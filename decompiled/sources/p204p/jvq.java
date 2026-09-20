package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class jvq extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f116447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j1x0 f116448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jvq(j1x0 j1x0Var, int i) {
        super(1);
        this.f116447a = i;
        this.f116448b = j1x0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f116447a) {
            case 0:
                return this.f116448b;
            case 1:
                String str = (String) ((ContextTrack) ((PlayerState) obj).track().mo49278b()).metadata().get(ContextTrack.Metadata.KEY_PARENT_EPISODE_URI);
                return (str == null || !(wl51.m88460J0(str) ^ true)) ? this.f116448b : new hl51("");
            case 2:
                return this.f116448b;
            case 3:
                return this.f116448b;
            case 4:
                return this.f116448b;
            default:
                return this.f116448b;
        }
    }
}
