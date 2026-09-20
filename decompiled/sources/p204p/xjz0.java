package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xjz0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f262249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f262250b;

    public /* synthetic */ xjz0(fiz fizVar, int i) {
        this.f262249a = i;
        this.f262250b = fizVar;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01b1  */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        zr41 zr41Var;
        switch (this.f262249a) {
            case 0:
                Object objCollect = ((vdm0) this.f262250b).collect(new ady0(nizVar, 17), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = ((uxc0) this.f262250b).collect(new ady0(nizVar, 24), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = ((uxc0) this.f262250b).collect(new ady0(nizVar, 26), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            case 3:
                Object objCollect4 = ((ysk) this.f262250b).collect(new ady0(nizVar, 27), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
            case 4:
                Object objCollect5 = ((lcw0) this.f262250b).collect(new czz0(nizVar, 23), fbkVar);
                return objCollect5 == yuk.f276404a ? objCollect5 : w2a1.f247311a;
            case 5:
                Object objCollect6 = ((lcw0) this.f262250b).collect(new czz0(nizVar, 25), fbkVar);
                return objCollect6 == yuk.f276404a ? objCollect6 : w2a1.f247311a;
            case 6:
                Object objCollect7 = ((f3i0) this.f262250b).collect(new sc11(nizVar, 4), fbkVar);
                return objCollect7 == yuk.f276404a ? objCollect7 : w2a1.f247311a;
            case 7:
                Object objCollect8 = ((uxc0) this.f262250b).collect(new sc11(nizVar, 17), fbkVar);
                return objCollect8 == yuk.f276404a ? objCollect8 : w2a1.f247311a;
            case 8:
                Object objCollect9 = ((in21) this.f262250b).collect(new sc11(nizVar, 24), fbkVar);
                return objCollect9 == yuk.f276404a ? objCollect9 : w2a1.f247311a;
            case 9:
                Object objCollect10 = ((klz) this.f262250b).collect(new aq21(nizVar, 2), fbkVar);
                return objCollect10 == yuk.f276404a ? objCollect10 : w2a1.f247311a;
            case 10:
                Object objCollect11 = ((be11) this.f262250b).collect(new aq21(nizVar, 4), fbkVar);
                return objCollect11 == yuk.f276404a ? objCollect11 : w2a1.f247311a;
            case 11:
                if (fbkVar instanceof zr41) {
                    zr41Var = (zr41) fbkVar;
                    int i = zr41Var.f285537b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zr41Var.f285537b = i - Integer.MIN_VALUE;
                    } else {
                        zr41Var = new zr41(this, fbkVar);
                    }
                } else {
                    zr41Var = new zr41(this, fbkVar);
                }
                Object obj = zr41Var.f285536a;
                int i2 = zr41Var.f285537b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw edb.m38575x(obj);
                }
                bga.m29073P(obj);
                nlv0 nlv0Var = new nlv0();
                du51 du51Var = (du51) this.f262250b;
                v1a v1aVar = new v1a(nlv0Var, nizVar);
                zr41Var.f285537b = 1;
                du51Var.collect(v1aVar, zr41Var);
                return yuk.f276404a;
            case 12:
                Object objCollect12 = ((ah40) this.f262250b).collect(new b941(nizVar, 20), fbkVar);
                return objCollect12 == yuk.f276404a ? objCollect12 : w2a1.f247311a;
            case 13:
                Object objCollect13 = ((tz2) this.f262250b).collect(new b941(nizVar, 22), fbkVar);
                return objCollect13 == yuk.f276404a ? objCollect13 : w2a1.f247311a;
            case 14:
                Object objCollect14 = ((xkb) this.f262250b).collect(new b941(nizVar, 25), fbkVar);
                return objCollect14 == yuk.f276404a ? objCollect14 : w2a1.f247311a;
            case 15:
                Object objCollect15 = ((phw0) this.f262250b).collect(new ud71(nizVar, 20), fbkVar);
                return objCollect15 == yuk.f276404a ? objCollect15 : w2a1.f247311a;
            case 16:
                Object objCollect16 = ((l181) this.f262250b).collect(new ud71(nizVar, 29), fbkVar);
                return objCollect16 == yuk.f276404a ? objCollect16 : w2a1.f247311a;
            case 17:
                Object objCollect17 = ((l181) this.f262250b).collect(new ie91(nizVar, 4), fbkVar);
                return objCollect17 == yuk.f276404a ? objCollect17 : w2a1.f247311a;
            case 18:
                Object objCollect18 = ((gso0) this.f262250b).collect(new ie91(nizVar, 8), fbkVar);
                return objCollect18 == yuk.f276404a ? objCollect18 : w2a1.f247311a;
            case 19:
                Object objCollect19 = ((l181) this.f262250b).collect(new ie91(nizVar, 22), fbkVar);
                return objCollect19 == yuk.f276404a ? objCollect19 : w2a1.f247311a;
            case 20:
                Object objCollect20 = ((l181) this.f262250b).collect(new ie91(nizVar, 26), fbkVar);
                return objCollect20 == yuk.f276404a ? objCollect20 : w2a1.f247311a;
            case 21:
                Object objCollect21 = ((iqb) this.f262250b).collect(new ie91(nizVar, 29), fbkVar);
                return objCollect21 == yuk.f276404a ? objCollect21 : w2a1.f247311a;
            case 22:
                Object objCollect22 = ((l181) this.f262250b).collect(new fmb1(nizVar, 3), fbkVar);
                return objCollect22 == yuk.f276404a ? objCollect22 : w2a1.f247311a;
            case 23:
                Object objCollect23 = ((l181) this.f262250b).collect(new fmb1(nizVar, 7), fbkVar);
                return objCollect23 == yuk.f276404a ? objCollect23 : w2a1.f247311a;
            case 24:
                Object objCollect24 = ((l181) this.f262250b).collect(new fmb1(nizVar, 21), fbkVar);
                return objCollect24 == yuk.f276404a ? objCollect24 : w2a1.f247311a;
            case 25:
                Object objCollect25 = ((C2498vj) this.f262250b).collect(new jpc1(nizVar, 0), fbkVar);
                return objCollect25 == yuk.f276404a ? objCollect25 : w2a1.f247311a;
            case 26:
                Object objCollect26 = ((qp20) this.f262250b).collect(new jpc1(nizVar, 3), fbkVar);
                return objCollect26 == yuk.f276404a ? objCollect26 : w2a1.f247311a;
            case 27:
                Object objCollect27 = ((in21) this.f262250b).collect(new jpc1(nizVar, 8), fbkVar);
                return objCollect27 == yuk.f276404a ? objCollect27 : w2a1.f247311a;
            case 28:
                Object objCollect28 = ((std1) this.f262250b).collect(new jpc1(nizVar, 14), fbkVar);
                return objCollect28 == yuk.f276404a ? objCollect28 : w2a1.f247311a;
            default:
                Object objCollect29 = ((xjz0) this.f262250b).collect(new jpc1(nizVar, 15), fbkVar);
                return objCollect29 == yuk.f276404a ? objCollect29 : w2a1.f247311a;
        }
    }
}
