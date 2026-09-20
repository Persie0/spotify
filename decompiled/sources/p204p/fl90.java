package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fl90 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vjz f70729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f70730c;

    public /* synthetic */ fl90(vjz vjzVar, List list, int i) {
        this.f70728a = i;
        this.f70729b = vjzVar;
        this.f70730c = list;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f70728a) {
            case 0:
                Object objCollect = this.f70729b.collect(new sn2(nizVar, this.f70730c, 4), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f70729b.collect(new sn2(nizVar, this.f70730c, 5), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
