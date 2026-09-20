package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bej0 {

    /* JADX INFO: renamed from: a */
    public final uaj0 f26376a;

    /* JADX INFO: renamed from: b */
    public final uaj0 f26377b;

    /* JADX INFO: renamed from: c */
    public final uaj0 f26378c;

    public bej0(uaj0 uaj0Var, uaj0 uaj0Var2, uaj0 uaj0Var3) {
        this.f26376a = uaj0Var;
        this.f26377b = uaj0Var2;
        this.f26378c = uaj0Var3;
    }

    /* JADX INFO: renamed from: a */
    public final uaj0 m28939a() {
        return this.f26376a;
    }

    /* JADX INFO: renamed from: b */
    public final uaj0 m28940b() {
        return this.f26378c;
    }

    /* JADX INFO: renamed from: c */
    public final uaj0 m28941c() {
        return this.f26377b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bej0)) {
            return false;
        }
        bej0 bej0Var = (bej0) obj;
        return wj50.m88271j(this.f26376a, bej0Var.f26376a) && wj50.m88271j(this.f26377b, bej0Var.f26377b) && wj50.m88271j(this.f26378c, bej0Var.f26378c);
    }

    public final int hashCode() {
        return this.f26378c.hashCode() + ((this.f26377b.hashCode() + (this.f26376a.hashCode() * 31)) * 31);
    }
}
