package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mn21 {

    /* JADX INFO: renamed from: a */
    public final int f145300a;

    /* JADX INFO: renamed from: b */
    public final qn21 f145301b;

    public /* synthetic */ mn21(int i) {
        this(i, on21.f167143a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn21)) {
            return false;
        }
        mn21 mn21Var = (mn21) obj;
        return this.f145300a == mn21Var.f145300a && wj50.m88271j(this.f145301b, mn21Var.f145301b);
    }

    public final int hashCode() {
        return this.f145301b.hashCode() + (edb.m38547C(this.f145300a) * 31);
    }

    public mn21(int i, qn21 qn21Var) {
        this.f145300a = i;
        this.f145301b = qn21Var;
    }
}
