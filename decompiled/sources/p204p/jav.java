package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jav {

    /* JADX INFO: renamed from: a */
    public final n6f f110552a;

    /* JADX INFO: renamed from: b */
    public final n6f f110553b;

    /* JADX INFO: renamed from: c */
    public final n6f f110554c;

    /* JADX INFO: renamed from: d */
    public final String f110555d;

    /* JADX INFO: renamed from: e */
    public final String f110556e;

    /* JADX INFO: renamed from: f */
    public final String f110557f;

    /* JADX INFO: renamed from: g */
    public final String f110558g;

    /* JADX INFO: renamed from: h */
    public final vqb f110559h;

    public jav(n6f n6fVar, n6f n6fVar2, n6f n6fVar3, String str, String str2, String str3, String str4, vqb vqbVar) {
        this.f110552a = n6fVar;
        this.f110553b = n6fVar2;
        this.f110554c = n6fVar3;
        this.f110555d = str;
        this.f110556e = str2;
        this.f110557f = str3;
        this.f110558g = str4;
        this.f110559h = vqbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jav)) {
            return false;
        }
        jav javVar = (jav) obj;
        return wj50.m88271j(this.f110552a, javVar.f110552a) && wj50.m88271j(this.f110553b, javVar.f110553b) && wj50.m88271j(this.f110554c, javVar.f110554c) && wj50.m88271j(this.f110555d, javVar.f110555d) && wj50.m88271j(this.f110556e, javVar.f110556e) && wj50.m88271j(this.f110557f, javVar.f110557f) && wj50.m88271j(this.f110558g, javVar.f110558g) && wj50.m88271j(this.f110559h, javVar.f110559h);
    }

    public final int hashCode() {
        n6f n6fVar = this.f110552a;
        int iHashCode = (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a)) * 31;
        n6f n6fVar2 = this.f110553b;
        int iHashCode2 = (iHashCode + (n6fVar2 == null ? 0 : Long.hashCode(n6fVar2.f150873a))) * 31;
        n6f n6fVar3 = this.f110554c;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((iHashCode2 + (n6fVar3 == null ? 0 : Long.hashCode(n6fVar3.f150873a))) * 31, 31, this.f110555d), 31, this.f110556e), 31, this.f110557f);
        String str = this.f110558g;
        int iHashCode3 = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        vqb vqbVar = this.f110559h;
        return iHashCode3 + (vqbVar != null ? vqbVar.hashCode() : 0);
    }
}
