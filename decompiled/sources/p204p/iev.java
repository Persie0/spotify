package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class iev {

    /* JADX INFO: renamed from: a */
    public final String f101550a;

    /* JADX INFO: renamed from: b */
    public final q76 f101551b;

    /* JADX INFO: renamed from: c */
    public final boolean f101552c;

    /* JADX INFO: renamed from: d */
    public final String f101553d;

    /* JADX INFO: renamed from: e */
    public final boolean f101554e;

    /* JADX INFO: renamed from: f */
    public final boolean f101555f;

    /* JADX INFO: renamed from: g */
    public final boolean f101556g;

    /* JADX INFO: renamed from: h */
    public final Set f101557h;

    /* JADX INFO: renamed from: i */
    public final String f101558i;

    /* JADX INFO: renamed from: j */
    public final lmo f101559j;

    public iev(String str, q76 q76Var, boolean z, String str2, boolean z2, boolean z3, boolean z4, Set set, String str3, lmo lmoVar) {
        this.f101550a = str;
        this.f101551b = q76Var;
        this.f101552c = z;
        this.f101553d = str2;
        this.f101554e = z2;
        this.f101555f = z3;
        this.f101556g = z4;
        this.f101557h = set;
        this.f101558i = str3;
        this.f101559j = lmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iev)) {
            return false;
        }
        iev ievVar = (iev) obj;
        return wj50.m88271j(this.f101550a, ievVar.f101550a) && wj50.m88271j(this.f101551b, ievVar.f101551b) && this.f101552c == ievVar.f101552c && wj50.m88271j(this.f101553d, ievVar.f101553d) && this.f101554e == ievVar.f101554e && this.f101555f == ievVar.f101555f && this.f101556g == ievVar.f101556g && wj50.m88271j(this.f101557h, ievVar.f101557h) && wj50.m88271j(this.f101558i, ievVar.f101558i) && wj50.m88271j(this.f101559j, ievVar.f101559j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f101551b.hashCode() + (this.f101550a.hashCode() * 31)) * 31, 31, this.f101552c);
        String str = this.f101553d;
        int iM56830b = klh.m56830b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f101554e), 31, false), 31, this.f101555f), 31, this.f101556g), 31, this.f101557h);
        String str2 = this.f101558i;
        int iHashCode = (iM56830b + (str2 == null ? 0 : str2.hashCode())) * 31;
        lmo lmoVar = this.f101559j;
        return iHashCode + (lmoVar != null ? Long.hashCode(lmoVar.f134995a) : 0);
    }
}
