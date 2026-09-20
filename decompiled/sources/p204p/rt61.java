package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class rt61 {

    /* JADX INFO: renamed from: a */
    public final a0a f202502a;

    /* JADX INFO: renamed from: b */
    public final i0a f202503b;

    /* JADX INFO: renamed from: c */
    public final a0a f202504c;

    /* JADX INFO: renamed from: d */
    public final iqp0 f202505d;

    /* JADX INFO: renamed from: e */
    public final yvt0 f202506e;

    /* JADX INFO: renamed from: f */
    public final c9k f202507f;

    public rt61(a0a a0aVar, i0a i0aVar, a0a a0aVar2, luk lukVar, iqp0 iqp0Var, yvt0 yvt0Var) {
        this.f202502a = a0aVar;
        this.f202503b = i0aVar;
        this.f202504c = a0aVar2;
        this.f202505d = iqp0Var;
        this.f202506e = yvt0Var;
        this.f202507f = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m76368a(rt61 rt61Var, nt61 nt61Var, fbk fbkVar) {
        qt61 qt61Var;
        rt61Var.getClass();
        if (fbkVar instanceof qt61) {
            qt61Var = (qt61) fbkVar;
            int i = qt61Var.f192305c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qt61Var.f192305c = i - Integer.MIN_VALUE;
            } else {
                qt61Var = new qt61(rt61Var, fbkVar);
            }
        } else {
            qt61Var = new qt61(rt61Var, fbkVar);
        }
        Object objM96567o = qt61Var.f192303a;
        int i2 = qt61Var.f192305c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                nt61Var.getClass();
                Single singleM94745a = yvt0.m94745a(rt61Var.f202506e, PlayOrigin.create("spotify-tap-ble"), LoggingParams.builder().build(), null, 28);
                qt61Var.f192305c = 1;
                objM96567o = zn91.m96567o(singleM94745a, qt61Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            wj50.m88279p(objM96567o);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Tap BLE Peripheral: Playback failed", new Object[0]);
        }
        return w2a1.f247311a;
    }
}
