package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mm51 implements om51 {

    /* JADX INFO: renamed from: a */
    public final up60 f145053a;

    /* JADX INFO: renamed from: b */
    public final gh00 f145054b;

    public mm51(up60 up60Var, gh00 gh00Var) {
        this.f145053a = up60Var;
        this.f145054b = gh00Var;
    }

    @Override // p204p.om51
    /* JADX INFO: renamed from: a */
    public final up60 mo62265a() {
        return this.f145053a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm51)) {
            return false;
        }
        mm51 mm51Var = (mm51) obj;
        return wj50.m88271j(this.f145053a, mm51Var.f145053a) && wj50.m88271j(this.f145054b, mm51Var.f145054b);
    }

    public final int hashCode() {
        return this.f145054b.hashCode() + (this.f145053a.hashCode() * 31);
    }
}
