package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cet implements eet {

    /* JADX INFO: renamed from: a */
    public final String f37174a;

    /* JADX INFO: renamed from: b */
    public final String f37175b;

    public cet(String str, String str2) {
        this.f37174a = str;
        this.f37175b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cet)) {
            return false;
        }
        cet cetVar = (cet) obj;
        return wj50.m88271j(this.f37174a, cetVar.f37174a) && wj50.m88271j(this.f37175b, cetVar.f37175b);
    }

    public final int hashCode() {
        return this.f37175b.hashCode() + (this.f37174a.hashCode() * 31);
    }
}
