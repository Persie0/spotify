package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes6.dex */
public final class um60 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1045b f231766a;

    public um60(Flowable flowable, tgz0 tgz0Var, luk lukVar) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        d0k[] d0kVarArr = bmu0.f28619a;
        fiz[] fizVarArr = {new ia2(xtm0.m92074U(new onc(flowable), new kb50(null, tgz0Var, 1)), 10)};
        companion.getClass();
        this.f231766a = new C1045b(lukVar, fizVarArr);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        return this.f231766a.mo15572a(consumer);
    }
}
