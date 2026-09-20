package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class kv61 {

    /* JADX INFO: renamed from: a */
    public final lv61 f126788a;

    /* JADX INFO: renamed from: b */
    public final String f126789b;

    /* JADX INFO: renamed from: c */
    public boolean f126790c;

    /* JADX INFO: renamed from: d */
    public cv61 f126791d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f126792e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f126793f;

    public kv61(lv61 lv61Var, String str) {
        this.f126788a = lv61Var;
        this.f126789b = str;
    }

    /* JADX INFO: renamed from: c */
    public static void m57439c(kv61 kv61Var, String str, long j, eh00 eh00Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        kv61Var.getClass();
        kv61Var.m57443d(new jv61(str, z, eh00Var), j);
    }

    /* JADX INFO: renamed from: a */
    public final void m57441a() {
        lv61 lv61Var = this.f126788a;
        TimeZone timeZone = c0f1.f32774a;
        synchronized (lv61Var) {
            if (m57442b()) {
                this.f126788a.m60067c(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57442b() {
        cv61 cv61Var = this.f126791d;
        if (cv61Var != null && cv61Var.f42321b) {
            this.f126793f = true;
        }
        ArrayList arrayList = this.f126792e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((cv61) arrayList.get(size)).f42321b) {
                Logger logger = this.f126788a.f137241b;
                cv61 cv61Var2 = (cv61) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    nqg1.m65436j(logger, cv61Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m57443d(cv61 cv61Var, long j) {
        synchronized (this.f126788a) {
            if (!this.f126790c) {
                if (m57444f(cv61Var, j, false)) {
                    this.f126788a.m60067c(this);
                }
            } else if (cv61Var.f42321b) {
                Logger logger = this.f126788a.f137241b;
                if (logger.isLoggable(Level.FINE)) {
                    nqg1.m65436j(logger, cv61Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f126788a.f137241b;
                if (logger2.isLoggable(Level.FINE)) {
                    nqg1.m65436j(logger2, cv61Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[LOOP:0: B:23:0x005f->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[EDGE_INSN: B:40:0x0077->B:30:0x0077 BREAK  A[LOOP:0: B:23:0x005f->B:28:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final boolean m57444f(cv61 cv61Var, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.f126788a.f137241b;
        kv61 kv61Var = cv61Var.f42322c;
        if (kv61Var != this) {
            if (kv61Var != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            cv61Var.f42322c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f126792e;
        int iIndexOf = arrayList.indexOf(cv61Var);
        if (iIndexOf == -1) {
            cv61Var.f42323d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(nqg1.m65439m(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(nqg1.m65439m(j2 - jNanoTime));
                }
                nqg1.m65436j(logger, cv61Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((cv61) it.next()).f42323d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, cv61Var);
            if (size == 0) {
                return true;
            }
        } else if (cv61Var.f42323d > j2) {
            arrayList.remove(iIndexOf);
            cv61Var.f42323d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(nqg1.m65439m(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(nqg1.m65439m(j2 - jNanoTime));
                }
                nqg1.m65436j(logger, cv61Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((cv61) it.next()).f42323d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, cv61Var);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            nqg1.m65436j(logger, cv61Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m57445g() {
        lv61 lv61Var = this.f126788a;
        TimeZone timeZone = c0f1.f32774a;
        synchronized (lv61Var) {
            this.f126790c = true;
            if (m57442b()) {
                this.f126788a.m60067c(this);
            }
        }
    }

    public final String toString() {
        return this.f126789b;
    }
}
