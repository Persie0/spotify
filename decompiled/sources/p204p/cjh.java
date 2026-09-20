package p204p;

import androidx.car.app.model.SectionHeader;

/* JADX INFO: loaded from: classes5.dex */
public final class cjh {

    /* JADX INFO: renamed from: a */
    public final int f38584a;

    /* JADX INFO: renamed from: b */
    public final st91 f38585b;

    /* JADX INFO: renamed from: c */
    public final Object f38586c;

    /* JADX INFO: renamed from: d */
    public final eh00 f38587d;

    /* JADX INFO: renamed from: e */
    public final SectionHeader f38588e;

    public cjh(int i, st91 st91Var, vh00 vh00Var, w831 w831Var, SectionHeader sectionHeader) {
        this.f38584a = i;
        this.f38585b = st91Var;
        this.f38586c = vh00Var;
        this.f38587d = w831Var;
        this.f38588e = sectionHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjh)) {
            return false;
        }
        cjh cjhVar = (cjh) obj;
        return this.f38584a == cjhVar.f38584a && wj50.m88271j(this.f38585b, cjhVar.f38585b) && this.f38586c.equals(cjhVar.f38586c) && wj50.m88271j(this.f38587d, cjhVar.f38587d) && wj50.m88271j(this.f38588e, cjhVar.f38588e);
    }

    public final int hashCode() {
        int iM36604d = dq60.m36604d(dq60.m36604d(Integer.hashCode(this.f38584a) * 31, 31, this.f38585b.f213866a), 31, this.f38586c);
        eh00 eh00Var = this.f38587d;
        int iHashCode = (iM36604d + (eh00Var == null ? 0 : eh00Var.hashCode())) * 31;
        SectionHeader sectionHeader = this.f38588e;
        return iHashCode + (sectionHeader != null ? sectionHeader.hashCode() : 0);
    }
}
