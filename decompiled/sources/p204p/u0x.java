package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u0x extends u2x {

    /* JADX INFO: renamed from: a */
    public final z0r f225620a;

    public u0x(z0r z0rVar) {
        this.f225620a = z0rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0x) && wj50.m88271j(this.f225620a, ((u0x) obj).f225620a);
    }

    public final int hashCode() {
        return this.f225620a.hashCode();
    }
}
