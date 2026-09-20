package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class grk0 {

    /* JADX INFO: renamed from: a */
    public final List f83777a;

    /* JADX INFO: renamed from: b */
    public final tqi f83778b;

    /* JADX INFO: renamed from: c */
    public final api f83779c;

    /* JADX INFO: renamed from: d */
    public final g0j f83780d;

    /* JADX INFO: renamed from: e */
    public final g0j f83781e;

    /* JADX INFO: renamed from: f */
    public final boolean f83782f;

    /* JADX INFO: renamed from: g */
    public final String f83783g;

    /* JADX INFO: renamed from: h */
    public final api f83784h;

    /* JADX INFO: renamed from: i */
    public final boolean f83785i;

    /* JADX INFO: renamed from: j */
    public final boolean f83786j;

    public grk0(List list, tqi tqiVar, api apiVar, g0j g0jVar, g0j g0jVar2, boolean z, String str, api apiVar2, boolean z2, boolean z3) {
        this.f83777a = list;
        this.f83778b = tqiVar;
        this.f83779c = apiVar;
        this.f83780d = g0jVar;
        this.f83781e = g0jVar2;
        this.f83782f = z;
        this.f83783g = str;
        this.f83784h = apiVar2;
        this.f83785i = z2;
        this.f83786j = z3;
    }

    /* JADX INFO: renamed from: a */
    public static grk0 m45510a(grk0 grk0Var, List list, tqi tqiVar, api apiVar, g0j g0jVar, g0j g0jVar2, boolean z, String str, api apiVar2, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = grk0Var.f83777a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            tqiVar = grk0Var.f83778b;
        }
        tqi tqiVar2 = tqiVar;
        if ((i & 4) != 0) {
            apiVar = grk0Var.f83779c;
        }
        api apiVar3 = apiVar;
        if ((i & 8) != 0) {
            g0jVar = grk0Var.f83780d;
        }
        g0j g0jVar3 = g0jVar;
        g0j g0jVar4 = (i & 16) != 0 ? grk0Var.f83781e : g0jVar2;
        boolean z3 = (i & 32) != 0 ? grk0Var.f83782f : z;
        String str2 = (i & 64) != 0 ? grk0Var.f83783g : str;
        api apiVar4 = (i & 128) != 0 ? grk0Var.f83784h : apiVar2;
        boolean z4 = grk0Var.f83785i;
        boolean z5 = (i & 512) != 0 ? grk0Var.f83786j : z2;
        grk0Var.getClass();
        return new grk0(list2, tqiVar2, apiVar3, g0jVar3, g0jVar4, z3, str2, apiVar4, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grk0)) {
            return false;
        }
        grk0 grk0Var = (grk0) obj;
        return wj50.m88271j(this.f83777a, grk0Var.f83777a) && wj50.m88271j(this.f83778b, grk0Var.f83778b) && wj50.m88271j(this.f83779c, grk0Var.f83779c) && this.f83780d == grk0Var.f83780d && this.f83781e == grk0Var.f83781e && this.f83782f == grk0Var.f83782f && wj50.m88271j(this.f83783g, grk0Var.f83783g) && wj50.m88271j(this.f83784h, grk0Var.f83784h) && this.f83785i == grk0Var.f83785i && this.f83786j == grk0Var.f83786j;
    }

    public final int hashCode() {
        int iHashCode = this.f83777a.hashCode() * 31;
        tqi tqiVar = this.f83778b;
        int iHashCode2 = (iHashCode + (tqiVar == null ? 0 : tqiVar.hashCode())) * 31;
        api apiVar = this.f83779c;
        int iM77245d = s571.m77245d((this.f83781e.hashCode() + ((this.f83780d.hashCode() + ((iHashCode2 + (apiVar == null ? 0 : apiVar.hashCode())) * 31)) * 31)) * 31, 31, this.f83782f);
        String str = this.f83783g;
        int iHashCode3 = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        api apiVar2 = this.f83784h;
        return Boolean.hashCode(this.f83786j) + s571.m77245d((iHashCode3 + (apiVar2 != null ? apiVar2.hashCode() : 0)) * 31, 31, this.f83785i);
    }
}
