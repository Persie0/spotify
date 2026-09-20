package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes6.dex */
public final class u950 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228075a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ onc f228076b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PlayerState f228077c;

    public /* synthetic */ u950(onc oncVar, PlayerState playerState, int i) {
        this.f228075a = i;
        this.f228076b = oncVar;
        this.f228077c = playerState;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f228075a) {
            case 0:
                Object objCollect = this.f228076b.collect(new t950(nizVar, this.f228077c, 0), fbkVar);
                return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
            default:
                Object objCollect2 = this.f228076b.collect(new t950(nizVar, this.f228077c, 1), fbkVar);
                return objCollect2 == yuk.f276404a ? objCollect2 : w2a1.f247311a;
        }
    }
}
