package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class ko10 implements c8e0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lo10 f124499a;

    public ko10(lo10 lo10Var) {
        this.f124499a = lo10Var;
    }

    @Override // p204p.c8e0
    public final void onMeetingStatusChange(b8e0 b8e0Var) {
        Logger.m3965a("[LiveSharing] Meeting status received: " + b8e0Var + ".", new Object[0]);
        lo10 lo10Var = this.f124499a;
        i8f1 i8f1Var = (i8f1) b8e0Var;
        ((BehaviorSubject) lo10Var.f135277g).onNext(i8f1Var.f99779a);
        ((BehaviorSubject) lo10Var.f135278h).onNext(((y9f1) i8f1Var.f99780b).f270586a);
    }
}
