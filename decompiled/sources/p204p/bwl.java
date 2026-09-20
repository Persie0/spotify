package p204p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldUpdate;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$FieldValue;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$SetSettingsRequest;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class bwl extends lg01 {

    /* JADX INFO: renamed from: a */
    public final j2p0 f31669a;

    /* JADX INFO: renamed from: b */
    public final vjz f31670b;

    public bwl(j2p0 j2p0Var) {
        this.f31669a = j2p0Var;
        fbk fbkVar = null;
        this.f31670b = new vjz(new g6a(new nzx0(new qri(this, fbkVar, 28)), 2), new ic0(3, 12, fbkVar), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m30695a(int i, ibk ibkVar) {
        xvl xvlVar;
        if (ibkVar instanceof xvl) {
            xvlVar = (xvl) ibkVar;
            int i2 = xvlVar.f266422d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xvlVar.f266422d = i2 - Integer.MIN_VALUE;
            } else {
                xvlVar = new xvl(this, ibkVar);
            }
        } else {
            xvlVar = new xvl(this, ibkVar);
        }
        Object obj = xvlVar.f266420b;
        int i3 = xvlVar.f266422d;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                if (i < 0) {
                    return new dd01(0, null);
                }
                ArrayList arrayList = new ArrayList();
                r2p0 r2p0VarM17574p = PlaybackSettingsEsperantoService$FieldUpdate.m17574p();
                r2p0VarM17574p.m74560m(q2p0.CROSSFADE);
                s2p0 s2p0VarM17578q = PlaybackSettingsEsperantoService$FieldValue.m17578q();
                s2p0VarM17578q.m77094m(i > 0);
                r2p0VarM17574p.m74561q((PlaybackSettingsEsperantoService$FieldValue) s2p0VarM17578q.build());
                arrayList.add(r2p0VarM17574p.build());
                if (i > 0) {
                    r2p0 r2p0VarM17574p2 = PlaybackSettingsEsperantoService$FieldUpdate.m17574p();
                    r2p0VarM17574p2.m74560m(q2p0.CROSSFADE_DURATION_MS);
                    s2p0 s2p0VarM17578q2 = PlaybackSettingsEsperantoService$FieldValue.m17578q();
                    s2p0VarM17578q2.m77095q(i * 1000);
                    r2p0VarM17574p2.m74561q((PlaybackSettingsEsperantoService$FieldValue) s2p0VarM17578q2.build());
                    arrayList.add(r2p0VarM17574p2.build());
                }
                j2p0 j2p0Var = this.f31669a;
                x2p0 x2p0VarM17600q = PlaybackSettingsEsperantoService$SetSettingsRequest.m17600q();
                x2p0VarM17600q.m89766m(arrayList);
                SingleSource map = j2p0Var.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "SetSettings", (PlaybackSettingsEsperantoService$SetSettingsRequest) x2p0VarM17600q.build()).map(zyx.f287708Y0);
                xvlVar.f266419a = i;
                xvlVar.f266422d = 1;
                Object objM96567o = zn91.m96567o(map, xvlVar);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = xvlVar.f266419a;
                bga.m29073P(obj);
            }
            return new ed01(new Integer(i));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new dd01(0, null);
        }
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f31670b;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return m30695a(((Number) obj2).intValue(), (ibk) fbkVar);
    }
}
