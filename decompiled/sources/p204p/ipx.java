package p204p;

import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ipx implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f104574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa81 f104575b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicInteger f104576c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicBoolean f104577d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ udy0 f104578e;

    public ipx(AtomicBoolean atomicBoolean, pa81 pa81Var, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean2, udy0 udy0Var) {
        this.f104574a = atomicBoolean;
        this.f104575b = pa81Var;
        this.f104576c = atomicInteger;
        this.f104577d = atomicBoolean2;
        this.f104578e = udy0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        boolean z = this.f104574a.get();
        pa81 pa81Var = this.f104575b;
        if (z) {
            pa81Var.mo51103d("await_response_" + (this.f104576c.get() + 1));
        }
        if (!this.f104577d.get()) {
            pa81Var.mo51103d("await_final_response");
        }
        pa81Var.stop();
        this.f104578e.cancel();
    }
}
