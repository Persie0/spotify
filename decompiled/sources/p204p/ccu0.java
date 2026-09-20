package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class ccu0 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1045b f36647a;

    public ccu0(luk lukVar, gcu0 gcu0Var) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        fiz[] fizVarArr = {new j5t0(gcu0Var.m44321c(), 10)};
        companion.getClass();
        this.f36647a = new C1045b(lukVar, fizVarArr);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        return this.f36647a.mo15572a(consumer);
    }
}
