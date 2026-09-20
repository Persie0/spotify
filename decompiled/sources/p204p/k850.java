package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k850 extends m850 {

    /* JADX INFO: renamed from: a */
    public final m621 f120249a;

    public k850(m621 m621Var) {
        this.f120249a = m621Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k850) && wj50.m88271j(this.f120249a, ((k850) obj).f120249a);
    }

    public final int hashCode() {
        return this.f120249a.hashCode();
    }
}
