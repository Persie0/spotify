package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bsc extends jg31 {

    /* JADX INFO: renamed from: c */
    public final String f30286c;

    public bsc(String str) {
        this.f30286c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsc) && wj50.m88271j(this.f30286c, ((bsc) obj).f30286c);
    }

    public final int hashCode() {
        return this.f30286c.hashCode();
    }
}
