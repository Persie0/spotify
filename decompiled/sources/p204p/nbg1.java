package p204p;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes4.dex */
public final class nbg1 extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ev61 f152271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbg1(s0f1 s0f1Var, Handler handler, ev61 ev61Var) {
        super(handler);
        this.f152271a = ev61Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f152271a.m40099d(null);
    }
}
