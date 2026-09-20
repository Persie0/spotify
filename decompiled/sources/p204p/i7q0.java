package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i7q0 implements h7q0 {

    /* JADX INFO: renamed from: a */
    public final int f99607a;

    /* JADX INFO: renamed from: b */
    public final boolean f99608b;

    /* JADX INFO: renamed from: c */
    public final boolean f99609c;

    public i7q0(int i, boolean z, boolean z2) {
        this.f99607a = i;
        this.f99608b = z;
        this.f99609c = z2;
    }

    @Override // p204p.h7q0
    /* JADX INFO: renamed from: a */
    public final boolean mo24993a() {
        return this.f99608b;
    }

    @Override // p204p.h7q0
    /* JADX INFO: renamed from: b */
    public final int mo24994b() {
        return this.f99607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7q0)) {
            return false;
        }
        i7q0 i7q0Var = (i7q0) obj;
        return this.f99607a == i7q0Var.f99607a && this.f99608b == i7q0Var.f99608b && this.f99609c == i7q0Var.f99609c;
    }

    public final int hashCode() {
        int i = this.f99607a;
        return Boolean.hashCode(this.f99609c) + s571.m77245d((i == 0 ? 0 : edb.m38547C(i)) * 31, 31, this.f99608b);
    }
}
