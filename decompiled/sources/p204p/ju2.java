package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ju2 implements mu2 {

    /* JADX INFO: renamed from: a */
    public final String f116015a;

    /* JADX INFO: renamed from: b */
    public final String f116016b;

    public ju2(String str, String str2) {
        this.f116015a = str;
        this.f116016b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju2)) {
            return false;
        }
        ju2 ju2Var = (ju2) obj;
        return wj50.m88271j(this.f116015a, ju2Var.f116015a) && wj50.m88271j(this.f116016b, ju2Var.f116016b);
    }

    @Override // p204p.mu2
    public final String getSessionId() {
        return this.f116015a;
    }

    public final int hashCode() {
        return this.f116016b.hashCode() + (this.f116015a.hashCode() * 31);
    }
}
