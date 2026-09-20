package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class fgm0 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final egm0 f69370a;

    /* JADX INFO: renamed from: b */
    public final luk f69371b;

    public fgm0(egm0 egm0Var, luk lukVar) {
        this.f69370a = egm0Var;
        this.f69371b = lukVar;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        fiz[] fizVarArr = {this.f69370a.f59362b};
        companion.getClass();
        return new C1045b(this.f69371b, fizVarArr).mo15572a(new eo2(consumer, 15));
    }
}
