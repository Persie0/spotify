package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l6c0 extends fpg1 {

    /* JADX INFO: renamed from: c */
    public final String f130305c;

    /* JADX INFO: renamed from: d */
    public final z5c0 f130306d;

    /* JADX INFO: renamed from: e */
    public final boolean f130307e;

    public l6c0(String str, z5c0 z5c0Var, boolean z) {
        this.f130305c = str;
        this.f130306d = z5c0Var;
        this.f130307e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6c0)) {
            return false;
        }
        l6c0 l6c0Var = (l6c0) obj;
        return wj50.m88271j(this.f130305c, l6c0Var.f130305c) && this.f130306d == l6c0Var.f130306d && this.f130307e == l6c0Var.f130307e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130307e) + ((this.f130306d.hashCode() + (this.f130305c.hashCode() * 31)) * 31);
    }
}
