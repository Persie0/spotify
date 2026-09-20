package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class syk {

    /* JADX INFO: renamed from: a */
    public final String f215268a;

    /* JADX INFO: renamed from: b */
    public final List f215269b;

    /* JADX INFO: renamed from: c */
    public final int f215270c;

    /* JADX INFO: renamed from: d */
    public final String f215271d;

    public syk(int i, String str, String str2, List list) {
        this.f215268a = str;
        this.f215269b = list;
        this.f215270c = i;
        this.f215271d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syk)) {
            return false;
        }
        syk sykVar = (syk) obj;
        return wj50.m88271j(this.f215268a, sykVar.f215268a) && wj50.m88271j(this.f215269b, sykVar.f215269b) && this.f215270c == sykVar.f215270c && wj50.m88271j(this.f215271d, sykVar.f215271d);
    }

    public final int hashCode() {
        return this.f215271d.hashCode() + mt60.m62800g(this.f215270c, s571.m77244c(this.f215268a.hashCode() * 31, 31, this.f215269b), 31);
    }
}
