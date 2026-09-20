package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zt91 implements f2b1, Serializable {

    /* JADX INFO: renamed from: i */
    public static final zt91 f286105i = new zt91("", "", "", geg1.m44518y(bu91.f31063f), false, "", "");

    /* JADX INFO: renamed from: a */
    public final String f286106a;

    /* JADX INFO: renamed from: b */
    public final String f286107b;

    /* JADX INFO: renamed from: c */
    public final String f286108c;

    /* JADX INFO: renamed from: d */
    public final List f286109d;

    /* JADX INFO: renamed from: e */
    public final boolean f286110e;

    /* JADX INFO: renamed from: f */
    public final String f286111f;

    /* JADX INFO: renamed from: g */
    public final String f286112g;

    /* JADX INFO: renamed from: h */
    public final bu91 f286113h;

    public zt91(String str, String str2, String str3, List list, boolean z, String str4, String str5) {
        this.f286106a = str;
        this.f286107b = str2;
        this.f286108c = str3;
        this.f286109d = list;
        this.f286110e = z;
        this.f286111f = str4;
        this.f286112g = str5;
        this.f286113h = (bu91) g6f.m43741q0(list);
    }

    @Override // p204p.f2b1
    /* JADX INFO: renamed from: a */
    public final List mo30507a() {
        ArrayList arrayListM66850s = ofg1.m66850s(this.f286109d);
        bu91 bu91Var = this.f286113h;
        int length = bu91Var.f31064a.length();
        String str = this.f286108c;
        if (length > 0 && str.length() > 0 && arrayListM66850s.isEmpty()) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayListM66850s);
        if (bu91Var.f31064a.length() == 0) {
            arrayList.add("spec id is empty");
        }
        if (str.length() == 0) {
            arrayList.add("app is empty");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List m96902b() {
        List list = this.f286109d;
        return list.subList(1, list.size());
    }

    /* JADX INFO: renamed from: c */
    public final yt91 m96903c() {
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = this.f286108c;
        yt91VarM50626j.f276053g = this.f286107b;
        bu91 bu91Var = this.f286113h;
        yt91VarM50626j.f276047a = bu91Var.f31064a;
        yt91VarM50626j.f276052f = this.f286106a;
        yt91VarM50626j.f276048b = bu91Var.f31065b;
        yt91VarM50626j.f276050d = bu91Var.f31066c;
        yt91VarM50626j.f276049c = bu91Var.f31067d;
        yt91VarM50626j.f276051e = bu91Var.f31068e;
        List listM96902b = m96902b();
        ArrayList arrayList = yt91VarM50626j.f276055i;
        arrayList.clear();
        arrayList.addAll(listM96902b);
        yt91VarM50626j.f276056j = this.f286110e;
        yt91VarM50626j.f276057k = this.f286111f;
        yt91VarM50626j.f276058l = this.f286112g;
        return yt91VarM50626j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zt91.class.equals(obj.getClass())) {
            return false;
        }
        zt91 zt91Var = (zt91) obj;
        if (wj50.m88271j(this.f286106a, zt91Var.f286106a) && wj50.m88271j(this.f286107b, zt91Var.f286107b) && wj50.m88271j(this.f286108c, zt91Var.f286108c) && wj50.m88271j(this.f286113h, zt91Var.f286113h) && this.f286109d.equals(zt91Var.f286109d) && this.f286110e == zt91Var.f286110e && wj50.m88271j(this.f286111f, zt91Var.f286111f)) {
            return wj50.m88271j(this.f286112g, zt91Var.f286112g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f286112g.hashCode() + s571.m77243b(s571.m77245d(s571.m77244c((this.f286113h.hashCode() + s571.m77243b(s571.m77243b(this.f286106a.hashCode() * 31, 31, this.f286107b), 31, this.f286108c)) * 31, 31, this.f286109d), 31, this.f286110e), 31, this.f286111f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f286108c);
        sb.append("][");
        List list = this.f286109d;
        sb.append(list.isEmpty() ? "no path" : g6f.m43753y0(list, "/", null, null, null, 62));
        sb.append("] <spec version ");
        sb.append(this.f286106a);
        sb.append("><generator version ");
        return dq60.m36617q(sb, this.f286107b, '>');
    }
}
