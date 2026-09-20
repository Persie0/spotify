package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes8.dex */
public final class bnu0 implements too0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mbk0 f28924a;

    public bnu0(mbk0 mbk0Var) {
        this.f28924a = mbk0Var;
    }

    @Override // p204p.too0
    public final PlayOrigin get() {
        mbk0 mbk0Var = this.f28924a;
        return PlayOrigin.builder(mbk0Var.mo61411f().getName()).viewUri(mbk0Var.mo61410e().f243453a).build();
    }
}
