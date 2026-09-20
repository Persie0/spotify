package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t3x0 {

    /* JADX INFO: renamed from: c */
    public static final t3x0 f216853c = new t3x0("", "");

    /* JADX INFO: renamed from: d */
    public static final t3x0 f216854d = new t3x0("", "local");

    /* JADX INFO: renamed from: a */
    public final String f216855a;

    /* JADX INFO: renamed from: b */
    public final String f216856b;

    public t3x0(String str, String str2) {
        this.f216855a = str;
        this.f216856b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3x0)) {
            return false;
        }
        t3x0 t3x0Var = (t3x0) obj;
        return wj50.m88271j(this.f216855a, t3x0Var.f216855a) && wj50.m88271j(this.f216856b, t3x0Var.f216856b);
    }

    public final int hashCode() {
        return this.f216856b.hashCode() + (this.f216855a.hashCode() * 31);
    }
}
