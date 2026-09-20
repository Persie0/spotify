package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class emy implements hmy {

    /* JADX INFO: renamed from: a */
    public final String f61021a;

    /* JADX INFO: renamed from: b */
    public final String f61022b;

    public emy(String str, String str2) {
        this.f61021a = str;
        this.f61022b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emy)) {
            return false;
        }
        emy emyVar = (emy) obj;
        return wj50.m88271j(this.f61021a, emyVar.f61021a) && wj50.m88271j(this.f61022b, emyVar.f61022b);
    }

    public final int hashCode() {
        return this.f61022b.hashCode() + (this.f61021a.hashCode() * 31);
    }
}
