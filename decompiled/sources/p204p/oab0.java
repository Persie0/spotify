package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class oab0 {

    /* JADX INFO: renamed from: a */
    public final int f163288a;

    /* JADX INFO: renamed from: b */
    public final pab0 f163289b;

    /* JADX INFO: renamed from: c */
    public final on3 f163290c;

    /* JADX INFO: renamed from: d */
    public int f163291d;

    /* JADX INFO: renamed from: e */
    public int f163292e;

    /* JADX INFO: renamed from: f */
    public int f163293f;

    public oab0(int i) {
        this.f163288a = i;
        if (i <= 0) {
            epv0.m39674J("maxSize <= 0");
            throw null;
        }
        this.f163289b = new pab0();
        this.f163290c = new on3(16);
    }

    /* JADX INFO: renamed from: a */
    public Object mo60467a(Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m66541c(Object obj) {
        Object objM69460d;
        synchronized (this.f163290c) {
            Object objM69457a = this.f163289b.m69457a(obj);
            if (objM69457a != null) {
                this.f163292e++;
                return objM69457a;
            }
            this.f163293f++;
            Object objMo60467a = mo60467a(obj);
            if (objMo60467a == null) {
                return null;
            }
            synchronized (this.f163290c) {
                try {
                    objM69460d = this.f163289b.m69460d(obj, objMo60467a);
                    if (objM69460d != null) {
                        this.f163289b.m69460d(obj, objM69460d);
                    } else {
                        this.f163291d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objM69460d != null) {
                mo60468b(obj, objMo60467a, objM69460d);
                return objM69460d;
            }
            m66544f(this.f163288a);
            return objMo60467a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m66542d(Object obj, Object obj2) {
        Object objM69460d;
        synchronized (this.f163290c) {
            this.f163291d++;
            objM69460d = this.f163289b.m69460d(obj, obj2);
            if (objM69460d != null) {
                this.f163291d--;
            }
        }
        if (objM69460d != null) {
            mo60468b(obj, objM69460d, obj2);
        }
        m66544f(this.f163288a);
        return objM69460d;
    }

    /* JADX INFO: renamed from: e */
    public final Object m66543e(Object obj) {
        Object objM69461e;
        synchronized (this.f163290c) {
            objM69461e = this.f163289b.m69461e(obj);
            if (objM69461e != null) {
                this.f163291d--;
            }
        }
        if (objM69461e != null) {
            mo60468b(obj, objM69461e, null);
        }
        return objM69461e;
    }

    /* JADX INFO: renamed from: f */
    public final void m66544f(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f163290c) {
                try {
                    if (this.f163291d < 0 || (this.f163289b.m69459c() && this.f163291d != 0)) {
                        break;
                    }
                    if (this.f163291d > i && !this.f163289b.m69459c()) {
                        Map.Entry entry = (Map.Entry) g6f.m43743r0(this.f163289b.m69458b());
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f163289b.m69461e(key);
                        this.f163291d--;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mo60468b(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f163290c) {
            try {
                int i = this.f163292e;
                int i2 = this.f163293f + i;
                str = "LruCache[maxSize=" + this.f163288a + ",hits=" + this.f163292e + ",misses=" + this.f163293f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public void mo60468b(Object obj, Object obj2, Object obj3) {
    }
}
