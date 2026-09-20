package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wny implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f253311a;

    public wny(String str) {
        this.f253311a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wny) && wj50.m88271j(this.f253311a, ((wny) obj).f253311a);
    }

    public final int hashCode() {
        return this.f253311a.hashCode();
    }
}
