package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o0f {

    /* JADX INFO: renamed from: a */
    public final f1f f160375a;

    /* JADX INFO: renamed from: b */
    public final d850 f160376b;

    /* JADX INFO: renamed from: c */
    public final boolean f160377c;

    public o0f(f1f f1fVar, d850 d850Var, boolean z) {
        this.f160375a = f1fVar;
        this.f160376b = d850Var;
        this.f160377c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0f)) {
            return false;
        }
        o0f o0fVar = (o0f) obj;
        return wj50.m88271j(this.f160375a, o0fVar.f160375a) && wj50.m88271j(this.f160376b, o0fVar.f160376b) && this.f160377c == o0fVar.f160377c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160377c) + ((this.f160376b.hashCode() + (this.f160375a.hashCode() * 31)) * 31);
    }
}
