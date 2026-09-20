package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class bo31 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f29004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fo31 f29005c;

    public /* synthetic */ bo31(niz nizVar, fo31 fo31Var, int i) {
        this.f29003a = i;
        this.f29004b = nizVar;
        this.f29005c = fo31Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ao31 ao31Var;
        do31 do31Var;
        switch (this.f29003a) {
            case 0:
                if (fbkVar instanceof ao31) {
                    ao31Var = (ao31) fbkVar;
                    int i = ao31Var.f17552b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ao31Var.f17552b = i - Integer.MIN_VALUE;
                    } else {
                        ao31Var = new ao31(this, fbkVar);
                    }
                } else {
                    ao31Var = new ao31(this, fbkVar);
                }
                Object obj2 = ao31Var.f17551a;
                int i2 = ao31Var.f17552b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    PlayerState playerState = (PlayerState) obj;
                    wj50.m88279p(playerState);
                    Boolean boolValueOf = Boolean.valueOf(wj50.m88271j(playerState.contextUri(), this.f29005c.f71423i));
                    ao31Var.f17552b = 1;
                    Object objEmit = this.f29004b.emit(boolValueOf, ao31Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof do31) {
                    do31Var = (do31) fbkVar;
                    int i3 = do31Var.f50929b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        do31Var.f50929b = i3 - Integer.MIN_VALUE;
                    } else {
                        do31Var = new do31(this, fbkVar);
                    }
                } else {
                    do31Var = new do31(this, fbkVar);
                }
                Object obj3 = do31Var.f50928a;
                int i4 = do31Var.f50929b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    PlayerState playerState2 = (PlayerState) obj;
                    wj50.m88279p(playerState2);
                    Boolean boolValueOf2 = Boolean.valueOf(this.f29005c.m42261c(playerState2));
                    do31Var.f50929b = 1;
                    Object objEmit2 = this.f29004b.emit(boolValueOf2, do31Var);
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
        }
    }
}
