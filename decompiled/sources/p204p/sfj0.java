package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sfj0 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final wpi0 f208604a;

    public sfj0(wpi0 wpi0Var) {
        this.f208604a = wpi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfj0) && this.f208604a.equals(((sfj0) obj).f208604a);
    }

    public final int hashCode() {
        return this.f208604a.hashCode();
    }
}
