package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kub0 {

    /* JADX INFO: renamed from: a */
    public final String f126499a;

    /* JADX INFO: renamed from: b */
    public final boolean f126500b;

    /* JADX INFO: renamed from: c */
    public final boolean f126501c;

    public kub0(String str, boolean z, boolean z2) {
        this.f126499a = str;
        this.f126500b = z;
        this.f126501c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kub0)) {
            return false;
        }
        kub0 kub0Var = (kub0) obj;
        return wj50.m88271j(this.f126499a, kub0Var.f126499a) && this.f126500b == kub0Var.f126500b && this.f126501c == kub0Var.f126501c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126501c) + s571.m77245d(this.f126499a.hashCode() * 31, 31, this.f126500b);
    }
}
