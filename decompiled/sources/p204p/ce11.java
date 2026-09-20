package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class ce11 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ le11 f36994a;

    public ce11(le11 le11Var) {
        this.f36994a = le11Var;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        le11 le11Var = this.f36994a;
        be11 be11Var = new be11(le11Var.f132429d.mo28301c().mo38766a(), 0);
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        luk lukVar = le11Var.f132432g;
        fiz[] fizVarArr = {be11Var};
        companion.getClass();
        return new C1045b(lukVar, fizVarArr).mo15572a(consumer);
    }
}
