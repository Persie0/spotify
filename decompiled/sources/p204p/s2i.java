package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s2i {

    /* JADX INFO: renamed from: a */
    public final String f205012a;

    /* JADX INFO: renamed from: b */
    public final int f205013b;

    /* JADX INFO: renamed from: c */
    public final boolean f205014c;

    /* JADX INFO: renamed from: d */
    public final String f205015d;

    /* JADX INFO: renamed from: e */
    public final Integer f205016e;

    /* JADX INFO: renamed from: f */
    public final Integer f205017f;

    public s2i(int i, Integer num, Integer num2, String str, String str2, boolean z) {
        this.f205012a = str;
        this.f205013b = i;
        this.f205014c = z;
        this.f205015d = str2;
        this.f205016e = num;
        this.f205017f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2i)) {
            return false;
        }
        s2i s2iVar = (s2i) obj;
        return wj50.m88271j(this.f205012a, s2iVar.f205012a) && this.f205013b == s2iVar.f205013b && this.f205014c == s2iVar.f205014c && wj50.m88271j(this.f205015d, s2iVar.f205015d) && wj50.m88271j(this.f205016e, s2iVar.f205016e) && wj50.m88271j(this.f205017f, s2iVar.f205017f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f205013b, this.f205012a.hashCode() * 31, 31), 31, this.f205014c);
        String str = this.f205015d;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f205016e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f205017f;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public /* synthetic */ s2i(String str, int i, int i2, boolean z) {
        this((i2 & 2) != 0 ? 1 : i, null, null, str, null, (i2 & 4) != 0 ? false : z);
    }
}
