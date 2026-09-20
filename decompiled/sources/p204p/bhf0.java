package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bhf0 implements ehf0 {

    /* JADX INFO: renamed from: a */
    public final wbw f27174a;

    /* JADX INFO: renamed from: b */
    public final int f27175b;

    public bhf0(wbw wbwVar, int i) {
        this.f27174a = wbwVar;
        this.f27175b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhf0)) {
            return false;
        }
        bhf0 bhf0Var = (bhf0) obj;
        return this.f27174a == bhf0Var.f27174a && this.f27175b == bhf0Var.f27175b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27175b) + (this.f27174a.hashCode() * 31);
    }
}
