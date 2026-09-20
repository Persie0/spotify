package p204p;

import android.os.Build;
import android.os.Process;
import android.os.Trace;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetExceptionImpl;
import org.chromium.net.impl.ImplVersion;
import p196j$.time.Duration;

/* JADX INFO: loaded from: classes11.dex */
public final class re60 {

    /* JADX INFO: renamed from: a */
    public final eeb1 f198291a;

    /* JADX INFO: renamed from: b */
    public final Executor f198292b;

    /* JADX INFO: renamed from: c */
    public final Executor f198293c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ue60 f198294d;

    public re60(ue60 ue60Var, UrlRequest.Callback callback, Executor executor) {
        this.f198294d = ue60Var;
        this.f198291a = new eeb1(callback);
        if (ue60Var.f229421h) {
            this.f198292b = executor;
            this.f198293c = null;
        } else {
            this.f198292b = new zr20(executor, 3);
            this.f198293c = executor;
        }
    }

    /* JADX INFO: renamed from: a */
    public final aul m75382a() {
        Map asMap;
        String str;
        int i;
        long length;
        long length2;
        long j;
        int i2;
        ue60 ue60Var = this.f198294d;
        yka1 yka1Var = ue60Var.f229428o;
        if (yka1Var != null) {
            asMap = yka1Var.f273660g.getAsMap();
            yka1 yka1Var2 = ue60Var.f229428o;
            str = yka1Var2.f273657d;
            i = yka1Var2.f273655b;
        } else {
            asMap = Collections.EMPTY_MAP;
            str = "";
            i = 0;
        }
        String str2 = str;
        TreeMap treeMap = ue60Var.f229417d;
        if (treeMap == null) {
            length = 0;
        } else {
            length = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 != null) {
                    length += (long) str3.length();
                }
                String str4 = (String) entry.getValue();
                if (str4 != null) {
                    length += (long) str4.length();
                }
            }
        }
        if (asMap == null) {
            length2 = 0;
        } else {
            length2 = 0;
            for (Map.Entry entry2 : asMap.entrySet()) {
                String str5 = (String) entry2.getKey();
                if (str5 != null) {
                    length2 += (long) str5.length();
                }
                if (entry2.getValue() != null) {
                    for (String str6 : (List) entry2.getValue()) {
                        if (str6 != null) {
                            length2 += (long) str6.length();
                        }
                    }
                }
            }
        }
        if (asMap.containsKey("Content-Length")) {
            try {
                j = Long.parseLong((String) ((List) asMap.get("Content-Length")).get(0));
            } catch (NumberFormatException unused) {
                j = 0;
            }
        } else {
            j = -1;
        }
        Duration durationOfSeconds = Duration.ofSeconds(0L);
        Duration durationOfSeconds2 = Duration.ofSeconds(0L);
        int i3 = ue60Var.f229419f.get();
        if (i3 == 6) {
            i2 = 2;
        } else if (i3 == 7) {
            i2 = 1;
        } else {
            if (i3 != 8) {
                throw new IllegalStateException(edb.m38563l("Internal Cronet error: attempted to report metrics but current state (", i3, ") is not a done state!"));
            }
            i2 = 3;
        }
        int i4 = i2;
        int i5 = ue60Var.f229437x;
        int i6 = ue60Var.f229436w;
        se60 se60Var = ue60Var.f229431r;
        return new aul(length, -1L, length2, j, i, durationOfSeconds, durationOfSeconds2, str2, i4, i5, i6, se60Var != null ? se60Var.f111476h : 0, ue60Var.f229438y, Process.myUid(), ImplVersion.getCronetVersion());
    }

    /* JADX INFO: renamed from: b */
    public final void m75383b(ve60 ve60Var, String str) {
        ue60 ue60Var = this.f198294d;
        try {
            m75384c(new ke60(ue60Var, ve60Var, 1), str);
        } catch (RejectedExecutionException e) {
            ue60Var.m82893b(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75384c(Runnable runnable, String str) {
        why0.m88178a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
        try {
            this.f198292b.execute(new oe60(str, runnable, 1));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m75385d() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.f198294d.m82894c(new ig10(this, 7), "maybeReportMetrics");
    }
}
