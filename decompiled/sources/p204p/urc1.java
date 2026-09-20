package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class urc1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yrc1 f233329a;

    public urc1(yrc1 yrc1Var) {
        this.f233329a = yrc1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f233329a.f275457c);
    }
}
