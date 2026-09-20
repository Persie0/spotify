package p204p;

/* JADX INFO: renamed from: p.au */
/* JADX INFO: loaded from: classes4.dex */
public final class C1680au {

    /* JADX INFO: renamed from: a */
    public final C1681av f19772a;

    /* JADX INFO: renamed from: b */
    public final int f19773b;

    public C1680au(C1681av c1681av, int i) {
        this.f19772a = c1681av;
        this.f19773b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1680au)) {
            return false;
        }
        C1680au c1680au = (C1680au) obj;
        return wj50.m88271j(this.f19772a, c1680au.f19772a) && this.f19773b == c1680au.f19773b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19773b) + (this.f19772a.hashCode() * 31);
    }
}
