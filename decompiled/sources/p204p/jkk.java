package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jkk {

    /* JADX INFO: renamed from: a */
    public final String f113322a;

    /* JADX INFO: renamed from: b */
    public final String f113323b;

    public jkk(String str, String str2) {
        this.f113322a = str;
        this.f113323b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkk)) {
            return false;
        }
        jkk jkkVar = (jkk) obj;
        return wj50.m88271j(this.f113322a, jkkVar.f113322a) && wj50.m88271j(this.f113323b, jkkVar.f113323b);
    }

    public final int hashCode() {
        return this.f113323b.hashCode() + (this.f113322a.hashCode() * 31);
    }
}
