package p204p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: classes3.dex */
public final class gu2 implements Cancellable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84348a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MobiusLoop f84349b;

    public gu2(MobiusLoop mobiusLoop) {
        this.f84349b = mobiusLoop;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        switch (this.f84348a) {
            case 0:
                this.f84349b.dispose();
                break;
            default:
                this.f84349b.dispose();
                break;
        }
    }

    public gu2(MobiusLoop mobiusLoop, rlv0 rlv0Var) {
        this.f84349b = mobiusLoop;
    }
}
