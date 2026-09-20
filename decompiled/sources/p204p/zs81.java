package p204p;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes6.dex */
public final class zs81 {

    /* JADX INFO: renamed from: a */
    public final Emitter f285888a;

    /* JADX INFO: renamed from: b */
    public final Disposable f285889b;

    /* JADX INFO: renamed from: c */
    public final gu51 f285890c;

    public zs81(Emitter emitter, Disposable disposable, gu51 gu51Var, String str) {
        this.f285888a = emitter;
        this.f285889b = disposable;
        this.f285890c = gu51Var;
    }

    /* JADX INFO: renamed from: a */
    public final gu51 m96826a() {
        return this.f285890c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m96827b() {
        boolean zIsCancelled;
        Emitter emitter = this.f285888a;
        if (emitter instanceof ObservableEmitter) {
            zIsCancelled = ((ObservableEmitter) emitter).isDisposed();
        } else {
            if (!(emitter instanceof FlowableEmitter)) {
                throw new IllegalArgumentException("Must be either ObservableEmitter or FlowableEmitter");
            }
            zIsCancelled = ((FlowableEmitter) emitter).isCancelled();
        }
        if (zIsCancelled) {
            return false;
        }
        this.f285889b.dispose();
        return true;
    }
}
