package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gfo implements ifo {

    /* JADX INFO: renamed from: a */
    public final k35 f79414a;

    /* JADX INFO: renamed from: b */
    public final kjo f79415b;

    public gfo(k35 k35Var, kjo kjoVar) {
        this.f79414a = k35Var;
        this.f79415b = kjoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfo)) {
            return false;
        }
        gfo gfoVar = (gfo) obj;
        return wj50.m88271j(this.f79414a, gfoVar.f79414a) && wj50.m88271j(this.f79415b, gfoVar.f79415b);
    }

    @Override // p204p.ifo
    public final String getMessage() {
        return "Source failed for " + this.f79414a + ": " + this.f79415b.getMessage();
    }

    public final int hashCode() {
        return this.f79415b.hashCode() + (this.f79414a.f118764c * 31);
    }

    public final String toString() {
        k35 k35Var = this.f79414a;
        return "SourceFailure(table=" + k35Var.f118762a + ", key=" + k35Var.f118763b + ", error=" + this.f79415b + ")";
    }
}
