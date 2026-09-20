package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sp2 {

    /* JADX INFO: renamed from: a */
    public final String f212709a;

    /* JADX INFO: renamed from: b */
    public final String f212710b;

    /* JADX INFO: renamed from: c */
    public final String f212711c;

    /* JADX INFO: renamed from: d */
    public final List f212712d;

    /* JADX INFO: renamed from: e */
    public final th00 f212713e;

    public sp2(String str, String str2, String str3, List list, th00 th00Var) {
        this.f212709a = str;
        this.f212710b = str2;
        this.f212711c = str3;
        this.f212712d = list;
        this.f212713e = th00Var;
    }

    /* JADX INFO: renamed from: a */
    public final th00 m78850a() {
        return this.f212713e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp2)) {
            return false;
        }
        sp2 sp2Var = (sp2) obj;
        return wj50.m88271j(this.f212709a, sp2Var.f212709a) && wj50.m88271j(this.f212710b, sp2Var.f212710b) && wj50.m88271j(this.f212711c, sp2Var.f212711c) && wj50.m88271j(this.f212712d, sp2Var.f212712d) && wj50.m88271j(this.f212713e, sp2Var.f212713e);
    }

    public final int hashCode() {
        int iHashCode = this.f212709a.hashCode() * 31;
        String str = this.f212710b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f212711c;
        return this.f212713e.hashCode() + s571.m77244c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f212712d);
    }

    public sp2(int i, String str, String str2, String str3, ArrayList arrayList) {
        this(str, str2, (i & 4) != 0 ? null : str3, arrayList, new rp2(2, 0, null));
    }
}
