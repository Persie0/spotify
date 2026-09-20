package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class izc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f107196a;

    /* JADX INFO: renamed from: b */
    public final qf40 f107197b;

    public izc0(String str, qf40 qf40Var) {
        this.f107196a = str;
        this.f107197b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izc0)) {
            return false;
        }
        izc0 izc0Var = (izc0) obj;
        return wj50.m88271j(this.f107196a, izc0Var.f107196a) && wj50.m88271j(this.f107197b, izc0Var.f107197b);
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f107196a;
    }

    public final int hashCode() {
        return this.f107197b.hashCode() + (this.f107196a.hashCode() * 961);
    }
}
