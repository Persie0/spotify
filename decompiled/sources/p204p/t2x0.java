package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t2x0 implements m3x0 {

    /* JADX INFO: renamed from: a */
    public final String f216636a;

    /* JADX INFO: renamed from: b */
    public final String f216637b;

    public t2x0(String str, String str2) {
        this.f216636a = str;
        this.f216637b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2x0)) {
            return false;
        }
        t2x0 t2x0Var = (t2x0) obj;
        return wj50.m88271j(this.f216636a, t2x0Var.f216636a) && wj50.m88271j(this.f216637b, t2x0Var.f216637b);
    }

    public final int hashCode() {
        return this.f216637b.hashCode() + (this.f216636a.hashCode() * 31);
    }
}
