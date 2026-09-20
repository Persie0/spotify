package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ffo implements ifo {

    /* JADX INFO: renamed from: a */
    public final k35 f69055a;

    public ffo(k35 k35Var) {
        this.f69055a = k35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffo) && wj50.m88271j(this.f69055a, ((ffo) obj).f69055a);
    }

    @Override // p204p.ifo
    public final String getMessage() {
        return "No source for key: " + this.f69055a;
    }

    public final int hashCode() {
        return this.f69055a.f118764c;
    }

    public final String toString() {
        k35 k35Var = this.f69055a;
        return "NoSource(table=" + k35Var.f118762a + ", key=" + k35Var.f118763b + ")";
    }
}
