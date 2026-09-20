package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes6.dex */
public final class t950 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f218190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PlayerState f218191c;

    public /* synthetic */ t950(niz nizVar, PlayerState playerState, int i) {
        this.f218189a = i;
        this.f218190b = nizVar;
        this.f218191c = playerState;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        s950 s950Var;
        wm60 wm60Var;
        boolean z;
        ncp0 ncp0Var;
        switch (this.f218189a) {
            case 0:
                if (fbkVar instanceof s950) {
                    s950Var = (s950) fbkVar;
                    int i = s950Var.f206863b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        s950Var.f206863b = i - Integer.MIN_VALUE;
                    } else {
                        s950Var = new s950(this, fbkVar);
                    }
                } else {
                    s950Var = new s950(this, fbkVar);
                }
                Object obj2 = s950Var.f206862a;
                int i2 = s950Var.f206863b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    PlayerState playerState = (PlayerState) obj;
                    PlayerState playerState2 = this.f218191c;
                    if (hdi.m47223O(playerState2) || !wj50.m88271j(playerState.playbackId().mo49283h(), playerState2.playbackId().mo49283h())) {
                        s950Var.f206863b = 1;
                        Object objEmit = this.f218190b.emit(obj, s950Var);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof wm60) {
                    wm60Var = (wm60) fbkVar;
                    int i3 = wm60Var.f252743b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wm60Var.f252743b = i3 - Integer.MIN_VALUE;
                    } else {
                        wm60Var = new wm60(this, fbkVar);
                    }
                } else {
                    wm60Var = new wm60(this, fbkVar);
                }
                Object obj3 = wm60Var.f252742a;
                int i4 = wm60Var.f252743b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    if (((Boolean) obj).booleanValue()) {
                        PlayerState playerState3 = this.f218191c;
                        wj50.m88279p(playerState3);
                        if (hdi.m47223O(playerState3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    wm60Var.f252743b = 1;
                    Object objEmit2 = this.f218190b.emit(boolValueOf, wm60Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof ncp0) {
                    ncp0Var = (ncp0) fbkVar;
                    int i5 = ncp0Var.f152568b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ncp0Var.f152568b = i5 - Integer.MIN_VALUE;
                    } else {
                        ncp0Var = new ncp0(this, fbkVar);
                    }
                } else {
                    ncp0Var = new ncp0(this, fbkVar);
                }
                Object obj4 = ncp0Var.f152567a;
                int i6 = ncp0Var.f152568b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    pqm0 pqm0Var = new pqm0(this.f218191c, (t5m) obj);
                    ncp0Var.f152568b = 1;
                    Object objEmit3 = this.f218190b.emit(pqm0Var, ncp0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
        }
    }
}
