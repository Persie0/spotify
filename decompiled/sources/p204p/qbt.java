package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class qbt implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yab f187166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f187167c;

    public /* synthetic */ qbt(yab yabVar, ArrayList arrayList, int i) {
        this.f187165a = i;
        this.f187166b = yabVar;
        this.f187167c = arrayList;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f187165a) {
            case 0:
                Object objCollect = this.f187166b.collect(new pbt(nizVar, this.f187167c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f187166b.collect(new pbt(nizVar, this.f187167c, 4), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
