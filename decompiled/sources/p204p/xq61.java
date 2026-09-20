package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xq61 extends yq61 {

    /* JADX INFO: renamed from: a */
    public final int f264884a;

    /* JADX INFO: renamed from: b */
    public final String f264885b;

    public xq61(int i, String str) {
        this.f264884a = i;
        this.f264885b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq61)) {
            return false;
        }
        xq61 xq61Var = (xq61) obj;
        return this.f264884a == xq61Var.f264884a && wj50.m88271j(this.f264885b, xq61Var.f264885b);
    }

    public final int hashCode() {
        return this.f264885b.hashCode() + (Integer.hashCode(this.f264884a) * 31);
    }
}
