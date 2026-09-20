package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class q6m implements x5m {

    /* JADX INFO: renamed from: a */
    public final a1m0 f185853a;

    /* JADX INFO: renamed from: b */
    public final luk f185854b;

    /* JADX INFO: renamed from: c */
    public final fiz f185855c;

    /* JADX INFO: renamed from: d */
    public final mb61 f185856d;

    /* JADX INFO: renamed from: g */
    public MobiusLoop f185859g;

    /* JADX INFO: renamed from: h */
    public Disposable f185860h;

    /* JADX INFO: renamed from: e */
    public final Object f185857e = new Object();

    /* JADX INFO: renamed from: f */
    public final zv41 f185858f = jag1.m52819d(v6m.f237922a);

    /* JADX INFO: renamed from: i */
    public final m6m f185861i = new m6m(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public q6m(a1m0 a1m0Var, luk lukVar, fiz fizVar, gh00 gh00Var) {
        this.f185853a = a1m0Var;
        this.f185854b = lukVar;
        this.f185855c = fizVar;
        this.f185856d = (mb61) gh00Var;
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: a */
    public final void mo28300a(Set set) {
        m72243b(new np10(set));
    }

    /* JADX INFO: renamed from: b */
    public final void m72243b(v1x v1xVar) {
        synchronized (this.f185857e) {
            MobiusLoop mobiusLoop = this.f185859g;
            if (mobiusLoop != null) {
                mobiusLoop.m15600a(v1xVar);
            }
        }
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: c */
    public final v5m mo28301c() {
        return this.f185861i;
    }

    @Override // p204p.x5m
    public final void start() {
        synchronized (this.f185857e) {
            MobiusLoop.Builder builderMo15594f = Mobius.m15582d(ata0.f19628c, (Connectable) this.f185853a.invoke(null, this.f185856d)).mo15594f(new AndroidLogger());
            FlowEventSources.Companion companion = FlowEventSources.f5713a;
            luk lukVar = this.f185854b;
            fiz[] fizVarArr = {new evi(this.f185855c, 18)};
            companion.getClass();
            MobiusLoop mobiusLoopMo15595g = builderMo15594f.mo15596h(new C1045b(lukVar, fizVarArr)).mo15595g(v6m.f237922a);
            this.f185859g = mobiusLoopMo15595g;
            this.f185860h = mobiusLoopMo15595g.m15601b(new hz0(this, 8));
        }
    }

    @Override // p204p.x5m
    public final void stop() {
        MobiusLoop mobiusLoop;
        Disposable disposable;
        synchronized (this.f185857e) {
            mobiusLoop = this.f185859g;
            disposable = this.f185860h;
            this.f185859g = null;
            this.f185860h = null;
        }
        Disposable disposable2 = disposable;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
    }
}
