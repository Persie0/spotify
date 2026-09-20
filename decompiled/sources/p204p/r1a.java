package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r1a implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f194811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f194812c;

    public /* synthetic */ r1a(fiz fizVar, Object obj, int i) {
        this.f194810a = i;
        this.f194811b = fizVar;
        this.f194812c = obj;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f194810a) {
            case 0:
                Object objCollect = ((ea5) this.f194811b).collect(new q1a(nizVar, (x1a) this.f194812c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f194811b.collect(new n2c(11, nizVar, (nde) this.f194812c), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = this.f194811b.collect(new n2c(16, nizVar, (esh) this.f194812c), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            case 3:
                Object objCollect4 = this.f194811b.collect(new xbk(2, nizVar, (r87) this.f194812c), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
            case 4:
                Object objCollect5 = this.f194811b.collect(new v1a(4, nizVar, (j5m) this.f194812c), fbkVar);
                return objCollect5 == yuk.f276404a ? objCollect5 : w2a1.f247311a;
            case 5:
                Object objCollect6 = ((nnc) this.f194811b).collect(new v1a(6, nizVar, (e3p) this.f194812c), fbkVar);
                return objCollect6 == yuk.f276404a ? objCollect6 : w2a1.f247311a;
            case 6:
                Object objCollect7 = ((vjz) this.f194811b).collect(new s2p(nizVar, (e3p) this.f194812c, 1), fbkVar);
                return objCollect7 == yuk.f276404a ? objCollect7 : w2a1.f247311a;
            case 7:
                Object objCollect8 = this.f194811b.collect(new xbk(29, nizVar, (mcq) this.f194812c), fbkVar);
                return objCollect8 == yuk.f276404a ? objCollect8 : w2a1.f247311a;
            case 8:
                Object objCollect9 = this.f194811b.collect(new v1a(12, nizVar, this.f194812c), fbkVar);
                return objCollect9 == yuk.f276404a ? objCollect9 : w2a1.f247311a;
            case 9:
                Object objCollect10 = this.f194811b.collect(new gtt(nizVar, (String) this.f194812c, 23), fbkVar);
                return objCollect10 == yuk.f276404a ? objCollect10 : w2a1.f247311a;
            case 10:
                Object objCollect11 = this.f194811b.collect(new ps80(28, nizVar, (akc0) this.f194812c), fbkVar);
                return objCollect11 == yuk.f276404a ? objCollect11 : w2a1.f247311a;
            case 11:
                Object objCollect12 = ((yab) this.f194811b).collect(new dal0(8, nizVar, (cwn0) this.f194812c), fbkVar);
                return objCollect12 == yuk.f276404a ? objCollect12 : w2a1.f247311a;
            case 12:
                Object objCollect13 = ((yab) this.f194811b).collect(new wk8(nizVar, (Set) this.f194812c, 12), fbkVar);
                return objCollect13 == yuk.f276404a ? objCollect13 : w2a1.f247311a;
            case 13:
                Object objCollect14 = this.f194811b.collect(new z0s0(nizVar, (fds0) this.f194812c, 11), fbkVar);
                return objCollect14 == yuk.f276404a ? objCollect14 : w2a1.f247311a;
            case 14:
                Object objCollect15 = ((yab) this.f194811b).collect(new a4t0(nizVar, (o7u0) this.f194812c, 25), fbkVar);
                return objCollect15 == yuk.f276404a ? objCollect15 : w2a1.f247311a;
            case 15:
                Object objCollect16 = this.f194811b.collect(new a4t0(nizVar, (mcu0) this.f194812c, 29), fbkVar);
                return objCollect16 == yuk.f276404a ? objCollect16 : w2a1.f247311a;
            case 16:
                Object objCollect17 = ((vjz) this.f194811b).collect(new czz0(nizVar, (szz0) this.f194812c, 2), fbkVar);
                return objCollect17 == yuk.f276404a ? objCollect17 : w2a1.f247311a;
            default:
                Object objCollect18 = ((r1a) this.f194811b).collect(new di91(19, nizVar, (k4e1) this.f194812c), fbkVar);
                return objCollect18 == yuk.f276404a ? objCollect18 : w2a1.f247311a;
        }
    }
}
