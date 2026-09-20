package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class elw0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60763a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60764b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PlayerState f60765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ elw0(PlayerState playerState, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f60763a = i;
        this.f60765c = playerState;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f60763a) {
            case 0:
                elw0 elw0Var = new elw0(this.f60765c, fbkVar, 0);
                elw0Var.f60764b = obj;
                return elw0Var;
            default:
                elw0 elw0Var2 = new elw0(this.f60765c, fbkVar, 1);
                elw0Var2.f60764b = obj;
                return elw0Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f60763a) {
            case 0:
                break;
        }
        return ((elw0) create(playerState, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f60763a) {
            case 0:
                PlayerState playerState = (PlayerState) this.f60764b;
                bga.m29073P(obj);
                return Boolean.valueOf(playerState != this.f60765c);
            default:
                PlayerState playerState2 = (PlayerState) this.f60764b;
                bga.m29073P(obj);
                return Boolean.valueOf(playerState2 != this.f60765c);
        }
    }
}
