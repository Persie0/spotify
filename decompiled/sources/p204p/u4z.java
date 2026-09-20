package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u4z implements c5z {

    /* JADX INFO: renamed from: a */
    public final String f226858a;

    public u4z(String str) {
        this.f226858a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4z) && wj50.m88271j(this.f226858a, ((u4z) obj).f226858a);
    }

    public final int hashCode() {
        return this.f226858a.hashCode();
    }
}
