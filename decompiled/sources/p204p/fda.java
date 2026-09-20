package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fda implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final Integer f68403a;

    /* JADX INFO: renamed from: b */
    public final bda f68404b;

    /* JADX INFO: renamed from: c */
    public final Integer f68405c;

    /* JADX INFO: renamed from: d */
    public final int f68406d;

    /* JADX INFO: renamed from: e */
    public final eda f68407e;

    /* JADX INFO: renamed from: f */
    public final n6q f68408f;

    /* JADX INFO: renamed from: g */
    public final boolean f68409g;

    /* JADX INFO: renamed from: h */
    public final boolean f68410h;

    /* JADX INFO: renamed from: i */
    public final boolean f68411i;

    /* JADX INFO: renamed from: j */
    public final boolean f68412j;

    /* JADX INFO: renamed from: k */
    public final boolean f68413k;

    public fda(Integer num, bda bdaVar, Integer num2, int i, eda edaVar, n6q n6qVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f68403a = num;
        this.f68404b = bdaVar;
        this.f68405c = num2;
        this.f68406d = i;
        this.f68407e = edaVar;
        this.f68408f = n6qVar;
        this.f68409g = z;
        this.f68410h = z2;
        this.f68411i = z3;
        this.f68412j = z4;
        this.f68413k = z5;
    }

    /* JADX INFO: renamed from: a */
    public static fda m41363a(fda fdaVar, Integer num, bda bdaVar, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            num = fdaVar.f68403a;
        }
        Integer num2 = num;
        bda bdaVar2 = (i2 & 2) != 0 ? fdaVar.f68404b : bdaVar;
        Integer num3 = fdaVar.f68405c;
        int i3 = (i2 & 8) != 0 ? fdaVar.f68406d : i;
        eda edaVar = fdaVar.f68407e;
        n6q n6qVar = fdaVar.f68408f;
        boolean z3 = fdaVar.f68409g;
        boolean z4 = (i2 & 128) != 0 ? fdaVar.f68410h : z;
        boolean z5 = (i2 & 256) != 0 ? fdaVar.f68411i : z2;
        boolean z6 = fdaVar.f68412j;
        boolean z7 = fdaVar.f68413k;
        fdaVar.getClass();
        return new fda(num2, bdaVar2, num3, i3, edaVar, n6qVar, z3, z4, z5, z6, z7);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41364b() {
        return this.f68410h;
    }

    /* JADX INFO: renamed from: c */
    public final n6q m41365c() {
        return this.f68408f;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m41366d() {
        return this.f68413k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fda)) {
            return false;
        }
        fda fdaVar = (fda) obj;
        return wj50.m88271j(this.f68403a, fdaVar.f68403a) && this.f68404b == fdaVar.f68404b && wj50.m88271j(this.f68405c, fdaVar.f68405c) && this.f68406d == fdaVar.f68406d && wj50.m88271j(this.f68407e, fdaVar.f68407e) && wj50.m88271j(this.f68408f, fdaVar.f68408f) && this.f68409g == fdaVar.f68409g && this.f68410h == fdaVar.f68410h && this.f68411i == fdaVar.f68411i && this.f68412j == fdaVar.f68412j && this.f68413k == fdaVar.f68413k;
    }

    public final int hashCode() {
        Integer num = this.f68403a;
        int iHashCode = (this.f68404b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        Integer num2 = this.f68405c;
        int iHashCode2 = (this.f68407e.hashCode() + f710.m40938f(this.f68406d, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31)) * 31;
        n6q n6qVar = this.f68408f;
        return Boolean.hashCode(this.f68413k) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode2 + (n6qVar != null ? n6qVar.hashCode() : 0)) * 31, 31, this.f68409g), 31, this.f68410h), 31, this.f68411i), 31, this.f68412j);
    }

    public /* synthetic */ fda(Integer num, bda bdaVar, Integer num2, int i, cda cdaVar, n6q n6qVar, boolean z, boolean z2, boolean z3, int i2) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? bda.f26061a : bdaVar, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? dda.f47755a : cdaVar, (i2 & 32) != 0 ? null : n6qVar, (i2 & 64) != 0 ? true : z, (i2 & 128) != 0 ? true : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0, (i2 & 1024) == 0);
    }
}
