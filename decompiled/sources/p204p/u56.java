package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u56 implements x56 {

    /* JADX INFO: renamed from: a */
    public final z8y f226914a;

    public u56(z8y z8yVar) {
        this.f226914a = z8yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u56) && this.f226914a.equals(((u56) obj).f226914a);
    }

    public final int hashCode() {
        return this.f226914a.hashCode();
    }
}
