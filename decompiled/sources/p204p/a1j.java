package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class a1j implements EventSource {

    /* JADX INFO: renamed from: a */
    public final gcu0 f11426a;

    /* JADX INFO: renamed from: b */
    public final nqw f11427b;

    /* JADX INFO: renamed from: c */
    public final luk f11428c;

    public a1j(gcu0 gcu0Var, nqw nqwVar, luk lukVar) {
        this.f11426a = gcu0Var;
        this.f11427b = nqwVar;
        this.f11428c = lukVar;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        zux zuxVar = new zux(this.f11426a.m44321c(), this.f11427b.f157347a, new jl0(3, 8, null), 1);
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        fiz[] fizVarArr = {mvl0.m62953p(zuxVar)};
        companion.getClass();
        return new C1045b(this.f11428c, fizVarArr).mo15572a(consumer);
    }
}
