package p204p;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ofd0 {

    /* JADX INFO: renamed from: i */
    public static final String f164719i;

    /* JADX INFO: renamed from: j */
    public static final String f164720j;

    /* JADX INFO: renamed from: k */
    public static final String f164721k;

    /* JADX INFO: renamed from: l */
    public static final String f164722l;

    /* JADX INFO: renamed from: m */
    public static final String f164723m;

    /* JADX INFO: renamed from: n */
    public static final String f164724n;

    /* JADX INFO: renamed from: o */
    public static final String f164725o;

    /* JADX INFO: renamed from: p */
    public static final String f164726p;

    /* JADX INFO: renamed from: a */
    public final Uri f164727a;

    /* JADX INFO: renamed from: b */
    public final String f164728b;

    /* JADX INFO: renamed from: c */
    public final lfd0 f164729c;

    /* JADX INFO: renamed from: d */
    public final efd0 f164730d;

    /* JADX INFO: renamed from: e */
    public final List f164731e;

    /* JADX INFO: renamed from: f */
    public final String f164732f;

    /* JADX INFO: renamed from: g */
    public final pf40 f164733g;

    /* JADX INFO: renamed from: h */
    public final long f164734h;

    static {
        String str = h0b1.f86200a;
        f164719i = Integer.toString(0, 36);
        f164720j = Integer.toString(1, 36);
        f164721k = Integer.toString(2, 36);
        f164722l = Integer.toString(3, 36);
        f164723m = Integer.toString(4, 36);
        f164724n = Integer.toString(5, 36);
        f164725o = Integer.toString(6, 36);
        f164726p = Integer.toString(7, 36);
    }

    public ofd0(Uri uri, String str, lfd0 lfd0Var, efd0 efd0Var, List list, String str2, pf40 pf40Var, long j) {
        this.f164727a = uri;
        this.f164728b = def0.m35799p(str);
        this.f164729c = lfd0Var;
        this.f164730d = efd0Var;
        this.f164731e = list;
        this.f164732f = str2;
        this.f164733g = pf40Var;
        jf40 jf40VarM69788m = pf40.m69788m();
        for (int i = 0; i < pf40Var.size(); i++) {
            rfd0 rfd0Var = (rfd0) pf40Var.get(i);
            zwi zwiVar = new zwi();
            zwiVar.f286989c = rfd0Var.f198586a;
            zwiVar.f286993g = rfd0Var.f198587b;
            zwiVar.f286990d = rfd0Var.f198588c;
            zwiVar.f286987a = rfd0Var.f198589d;
            zwiVar.f286988b = rfd0Var.f198590e;
            zwiVar.f286991e = rfd0Var.f198591f;
            zwiVar.f286992f = rfd0Var.f198592g;
            jf40VarM69788m.m28985c(new qfd0(zwiVar));
        }
        jf40VarM69788m.m53150g();
        this.f164734h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofd0)) {
            return false;
        }
        ofd0 ofd0Var = (ofd0) obj;
        if (!this.f164727a.equals(ofd0Var.f164727a) || !Objects.equals(this.f164728b, ofd0Var.f164728b) || !Objects.equals(this.f164729c, ofd0Var.f164729c) || !Objects.equals(this.f164730d, ofd0Var.f164730d) || !this.f164731e.equals(ofd0Var.f164731e) || !Objects.equals(this.f164732f, ofd0Var.f164732f)) {
            return false;
        }
        pf40 pf40Var = ofd0Var.f164733g;
        pf40 pf40Var2 = this.f164733g;
        pf40Var2.getClass();
        return pmf0.m70330p(pf40Var2, pf40Var) && this.f164734h == ofd0Var.f164734h;
    }

    public final int hashCode() {
        int iHashCode = this.f164727a.hashCode() * 31;
        String str = this.f164728b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        lfd0 lfd0Var = this.f164729c;
        int iHashCode3 = (iHashCode2 + (lfd0Var == null ? 0 : lfd0Var.hashCode())) * 31;
        efd0 efd0Var = this.f164730d;
        int iHashCode4 = (this.f164731e.hashCode() + ((iHashCode3 + (efd0Var == null ? 0 : efd0Var.hashCode())) * 31)) * 31;
        String str2 = this.f164732f;
        return (int) ((((long) ((this.f164733g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.f164734h);
    }
}
