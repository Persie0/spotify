package p204p;

import com.spotify.browse.clientnative.mobius.C0318b;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class hna implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0318b f93270a;

    public hna(C0318b c0318b) {
        this.f93270a = c0318b;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f93270a.f3113b);
    }
}
