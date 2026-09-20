package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class skt implements zkt {

    /* JADX INFO: renamed from: a */
    public final String f210195a;

    public skt(String str) {
        this.f210195a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skt) && wj50.m88271j(this.f210195a, ((skt) obj).f210195a);
    }

    public final int hashCode() {
        return this.f210195a.hashCode();
    }
}
