package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jez implements tvd1 {

    /* JADX INFO: renamed from: a */
    public final int f111751a;

    /* JADX INFO: renamed from: b */
    public final int f111752b;

    /* JADX INFO: renamed from: c */
    public final int f111753c;

    /* JADX INFO: renamed from: d */
    public final int f111754d;

    public jez(int i, int i2, int i3, int i4) {
        this.f111751a = i;
        this.f111752b = i2;
        this.f111753c = i3;
        this.f111754d = i4;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: a */
    public final int mo41499a(yqq yqqVar, ko70 ko70Var) {
        return this.f111753c;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: b */
    public final int mo41500b(yqq yqqVar, ko70 ko70Var) {
        return this.f111751a;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: c */
    public final int mo41501c(yqq yqqVar) {
        return this.f111752b;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: d */
    public final int mo41502d(yqq yqqVar) {
        return this.f111754d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jez)) {
            return false;
        }
        jez jezVar = (jez) obj;
        return this.f111751a == jezVar.f111751a && this.f111752b == jezVar.f111752b && this.f111753c == jezVar.f111753c && this.f111754d == jezVar.f111754d;
    }

    public final int hashCode() {
        return (((((this.f111751a * 31) + this.f111752b) * 31) + this.f111753c) * 31) + this.f111754d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.f111751a);
        sb.append(", top=");
        sb.append(this.f111752b);
        sb.append(", right=");
        sb.append(this.f111753c);
        sb.append(", bottom=");
        return edb.m38567p(sb, this.f111754d, ')');
    }
}
