package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h541 {

    /* JADX INFO: renamed from: a */
    public final Integer f87729a;

    /* JADX INFO: renamed from: b */
    public final int f87730b;

    /* JADX INFO: renamed from: c */
    public final boolean f87731c;

    /* JADX INFO: renamed from: d */
    public final boolean f87732d;

    /* JADX INFO: renamed from: e */
    public final qas f87733e;

    /* JADX INFO: renamed from: f */
    public final qf40 f87734f;

    public h541(Integer num, int i, boolean z, boolean z2, qas qasVar, qf40 qf40Var) {
        this.f87729a = num;
        this.f87730b = i;
        this.f87731c = z;
        this.f87732d = z2;
        this.f87733e = qasVar;
        this.f87734f = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h541)) {
            return false;
        }
        h541 h541Var = (h541) obj;
        return wj50.m88271j(this.f87729a, h541Var.f87729a) && this.f87730b == h541Var.f87730b && this.f87731c == h541Var.f87731c && this.f87732d == h541Var.f87732d && wj50.m88271j(this.f87733e, h541Var.f87733e) && wj50.m88271j(this.f87734f, h541Var.f87734f);
    }

    public final int hashCode() {
        Integer num = this.f87729a;
        int iM77245d = s571.m77245d(s571.m77245d(f710.m40938f(this.f87730b, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.f87731c), 31, this.f87732d);
        qas qasVar = this.f87733e;
        return this.f87734f.hashCode() + ((iM77245d + (qasVar != null ? qasVar.hashCode() : 0)) * 31);
    }
}
