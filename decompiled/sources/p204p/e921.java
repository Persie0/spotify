package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e921 {

    /* JADX INFO: renamed from: a */
    public final boolean f57334a;

    /* JADX INFO: renamed from: b */
    public final List f57335b;

    /* JADX INFO: renamed from: c */
    public final boolean f57336c;

    /* JADX INFO: renamed from: d */
    public final String f57337d;

    /* JADX INFO: renamed from: e */
    public final wb50 f57338e;

    /* JADX INFO: renamed from: f */
    public final r0s f57339f;

    /* JADX INFO: renamed from: g */
    public final boolean f57340g;

    /* JADX INFO: renamed from: h */
    public final boolean f57341h;

    /* JADX INFO: renamed from: i */
    public final bs81 f57342i;

    /* JADX INFO: renamed from: j */
    public final boolean f57343j;

    /* JADX INFO: renamed from: k */
    public final boolean f57344k;

    /* JADX INFO: renamed from: l */
    public final boolean f57345l;

    /* JADX INFO: renamed from: m */
    public final boolean f57346m;

    /* JADX INFO: renamed from: n */
    public final dzi f57347n;

    /* JADX INFO: renamed from: o */
    public final boolean f57348o;

    public e921(boolean z, List list, boolean z2, String str, wb50 wb50Var, r0s r0sVar, boolean z3, boolean z4, bs81 bs81Var, boolean z5, boolean z6, boolean z7, boolean z8, dzi dziVar, boolean z9) {
        this.f57334a = z;
        this.f57335b = list;
        this.f57336c = z2;
        this.f57337d = str;
        this.f57338e = wb50Var;
        this.f57339f = r0sVar;
        this.f57340g = z3;
        this.f57341h = z4;
        this.f57342i = bs81Var;
        this.f57343j = z5;
        this.f57344k = z6;
        this.f57345l = z7;
        this.f57346m = z8;
        this.f57347n = dziVar;
        this.f57348o = z9;
    }

    /* JADX INFO: renamed from: a */
    public static e921 m38190a(e921 e921Var, boolean z, List list, String str, wb50 wb50Var, r0s r0sVar, boolean z2, boolean z3, bs81 bs81Var, boolean z4, boolean z5, boolean z6, dzi dziVar, boolean z7, int i) {
        boolean z8 = (i & 1) != 0 ? e921Var.f57334a : z;
        List list2 = (i & 2) != 0 ? e921Var.f57335b : list;
        boolean z9 = (i & 4) != 0 ? e921Var.f57336c : true;
        String str2 = (i & 8) != 0 ? e921Var.f57337d : str;
        wb50 wb50Var2 = (i & 16) != 0 ? e921Var.f57338e : wb50Var;
        r0s r0sVar2 = (i & 32) != 0 ? e921Var.f57339f : r0sVar;
        boolean z10 = (i & 64) != 0 ? e921Var.f57340g : z2;
        boolean z11 = (i & 128) != 0 ? e921Var.f57341h : z3;
        bs81 bs81Var2 = (i & 256) != 0 ? e921Var.f57342i : bs81Var;
        boolean z12 = (i & 512) != 0 ? e921Var.f57343j : z4;
        boolean z13 = (i & 1024) != 0 ? e921Var.f57344k : true;
        boolean z14 = (i & 2048) != 0 ? e921Var.f57345l : z5;
        boolean z15 = (i & 4096) != 0 ? e921Var.f57346m : z6;
        dzi dziVar2 = (i & 8192) != 0 ? e921Var.f57347n : dziVar;
        boolean z16 = (i & 16384) != 0 ? e921Var.f57348o : z7;
        e921Var.getClass();
        return new e921(z8, list2, z9, str2, wb50Var2, r0sVar2, z10, z11, bs81Var2, z12, z13, z14, z15, dziVar2, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e921)) {
            return false;
        }
        e921 e921Var = (e921) obj;
        return this.f57334a == e921Var.f57334a && wj50.m88271j(this.f57335b, e921Var.f57335b) && this.f57336c == e921Var.f57336c && wj50.m88271j(this.f57337d, e921Var.f57337d) && wj50.m88271j(this.f57338e, e921Var.f57338e) && wj50.m88271j(this.f57339f, e921Var.f57339f) && this.f57340g == e921Var.f57340g && this.f57341h == e921Var.f57341h && wj50.m88271j(this.f57342i, e921Var.f57342i) && this.f57343j == e921Var.f57343j && this.f57344k == e921Var.f57344k && this.f57345l == e921Var.f57345l && this.f57346m == e921Var.f57346m && this.f57347n == e921Var.f57347n && this.f57348o == e921Var.f57348o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57348o) + ((this.f57347n.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f57342i.hashCode() + s571.m77245d(s571.m77245d((this.f57339f.hashCode() + ((this.f57338e.hashCode() + s571.m77243b(s571.m77245d(s571.m77244c(Boolean.hashCode(this.f57334a) * 31, 31, this.f57335b), 31, this.f57336c), 31, this.f57337d)) * 31)) * 31, 31, this.f57340g), 31, this.f57341h)) * 31, 31, this.f57343j), 31, this.f57344k), 31, this.f57345l), 31, this.f57346m)) * 31);
    }

    public /* synthetic */ e921(r0s r0sVar) {
        this(false, lau.f131415a, false, "", sb50.f207357a, r0sVar, false, true, sr81.f213257a, false, false, false, true, dzi.f54671b, false);
    }
}
