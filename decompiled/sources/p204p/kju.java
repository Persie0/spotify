package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class kju implements qwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g2q f123427b;

    public /* synthetic */ kju(g2q g2qVar, int i) {
        this.f123426a = i;
        this.f123427b = g2qVar;
    }

    @Override // p204p.qwf
    /* JADX INFO: renamed from: a */
    public final ovf mo26174a(hwf hwfVar) {
        switch (this.f123426a) {
            case 0:
                if (hwfVar != null) {
                    throw new ClassCastException();
                }
                tw41.f224312b = false;
                return new g1p((Context) this.f123427b.f75987b, 4);
            case 1:
                if (hwfVar == null) {
                    return new wup((Context) this.f123427b.f75987b, 10);
                }
                throw new ClassCastException();
            case 2:
                if (hwfVar == null) {
                    return new g1p((Context) this.f123427b.f75987b, 6);
                }
                throw new ClassCastException();
            case 3:
                g2q g2qVar = this.f123427b;
                return new xzo((Context) g2qVar.f75987b, (e940) g2qVar.f75988c, 2);
            case 4:
                fyf fyfVar = ncg.f152508a;
                g2q g2qVar2 = this.f123427b;
                return new lhp((Context) g2qVar2.f75987b, (e940) g2qVar2.f75988c, fyfVar);
            case 5:
                if (hwfVar != null) {
                    throw new ClassCastException();
                }
                g2q g2qVar3 = this.f123427b;
                return new wup((Context) g2qVar3.f75987b, (e940) g2qVar3.f75988c, 12);
            case 6:
                fyf fyfVar2 = scg.f207738a;
                g2q g2qVar4 = this.f123427b;
                return new lhp((Context) g2qVar4.f75987b, (e940) g2qVar4.f75988c, fyfVar2);
            case 7:
                fyf fyfVar3 = tcg.f219081a;
                g2q g2qVar5 = this.f123427b;
                return new lhp((Context) g2qVar5.f75987b, (e940) g2qVar5.f75988c, fyfVar3);
            case 8:
                if (hwfVar != null) {
                    throw new ClassCastException();
                }
                g2q g2qVar6 = this.f123427b;
                return new suo((Context) g2qVar6.f75987b, (e940) g2qVar6.f75988c, 6);
            default:
                if (hwfVar == null) {
                    return new f6q((Context) this.f123427b.f75987b, 11);
                }
                throw new ClassCastException();
        }
    }
}
