package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class egr {

    /* JADX INFO: renamed from: a */
    public final Double f59380a;

    /* JADX INFO: renamed from: b */
    public final String f59381b;

    public egr(Double d, String str) {
        this.f59380a = d;
        this.f59381b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egr)) {
            return false;
        }
        egr egrVar = (egr) obj;
        return wj50.m88271j(this.f59380a, egrVar.f59380a) && wj50.m88271j(this.f59381b, egrVar.f59381b);
    }

    public final int hashCode() {
        Double d = this.f59380a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f59381b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
