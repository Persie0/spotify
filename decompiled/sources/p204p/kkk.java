package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kkk implements nkk {

    /* JADX INFO: renamed from: a */
    public final String f123613a;

    /* JADX INFO: renamed from: b */
    public final String f123614b;

    /* JADX INFO: renamed from: c */
    public final String f123615c;

    /* JADX INFO: renamed from: d */
    public final String f123616d;

    /* JADX INFO: renamed from: e */
    public final int f123617e;

    /* JADX INFO: renamed from: f */
    public final String f123618f;

    /* JADX INFO: renamed from: g */
    public final boolean f123619g;

    /* JADX INFO: renamed from: h */
    public final n6f f123620h;

    /* JADX INFO: renamed from: i */
    public final String f123621i;

    /* JADX INFO: renamed from: j */
    public final boolean f123622j;

    /* JADX INFO: renamed from: k */
    public final n6f f123623k;

    /* JADX INFO: renamed from: l */
    public final qf40 f123624l;

    public kkk(String str, String str2, String str3, String str4, int i, String str5, boolean z, n6f n6fVar, String str6, boolean z2, n6f n6fVar2, qf40 qf40Var) {
        this.f123613a = str;
        this.f123614b = str2;
        this.f123615c = str3;
        this.f123616d = str4;
        this.f123617e = i;
        this.f123618f = str5;
        this.f123619g = z;
        this.f123620h = n6fVar;
        this.f123621i = str6;
        this.f123622j = z2;
        this.f123623k = n6fVar2;
        this.f123624l = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkk)) {
            return false;
        }
        kkk kkkVar = (kkk) obj;
        return wj50.m88271j(this.f123613a, kkkVar.f123613a) && wj50.m88271j(this.f123614b, kkkVar.f123614b) && wj50.m88271j(this.f123615c, kkkVar.f123615c) && wj50.m88271j(this.f123616d, kkkVar.f123616d) && this.f123617e == kkkVar.f123617e && wj50.m88271j(this.f123618f, kkkVar.f123618f) && this.f123619g == kkkVar.f123619g && wj50.m88271j(this.f123620h, kkkVar.f123620h) && wj50.m88271j(this.f123621i, kkkVar.f123621i) && this.f123622j == kkkVar.f123622j && wj50.m88271j(this.f123623k, kkkVar.f123623k) && wj50.m88271j(this.f123624l, kkkVar.f123624l);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f123617e, s571.m77243b(s571.m77243b(s571.m77243b(this.f123613a.hashCode() * 31, 31, this.f123614b), 31, this.f123615c), 31, this.f123616d), 31);
        String str = this.f123618f;
        int iM77245d = s571.m77245d((iM62800g + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123619g);
        n6f n6fVar = this.f123620h;
        int iHashCode = (iM77245d + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31;
        String str2 = this.f123621i;
        int iM77245d2 = s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f123622j);
        n6f n6fVar2 = this.f123623k;
        return this.f123624l.hashCode() + ((iM77245d2 + (n6fVar2 != null ? Long.hashCode(n6fVar2.f150873a) : 0)) * 31);
    }
}
