package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o1n0 {

    /* JADX INFO: renamed from: a */
    public final String f160814a;

    /* JADX INFO: renamed from: b */
    public final boolean f160815b;

    /* JADX INFO: renamed from: c */
    public final boolean f160816c;

    public o1n0(String str, boolean z, boolean z2) {
        this.f160814a = str;
        this.f160815b = z;
        this.f160816c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1n0)) {
            return false;
        }
        o1n0 o1n0Var = (o1n0) obj;
        return wj50.m88271j(this.f160814a, o1n0Var.f160814a) && this.f160815b == o1n0Var.f160815b && this.f160816c == o1n0Var.f160816c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160816c) + s571.m77245d(this.f160814a.hashCode() * 31, 31, this.f160815b);
    }
}
