package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rs41 implements ev41 {

    /* JADX INFO: renamed from: a */
    public final String f202181a;

    /* JADX INFO: renamed from: b */
    public final Throwable f202182b;

    public rs41(String str, Throwable th) {
        this.f202181a = str;
        this.f202182b = th;
    }

    @Override // p204p.ev41
    /* JADX INFO: renamed from: a */
    public final String mo40094a() {
        return this.f202181a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs41)) {
            return false;
        }
        rs41 rs41Var = (rs41) obj;
        return wj50.m88271j(this.f202181a, rs41Var.f202181a) && wj50.m88271j(this.f202182b, rs41Var.f202182b);
    }

    public final int hashCode() {
        return this.f202182b.hashCode() + (this.f202181a.hashCode() * 31);
    }
}
