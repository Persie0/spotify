package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class zt30 implements bu30, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f286048a;

    public zt30(IBinder iBinder) {
        this.f286048a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f286048a;
    }
}
