package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class syh implements tyh {

    /* JADX INFO: renamed from: a */
    public final String f215250a;

    /* JADX INFO: renamed from: b */
    public final String f215251b;

    public syh(String str, String str2) {
        this.f215250a = str;
        this.f215251b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syh)) {
            return false;
        }
        syh syhVar = (syh) obj;
        return wj50.m88271j(this.f215250a, syhVar.f215250a) && wj50.m88271j(this.f215251b, syhVar.f215251b);
    }

    public final int hashCode() {
        return this.f215251b.hashCode() + (this.f215250a.hashCode() * 31);
    }
}
