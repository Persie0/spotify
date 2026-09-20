package p204p;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class h8v extends Binder implements ru30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xpo f88806a;

    public h8v(xpo xpoVar) {
        this.f88806a = xpoVar;
        attachInterface(this, ru30.f202734d);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = ru30.f202734d;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt() | 2;
        xpo xpoVar = this.f88806a;
        synchronized (xpoVar.f264691a) {
            Integer num = (Integer) xpoVar.f264696f;
            if (num != null && num.intValue() == i3) {
                return true;
            }
            xpoVar.f264696f = Integer.valueOf(i3);
            for (Map.Entry entry : new ArrayMap((ArrayMap) xpoVar.f264695e).entrySet()) {
                ((Executor) entry.getValue()).execute(new lx6((Consumer) entry.getKey(), i3, 4));
            }
            return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
