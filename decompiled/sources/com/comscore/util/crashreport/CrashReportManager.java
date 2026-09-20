package com.comscore.util.crashreport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class CrashReportManager {
    public static final int MAX_REPORTS_TO_SEND = 1;
    public static final String REPORT_URL = "https://sb.scorecardresearch.com/p2";
    public static final int TIME_WINDOW = 5000;

    /* JADX INFO: renamed from: h */
    private CrashReportDecorator f1635h;

    /* JADX INFO: renamed from: b */
    private final Object f1629b = new Object();

    /* JADX INFO: renamed from: c */
    private final Object f1630c = new Object();

    /* JADX INFO: renamed from: i */
    private Runnable f1636i = null;

    /* JADX INFO: renamed from: a */
    private final List<CrashReport> f1628a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    private boolean f1633f = false;

    /* JADX INFO: renamed from: g */
    private CrashReportParser f1634g = new HttpGetCrashReportParser();

    /* JADX INFO: renamed from: d */
    private CrashReportFlusher f1631d = createCrashReportFlusher();

    /* JADX INFO: renamed from: e */
    private ExecutorService f1632e = new ThreadPoolExecutor(0, 1, 150, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: com.comscore.util.crashreport.CrashReportManager$a */
    public class RunnableC0127a implements Runnable {
        public RunnableC0127a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException unused) {
            }
            CrashReportManager crashReportManager = CrashReportManager.this;
            crashReportManager.f1633f = true;
            crashReportManager.flushReportsErrors();
        }
    }

    /* JADX INFO: renamed from: com.comscore.util.crashreport.CrashReportManager$b */
    public class RunnableC0128b implements Runnable {
        public RunnableC0128b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<CrashReport> arrayList;
            try {
                synchronized (CrashReportManager.this.f1629b) {
                    arrayList = new ArrayList(CrashReportManager.this.f1628a);
                }
                if (arrayList.size() == 0) {
                    return;
                }
                LinkedList linkedList = new LinkedList();
                for (CrashReport crashReport : arrayList) {
                    CrashReportManager.this.f1635h.fillCrashReport(crashReport);
                    CrashReportManager crashReportManager = CrashReportManager.this;
                    if (crashReportManager.f1631d.flush(CrashReportManager.REPORT_URL, crashReportManager.f1634g, crashReport)) {
                        linkedList.add(crashReport);
                    }
                }
                if (linkedList.size() > 0) {
                    synchronized (CrashReportManager.this.f1629b) {
                        CrashReportManager.this.f1628a.removeAll(linkedList);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public CrashReportManager(CrashReportDecorator crashReportDecorator) {
        this.f1635h = crashReportDecorator;
    }

    public void addReport(CrashReport crashReport) {
        if (crashReport == null) {
            return;
        }
        synchronized (this.f1629b) {
            try {
                if (this.f1628a.size() < 1) {
                    this.f1628a.add(crashReport);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        flushReportsErrors();
    }

    public CrashReportFlusher createCrashReportFlusher() {
        return new CrashReportHttpFlusher();
    }

    public void flushReportsErrors() {
        synchronized (this.f1630c) {
            try {
                if (this.f1633f) {
                    this.f1632e.execute(new RunnableC0128b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<CrashReport> getReports() {
        return this.f1628a;
    }

    public void start() {
        synchronized (this.f1630c) {
            try {
                if (this.f1636i != null) {
                    return;
                }
                RunnableC0127a runnableC0127a = new RunnableC0127a();
                this.f1636i = runnableC0127a;
                this.f1632e.execute(runnableC0127a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
