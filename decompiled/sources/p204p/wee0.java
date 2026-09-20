package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wee0 {

    /* JADX INFO: renamed from: a */
    public final boolean f250517a;

    /* JADX INFO: renamed from: b */
    public final akk f250518b;

    /* JADX INFO: renamed from: c */
    public final akk f250519c;

    public wee0(boolean z, akk akkVar, akk akkVar2) {
        this.f250517a = z;
        this.f250518b = akkVar;
        this.f250519c = akkVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wee0)) {
            return false;
        }
        wee0 wee0Var = (wee0) obj;
        return this.f250517a == wee0Var.f250517a && wj50.m88271j(this.f250518b, wee0Var.f250518b) && wj50.m88271j(this.f250519c, wee0Var.f250519c);
    }

    public final int hashCode() {
        return this.f250519c.hashCode() + ((this.f250518b.hashCode() + (Boolean.hashCode(this.f250517a) * 31)) * 31);
    }
}
