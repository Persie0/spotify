package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h100 implements k100 {

    /* JADX INFO: renamed from: a */
    public final boolean f86393a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 f86394b;

    /* JADX INFO: renamed from: c */
    public final boolean f86395c;

    public h100(boolean z, AbstractC2524w8 abstractC2524w8, boolean z2) {
        this.f86393a = z;
        this.f86394b = abstractC2524w8;
        this.f86395c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h100)) {
            return false;
        }
        h100 h100Var = (h100) obj;
        return this.f86393a == h100Var.f86393a && wj50.m88271j(this.f86394b, h100Var.f86394b) && this.f86395c == h100Var.f86395c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86395c) + ((this.f86394b.hashCode() + (Boolean.hashCode(this.f86393a) * 31)) * 31);
    }
}
