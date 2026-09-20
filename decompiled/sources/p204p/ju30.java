package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class ju30 implements lu30, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f116024a;

    public ju30(IBinder iBinder) {
        this.f116024a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f116024a;
    }
}
