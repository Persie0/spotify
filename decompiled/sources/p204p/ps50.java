package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ps50 implements rs50 {

    /* JADX INFO: renamed from: a */
    public final ls50 f180754a;

    public ps50(ls50 ls50Var) {
        this.f180754a = ls50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ps50) && wj50.m88271j(this.f180754a, ((ps50) obj).f180754a);
    }

    public final int hashCode() {
        return this.f180754a.hashCode();
    }
}
