package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rdw {

    /* JADX INFO: renamed from: a */
    public final String f198216a;

    /* JADX INFO: renamed from: b */
    public final String f198217b;

    public rdw(String str, String str2) {
        this.f198216a = str;
        this.f198217b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdw)) {
            return false;
        }
        rdw rdwVar = (rdw) obj;
        return wj50.m88271j(this.f198216a, rdwVar.f198216a) && wj50.m88271j(this.f198217b, rdwVar.f198217b);
    }

    public final int hashCode() {
        return this.f198217b.hashCode() + (this.f198216a.hashCode() * 31);
    }
}
