package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qew {

    /* JADX INFO: renamed from: a */
    public final eh00 f188048a;

    /* JADX INFO: renamed from: b */
    public final eh00 f188049b;

    public qew(eh00 eh00Var, eh00 eh00Var2) {
        this.f188048a = eh00Var;
        this.f188049b = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qew)) {
            return false;
        }
        qew qewVar = (qew) obj;
        return wj50.m88271j(this.f188048a, qewVar.f188048a) && wj50.m88271j(this.f188049b, qewVar.f188049b);
    }

    public final int hashCode() {
        return this.f188049b.hashCode() + (this.f188048a.hashCode() * 31);
    }
}
