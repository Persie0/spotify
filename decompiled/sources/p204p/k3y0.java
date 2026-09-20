package p204p;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes10.dex */
public final class k3y0 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cy30 f119024a;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ObservableEmitter f119025l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ l3y0 f119026m;

    public k3y0(l3y0 l3y0Var, cy30 cy30Var, ObservableEmitter observableEmitter) {
        this.f119026m = l3y0Var;
        this.f119024a = cy30Var;
        this.f119025l = observableEmitter;
        attachInterface(this, "com.msc.sa.aidl.ISACallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object h2y0Var;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.msc.sa.aidl.ISACallback");
        }
        if (i == 1) {
            parcel.readInt();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            parcel.readInt();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            parcel.readInt();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.readInt();
        boolean z = parcel.readInt() != 0;
        Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
        l3y0 l3y0Var = this.f119026m;
        try {
            if (l3y0Var.f129460c.mo49279c()) {
                ((ay30) this.f119024a).m27499a2((String) l3y0Var.f129460c.mo49278b());
            }
        } catch (RemoteException unused) {
        }
        ObservableEmitter observableEmitter = this.f119025l;
        if (!observableEmitter.isDisposed()) {
            if (bundle.containsKey("id_token") && bundle.containsKey("authcode") && bundle.containsKey("api_server_url") && bundle.containsKey("auth_server_url")) {
                String string = bundle.getString("id_token");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("authcode");
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = bundle.getString("api_server_url");
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = bundle.getString("auth_server_url");
                if (string4 == null) {
                    string4 = "";
                }
                h2y0Var = new i2y0(string, string2, string3, string4);
            } else {
                h2y0Var = new h2y0("Data missing in auth code result");
            }
            if (z) {
                observableEmitter.onNext(h2y0Var);
            } else {
                observableEmitter.onNext(new h2y0(edb.m38564m("Failed to fetch id token. ", bundle.getString("error_message", ""))));
            }
            observableEmitter.onComplete();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
