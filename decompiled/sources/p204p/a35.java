package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a35 {

    /* JADX INFO: renamed from: a */
    public final i35 f11868a;

    /* JADX INFO: renamed from: b */
    public final boolean f11869b;

    /* JADX INFO: renamed from: c */
    public final boolean f11870c;

    public a35(i35 i35Var, boolean z, boolean z2) {
        this.f11868a = i35Var;
        this.f11869b = z;
        this.f11870c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a35)) {
            return false;
        }
        a35 a35Var = (a35) obj;
        return wj50.m88271j(this.f11868a, a35Var.f11868a) && this.f11869b == a35Var.f11869b && this.f11870c == a35Var.f11870c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11870c) + s571.m77245d(this.f11868a.hashCode() * 31, 31, this.f11869b);
    }
}
