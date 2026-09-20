package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class te11 implements ze11 {

    /* JADX INFO: renamed from: a */
    public final sd11 f219551a;

    public te11(sd11 sd11Var) {
        this.f219551a = sd11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te11) && this.f219551a == ((te11) obj).f219551a;
    }

    public final int hashCode() {
        sd11 sd11Var = this.f219551a;
        if (sd11Var == null) {
            return 0;
        }
        return sd11Var.hashCode();
    }
}
