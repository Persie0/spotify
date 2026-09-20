package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes10.dex */
public final class rmu0 implements too0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ agy f200616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ voc1 f200617b;

    public rmu0(agy agyVar, voc1 voc1Var) {
        this.f200616a = agyVar;
        this.f200617b = voc1Var;
    }

    @Override // p204p.too0
    public final PlayOrigin get() {
        return PlayOrigin.builder(this.f200616a.getName()).viewUri(this.f200617b.f243453a).build();
    }
}
