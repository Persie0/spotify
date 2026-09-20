package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes6.dex */
public final class jb50 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1045b f110655a;

    public jb50(Flowable flowable, tgz0 tgz0Var, l3v l3vVar, luk lukVar) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        boolean zM38353n = l3vVar.f129445a.m38353n();
        d0k[] d0kVarArr = bmu0.f28619a;
        fiz[] fizVarArr = {new qp20(mvl0.m62953p(xtm0.m92074U(mvl0.m62953p(new p8x(new onc(flowable), zM38353n, 2)), new kb50(null, tgz0Var, 0))), 10)};
        companion.getClass();
        this.f110655a = new C1045b(lukVar, fizVarArr);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        return this.f110655a.mo15572a(consumer);
    }
}
