package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qq61 extends rq61 {

    /* JADX INFO: renamed from: a */
    public final String f191498a;

    /* JADX INFO: renamed from: b */
    public final int f191499b;

    public qq61(String str, int i) {
        this.f191498a = str;
        this.f191499b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq61)) {
            return false;
        }
        qq61 qq61Var = (qq61) obj;
        return wj50.m88271j(this.f191498a, qq61Var.f191498a) && this.f191499b == qq61Var.f191499b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191499b) + (this.f191498a.hashCode() * 31);
    }
}
