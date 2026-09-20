package p204p;

import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;

/* JADX INFO: loaded from: classes9.dex */
public final class arb implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18986a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f18987b;

    public /* synthetic */ arb(Object obj, int i) {
        this.f18986a = i;
        this.f18987b = obj;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: I */
    public final void mo25535I(BetamaxException betamaxException, long j, long j2) {
        switch (this.f18986a) {
            case 0:
                brb brbVar = (brb) this.f18987b;
                brbVar.f30052b1.setVisibility(8);
                x02 x02Var = brbVar.f30056f1;
                if (x02Var != null) {
                    brbVar.m30294K(x02Var.f256769f);
                }
                break;
            default:
                ((yhq) this.f18987b).m93691e();
                break;
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: O */
    public final void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        switch (this.f18986a) {
            case 0:
                brb brbVar = (brb) this.f18987b;
                brbVar.f30052b1.setVisibility(8);
                x02 x02Var = brbVar.f30056f1;
                if (x02Var != null) {
                    brbVar.m30294K(x02Var.f256769f);
                }
                break;
            default:
                ((yhq) this.f18987b).m93691e();
                break;
        }
    }
}
