package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes7.dex */
public final class d690 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ luk f45630a;

    public d690(luk lukVar) {
        this.f45630a = lukVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f45630a);
    }
}
