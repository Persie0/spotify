package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kny implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f124483a;

    public kny(String str) {
        this.f124483a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kny) && wj50.m88271j(this.f124483a, ((kny) obj).f124483a);
    }

    public final int hashCode() {
        return this.f124483a.hashCode();
    }
}
