package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class uwa1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vwa1 f234620a;

    public uwa1(vwa1 vwa1Var) {
        this.f234620a = vwa1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f234620a.f245449a);
    }
}
