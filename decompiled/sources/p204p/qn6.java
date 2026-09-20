package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;

/* JADX INFO: loaded from: classes3.dex */
public final class qn6 implements Function {

    /* JADX INFO: renamed from: a */
    public final Scheduler f190478a;

    /* JADX INFO: renamed from: b */
    public final Consumer f190479b;

    public /* synthetic */ qn6(Scheduler scheduler, Consumer consumer) {
        this.f190478a = scheduler;
        this.f190479b = consumer;
    }

    /* JADX INFO: renamed from: a */
    public CompletableSubscribeOn m73313a(zjs0 zjs0Var) {
        return new CompletableFromAction(new ok0(10, this, zjs0Var)).m23303t(this.f190478a);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        CompletableFromAction completableFromAction = new CompletableFromAction(new ok0(22, this.f190479b, obj));
        Scheduler scheduler = this.f190478a;
        return scheduler == null ? completableFromAction : completableFromAction.m23303t(scheduler);
    }
}
