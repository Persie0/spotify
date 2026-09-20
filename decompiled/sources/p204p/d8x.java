package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d8x {

    /* JADX INFO: renamed from: a */
    public final ri00 f46546a;

    /* JADX WARN: Multi-variable type inference failed */
    public d8x(eh00 eh00Var) {
        this.f46546a = (ri00) eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8x) && this.f46546a.equals(((d8x) obj).f46546a);
    }

    public final int hashCode() {
        return this.f46546a.hashCode();
    }
}
