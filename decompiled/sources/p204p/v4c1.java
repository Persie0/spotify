package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v4c1 extends w4c1 {

    /* JADX INFO: renamed from: a */
    public final s4c1 f237116a;

    /* JADX INFO: renamed from: b */
    public final j9c1 f237117b;

    /* JADX INFO: renamed from: c */
    public final int f237118c;

    /* JADX INFO: renamed from: d */
    public final int f237119d;

    public v4c1(s4c1 s4c1Var, j9c1 j9c1Var) {
        this.f237116a = s4c1Var;
        this.f237117b = j9c1Var;
        this.f237118c = s4c1Var.f205567a;
        this.f237119d = s4c1Var.f205568b;
    }

    @Override // p204p.w4c1
    /* JADX INFO: renamed from: a */
    public final int mo82322a() {
        return this.f237119d;
    }

    @Override // p204p.w4c1
    /* JADX INFO: renamed from: b */
    public final int mo82323b() {
        return this.f237118c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4c1)) {
            return false;
        }
        v4c1 v4c1Var = (v4c1) obj;
        return this.f237116a == v4c1Var.f237116a && wj50.m88271j(this.f237117b, v4c1Var.f237117b);
    }

    public final int hashCode() {
        return this.f237117b.hashCode() + (this.f237116a.hashCode() * 31);
    }
}
