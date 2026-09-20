package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r7z {

    /* JADX INFO: renamed from: a */
    public final String f196678a;

    /* JADX INFO: renamed from: b */
    public final String f196679b;

    public r7z(String str, String str2) {
        this.f196678a = str;
        this.f196679b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7z)) {
            return false;
        }
        r7z r7zVar = (r7z) obj;
        return wj50.m88271j(this.f196678a, r7zVar.f196678a) && wj50.m88271j(this.f196679b, r7zVar.f196679b);
    }

    public final int hashCode() {
        return this.f196679b.hashCode() + (this.f196678a.hashCode() * 31);
    }
}
