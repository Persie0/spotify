package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class g9c implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i9c f77726a;

    public g9c(i9c i9cVar) {
        this.f77726a = i9cVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f77726a.f99985e);
    }
}
