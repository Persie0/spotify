package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vyb0 {

    /* JADX INFO: renamed from: a */
    public final uek0 f246036a;

    public vyb0(uek0 uek0Var) {
        this.f246036a = uek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyb0) && this.f246036a == ((vyb0) obj).f246036a;
    }

    public final int hashCode() {
        uek0 uek0Var = this.f246036a;
        if (uek0Var == null) {
            return 0;
        }
        return uek0Var.hashCode();
    }
}
