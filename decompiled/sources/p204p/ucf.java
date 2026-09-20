package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ucf {

    /* JADX INFO: renamed from: a */
    public final String f229026a;

    /* JADX INFO: renamed from: b */
    public final String f229027b;

    /* JADX INFO: renamed from: c */
    public final boolean f229028c;

    public ucf(String str, String str2, boolean z) {
        this.f229026a = str;
        this.f229027b = str2;
        this.f229028c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucf)) {
            return false;
        }
        ucf ucfVar = (ucf) obj;
        return wj50.m88271j(this.f229026a, ucfVar.f229026a) && wj50.m88271j(this.f229027b, ucfVar.f229027b) && this.f229028c == ucfVar.f229028c;
    }

    public final int hashCode() {
        String str = this.f229026a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f229027b;
        return Boolean.hashCode(this.f229028c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
