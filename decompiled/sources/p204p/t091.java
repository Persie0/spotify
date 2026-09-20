package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes9.dex */
public final class t091 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f215789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f215790c;

    public /* synthetic */ t091(niz nizVar, String str, int i) {
        this.f215788a = i;
        this.f215789b = nizVar;
        this.f215790c = str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        s091 s091Var;
        yw91 yw91Var;
        aud1 aud1Var;
        switch (this.f215788a) {
            case 0:
                if (fbkVar instanceof s091) {
                    s091Var = (s091) fbkVar;
                    int i = s091Var.f204324b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        s091Var.f204324b = i - Integer.MIN_VALUE;
                    } else {
                        s091Var = new s091(this, fbkVar);
                    }
                } else {
                    s091Var = new s091(this, fbkVar);
                }
                Object obj2 = s091Var.f204323a;
                int i2 = s091Var.f204324b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    maw mawVar = (maw) ((gqx) obj).mo45449a(maw.class, this.f215790c).f72301b;
                    Object obj3 = mawVar != null ? mawVar.f141702b : null;
                    if (obj3 == null) {
                        obj3 = lau.f131415a;
                    }
                    s091Var.f204324b = 1;
                    Object objEmit = this.f215789b.emit(obj3, s091Var);
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
            case 1:
                if (fbkVar instanceof yw91) {
                    yw91Var = (yw91) fbkVar;
                    int i3 = yw91Var.f276927b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yw91Var.f276927b = i3 - Integer.MIN_VALUE;
                    } else {
                        yw91Var = new yw91(this, fbkVar);
                    }
                } else {
                    yw91Var = new yw91(this, fbkVar);
                }
                Object obj4 = yw91Var.f276926a;
                int i4 = yw91Var.f276927b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    if (wj50.m88271j(((ww91) obj).f255735a, this.f215790c)) {
                        yw91Var.f276927b = 1;
                        Object objEmit2 = this.f215789b.emit(obj, yw91Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof aud1) {
                    aud1Var = (aud1) fbkVar;
                    int i5 = aud1Var.f19922b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aud1Var.f19922b = i5 - Integer.MIN_VALUE;
                    } else {
                        aud1Var = new aud1(this, fbkVar);
                    }
                } else {
                    aud1Var = new aud1(this, fbkVar);
                }
                Object obj5 = aud1Var.f19921a;
                int i6 = aud1Var.f19922b;
                if (i6 == 0) {
                    bga.m29073P(obj5);
                    if (!wj50.m88271j(((PlayerState) obj).contextUri(), this.f215790c)) {
                        aud1Var.f19922b = 1;
                        Object objEmit3 = this.f215789b.emit(obj, aud1Var);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
        }
    }
}
