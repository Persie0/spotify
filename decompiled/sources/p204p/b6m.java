package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b6m implements x5m {

    /* JADX INFO: renamed from: a */
    public final C1044a f23985a;

    /* JADX INFO: renamed from: b */
    public final fiz f23986b;

    /* JADX INFO: renamed from: c */
    public final luk f23987c;

    /* JADX INFO: renamed from: d */
    public final luk f23988d;

    /* JADX INFO: renamed from: e */
    public volatile MobiusLoop f23989e;

    /* JADX INFO: renamed from: f */
    public volatile Disposable f23990f;

    /* JADX INFO: renamed from: g */
    public final zv41 f23991g = jag1.m52819d(c6m.f34572a);

    /* JADX INFO: renamed from: h */
    public final z5m f23992h = new z5m(this);

    public b6m(C1044a c1044a, fiz fizVar, luk lukVar, luk lukVar2) {
        this.f23985a = c1044a;
        this.f23986b = fizVar;
        this.f23987c = lukVar;
        this.f23988d = lukVar2;
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: a */
    public final void mo28300a(Set set) {
        MobiusLoop mobiusLoop = this.f23989e;
        if (mobiusLoop != null) {
            mobiusLoop.m15600a(new np10(set));
        }
    }

    @Override // p204p.x5m
    /* JADX INFO: renamed from: c */
    public final v5m mo28301c() {
        return this.f23992h;
    }

    @Override // p204p.x5m
    public final void start() {
        Disposable disposable = this.f23990f;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.f23989e;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        MobiusLoop.Builder builderMo15590b = Mobius.m15582d(ata0.f19628c, this.f23985a).mo15592d(new jsa(this, 23)).mo15590b(new qq8(this, 26));
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        luk lukVar = this.f23987c;
        fiz[] fizVarArr = {new ur0(this.f23986b, 3)};
        companion.getClass();
        MobiusLoop mobiusLoopMo15595g = builderMo15590b.mo15596h(new C1045b(lukVar, fizVarArr)).mo15595g(c6m.f34572a);
        this.f23989e = mobiusLoopMo15595g;
        this.f23990f = mobiusLoopMo15595g.m15601b(new hz0(this, 7));
    }

    @Override // p204p.x5m
    public final void stop() {
        Disposable disposable = this.f23990f;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.f23989e;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        this.f23989e = null;
        this.f23990f = null;
        zv41 zv41Var = this.f23991g;
        z4m z4mVar = c6m.f34572a;
        zv41Var.getClass();
        zv41Var.m97091m(null, z4mVar);
    }
}
