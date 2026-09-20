package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nny implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f156518a;

    public nny(String str) {
        this.f156518a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nny) && wj50.m88271j(this.f156518a, ((nny) obj).f156518a);
    }

    public final int hashCode() {
        return this.f156518a.hashCode();
    }
}
