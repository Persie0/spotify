package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rm70 implements qh0 {

    /* JADX INFO: renamed from: a */
    public final fh0 f200469a;

    public rm70(fh0 fh0Var) {
        this.f200469a = fh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm70) && this.f200469a.equals(((rm70) obj).f200469a);
    }

    public final int hashCode() {
        return this.f200469a.hashCode();
    }
}
