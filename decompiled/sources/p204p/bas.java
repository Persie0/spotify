package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class bas implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yab f25275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f25276c;

    public /* synthetic */ bas(yab yabVar, Set set, int i) {
        this.f25274a = i;
        this.f25275b = yabVar;
        this.f25276c = set;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f25274a) {
            case 0:
                Object objCollect = this.f25275b.collect(new wk8(nizVar, this.f25276c, 4), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            case 1:
                Object objCollect2 = this.f25275b.collect(new wk8(nizVar, this.f25276c, 15), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
            default:
                Object objCollect3 = this.f25275b.collect(new wk8(nizVar, this.f25276c, 16), fbkVar);
                return objCollect3 == yuk.f276404a ? objCollect3 : w2a1.f247311a;
        }
    }
}
