package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class uji {

    /* JADX INFO: renamed from: a */
    public final String f231036a;

    /* JADX INFO: renamed from: b */
    public final String f231037b;

    /* JADX INFO: renamed from: c */
    public final dp11 f231038c;

    /* JADX INFO: renamed from: d */
    public final fmi f231039d;

    /* JADX INFO: renamed from: e */
    public final String f231040e;

    /* JADX INFO: renamed from: f */
    public final String f231041f;

    /* JADX INFO: renamed from: g */
    public final List f231042g;

    /* JADX INFO: renamed from: h */
    public final ol21 f231043h;

    /* JADX INFO: renamed from: i */
    public final String f231044i;

    public uji(String str, String str2, dp11 dp11Var, fmi fmiVar, String str3, String str4, ArrayList arrayList, ol21 ol21Var, String str5) {
        this.f231036a = str;
        this.f231037b = str2;
        this.f231038c = dp11Var;
        this.f231039d = fmiVar;
        this.f231040e = str3;
        this.f231041f = str4;
        this.f231042g = arrayList;
        this.f231043h = ol21Var;
        this.f231044i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uji)) {
            return false;
        }
        uji ujiVar = (uji) obj;
        return wj50.m88271j(this.f231036a, ujiVar.f231036a) && wj50.m88271j(this.f231037b, ujiVar.f231037b) && wj50.m88271j(this.f231038c, ujiVar.f231038c) && wj50.m88271j(this.f231039d, ujiVar.f231039d) && wj50.m88271j(this.f231040e, ujiVar.f231040e) && wj50.m88271j(this.f231041f, ujiVar.f231041f) && wj50.m88271j(this.f231042g, ujiVar.f231042g) && this.f231043h == ujiVar.f231043h && wj50.m88271j(this.f231044i, ujiVar.f231044i);
    }

    public final int hashCode() {
        int iHashCode = (this.f231039d.hashCode() + ((this.f231038c.hashCode() + s571.m77243b(this.f231036a.hashCode() * 31, 31, this.f231037b)) * 31)) * 31;
        String str = this.f231040e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f231041f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f231042g;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ol21 ol21Var = this.f231043h;
        int iHashCode5 = (iHashCode4 + (ol21Var == null ? 0 : ol21Var.hashCode())) * 31;
        String str3 = this.f231044i;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
