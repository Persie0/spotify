package p204p;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class wn70 {

    /* JADX INFO: renamed from: a */
    public final List f253084a;

    /* JADX INFO: renamed from: b */
    public final u8b0 f253085b;

    /* JADX INFO: renamed from: c */
    public final String f253086c;

    /* JADX INFO: renamed from: d */
    public final long f253087d;

    /* JADX INFO: renamed from: e */
    public final int f253088e;

    /* JADX INFO: renamed from: f */
    public final long f253089f;

    /* JADX INFO: renamed from: g */
    public final String f253090g;

    /* JADX INFO: renamed from: h */
    public final List f253091h;

    /* JADX INFO: renamed from: i */
    public final ow4 f253092i;

    /* JADX INFO: renamed from: j */
    public final int f253093j;

    /* JADX INFO: renamed from: k */
    public final int f253094k;

    /* JADX INFO: renamed from: l */
    public final int f253095l;

    /* JADX INFO: renamed from: m */
    public final float f253096m;

    /* JADX INFO: renamed from: n */
    public final float f253097n;

    /* JADX INFO: renamed from: o */
    public final float f253098o;

    /* JADX INFO: renamed from: p */
    public final float f253099p;

    /* JADX INFO: renamed from: q */
    public final mw4 f253100q;

    /* JADX INFO: renamed from: r */
    public final twz0 f253101r;

    /* JADX INFO: renamed from: s */
    public final iw4 f253102s;

    /* JADX INFO: renamed from: t */
    public final List f253103t;

    /* JADX INFO: renamed from: u */
    public final int f253104u;

    /* JADX INFO: renamed from: v */
    public final boolean f253105v;

    /* JADX INFO: renamed from: w */
    public final px0 f253106w;

    /* JADX INFO: renamed from: x */
    public final u7n f253107x;

    /* JADX INFO: renamed from: y */
    public final int f253108y;

    public wn70(List list, u8b0 u8b0Var, String str, long j, int i, long j2, String str2, List list2, ow4 ow4Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, mw4 mw4Var, twz0 twz0Var, List list3, int i5, iw4 iw4Var, boolean z, px0 px0Var, u7n u7nVar, int i6) {
        this.f253084a = list;
        this.f253085b = u8b0Var;
        this.f253086c = str;
        this.f253087d = j;
        this.f253088e = i;
        this.f253089f = j2;
        this.f253090g = str2;
        this.f253091h = list2;
        this.f253092i = ow4Var;
        this.f253093j = i2;
        this.f253094k = i3;
        this.f253095l = i4;
        this.f253096m = f;
        this.f253097n = f2;
        this.f253098o = f3;
        this.f253099p = f4;
        this.f253100q = mw4Var;
        this.f253101r = twz0Var;
        this.f253103t = list3;
        this.f253104u = i5;
        this.f253102s = iw4Var;
        this.f253105v = z;
        this.f253106w = px0Var;
        this.f253107x = u7nVar;
        this.f253108y = i6;
    }

    /* JADX INFO: renamed from: a */
    public final String m88579a(String str) {
        int i;
        StringBuilder sbM36620t = dq60.m36620t(str);
        sbM36620t.append(this.f253086c);
        sbM36620t.append("\n");
        long j = this.f253089f;
        u8b0 u8b0Var = this.f253085b;
        wn70 wn70Var = (wn70) u8b0Var.f227890i.m87067c(j);
        if (wn70Var != null) {
            sbM36620t.append("\t\tParents: ");
            sbM36620t.append(wn70Var.f253086c);
            for (wn70 wn70Var2 = (wn70) u8b0Var.f227890i.m87067c(wn70Var.f253089f); wn70Var2 != null; wn70Var2 = (wn70) u8b0Var.f227890i.m87067c(wn70Var2.f253089f)) {
                sbM36620t.append("->");
                sbM36620t.append(wn70Var2.f253086c);
            }
            sbM36620t.append(str);
            sbM36620t.append("\n");
        }
        List list = this.f253091h;
        if (!list.isEmpty()) {
            sbM36620t.append(str);
            sbM36620t.append("\tMasks: ");
            sbM36620t.append(list.size());
            sbM36620t.append("\n");
        }
        int i2 = this.f253093j;
        if (i2 != 0 && (i = this.f253094k) != 0) {
            sbM36620t.append(str);
            sbM36620t.append("\tBackground: ");
            sbM36620t.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f253095l)));
        }
        List list2 = this.f253084a;
        if (!list2.isEmpty()) {
            sbM36620t.append(str);
            sbM36620t.append("\tShapes:\n");
            for (Object obj : list2) {
                sbM36620t.append(str);
                sbM36620t.append("\t\t");
                sbM36620t.append(obj);
                sbM36620t.append("\n");
            }
        }
        return sbM36620t.toString();
    }

    public final String toString() {
        return m88579a("");
    }
}
