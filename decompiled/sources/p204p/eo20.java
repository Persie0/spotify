package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eo20 {

    /* JADX INFO: renamed from: a */
    public final String f61275a;

    /* JADX INFO: renamed from: b */
    public final s15 f61276b;

    public eo20(String str, s15 s15Var) {
        this.f61275a = str;
        this.f61276b = s15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo20)) {
            return false;
        }
        eo20 eo20Var = (eo20) obj;
        return wj50.m88271j(this.f61275a, eo20Var.f61275a) && wj50.m88271j(this.f61276b, eo20Var.f61276b);
    }

    public final int hashCode() {
        String str = this.f61275a;
        return this.f61276b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
