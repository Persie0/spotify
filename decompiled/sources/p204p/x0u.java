package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x0u extends z0u {

    /* JADX INFO: renamed from: a */
    public final String f256994a;

    public x0u(String str) {
        this.f256994a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0u) && wj50.m88271j(this.f256994a, ((x0u) obj).f256994a);
    }

    public final int hashCode() {
        return this.f256994a.hashCode();
    }
}
