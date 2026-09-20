package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class goz0 implements koz0 {

    /* JADX INFO: renamed from: a */
    public final int f83042a;

    /* JADX INFO: renamed from: b */
    public final uk91 f83043b;

    public goz0(int i, uk91 uk91Var) {
        this.f83042a = i;
        this.f83043b = uk91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goz0)) {
            return false;
        }
        goz0 goz0Var = (goz0) obj;
        return this.f83042a == goz0Var.f83042a && wj50.m88271j(this.f83043b, goz0Var.f83043b);
    }

    public final int hashCode() {
        return this.f83043b.hashCode() + (edb.m38547C(this.f83042a) * 31);
    }
}
