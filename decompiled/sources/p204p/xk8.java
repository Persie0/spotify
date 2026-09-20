package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class xk8 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f262300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz f262301b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f262302c;

    public /* synthetic */ xk8(fiz fizVar, Set set, int i) {
        this.f262300a = i;
        this.f262301b = fizVar;
        this.f262302c = set;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f262300a) {
            case 0:
                Object objCollect = this.f262301b.collect(new wk8(nizVar, this.f262302c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f262301b.collect(new v1a(9, nizVar, this.f262302c), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            case 2:
                Object objCollect3 = this.f262301b.collect(new wk8(nizVar, this.f262302c, 7), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
            case 3:
                Object objCollect4 = this.f262301b.collect(new wk8(nizVar, this.f262302c, 8), fbkVar);
                return objCollect4 == yuk.f276404a ? objCollect4 : w2a1.f247311a;
            case 4:
                Object objCollect5 = this.f262301b.collect(new wk8(nizVar, this.f262302c, 10), fbkVar);
                return objCollect5 == yuk.f276404a ? objCollect5 : w2a1.f247311a;
            default:
                Object objCollect6 = this.f262301b.collect(new wk8(nizVar, this.f262302c, 11), fbkVar);
                return objCollect6 == yuk.f276404a ? objCollect6 : w2a1.f247311a;
        }
    }
}
