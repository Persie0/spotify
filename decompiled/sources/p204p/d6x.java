package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d6x implements Runnable, Comparable, hwr {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    public long f45918a;

    /* JADX INFO: renamed from: b */
    public int f45919b = -1;

    public d6x(long j) {
        this.f45918a = j;
    }

    /* JADX INFO: renamed from: b */
    public final int m35157b(long j, e6x e6xVar, f6x f6xVar) {
        synchronized (this) {
            if (this._heap == pmf0.f179061a) {
                return 2;
            }
            synchronized (e6xVar) {
                try {
                    d6x[] d6xVarArr = e6xVar.f251003a;
                    d6x d6xVar = d6xVarArr != null ? d6xVarArr[0] : null;
                    if (f6x.f66513i.get(f6xVar) == 1) {
                        return 1;
                    }
                    if (d6xVar == null) {
                        e6xVar.f56773c = j;
                    } else {
                        long j2 = d6xVar.f45918a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - e6xVar.f56773c > 0) {
                            e6xVar.f56773c = j;
                        }
                    }
                    long j3 = this.f45918a;
                    long j4 = e6xVar.f56773c;
                    if (j3 - j4 < 0) {
                        this.f45918a = j4;
                    }
                    e6xVar.m88009a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m35158c(e6x e6xVar) {
        if (this._heap == pmf0.f179061a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = e6xVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f45918a - ((d6x) obj).f45918a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // p204p.hwr
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C2617yl c2617yl = pmf0.f179061a;
                if (obj == c2617yl) {
                    return;
                }
                e6x e6xVar = obj instanceof e6x ? (e6x) obj : null;
                if (e6xVar != null) {
                    synchronized (e6xVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof wg71 ? (wg71) obj2 : null) != null) {
                            e6xVar.m88010b(this.f45919b);
                        }
                    }
                }
                this._heap = c2617yl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f45918a + ']';
    }
}
