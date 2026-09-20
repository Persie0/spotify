package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class m4r implements q4r {

    /* JADX INFO: renamed from: a */
    public final dw50 f140006a;

    /* JADX INFO: renamed from: b */
    public final ibj f140007b;

    /* JADX INFO: renamed from: c */
    public final k980 f140008c;

    /* JADX INFO: renamed from: d */
    public final List f140009d;

    public m4r(dw50 dw50Var, ibj ibjVar, k980 k980Var, List list) {
        this.f140006a = dw50Var;
        this.f140007b = ibjVar;
        this.f140008c = k980Var;
        this.f140009d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4r)) {
            return false;
        }
        m4r m4rVar = (m4r) obj;
        return wj50.m88271j(this.f140006a, m4rVar.f140006a) && wj50.m88271j(this.f140007b, m4rVar.f140007b) && wj50.m88271j(this.f140008c, m4rVar.f140008c) && wj50.m88271j(this.f140009d, m4rVar.f140009d);
    }

    public final int hashCode() {
        return this.f140009d.hashCode() + ((this.f140008c.hashCode() + ((this.f140007b.hashCode() + (this.f140006a.hashCode() * 31)) * 31)) * 31);
    }
}
