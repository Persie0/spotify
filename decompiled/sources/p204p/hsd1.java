package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class hsd1 {
    public static final gsd1 Companion = new gsd1();

    /* JADX INFO: renamed from: d */
    public static final fr70[] f94678d = {q3d0.m72078I(2, rfd1.f198605X), null, null};

    /* JADX INFO: renamed from: a */
    public final List f94679a;

    /* JADX INFO: renamed from: b */
    public final String f94680b;

    /* JADX INFO: renamed from: c */
    public final String f94681c;

    public /* synthetic */ hsd1(int i, String str, String str2, List list) {
        if (2 != (i & 2)) {
            edo.m38617p(i, 2, fsd1.f72835a.getDescriptor());
            throw null;
        }
        this.f94679a = (i & 1) == 0 ? lau.f131415a : list;
        this.f94680b = str;
        if ((i & 4) == 0) {
            this.f94681c = null;
        } else {
            this.f94681c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsd1)) {
            return false;
        }
        hsd1 hsd1Var = (hsd1) obj;
        return wj50.m88271j(this.f94679a, hsd1Var.f94679a) && wj50.m88271j(this.f94680b, hsd1Var.f94680b) && wj50.m88271j(this.f94681c, hsd1Var.f94681c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f94679a.hashCode() * 31, 31, this.f94680b);
        String str = this.f94681c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    public hsd1(String str, String str2, ArrayList arrayList) {
        this.f94679a = arrayList;
        this.f94680b = str;
        this.f94681c = str2;
    }
}
