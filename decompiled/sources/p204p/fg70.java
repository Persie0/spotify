package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fg70 implements hg70 {

    /* JADX INFO: renamed from: a */
    public final String f69239a;

    public fg70(String str) {
        this.f69239a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg70) && wj50.m88271j(this.f69239a, ((fg70) obj).f69239a);
    }

    public final int hashCode() {
        return this.f69239a.hashCode();
    }
}
