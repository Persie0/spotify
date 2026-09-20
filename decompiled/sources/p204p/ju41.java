package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ju41 extends mv41 {

    /* JADX INFO: renamed from: b */
    public final ms41 f116029b;

    public ju41(ms41 ms41Var) {
        super(ms41Var.f147511a);
        this.f116029b = ms41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju41) && wj50.m88271j(this.f116029b, ((ju41) obj).f116029b);
    }

    public final int hashCode() {
        return this.f116029b.hashCode();
    }
}
