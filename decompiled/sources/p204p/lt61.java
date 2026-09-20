package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class lt61 {

    /* JADX INFO: renamed from: a */
    public final a0a f136705a;

    /* JADX INFO: renamed from: b */
    public final i0a f136706b;

    /* JADX INFO: renamed from: c */
    public final a0a f136707c;

    /* JADX INFO: renamed from: d */
    public final w2y0 f136708d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f136709e;

    /* JADX INFO: renamed from: f */
    public final yvt0 f136710f;

    /* JADX INFO: renamed from: g */
    public final c9k f136711g;

    /* JADX INFO: renamed from: h */
    public final lsi0 f136712h = msi0.m62770a();

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f136713i = new LinkedHashSet();

    /* JADX INFO: renamed from: j */
    public final ArrayList f136714j = new ArrayList();

    public lt61(a0a a0aVar, i0a i0aVar, a0a a0aVar2, luk lukVar, w2y0 w2y0Var, ron ronVar, yvt0 yvt0Var) {
        this.f136705a = a0aVar;
        this.f136706b = i0aVar;
        this.f136707c = a0aVar2;
        this.f136708d = w2y0Var;
        this.f136709e = ronVar;
        this.f136710f = yvt0Var;
        this.f136711g = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m59872a(lt61 lt61Var, nt61 nt61Var, fbk fbkVar) {
        kt61 kt61Var;
        lt61Var.getClass();
        if (fbkVar instanceof kt61) {
            kt61Var = (kt61) fbkVar;
            int i = kt61Var.f126168c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kt61Var.f126168c = i - Integer.MIN_VALUE;
            } else {
                kt61Var = new kt61(lt61Var, fbkVar);
            }
        } else {
            kt61Var = new kt61(lt61Var, fbkVar);
        }
        Object objM96567o = kt61Var.f126166a;
        int i2 = kt61Var.f126168c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                nt61Var.getClass();
                Single singleM94745a = yvt0.m94745a(lt61Var.f136710f, PlayOrigin.create("spotify-tap-ble"), LoggingParams.builder().build(), null, 28);
                kt61Var.f126168c = 1;
                objM96567o = zn91.m96567o(singleM94745a, kt61Var);
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
            Logger.m3967c(e2, "Tap BLE: Playback failed", new Object[0]);
        }
        return w2a1.f247311a;
    }
}
