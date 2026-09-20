package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class zck implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nzx0 f281532b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f281533c;

    public /* synthetic */ zck(nzx0 nzx0Var, Set set, int i) {
        this.f281531a = i;
        this.f281532b = nzx0Var;
        this.f281533c = set;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) throws Throwable {
        switch (this.f281531a) {
            case 0:
                Object objCollect = this.f281532b.collect(new wk8(nizVar, this.f281533c, 1), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f281532b.collect(new wk8(nizVar, this.f281533c, 2), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            default:
                Object objCollect3 = this.f281532b.collect(new wk8(nizVar, this.f281533c, 3), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
        }
    }
}
