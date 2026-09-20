package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class kbz0 {

    /* JADX INFO: renamed from: a */
    public final List f121314a;

    /* JADX INFO: renamed from: b */
    public final boolean f121315b;

    /* JADX INFO: renamed from: c */
    public final String f121316c;

    /* JADX INFO: renamed from: d */
    public final List f121317d;

    /* JADX INFO: renamed from: e */
    public final Map f121318e;

    /* JADX INFO: renamed from: f */
    public final String f121319f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ kbz0(String str, int i, List list) {
        int i2 = i & 1;
        lau lauVar = lau.f131415a;
        this(i2 != 0 ? lauVar : list, false, (i & 4) != 0 ? "" : str, lauVar, nau.f152117a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbz0)) {
            return false;
        }
        kbz0 kbz0Var = (kbz0) obj;
        return wj50.m88271j(this.f121314a, kbz0Var.f121314a) && this.f121315b == kbz0Var.f121315b && wj50.m88271j(this.f121316c, kbz0Var.f121316c) && wj50.m88271j(this.f121317d, kbz0Var.f121317d) && wj50.m88271j(this.f121318e, kbz0Var.f121318e) && wj50.m88271j(this.f121319f, kbz0Var.f121319f);
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(s571.m77244c(s571.m77243b(s571.m77245d(this.f121314a.hashCode() * 31, 31, this.f121315b), 31, this.f121316c), 31, this.f121317d), 31, this.f121318e);
        String str = this.f121319f;
        return iM38557f + (str == null ? 0 : str.hashCode());
    }

    public kbz0(List list, boolean z, String str, List list2, Map map, String str2) {
        this.f121314a = list;
        this.f121315b = z;
        this.f121316c = str;
        this.f121317d = list2;
        this.f121318e = map;
        this.f121319f = str2;
    }
}
