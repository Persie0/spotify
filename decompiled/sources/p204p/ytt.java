package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ytt {

    /* JADX INFO: renamed from: a */
    public final String f276207a;

    /* JADX INFO: renamed from: b */
    public final String f276208b;

    public ytt(String str, String str2) {
        this.f276207a = str;
        this.f276208b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytt)) {
            return false;
        }
        ytt yttVar = (ytt) obj;
        return wj50.m88271j(this.f276207a, yttVar.f276207a) && wj50.m88271j(this.f276208b, yttVar.f276208b);
    }

    public final int hashCode() {
        return this.f276208b.hashCode() + (this.f276207a.hashCode() * 31);
    }
}
