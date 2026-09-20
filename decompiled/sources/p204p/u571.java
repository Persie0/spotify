package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u571 implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final List f226933a;

    /* JADX INFO: renamed from: b */
    public final List f226934b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f226935c;

    /* JADX INFO: renamed from: d */
    public final long f226936d;

    /* JADX INFO: renamed from: e */
    public final ic71 f226937e;

    /* JADX INFO: renamed from: f */
    public final pqm0 f226938f;

    public u571(CharSequence charSequence, long j, ic71 ic71Var, pqm0 pqm0Var, List list, List list2, int i) {
        ic71Var = (i & 4) != 0 ? null : ic71Var;
        pqm0Var = (i & 8) != 0 ? null : pqm0Var;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        this.f226933a = list;
        this.f226934b = list2;
        this.f226935c = charSequence instanceof u571 ? ((u571) charSequence).f226935c : charSequence;
        this.f226936d = dvg1.m37114p(charSequence.length(), j);
        this.f226937e = ic71Var != null ? new ic71(dvg1.m37114p(charSequence.length(), ic71Var.f100752a)) : null;
        this.f226938f = pqm0Var != null ? pqm0.m70657a(pqm0Var, new ic71(dvg1.m37114p(charSequence.length(), ((ic71) pqm0Var.f180351b).f100752a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f226935c.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u571.class != obj.getClass()) {
            return false;
        }
        u571 u571Var = (u571) obj;
        if (ic71.m50235c(this.f226936d, u571Var.f226936d) && wj50.m88271j(this.f226937e, u571Var.f226937e) && wj50.m88271j(this.f226938f, u571Var.f226938f) && wj50.m88271j(this.f226933a, u571Var.f226933a)) {
            return bm51.m29794e0(this.f226935c, u571Var.f226935c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f226935c.hashCode() * 31;
        int i = ic71.f100751c;
        int iM36605e = dq60.m36605e(iHashCode, this.f226936d, 31);
        ic71 ic71Var = this.f226937e;
        int iHashCode2 = (iM36605e + (ic71Var != null ? Long.hashCode(ic71Var.f100752a) : 0)) * 31;
        pqm0 pqm0Var = this.f226938f;
        int iHashCode3 = (iHashCode2 + (pqm0Var != null ? pqm0Var.hashCode() : 0)) * 31;
        List list = this.f226933a;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f226935c.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f226935c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f226935c.toString();
    }
}
