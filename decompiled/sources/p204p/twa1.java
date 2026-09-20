package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class twa1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vwa1 f224393a;

    public twa1(vwa1 vwa1Var) {
        this.f224393a = vwa1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f224393a.f245449a);
    }
}
