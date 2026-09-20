package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v920 implements w920 {

    /* JADX INFO: renamed from: a */
    public final fyf f238828a;

    public v920(fyf fyfVar) {
        this.f238828a = fyfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v920) && this.f238828a.equals(((v920) obj).f238828a);
    }

    public final int hashCode() {
        return this.f238828a.hashCode();
    }
}
