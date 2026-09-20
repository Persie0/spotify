package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class qy31 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1045b f193797a;

    public qy31(gzr gzrVar, luk lukVar) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        int i = 3;
        fbk fbkVar = null;
        fiz[] fizVarArr = {new kmx(new ia2(xtm0.m92074U(xtm0.m92074U(new kmx(gzrVar, 8), new zv3(i, 26, fbkVar)), new zv3(i, 27, fbkVar)), 23), 8)};
        companion.getClass();
        this.f193797a = new C1045b(lukVar, fizVarArr);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        return this.f193797a.mo15572a(consumer);
    }
}
