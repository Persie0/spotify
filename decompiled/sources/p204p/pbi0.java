package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pbi0 {

    /* JADX INFO: renamed from: a */
    public final int f175852a;

    /* JADX INFO: renamed from: b */
    public final Integer f175853b;

    /* JADX INFO: renamed from: c */
    public final Integer f175854c;

    /* JADX INFO: renamed from: d */
    public final yxf f175855d;

    /* JADX INFO: renamed from: e */
    public final fiz f175856e;

    /* JADX INFO: renamed from: f */
    public final vbi0 f175857f;

    public pbi0(int i, Integer num, Integer num2, dlr0 dlr0Var, fiz fizVar, vbi0 vbi0Var, int i2) {
        num2 = (i2 & 8) != 0 ? null : num2;
        dlr0Var = (i2 & 32) != 0 ? null : dlr0Var;
        fizVar = (i2 & 64) != 0 ? new ysk(rdu.f198207a, 27) : fizVar;
        vbi0Var = (i2 & 512) != 0 ? null : vbi0Var;
        this.f175852a = i;
        this.f175853b = num;
        this.f175854c = num2;
        this.f175855d = dlr0Var;
        this.f175856e = fizVar;
        this.f175857f = vbi0Var;
        lmg1.m59448s(new Object[]{num, null}, sfe0.f208554V0);
        lmg1.m59447r(new Object[]{num2, null, dlr0Var}, sfe0.f208555W0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbi0)) {
            return false;
        }
        pbi0 pbi0Var = (pbi0) obj;
        return this.f175852a == pbi0Var.f175852a && wj50.m88271j(this.f175853b, pbi0Var.f175853b) && wj50.m88271j(this.f175854c, pbi0Var.f175854c) && wj50.m88271j(this.f175855d, pbi0Var.f175855d) && wj50.m88271j(this.f175856e, pbi0Var.f175856e) && wj50.m88271j(this.f175857f, pbi0Var.f175857f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f175852a) * 31;
        Integer num = this.f175853b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Integer num2 = this.f175854c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 961;
        yxf yxfVar = this.f175855d;
        int iHashCode4 = (this.f175856e.hashCode() + ((iHashCode3 + (yxfVar == null ? 0 : yxfVar.hashCode())) * 31)) * 29791;
        vbi0 vbi0Var = this.f175857f;
        return iHashCode4 + (vbi0Var != null ? vbi0Var.hashCode() : 0);
    }
}
