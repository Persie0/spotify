package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ut2 implements fu2 {

    /* JADX INFO: renamed from: a */
    public final String f233741a;

    /* JADX INFO: renamed from: b */
    public final qke0 f233742b;

    public ut2(String str, qke0 qke0Var) {
        this.f233741a = str;
        this.f233742b = qke0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut2)) {
            return false;
        }
        ut2 ut2Var = (ut2) obj;
        return wj50.m88271j(this.f233741a, ut2Var.f233741a) && wj50.m88271j(this.f233742b, ut2Var.f233742b);
    }

    public final int hashCode() {
        return this.f233742b.hashCode() + (this.f233741a.hashCode() * 31);
    }
}
