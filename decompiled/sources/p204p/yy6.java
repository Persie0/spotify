package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldUpdate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldValue;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$UserSettings;

/* JADX INFO: loaded from: classes9.dex */
public final class yy6 {

    /* JADX INFO: renamed from: a */
    public final mr0 f277418a;

    /* JADX INFO: renamed from: b */
    public final zv41 f277419b;

    public yy6(fnc fncVar, mr0 mr0Var) {
        this.f277418a = mr0Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f277419b = zv41VarM52819d;
        xtm0.m92105z(new vjz(fncVar, new jr4(this, null, 15)), new kmx(zv41VarM52819d, 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7 == r5) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m94864a(yy6 yy6Var, ibk ibkVar) {
        xy6 xy6Var;
        String strM17630n;
        if (ibkVar instanceof xy6) {
            xy6Var = (xy6) ibkVar;
            int i = xy6Var.f267229c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xy6Var.f267229c = i - Integer.MIN_VALUE;
            } else {
                xy6Var = new xy6(yy6Var, ibkVar);
            }
        } else {
            xy6Var = new xy6(yy6Var, ibkVar);
        }
        Object objInvoke = xy6Var.f267227a;
        int i2 = xy6Var.f267229c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            mr0 mr0Var = yy6Var.f277418a;
            xy6Var.f267229c = 1;
            objInvoke = mr0Var.invoke(xy6Var);
            if (objInvoke != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objInvoke);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
        }
        PlaybackSettingsEsperantoService$UserSettings playbackSettingsEsperantoService$UserSettingsM17592p = ((PlaybackSettingsEsperantoService$GetSettingsResponse) objInvoke).m17592p();
        if (playbackSettingsEsperantoService$UserSettingsM17592p == null || (strM17630n = playbackSettingsEsperantoService$UserSettingsM17592p.m17630n()) == null || strM17630n.length() == 0) {
            return null;
        }
        return strM17630n;
        q2p0[] q2p0VarArr = {q2p0.AUDIO_LANGUAGE};
        xy6Var.f267229c = 2;
        objInvoke = ((g3p0) objInvoke).m43510a(null, true, q2p0VarArr, xy6Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (((p204p.g3p0) r8).m43512c(r7, r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m94865b(String str, ibk ibkVar) {
        wy6 wy6Var;
        if (ibkVar instanceof wy6) {
            wy6Var = (wy6) ibkVar;
            int i = wy6Var.f256205d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wy6Var.f256205d = i - Integer.MIN_VALUE;
            } else {
                wy6Var = new wy6(this, ibkVar);
            }
        } else {
            wy6Var = new wy6(this, ibkVar);
        }
        Object objInvoke = wy6Var.f256203b;
        int i2 = wy6Var.f256205d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            this.f277419b.m97090l(str);
            wy6Var.f256202a = str;
            wy6Var.f256205d = 1;
            objInvoke = this.f277418a.invoke(wy6Var);
            if (objInvoke != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = wy6Var.f256202a;
            bga.m29073P(objInvoke);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
            ((s6x0) objInvoke).getClass();
        }
        return w2a1.f247311a;
        x2p0 x2p0VarM17600q = PlaybackSettingsEsperantoService$SetSettingsRequest.m17600q();
        r2p0 r2p0VarM17574p = PlaybackSettingsEsperantoService$FieldUpdate.m17574p();
        r2p0VarM17574p.m74560m(q2p0.AUDIO_LANGUAGE);
        s2p0 s2p0VarM17578q = PlaybackSettingsEsperantoService$FieldValue.m17578q();
        s2p0VarM17578q.m77096r(str);
        r2p0VarM17574p.m74561q((PlaybackSettingsEsperantoService$FieldValue) s2p0VarM17578q.build());
        x2p0VarM17600q.m89768r((PlaybackSettingsEsperantoService$FieldUpdate) r2p0VarM17574p.build());
        PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest = (PlaybackSettingsEsperantoService$SetSettingsRequest) x2p0VarM17600q.build();
        wy6Var.f256202a = null;
        wy6Var.f256205d = 2;
    }
}
