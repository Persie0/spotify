package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u0i implements y0i {

    /* JADX INFO: renamed from: a */
    public final s0i f225515a;

    public u0i(s0i s0iVar) {
        this.f225515a = s0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0i) && this.f225515a == ((u0i) obj).f225515a;
    }

    public final int hashCode() {
        return this.f225515a.hashCode();
    }
}
