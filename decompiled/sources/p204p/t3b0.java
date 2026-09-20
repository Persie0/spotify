package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t3b0 {

    /* JADX INFO: renamed from: a */
    public final String f216738a;

    /* JADX INFO: renamed from: b */
    public final String f216739b;

    public t3b0(String str, String str2) {
        this.f216738a = str;
        this.f216739b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3b0)) {
            return false;
        }
        t3b0 t3b0Var = (t3b0) obj;
        return wj50.m88271j(this.f216738a, t3b0Var.f216738a) && wj50.m88271j(this.f216739b, t3b0Var.f216739b);
    }

    public final int hashCode() {
        return this.f216739b.hashCode() + (this.f216738a.hashCode() * 31);
    }
}
