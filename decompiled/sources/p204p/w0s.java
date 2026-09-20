package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes6.dex */
public final class w0s implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1045b f246803a;

    public w0s(Flowable flowable, h6v h6vVar, luk lukVar) {
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        d0k[] d0kVarArr = bmu0.f28619a;
        fiz[] fizVarArr = {mvl0.m62953p(new nmp(22, new onc(flowable), h6vVar))};
        companion.getClass();
        this.f246803a = new C1045b(lukVar, fizVarArr);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        return this.f246803a.mo15572a(consumer);
    }
}
