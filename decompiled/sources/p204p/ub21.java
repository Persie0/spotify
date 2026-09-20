package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ub21 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f228615a;

    /* JADX INFO: renamed from: b */
    public final String f228616b;

    /* JADX INFO: renamed from: c */
    public final String f228617c;

    /* JADX INFO: renamed from: d */
    public final String f228618d;

    /* JADX INFO: renamed from: e */
    public final aaj f228619e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f228620f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f228621g;

    /* JADX INFO: renamed from: h */
    public final String f228622h;

    /* JADX INFO: renamed from: i */
    public final long f228623i;

    /* JADX INFO: renamed from: j */
    public final long f228624j;

    /* JADX INFO: renamed from: k */
    public final String f228625k;

    /* JADX INFO: renamed from: l */
    public final String f228626l;

    public ub21(String str, String str2, String str3, String str4, aaj aajVar, ArrayList arrayList, ArrayList arrayList2, String str5, long j, long j2, String str6, String str7) {
        this.f228615a = str;
        this.f228616b = str2;
        this.f228617c = str3;
        this.f228618d = str4;
        this.f228619e = aajVar;
        this.f228620f = arrayList;
        this.f228621g = arrayList2;
        this.f228622h = str5;
        this.f228623i = j;
        this.f228624j = j2;
        this.f228625k = str6;
        this.f228626l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub21)) {
            return false;
        }
        ub21 ub21Var = (ub21) obj;
        return wj50.m88271j(this.f228615a, ub21Var.f228615a) && wj50.m88271j(this.f228616b, ub21Var.f228616b) && wj50.m88271j(this.f228617c, ub21Var.f228617c) && wj50.m88271j(this.f228618d, ub21Var.f228618d) && this.f228619e == ub21Var.f228619e && this.f228620f.equals(ub21Var.f228620f) && this.f228621g.equals(ub21Var.f228621g) && wj50.m88271j(this.f228622h, ub21Var.f228622h) && this.f228623i == ub21Var.f228623i && this.f228624j == ub21Var.f228624j && wj50.m88271j(this.f228625k, ub21Var.f228625k) && wj50.m88271j(this.f228626l, ub21Var.f228626l);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(s571.m77243b(lq51.m59700f(this.f228621g, lq51.m59700f(this.f228620f, (this.f228619e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f228615a.hashCode() * 31, 31, this.f228616b), 31, this.f228617c), 31, this.f228618d)) * 31, 31), 31), 31, this.f228622h), this.f228623i, 31), this.f228624j, 31);
        String str = this.f228625k;
        int iHashCode = (iM36605e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f228626l;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
