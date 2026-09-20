package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p204p.ti3;
import p204p.xxw0;
import p204p.yx30;
import p204p.zx30;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new xxw0(11);
    final Handler mHandler;
    final boolean mLocal;
    zx30 mReceiver;

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new ti3((Object) this, i, (Object) bundle, 9, false));
                return;
            } else {
                onReceiveResult(i, bundle);
                return;
            }
        }
        zx30 zx30Var = this.mReceiver;
        if (zx30Var != null) {
            try {
                zx30Var.mo67y0(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.mReceiver == null) {
                    this.mReceiver = new BinderC0008a(this);
                }
                parcel.writeStrongBinder(this.mReceiver.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.mLocal = false;
        zx30 zx30Var = null;
        this.mHandler = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = BinderC0008a.f61l;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(zx30.f287191k);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof zx30)) {
                zx30Var = (zx30) iInterfaceQueryLocalInterface;
            } else {
                yx30 yx30Var = new yx30();
                yx30Var.f277125a = strongBinder;
                zx30Var = yx30Var;
            }
        }
        this.mReceiver = zx30Var;
    }
}
