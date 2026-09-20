package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ea61 implements ia61 {

    /* JADX INFO: renamed from: a */
    public final z961 f57597a;

    public ea61(z961 z961Var) {
        this.f57597a = z961Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea61) && this.f57597a.equals(((ea61) obj).f57597a);
    }

    public final int hashCode() {
        return this.f57597a.hashCode();
    }
}
