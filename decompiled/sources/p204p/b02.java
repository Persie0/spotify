package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes4.dex */
public final class b02 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c02 f21725a;

    public b02(c02 c02Var) {
        this.f21725a = c02Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f21725a.f32650b);
    }
}
