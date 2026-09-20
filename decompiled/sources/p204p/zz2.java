package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zz2 implements x5m {

    /* JADX INFO: renamed from: a */
    public final C1044a f287862a;

    /* JADX INFO: renamed from: b */
    public final luk f287863b;

    /* JADX INFO: renamed from: e */
    public MobiusLoop f287866e;

    /* JADX INFO: renamed from: f */
    public Disposable f287867f;

    /* JADX INFO: renamed from: c */
    public final zv41 f287864c = jag1.m52819d(a03.f10978a);

    /* JADX INFO: renamed from: d */
    public final Object f287865d = new Object();

    /* JADX INFO: renamed from: g */
    public final xz2 f287868g = new xz2(this);

    public zz2(C1044a c1044a, luk lukVar) {
        this.f287862a = c1044a;
        this.f287863b = lukVar;
    }

    /* JADX INFO: renamed from: d */
    public static final void m97263d(zz2 zz2Var, v1x v1xVar) {
        synchronized (zz2Var.f287865d) {
            MobiusLoop mobiusLoop = zz2Var.f287866e;
            if (mobiusLoop != null) {
                mobiusLoop.m15600a(v1xVar);
            }
        }
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: a */
    public final void mo28300a(Set set) {
        np10 np10Var = new np10(set);
        synchronized (this.f287865d) {
            MobiusLoop mobiusLoop = this.f287866e;
            if (mobiusLoop != null) {
                mobiusLoop.m15600a(np10Var);
            }
        }
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: c */
    public final v5m mo28301c() {
        return this.f287868g;
    }

    @Override // p204p.x5m
    public final void start() {
        synchronized (this.f287865d) {
            MobiusLoop.Builder builderMo15594f = Mobius.m15582d(ata0.f19628c, this.f287862a).mo15594f(new AndroidLogger());
            FlowEventSources.Companion companion = FlowEventSources.f5713a;
            luk lukVar = this.f287863b;
            fiz[] fizVarArr = {new yz2()};
            companion.getClass();
            MobiusLoop mobiusLoopMo15595g = builderMo15594f.mo15596h(new C1045b(lukVar, fizVarArr)).mo15595g(a03.f10978a);
            this.f287866e = mobiusLoopMo15595g;
            this.f287867f = mobiusLoopMo15595g.m15601b(new hz0(this, 2));
        }
    }

    @Override // p204p.x5m
    public final void stop() {
        MobiusLoop mobiusLoop;
        Disposable disposable;
        synchronized (this.f287865d) {
            mobiusLoop = this.f287866e;
            disposable = this.f287867f;
            this.f287866e = null;
            this.f287867f = null;
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
