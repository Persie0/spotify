package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class r2f1 implements v2f1, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f195135a;

    public r2f1(IBinder iBinder) {
        this.f195135a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f195135a;
    }
}
