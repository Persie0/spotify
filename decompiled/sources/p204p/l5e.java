package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l5e implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129880a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kmx f129881b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ twy f129882c;

    public /* synthetic */ l5e(kmx kmxVar, twy twyVar, int i) {
        this.f129880a = i;
        this.f129881b = kmxVar;
        this.f129882c = twyVar;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f129880a) {
            case 0:
                Object objCollect = this.f129881b.collect(new i5e(nizVar, this.f129882c, 1), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f129881b.collect(new i5e(nizVar, this.f129882c, 2), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
