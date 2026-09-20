package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class gpk {

    /* JADX INFO: renamed from: a */
    public final String f83211a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f83212b;

    /* JADX INFO: renamed from: c */
    public final rcm0 f83213c;

    /* JADX INFO: renamed from: d */
    public final String f83214d;

    /* JADX INFO: renamed from: e */
    public final int f83215e;

    /* JADX INFO: renamed from: f */
    public final String f83216f;

    public gpk(int i, String str, String str2, String str3, ArrayList arrayList, rcm0 rcm0Var) {
        this.f83211a = str;
        this.f83212b = arrayList;
        this.f83213c = rcm0Var;
        this.f83214d = str2;
        this.f83215e = i;
        this.f83216f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpk)) {
            return false;
        }
        gpk gpkVar = (gpk) obj;
        return wj50.m88271j(this.f83211a, gpkVar.f83211a) && this.f83212b.equals(gpkVar.f83212b) && this.f83213c.equals(gpkVar.f83213c) && wj50.m88271j(this.f83214d, gpkVar.f83214d) && this.f83215e == gpkVar.f83215e && wj50.m88271j(this.f83216f, gpkVar.f83216f);
    }

    public final int hashCode() {
        return this.f83216f.hashCode() + mt60.m62800g(this.f83215e, s571.m77243b(yds.m93483m(this.f83213c, lq51.m59700f(this.f83212b, this.f83211a.hashCode() * 31, 31), 31), 31, this.f83214d), 31);
    }
}
