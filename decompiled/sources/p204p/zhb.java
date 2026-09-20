package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zhb {

    /* JADX INFO: renamed from: a */
    public final String f282863a;

    /* JADX INFO: renamed from: b */
    public final un20 f282864b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f282865c;

    /* JADX INFO: renamed from: d */
    public final f5u f282866d;

    public zhb(String str, un20 un20Var, ArrayList arrayList, f5u f5uVar) {
        this.f282863a = str;
        this.f282864b = un20Var;
        this.f282865c = arrayList;
        this.f282866d = f5uVar;
    }

    /* JADX INFO: renamed from: a */
    public final String m96122a() {
        return this.f282863a;
    }

    /* JADX INFO: renamed from: b */
    public final List m96123b() {
        return this.f282865c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhb)) {
            return false;
        }
        zhb zhbVar = (zhb) obj;
        return wj50.m88271j(this.f282863a, zhbVar.f282863a) && wj50.m88271j(this.f282864b, zhbVar.f282864b) && this.f282865c.equals(zhbVar.f282865c) && wj50.m88271j(this.f282866d, zhbVar.f282866d);
    }

    public final int hashCode() {
        int iHashCode = this.f282863a.hashCode() * 31;
        un20 un20Var = this.f282864b;
        int iM59700f = lq51.m59700f(this.f282865c, (iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31);
        f5u f5uVar = this.f282866d;
        return iM59700f + (f5uVar != null ? f5uVar.hashCode() : 0);
    }
}
