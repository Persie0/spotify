package p204p;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class qrf1 implements Parcelable {
    public static final Parcelable.Creator<qrf1> CREATOR = new c5f1(22);

    /* JADX INFO: renamed from: a */
    public final Messenger f191832a;

    public qrf1(IBinder iBinder) {
        this.f191832a = new Messenger(iBinder);
    }

    /* JADX INFO: renamed from: c */
    public final void m73617c(Message message) throws RemoteException {
        Messenger messenger = this.f191832a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f191832a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((qrf1) obj).f191832a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f191832a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f191832a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
