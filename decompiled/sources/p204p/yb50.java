package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class yb50 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1045b f271079a;

    public yb50(fiz fizVar, luk lukVar) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        fiz[] fizVarArr = {mvl0.m62953p(new qp20(fizVar, 11))};
        companion.getClass();
        this.f271079a = new C1045b(lukVar, fizVarArr);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        return this.f271079a.mo15572a(consumer);
    }
}
