package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ier implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f101539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fiz f101540c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f101541d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f101542e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f101543f;

    public /* synthetic */ ier(fiz fizVar, Object obj, Object obj2, Object obj3, long j, int i) {
        this.f101538a = i;
        this.f101540c = fizVar;
        this.f101541d = obj;
        this.f101542e = obj2;
        this.f101543f = obj3;
        this.f101539b = j;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        switch (this.f101538a) {
            case 0:
                Object objCollect = ((kmx) this.f101540c).collect(new idr(nizVar, (uer) this.f101541d, (ddr) this.f101542e, (e261) this.f101543f, this.f101539b), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = ((nzx0) this.f101540c).collect(new zz90(nizVar, (z990) this.f101541d, (String) this.f101542e, (h990) this.f101543f, this.f101539b), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
