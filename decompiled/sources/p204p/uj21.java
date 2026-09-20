package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uj21 {

    /* JADX INFO: renamed from: a */
    public final ek21 f230869a;

    public uj21(ek21 ek21Var) {
        this.f230869a = ek21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj21) && this.f230869a.equals(((uj21) obj).f230869a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f230869a.hashCode() * 31);
    }
}
