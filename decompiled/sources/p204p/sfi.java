package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sfi {

    /* JADX INFO: renamed from: a */
    public final String f208588a;

    /* JADX INFO: renamed from: b */
    public final j15 f208589b;

    /* JADX INFO: renamed from: c */
    public final n6f f208590c;

    /* JADX INFO: renamed from: d */
    public final boolean f208591d;

    /* JADX INFO: renamed from: e */
    public final int f208592e;

    /* JADX INFO: renamed from: f */
    public final int f208593f;

    /* JADX INFO: renamed from: g */
    public final boolean f208594g;

    /* JADX INFO: renamed from: h */
    public final boolean f208595h;

    /* JADX INFO: renamed from: i */
    public final boolean f208596i;

    /* JADX INFO: renamed from: j */
    public final boolean f208597j;

    /* JADX INFO: renamed from: k */
    public final n6f f208598k;

    /* JADX INFO: renamed from: l */
    public final String f208599l;

    /* JADX INFO: renamed from: m */
    public final Integer f208600m;

    /* JADX INFO: renamed from: n */
    public final Integer f208601n;

    public sfi(String str, j15 j15Var, n6f n6fVar, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, n6f n6fVar2, String str2, Integer num, Integer num2, int i3) {
        j15 j15Var2 = (i3 & 4) != 0 ? null : j15Var;
        n6f n6fVar3 = (i3 & 8) != 0 ? null : n6fVar;
        boolean z5 = (i3 & 16) != 0 ? false : z;
        int i4 = (i3 & 32) != 0 ? 2 : i;
        int i5 = (i3 & 64) == 0 ? i2 : 2;
        boolean z6 = (i3 & 128) != 0 ? true : z2;
        boolean z7 = (i3 & 256) == 0;
        boolean z8 = (i3 & 512) != 0 ? false : z3;
        boolean z9 = (i3 & 1024) == 0 ? z4 : false;
        n6f n6fVar4 = (i3 & 2048) != 0 ? null : n6fVar2;
        String str3 = (i3 & 4096) != 0 ? null : str2;
        Integer num3 = (i3 & 8192) != 0 ? null : num;
        Integer num4 = (i3 & 16384) == 0 ? num2 : null;
        this.f208588a = str;
        this.f208589b = j15Var2;
        this.f208590c = n6fVar3;
        this.f208591d = z5;
        this.f208592e = i4;
        this.f208593f = i5;
        this.f208594g = z6;
        this.f208595h = z7;
        this.f208596i = z8;
        this.f208597j = z9;
        this.f208598k = n6fVar4;
        this.f208599l = str3;
        this.f208600m = num3;
        this.f208601n = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfi)) {
            return false;
        }
        sfi sfiVar = (sfi) obj;
        return wj50.m88271j(this.f208588a, sfiVar.f208588a) && wj50.m88271j(this.f208589b, sfiVar.f208589b) && wj50.m88271j(this.f208590c, sfiVar.f208590c) && this.f208591d == sfiVar.f208591d && this.f208592e == sfiVar.f208592e && this.f208593f == sfiVar.f208593f && this.f208594g == sfiVar.f208594g && this.f208595h == sfiVar.f208595h && this.f208596i == sfiVar.f208596i && this.f208597j == sfiVar.f208597j && wj50.m88271j(this.f208598k, sfiVar.f208598k) && wj50.m88271j(this.f208599l, sfiVar.f208599l) && wj50.m88271j(this.f208600m, sfiVar.f208600m) && wj50.m88271j(this.f208601n, sfiVar.f208601n);
    }

    public final int hashCode() {
        int iHashCode = this.f208588a.hashCode() * 961;
        j15 j15Var = this.f208589b;
        int iHashCode2 = (iHashCode + (j15Var == null ? 0 : j15Var.hashCode())) * 31;
        n6f n6fVar = this.f208590c;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(f710.m40938f(this.f208593f, f710.m40938f(this.f208592e, s571.m77245d((iHashCode2 + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31, 31, this.f208591d), 31), 31), 31, this.f208594g), 31, this.f208595h), 31, this.f208596i), 31, this.f208597j);
        n6f n6fVar2 = this.f208598k;
        int iHashCode3 = (iM77245d + (n6fVar2 == null ? 0 : Long.hashCode(n6fVar2.f150873a))) * 31;
        String str = this.f208599l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f208600m;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f208601n;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }
}
