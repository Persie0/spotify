package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class svw implements p2x {

    /* JADX INFO: renamed from: a */
    public final String f214522a;

    public svw(String str) {
        this.f214522a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svw) && wj50.m88271j(this.f214522a, ((svw) obj).f214522a);
    }

    public final int hashCode() {
        return this.f214522a.hashCode();
    }
}
