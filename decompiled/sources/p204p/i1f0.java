package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i1f0 {

    /* JADX INFO: renamed from: a */
    public final String f97524a;

    public i1f0(String str) {
        this.f97524a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1f0) && wj50.m88271j(this.f97524a, ((i1f0) obj).f97524a);
    }

    public final int hashCode() {
        return this.f97524a.hashCode();
    }
}
