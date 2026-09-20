package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class xmf1 implements yvf1, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f263360a;

    public xmf1(IBinder iBinder) {
        this.f263360a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f263360a;
    }
}
