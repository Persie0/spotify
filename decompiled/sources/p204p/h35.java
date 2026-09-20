package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h35 {

    /* JADX INFO: renamed from: a */
    public final i35 f87140a;

    /* JADX INFO: renamed from: b */
    public final boolean f87141b;

    /* JADX INFO: renamed from: c */
    public final boolean f87142c;

    public h35(i35 i35Var, boolean z, boolean z2) {
        this.f87140a = i35Var;
        this.f87141b = z;
        this.f87142c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h35)) {
            return false;
        }
        h35 h35Var = (h35) obj;
        return wj50.m88271j(this.f87140a, h35Var.f87140a) && this.f87141b == h35Var.f87141b && this.f87142c == h35Var.f87142c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87142c) + s571.m77245d(this.f87140a.hashCode() * 31, 31, this.f87141b);
    }
}
