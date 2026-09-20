package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gu8 {

    /* JADX INFO: renamed from: a */
    public final int f84402a;

    /* JADX INFO: renamed from: b */
    public final String f84403b;

    public gu8(int i, String str) {
        this.f84402a = i;
        this.f84403b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu8)) {
            return false;
        }
        gu8 gu8Var = (gu8) obj;
        return this.f84402a == gu8Var.f84402a && wj50.m88271j(this.f84403b, gu8Var.f84403b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f84402a) * 31;
        String str = this.f84403b;
        return iM38547C + (str == null ? 0 : str.hashCode());
    }
}
