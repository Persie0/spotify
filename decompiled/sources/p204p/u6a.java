package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u6a extends v6a {

    /* JADX INFO: renamed from: a */
    public final String f227249a;

    public u6a(String str) {
        this.f227249a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6a) && wj50.m88271j(this.f227249a, ((u6a) obj).f227249a);
    }

    public final int hashCode() {
        return this.f227249a.hashCode();
    }
}
