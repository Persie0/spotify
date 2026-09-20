package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes6.dex */
public final class idp implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kdp f101198a;

    public idp(kdp kdpVar) {
        this.f101198a = kdpVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f101198a.f121711d);
    }
}
