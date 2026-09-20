package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import p204p.ti3;
import p204p.zx30;

/* JADX INFO: renamed from: android.support.v4.os.a */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC0008a extends Binder implements zx30 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f61l = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ResultReceiver f62a;

    public BinderC0008a(ResultReceiver resultReceiver) {
        this.f62a = resultReceiver;
        attachInterface(this, zx30.f287191k);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = zx30.f287191k;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo67y0(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // p204p.zx30
    /* JADX INFO: renamed from: y0 */
    public final void mo67y0(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.f62a;
        Handler handler = resultReceiver.mHandler;
        if (handler != null) {
            handler.post(new ti3((Object) resultReceiver, i, (Object) bundle, 9, false));
        } else {
            resultReceiver.onReceiveResult(i, bundle);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
