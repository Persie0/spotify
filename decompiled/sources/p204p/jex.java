package p204p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.home.evopage.mobius.C0788e;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import com.spotify.home.evopage.structureapi.InterfaceC0791a;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jex extends d6a0 implements InterfaceC0791a, w3x0 {

    /* JADX INFO: renamed from: L0 */
    public final xp4 f111685L0;

    /* JADX INFO: renamed from: M0 */
    public final xoi0 f111686M0;

    /* JADX INFO: renamed from: N0 */
    public final xoi0 f111687N0;

    /* JADX INFO: renamed from: O0 */
    public final CompositeDisposable f111688O0;

    /* JADX INFO: renamed from: P0 */
    public MobiusLoop f111689P0;

    /* JADX INFO: renamed from: Q0 */
    public Disposable f111690Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f111691R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f111692S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f111693T0;

    /* JADX INFO: renamed from: U0 */
    public hex f111694U0;

    /* JADX INFO: renamed from: V0 */
    public final e630 f111695V0;

    /* JADX INFO: renamed from: W0 */
    public a630 f111696W0;

    /* JADX INFO: renamed from: X */
    public final er70 f111697X;

    /* JADX INFO: renamed from: Y */
    public final i780 f111698Y;

    /* JADX INFO: renamed from: Z */
    public final b9m0 f111699Z;

    /* JADX INFO: renamed from: d */
    public final Activity f111700d;

    /* JADX INFO: renamed from: e */
    public final C0788e f111701e;

    /* JADX INFO: renamed from: f */
    public final zfx f111702f;

    /* JADX INFO: renamed from: g */
    public final q530 f111703g;

    /* JADX INFO: renamed from: h */
    public final q040 f111704h;

    /* JADX INFO: renamed from: i */
    public final hc80 f111705i;

    /* JADX INFO: renamed from: t */
    public final gex f111706t;

    public jex(fex fexVar, Activity activity, C0788e c0788e, zfx zfxVar, q530 q530Var, q040 q040Var, hc80 hc80Var, gex gexVar, er70 er70Var, i780 i780Var, b9m0 b9m0Var, xp4 xp4Var) {
        this.f111700d = activity;
        this.f111701e = c0788e;
        this.f111702f = zfxVar;
        this.f111703g = q530Var;
        this.f111704h = q040Var;
        this.f111705i = hc80Var;
        this.f111706t = gexVar;
        this.f111697X = er70Var;
        this.f111698Y = i780Var;
        this.f111699Z = b9m0Var;
        this.f111685L0 = xp4Var;
        xoi0 xoi0Var = new xoi0();
        this.f111686M0 = xoi0Var;
        this.f111687N0 = xoi0Var;
        this.f111688O0 = new CompositeDisposable();
        this.f111691R0 = true;
        this.f111695V0 = q530Var.mo40811o();
        Logger.m3965a("EvoLoadableResource :: init", new Object[0]);
        hc80Var.getLifecycle().mo31986a(fexVar);
    }

    @Override // p204p.w3x0
    /* JADX INFO: renamed from: a */
    public final void mo31963a(Bundle bundle) {
        this.f111692S0 = bundle.getBoolean("isRestored", false);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        this.f111703g.mo40801e(this.f111695V0);
        Logger.m3965a("EvoLoadableResource :: onStart", new Object[0]);
        ias iasVar = new ias(this, 8);
        if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            iasVar.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new eph(iasVar, 22));
        }
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        Logger.m3965a("EvoLoadableResource :: onStop", new Object[0]);
        this.f111693T0 = true;
        hex hexVar = this.f111694U0;
        if (hexVar != null) {
            if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
                this.f111705i.getLifecycle().mo31988d(hexVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new lk00(21, this, hexVar));
            }
        }
        this.f111694U0 = null;
        this.f111706t.m44532c();
        this.f111688O0.m23396g();
        Disposable disposable = this.f111690Q0;
        if (disposable == null) {
            wj50.m88260d0("loopDisposable");
            throw null;
        }
        disposable.dispose();
        zfx zfxVar = this.f111702f;
        zfxVar.f282446g = true;
        Iterator it = zfxVar.f282444e.iterator();
        while (it.hasNext()) {
            ((p450) it.next()).dispose();
        }
        MobiusLoop mobiusLoop = this.f111689P0;
        if (mobiusLoop == null) {
            wj50.m88260d0("loop");
            throw null;
        }
        mobiusLoop.dispose();
        this.f111703g.mo40809m(3, this.f111700d);
    }

    /* JADX INFO: renamed from: k */
    public final void m53119k(String str, DismissedEntity.Type type) {
        DismissedEntity dismissedEntity = new DismissedEntity(str, type);
        if (type != DismissedEntity.Type.SHOWCASE) {
            m53120l(new Event.DismissSection(dismissedEntity));
        } else {
            zv41 zv41Var = ((iz61) this.f111697X.get()).f107156a;
            zv41Var.m97091m(null, s601.m77308k0(dismissedEntity, (Set) zv41Var.getValue()));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m53120l(Event event) {
        Object c6x0Var;
        MobiusLoop mobiusLoop = this.f111689P0;
        if (mobiusLoop == null || this.f111693T0) {
            return;
        }
        try {
            mobiusLoop.m15600a(event);
            c6x0Var = w2a1.f247311a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            na6.m63972t("Failed to dispatch event to loop: " + event, thM77348a);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m53121m(String str, DismissedEntity.Type type) {
        m53120l(new Event.UndoDismissSection(new DismissedEntity(str, type)));
    }

    @Override // p204p.w3x0
    public final Bundle serialize() {
        return pp91.m70529j(pft0.m69840u("isRestored", Boolean.TRUE));
    }
}
