package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jdy implements kdy {

    /* JADX INFO: renamed from: a */
    public final String f111407a;

    /* JADX INFO: renamed from: b */
    public final String f111408b;

    /* JADX INFO: renamed from: c */
    public final String f111409c;

    public jdy(String str, String str2, String str3) {
        this.f111407a = str;
        this.f111408b = str2;
        this.f111409c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdy)) {
            return false;
        }
        jdy jdyVar = (jdy) obj;
        return wj50.m88271j(this.f111407a, jdyVar.f111407a) && wj50.m88271j(this.f111408b, jdyVar.f111408b) && wj50.m88271j(this.f111409c, jdyVar.f111409c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f111407a.hashCode() * 31, 31, this.f111408b);
        String str = this.f111409c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
