package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class lv61 {

    /* JADX INFO: renamed from: k */
    public static final Logger f137238k = Logger.getLogger(lv61.class.getName());

    /* JADX INFO: renamed from: l */
    public static final lv61 f137239l = new lv61(new utu0(new b0f1(dq60.m36616p(c0f1.f32775b, " TaskRunner", new StringBuilder()), true)));

    /* JADX INFO: renamed from: a */
    public final utu0 f137240a;

    /* JADX INFO: renamed from: d */
    public boolean f137243d;

    /* JADX INFO: renamed from: e */
    public long f137244e;

    /* JADX INFO: renamed from: f */
    public int f137245f;

    /* JADX INFO: renamed from: g */
    public int f137246g;

    /* JADX INFO: renamed from: b */
    public final Logger f137241b = f137238k;

    /* JADX INFO: renamed from: c */
    public int f137242c = 10000;

    /* JADX INFO: renamed from: h */
    public final ArrayList f137247h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f137248i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final zu3 f137249j = new zu3(this, 18);

    public lv61(utu0 utu0Var) {
        this.f137240a = utu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m60065a(lv61 lv61Var, cv61 cv61Var, long j, boolean z) {
        TimeZone timeZone = c0f1.f32774a;
        kv61 kv61Var = cv61Var.f42322c;
        wj50.m88279p(kv61Var);
        if (kv61Var.f126791d != cv61Var) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = kv61Var.f126793f;
        kv61Var.f126793f = false;
        kv61Var.f126791d = null;
        lv61Var.f137247h.remove(kv61Var);
        if (j != -1 && !z2 && !kv61Var.f126790c) {
            kv61Var.m57444f(cv61Var, j, true);
        }
        if (kv61Var.f126792e.isEmpty()) {
            return;
        }
        lv61Var.f137248i.add(kv61Var);
        if (z) {
            return;
        }
        lv61Var.m60069e();
    }

    /* JADX INFO: renamed from: b */
    public final cv61 m60066b() {
        boolean z;
        TimeZone timeZone = c0f1.f32774a;
        while (true) {
            ArrayList arrayList = this.f137248i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            cv61 cv61Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                cv61 cv61Var2 = (cv61) ((kv61) it.next()).f126792e.get(0);
                long jMax = Math.max(0L, cv61Var2.f42323d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (cv61Var != null) {
                        z = true;
                        break;
                    }
                    cv61Var = cv61Var2;
                }
            }
            ArrayList arrayList2 = this.f137247h;
            if (cv61Var != null) {
                TimeZone timeZone2 = c0f1.f32774a;
                cv61Var.f42323d = -1L;
                kv61 kv61Var = cv61Var.f42322c;
                wj50.m88279p(kv61Var);
                kv61Var.f126792e.remove(cv61Var);
                arrayList.remove(kv61Var);
                kv61Var.f126791d = cv61Var;
                arrayList2.add(kv61Var);
                if (z || (!this.f137243d && !arrayList.isEmpty())) {
                    m60069e();
                }
                return cv61Var;
            }
            if (this.f137243d) {
                if (jMin >= this.f137244e - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.f137243d = true;
            this.f137244e = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = c0f1.f32774a;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = c0f1.f32774a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((kv61) arrayList2.get(size)).m57442b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        kv61 kv61Var2 = (kv61) arrayList.get(size2);
                        kv61Var2.m57442b();
                        if (kv61Var2.f126792e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f137243d = false;
            } catch (Throwable th) {
                this.f137243d = false;
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m60067c(kv61 kv61Var) {
        TimeZone timeZone = c0f1.f32774a;
        if (kv61Var.f126791d == null) {
            boolean zIsEmpty = kv61Var.f126792e.isEmpty();
            ArrayList arrayList = this.f137248i;
            if (zIsEmpty) {
                arrayList.remove(kv61Var);
            } else {
                byte[] bArr = a0f1.f11072a;
                if (!arrayList.contains(kv61Var)) {
                    arrayList.add(kv61Var);
                }
            }
        }
        if (this.f137243d) {
            notify();
        } else {
            m60069e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final kv61 m60068d() {
        int i;
        synchronized (this) {
            i = this.f137242c;
            this.f137242c = i + 1;
        }
        return new kv61(this, s571.m77246e(i, "Q"));
    }

    /* JADX INFO: renamed from: e */
    public final void m60069e() {
        TimeZone timeZone = c0f1.f32774a;
        int i = this.f137245f;
        if (i > this.f137246g) {
            return;
        }
        this.f137245f = i + 1;
        ((ThreadPoolExecutor) this.f137240a.f233995a).execute(this.f137249j);
    }
}
