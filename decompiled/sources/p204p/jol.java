package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jol {

    /* JADX INFO: renamed from: a */
    public final String f114448a;

    /* JADX INFO: renamed from: b */
    public final String f114449b;

    public jol(String str, String str2) {
        this.f114448a = str;
        this.f114449b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jol)) {
            return false;
        }
        jol jolVar = (jol) obj;
        return wj50.m88271j(this.f114448a, jolVar.f114448a) && wj50.m88271j(this.f114449b, jolVar.f114449b);
    }

    public final int hashCode() {
        String str = this.f114448a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f114449b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
