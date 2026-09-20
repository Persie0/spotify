package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ot41 extends zu41 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f168972a;

    /* JADX INFO: renamed from: b */
    public final String f168973b;

    /* JADX INFO: renamed from: c */
    public final un20 f168974c;

    public ot41(String str, ArrayList arrayList, un20 un20Var) {
        this.f168972a = arrayList;
        this.f168973b = str;
        this.f168974c = un20Var;
    }

    @Override // p204p.zu41
    /* JADX INFO: renamed from: a */
    public final un20 mo54269a() {
        return this.f168974c;
    }

    @Override // p204p.zu41
    /* JADX INFO: renamed from: b */
    public final String mo54270b() {
        return this.f168973b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot41)) {
            return false;
        }
        ot41 ot41Var = (ot41) obj;
        return this.f168972a.equals(ot41Var.f168972a) && wj50.m88271j(this.f168973b, ot41Var.f168973b) && wj50.m88271j(this.f168974c, ot41Var.f168974c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f168972a.hashCode() * 31, 31, this.f168973b);
        un20 un20Var = this.f168974c;
        return iM77243b + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
