package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class zq71 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ br71 f285326a;

    public zq71(br71 br71Var) {
        this.f285326a = br71Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f285326a.f30007a);
    }
}
