package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h2c extends c2c {

    /* JADX INFO: renamed from: a */
    public final r511 f86949a;

    public h2c(r511 r511Var) {
        this.f86949a = r511Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2c) && this.f86949a.equals(((h2c) obj).f86949a);
    }

    public final int hashCode() {
        return this.f86949a.hashCode();
    }
}
