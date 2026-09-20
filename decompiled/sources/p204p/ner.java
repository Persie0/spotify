package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ner implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f153062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f153063c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f153064d;

    public /* synthetic */ ner(Object obj, Object obj2, Object obj3, int i) {
        this.f153061a = i;
        this.f153062b = obj;
        this.f153063c = obj2;
        this.f153064d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02d0  */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        hlz hlzVar;
        rlv0 rlv0VarM36622v;
        int i;
        switch (this.f153061a) {
            case 0:
                Object objCollect = ((ier) this.f153062b).collect(new ker(nizVar, (uer) this.f153063c, (ddr) this.f153064d, 1), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = ((yab) this.f153062b).collect(new w51(nizVar, (xjp) this.f153063c, (udc) this.f153064d, 28), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = ((fiz) this.f153062b).collect(new pfu(nizVar, (jj1) this.f153063c, (vhe0) this.f153064d, 1), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            case 3:
                Object objCollect4 = ((vjz) this.f153062b).collect(new pfu(nizVar, (k52) this.f153063c, (List) this.f153064d, 3), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
            case 4:
                Object objCollect5 = ((fiz) this.f153062b).collect(new pfu(nizVar, (gh00) this.f153063c, this.f153064d, 5), fbkVar);
                return objCollect5 == yuk.f276404a ? objCollect5 : w2a1.f247311a;
            case 5:
                Object objCollect6 = ((fiz) this.f153062b).collect(new pfu(nizVar, (String) this.f153063c, (pyu) this.f153064d, 6), fbkVar);
                return objCollect6 == yuk.f276404a ? objCollect6 : w2a1.f247311a;
            case 6:
                if (fbkVar instanceof hlz) {
                    hlzVar = (hlz) fbkVar;
                    int i2 = hlzVar.f92770b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        hlzVar.f92770b = i2 - Integer.MIN_VALUE;
                    } else {
                        hlzVar = new hlz(this, fbkVar);
                    }
                } else {
                    hlzVar = new hlz(this, fbkVar);
                }
                Object obj = hlzVar.f92769a;
                int i3 = hlzVar.f92770b;
                yuk yukVar = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        int i4 = hlzVar.f92774f;
                        rlv0VarM36622v = hlzVar.f92773e;
                        niz nizVar2 = hlzVar.f92772d;
                        bga.m29073P(obj);
                        i = i4;
                        nizVar = nizVar2;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                rlv0VarM36622v = dq60.m36622v(obj);
                Object obj2 = this.f153062b;
                rlv0VarM36622v.f200373a = obj2;
                hlzVar.f92772d = nizVar;
                hlzVar.f92773e = rlv0VarM36622v;
                i = 0;
                hlzVar.f92774f = 0;
                hlzVar.f92770b = 1;
                if (nizVar.emit(obj2, hlzVar) == yukVar) {
                    return yukVar;
                }
                fiz fizVar = (fiz) this.f153063c;
                fwj fwjVar = new fwj(rlv0VarM36622v, this.f153064d, nizVar, 3);
                hlzVar.f92772d = null;
                hlzVar.f92773e = null;
                hlzVar.f92774f = i;
                hlzVar.f92770b = 2;
                if (fizVar.collect(fwjVar, hlzVar) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            case 7:
                Object objCollect7 = ((yab) this.f153062b).collect(new pfu(nizVar, (so00) this.f153063c, (jo00) this.f153064d, 11), fbkVar);
                return objCollect7 == yuk.f276404a ? objCollect7 : w2a1.f247311a;
            case 8:
                Object objCollect8 = ((rv7) this.f153062b).collect(new pfu(nizVar, (c810) this.f153063c, (ContextTrack) this.f153064d, 12), fbkVar);
                return objCollect8 == yuk.f276404a ? objCollect8 : w2a1.f247311a;
            case 9:
                Object objCollect9 = ((fiz) this.f153062b).collect(new pfu(nizVar, (i4t0) this.f153063c, (i4t0) this.f153064d, 14), fbkVar);
                return objCollect9 == yuk.f276404a ? objCollect9 : w2a1.f247311a;
            case 10:
                Object objCollect10 = ((std1) this.f153062b).collect(new pfu(nizVar, (qr20) this.f153063c, (vhe0) this.f153064d, 16), fbkVar);
                return objCollect10 == yuk.f276404a ? objCollect10 : w2a1.f247311a;
            case 11:
                Object objCollect11 = ((nuu0) this.f153062b).f158717a.collect(new pfu(nizVar, (pk0) this.f153063c, (gb30) this.f153064d, 17), fbkVar);
                return objCollect11 == yuk.f276404a ? objCollect11 : w2a1.f247311a;
            case 12:
                Object objCollect12 = ((yab) this.f153062b).collect(new pfu(nizVar, (jj1) this.f153063c, (vhe0) this.f153064d, 19), fbkVar);
                return objCollect12 == yuk.f276404a ? objCollect12 : w2a1.f247311a;
            case 13:
                Object objCollect13 = ((yab) this.f153062b).collect(new pfu(nizVar, (ym40) this.f153063c, (h5r) this.f153064d, 21), fbkVar);
                return objCollect13 == yuk.f276404a ? objCollect13 : w2a1.f247311a;
            case 14:
                Object objCollect14 = ((fiz) this.f153062b).collect(new pfu(nizVar, (cv50) this.f153063c, (List) this.f153064d, 22), fbkVar);
                return objCollect14 == yuk.f276404a ? objCollect14 : w2a1.f247311a;
            case 15:
                Object objCollect15 = ((fiz) this.f153062b).collect(new sn2(nizVar, (a470) this.f153063c, (List) this.f153064d), fbkVar);
                return objCollect15 == yuk.f276404a ? objCollect15 : w2a1.f247311a;
            case 16:
                Object objCollect16 = ((ur0) this.f153062b).collect(new hu80(nizVar, (String) this.f153063c, (mu80) this.f153064d, 0), fbkVar);
                return objCollect16 == yuk.f276404a ? objCollect16 : w2a1.f247311a;
            case 17:
                Object objCollect17 = ((ur0) this.f153062b).collect(new pfu(nizVar, (ex80) this.f153063c, (mu80) this.f153064d, 23), fbkVar);
                return objCollect17 == yuk.f276404a ? objCollect17 : w2a1.f247311a;
            case 18:
                Object objCollect18 = ((luk0) this.f153062b).collect(new hu80(nizVar, (String) this.f153063c, (mu80) this.f153064d, 1), fbkVar);
                return objCollect18 == yuk.f276404a ? objCollect18 : w2a1.f247311a;
            case 19:
                Object objCollect19 = ((ur0) this.f153062b).collect(new pfu(nizVar, (iz80) this.f153063c, (mu80) this.f153064d, 24), fbkVar);
                return objCollect19 == yuk.f276404a ? objCollect19 : w2a1.f247311a;
            case 20:
                Object objCollect20 = ((fiz) this.f153062b).collect(new pfu(nizVar, (d670) this.f153063c, (String) this.f153064d, 25), fbkVar);
                return objCollect20 == yuk.f276404a ? objCollect20 : w2a1.f247311a;
            case 21:
                Object objCollect21 = ((fiz) this.f153062b).collect(new pfu(nizVar, (String) this.f153063c, (b390) this.f153064d, 26), fbkVar);
                return objCollect21 == yuk.f276404a ? objCollect21 : w2a1.f247311a;
            case 22:
                Object objCollect22 = ((yab) this.f153062b).collect(new pfu(nizVar, (ArrayList) this.f153063c, (ArrayList) this.f153064d, 28), fbkVar);
                return objCollect22 == yuk.f276404a ? objCollect22 : w2a1.f247311a;
            case 23:
                Object objCollect23 = ((yab) this.f153062b).collect(new ps80(nizVar, (lm90) this.f153063c, (ae50) this.f153064d), fbkVar);
                return objCollect23 == yuk.f276404a ? objCollect23 : w2a1.f247311a;
            case 24:
                fiz[] fizVarArr = (fiz[]) this.f153062b;
                Object objM85470k = vgg1.m85470k(fbkVar, nizVar, new my80(fizVarArr, 3), new sb90((fbk) null, (egt) this.f153063c, (bq70) this.f153064d, 1), fizVarArr);
                return objM85470k == yuk.f276404a ? objM85470k : w2a1.f247311a;
            case 25:
                Object objCollect24 = ((yab) this.f153062b).collect(new i1b0(nizVar, (k1b0) this.f153063c, (h5r) this.f153064d, 0), fbkVar);
                return objCollect24 == yuk.f276404a ? objCollect24 : w2a1.f247311a;
            case 26:
                Object objCollect25 = ((fiz) this.f153062b).collect(new i1b0(nizVar, (ym40) this.f153063c, (h5r) this.f153064d, 1), fbkVar);
                return objCollect25 == yuk.f276404a ? objCollect25 : w2a1.f247311a;
            case 27:
                ((ay7) this.f153062b).collect(new cvx(nizVar, (cz90) this.f153063c, this.f153064d, 2), fbkVar);
                return yuk.f276404a;
            case 28:
                Object objCollect26 = ((fiz) this.f153062b).collect(new i1b0(nizVar, (pts) this.f153063c, (vhe0) this.f153064d, 2), fbkVar);
                return objCollect26 == yuk.f276404a ? objCollect26 : w2a1.f247311a;
            default:
                ((ay7) this.f153062b).collect(new i1b0(nizVar, (String) this.f153063c, (fmd0) this.f153064d, 4), fbkVar);
                return yuk.f276404a;
        }
    }
}
