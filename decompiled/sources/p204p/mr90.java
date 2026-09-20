package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class mr90 implements qc81 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146453a;

    /* JADX INFO: renamed from: b */
    public final Object f146454b;

    public /* synthetic */ mr90(Object obj, int i) {
        this.f146453a = i;
        this.f146454b = obj;
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: a */
    public final pc81 mo35170a() {
        switch (this.f146453a) {
            case 0:
                return new zb70(this, 6);
            case 1:
                return new w090(this, 22);
            case 2:
                return new rg41(this, 0);
            default:
                return new po11(this, 19);
        }
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: b */
    public final boolean mo35171b(nc81 nc81Var) {
        switch (this.f146453a) {
            case 0:
                return bm51.m29803n0(nc81Var.f152461a.uri(), "spotify:room:", false);
            case 1:
                ContextTrack contextTrack = nc81Var.f152461a;
                return e72.m37985S(contextTrack) && bm51.m29803n0(contextTrack.uri(), "spotify:media:", false);
            case 2:
                return true;
            default:
                ContextTrack contextTrack2 = nc81Var.f152461a;
                return e72.m37986T(contextTrack2) && !e72.m37994a0(contextTrack2) && ((Boolean.parseBoolean((String) contextTrack2.metadata().get(ContextTrack.Metadata.KEY_HAS_TRANSCRIPTS)) && !Boolean.parseBoolean((String) contextTrack2.metadata().get("transcripts_disallowed_in_content_layer"))) || Boolean.parseBoolean((String) contextTrack2.metadata().get("has_companion_content")));
        }
    }

    @Override // p204p.qc81
    public final oc81 type() {
        switch (this.f146453a) {
            case 0:
                return oc81.f163868e;
            case 1:
                return oc81.f163869f;
            case 2:
                return oc81.f163870g;
            default:
                return oc81.f163871h;
        }
    }
}
