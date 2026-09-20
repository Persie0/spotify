package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes.dex */
public final class la9 implements pzo0 {

    /* JADX INFO: renamed from: a */
    public final a1p0 f131307a;

    /* JADX INFO: renamed from: b */
    public final ayh0 f131308b;

    public la9(a1p0 a1p0Var, ayh0 ayh0Var) {
        this.f131307a = a1p0Var;
        this.f131308b = ayh0Var;
    }

    @Override // p204p.pzo0
    /* JADX INFO: renamed from: a */
    public final ozo0 mo32013a(yzo0 yzo0Var, noo0 noo0Var, ujx ujxVar, String str) {
        if (str.equals("multiplayer")) {
            return null;
        }
        return new ka9(this.f131307a, this.f131308b, yzo0Var.mo43763b(), (String) yzo0Var.metadata().get("endvideo_track_uri"), (String) yzo0Var.metadata().get(ContextTrack.Metadata.KEY_INTERACTION_ID), 0);
    }
}
