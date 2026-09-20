package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class rwx implements EventSource {

    /* JADX INFO: renamed from: a */
    public final luk f203426a;

    /* JADX INFO: renamed from: b */
    public final swx f203427b;

    public rwx(luk lukVar, swx swxVar) {
        this.f203426a = lukVar;
        this.f203427b = swxVar;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        fiz[] fizVarArr = {new kmx(this.f203427b.f214732b, 1)};
        companion.getClass();
        return new C1045b(this.f203426a, fizVarArr).mo15572a(new eo2(consumer, 8));
    }
}
