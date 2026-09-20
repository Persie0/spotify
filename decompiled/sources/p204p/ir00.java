package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldUpdate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldValue;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ir00 extends lg01 {

    /* JADX INFO: renamed from: a */
    public final j2p0 f104877a;

    /* JADX INFO: renamed from: b */
    public final vjz f104878b;

    public ir00(j2p0 j2p0Var) {
        this.f104877a = j2p0Var;
        fbk fbkVar = null;
        this.f104878b = new vjz(new g6a(new nzx0(new l92(this, fbkVar, 8)), 6), new ic0(3, 25, fbkVar), 2);
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f104878b;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, d850 d850Var, fbk fbkVar) {
        fr00 fr00Var;
        if (fbkVar instanceof fr00) {
            fr00Var = (fr00) fbkVar;
            int i = fr00Var.f72320d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fr00Var.f72320d = i - Integer.MIN_VALUE;
            } else {
                fr00Var = new fr00(this, (ibk) fbkVar);
            }
        } else {
            fr00Var = new fr00(this, (ibk) fbkVar);
        }
        Object obj = fr00Var.f72318b;
        int i2 = fr00Var.f72320d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                j2p0 j2p0Var = this.f104877a;
                x2p0 x2p0VarM17600q = PlaybackSettingsEsperantoService$SetSettingsRequest.m17600q();
                r2p0 r2p0VarM17574p = PlaybackSettingsEsperantoService$FieldUpdate.m17574p();
                r2p0VarM17574p.m74560m(q2p0.GAPLESS);
                s2p0 s2p0VarM17578q = PlaybackSettingsEsperantoService$FieldValue.m17578q();
                s2p0VarM17578q.m77094m(z);
                r2p0VarM17574p.m74561q((PlaybackSettingsEsperantoService$FieldValue) s2p0VarM17578q.build());
                x2p0VarM17600q.m89768r((PlaybackSettingsEsperantoService$FieldUpdate) r2p0VarM17574p.build());
                SingleSource map = j2p0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetSettings", (PlaybackSettingsEsperantoService$SetSettingsRequest) x2p0VarM17600q.build()).map(zyx.f287708Y0);
                fr00Var.f72317a = z;
                fr00Var.f72320d = 1;
                Object objM96567o = zn91.m96567o(map, fr00Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = fr00Var.f72317a;
                bga.m29073P(obj);
            }
            return new ed01(Boolean.valueOf(z));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new dd01(0, null);
        }
    }
}
