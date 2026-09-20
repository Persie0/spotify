package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lb3 {

    /* JADX INFO: renamed from: c */
    public static final lb3 f131528c = new lb3(0, 0);

    /* JADX INFO: renamed from: d */
    public static final lb3 f131529d = new lb3(1, 0);

    /* JADX INFO: renamed from: e */
    public static final lb3 f131530e = new lb3(2, 0);

    /* JADX INFO: renamed from: f */
    public static final lb3 f131531f = new lb3(0, 1);

    /* JADX INFO: renamed from: g */
    public static final lb3 f131532g = new lb3(1, 1);

    /* JADX INFO: renamed from: h */
    public static final lb3 f131533h = new lb3(2, 1);

    /* JADX INFO: renamed from: i */
    public static final lb3 f131534i = new lb3(0, 2);

    /* JADX INFO: renamed from: j */
    public static final lb3 f131535j = new lb3(1, 2);

    /* JADX INFO: renamed from: k */
    public static final lb3 f131536k = new lb3(2, 2);

    /* JADX INFO: renamed from: a */
    public final int f131537a;

    /* JADX INFO: renamed from: b */
    public final int f131538b;

    public lb3(int i, int i2) {
        this.f131537a = i;
        this.f131538b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m58594a() {
        return this.f131537a;
    }

    /* JADX INFO: renamed from: b */
    public final int m58595b() {
        return this.f131538b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lb3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lb3 lb3Var = (lb3) obj;
        return this.f131537a == lb3Var.f131537a && this.f131538b == lb3Var.f131538b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131538b) + (Integer.hashCode(this.f131537a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) ib3.m50115c(this.f131537a)) + ", vertical=" + ((Object) kb3.m55925c(this.f131538b)) + ')';
    }
}
