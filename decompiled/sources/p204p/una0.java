package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class una0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232118a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ doa0 f232119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ una0(doa0 doa0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f232118a = i;
        this.f232119b = doa0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f232118a) {
            case 0:
                return new una0(this.f232119b, fbkVar, 0);
            case 1:
                return new una0(this.f232119b, fbkVar, 1);
            default:
                return new una0(this.f232119b, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f232118a) {
            case 0:
                una0 una0Var = (una0) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                una0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                una0 una0Var2 = (una0) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                una0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            default:
                una0 una0Var3 = (una0) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                una0Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f232118a) {
            case 0:
                bga.m29073P(obj);
                this.f232119b.f50995a.finishAffinity();
                break;
            case 1:
                bga.m29073P(obj);
                this.f232119b.f50996b.mo47345e();
                break;
            default:
                bga.m29073P(obj);
                doa0 doa0Var = this.f232119b;
                doa0Var.f50995a.getWindow().getDecorView().announceForAccessibility(doa0Var.f50995a.getString(R.string.lock_state_action_completed));
                doa0Var.f50996b.mo47345e();
                break;
        }
        return w2a1.f247311a;
    }
}
