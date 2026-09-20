package p204p;

import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class nzp0 implements ymv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160135a;

    public /* synthetic */ nzp0(int i) {
        this.f160135a = i;
    }

    /* JADX INFO: renamed from: c */
    public static o1x0 m65967c(PlayerState playerState) {
        return !wl51.m88460J0(rkk.m75764p(playerState)) ? new o1x0(new j1x0(R.string.context_type_description_suggested_track_with_replanation), new hl51(rkk.m75764p(playerState)), rkk.m75761m(playerState), null, 120) : new o1x0(new j1x0(R.string.context_type_description_suggested_track_without_resplanation), new hl51(""), rkk.m75761m(playerState), null, 120);
    }

    @Override // p204p.ymv
    /* JADX INFO: renamed from: a */
    public final o1x0 mo44204a(PlayerState playerState) {
        switch (this.f160135a) {
            case 0:
                return new o1x0(new j1x0(R.string.context_type_description_podcast_autoplay), new hl51(""), "", null, 120);
            default:
                Set set = dd41.f47702f;
                dd41 dd41VarM74726U = r46.m74726U(playerState.contextUri());
                he41 he41Var = dd41VarM74726U.f47710d;
                if (wj50.m88271j(he41Var != null ? he41Var.getType() : null, avp0.f20242e)) {
                    return m65967c(playerState);
                }
                int iOrdinal = dd41VarM74726U.f47709c.ordinal();
                return (iOrdinal == 30 || iOrdinal == 42) ? m65967c(playerState) : new o1x0(new j1x0(R.string.context_type_description_suggested_track_without_resplanation), new hl51(""), rkk.m75761m(playerState), null, 120);
        }
    }
}
