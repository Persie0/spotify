package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class dek0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f48116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e6a0 f48117c;

    public /* synthetic */ dek0(niz nizVar, e6a0 e6a0Var, int i) {
        this.f48115a = i;
        this.f48116b = nizVar;
        this.f48117c = e6a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        cek0 cek0Var;
        int i;
        niz nizVar;
        eek0 eek0Var;
        lu01 lu01Var;
        ContextTrack contextTrack;
        switch (this.f48115a) {
            case 0:
                if (fbkVar instanceof cek0) {
                    cek0Var = (cek0) fbkVar;
                    int i2 = cek0Var.f37149b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        cek0Var.f37149b = i2 - Integer.MIN_VALUE;
                    } else {
                        cek0Var = new cek0(this, fbkVar);
                    }
                } else {
                    cek0Var = new cek0(this, fbkVar);
                }
                Object objM33700a = cek0Var.f37148a;
                int i3 = cek0Var.f37149b;
                yuk yukVar = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        int i4 = cek0Var.f37152e;
                        niz nizVar2 = cek0Var.f37151d;
                        Object obj2 = cek0Var.f37150c;
                        bga.m29073P(objM33700a);
                        nizVar = nizVar2;
                        i = i4;
                        obj = obj2;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM33700a);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM33700a);
                ContextTrack contextTrack2 = (ContextTrack) ((PlayerState) obj).track().mo49283h();
                i = 0;
                nizVar = this.f48116b;
                if (contextTrack2 == null) {
                    objM33700a = Boolean.FALSE;
                } else if (bm51.m29803n0(contextTrack2.uri(), "spotify:track:", false) || e72.m37986T(contextTrack2) || e72.m37978L(contextTrack2)) {
                    cr01 cr01Var = (cr01) this.f48117c.f56601e;
                    String strUri = contextTrack2.uri();
                    cek0Var.f37150c = obj;
                    cek0Var.f37151d = nizVar;
                    cek0Var.f37152e = 0;
                    cek0Var.f37149b = 1;
                    objM33700a = cr01Var.m33700a(strUri, cek0Var);
                    if (objM33700a == yukVar) {
                        return yukVar;
                    }
                } else {
                    objM33700a = Boolean.FALSE;
                }
                if (((Boolean) objM33700a).booleanValue()) {
                    cek0Var.f37150c = null;
                    cek0Var.f37151d = null;
                    cek0Var.f37152e = i;
                    cek0Var.f37149b = 2;
                    if (nizVar.emit(obj, cek0Var) == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof eek0) {
                    eek0Var = (eek0) fbkVar;
                    int i5 = eek0Var.f58810b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        eek0Var.f58810b = i5 - Integer.MIN_VALUE;
                    } else {
                        eek0Var = new eek0(this, fbkVar);
                    }
                } else {
                    eek0Var = new eek0(this, fbkVar);
                }
                Object obj3 = eek0Var.f58809a;
                int i6 = eek0Var.f58810b;
                if (i6 == 0) {
                    bga.m29073P(obj3);
                    PlayerState playerState = (PlayerState) obj;
                    wj50.m88279p(playerState);
                    if (e72.m37978L((ContextTrack) playerState.track().mo49278b()) || e72.m37985S((ContextTrack) playerState.track().mo49278b())) {
                        lu01Var = new lu01(playerState.contextUri(), null, null, null, null, null, null, 126);
                    } else {
                        String strUri2 = ((ContextTrack) playerState.track().mo49278b()).uri();
                        u300 u300VarM87094a = ((w300) ((v300) this.f48117c.f56599c)).m87094a((String) playerState.contextMetadata().get(Context.Metadata.KEY_FORMAT_LIST_TYPE));
                        lu01Var = new lu01(strUri2, (!(playerState.track().mo49279c() && (contextTrack = (ContextTrack) playerState.track().mo49283h()) != null && e72.m37988V(contextTrack)) && (u300VarM87094a == u300.P2S || u300VarM87094a == u300.EDITORIAL || u300VarM87094a == u300.PLAYLIST)) ? playerState.contextUri() : null, null, null, null, null, null, 124);
                    }
                    eek0Var.f58810b = 1;
                    Object objEmit = this.f48116b.emit(lu01Var, eek0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
