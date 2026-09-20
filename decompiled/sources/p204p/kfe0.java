package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kfe0 {

    /* JADX INFO: renamed from: a */
    public final String f122148a;

    /* JADX INFO: renamed from: b */
    public final String f122149b;

    /* JADX INFO: renamed from: c */
    public final int f122150c;

    /* JADX INFO: renamed from: d */
    public final noa1 f122151d;

    /* JADX INFO: renamed from: e */
    public final lnn0 f122152e;

    /* JADX INFO: renamed from: f */
    public final List f122153f;

    public kfe0(String str, String str2, int i, noa1 noa1Var, lnn0 lnn0Var, List list) {
        this.f122148a = str;
        this.f122149b = str2;
        this.f122150c = i;
        this.f122151d = noa1Var;
        this.f122152e = lnn0Var;
        this.f122153f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfe0)) {
            return false;
        }
        kfe0 kfe0Var = (kfe0) obj;
        return wj50.m88271j(this.f122148a, kfe0Var.f122148a) && wj50.m88271j(this.f122149b, kfe0Var.f122149b) && this.f122150c == kfe0Var.f122150c && wj50.m88271j(this.f122151d, kfe0Var.f122151d) && this.f122152e == kfe0Var.f122152e && wj50.m88271j(this.f122153f, kfe0Var.f122153f);
    }

    public final int hashCode() {
        return this.f122153f.hashCode() + ((this.f122152e.hashCode() + ((this.f122151d.hashCode() + mt60.m62800g(this.f122150c, s571.m77243b(this.f122148a.hashCode() * 31, 31, this.f122149b), 31)) * 31)) * 31);
    }
}
