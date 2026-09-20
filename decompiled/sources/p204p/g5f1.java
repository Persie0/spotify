package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g5f1 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76673a;

    /* JADX INFO: renamed from: l */
    public final IBinder f76674l;

    /* JADX INFO: renamed from: m */
    public final String f76675m;

    public /* synthetic */ g5f1(IBinder iBinder, String str, int i) {
        this.f76673a = i;
        this.f76674l = iBinder;
        this.f76675m = str;
    }

    /* JADX INFO: renamed from: C */
    public Parcel m43600C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f76675m);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: a2 */
    public Parcel m43601a2(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f76674l.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f76673a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return this.f76674l;
    }

    /* JADX INFO: renamed from: b2 */
    public Parcel m43602b2(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f76674l.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m43603c2(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f76674l.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public Parcel m43604d2() {
        switch (this.f76673a) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f76675m);
                return parcelObtain;
            case 2:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f76675m);
                return parcelObtain2;
            case 3:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f76675m);
                return parcelObtain3;
            case 4:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(this.f76675m);
                return parcelObtain4;
            default:
                Parcel parcelObtain5 = Parcel.obtain();
                parcelObtain5.writeInterfaceToken(this.f76675m);
                return parcelObtain5;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public Parcel m43605e2(int i, Parcel parcel) {
        switch (this.f76673a) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    try {
                        this.f76674l.transact(i, parcel, parcelObtain, 0);
                        parcelObtain.readException();
                        parcel.recycle();
                        return parcelObtain;
                    } catch (Throwable th) {
                        parcel.recycle();
                        throw th;
                    }
                } catch (RuntimeException e) {
                    parcelObtain.recycle();
                    throw e;
                }
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        this.f76674l.transact(i, parcel, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcel.recycle();
                        return parcelObtain2;
                    } catch (RuntimeException e2) {
                        parcelObtain2.recycle();
                        throw e2;
                    }
                } catch (Throwable th2) {
                    parcel.recycle();
                    throw th2;
                }
        }
    }

    /* JADX INFO: renamed from: f2 */
    public void m43606f2(int i, Parcel parcel) {
        switch (this.f76673a) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    this.f76674l.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            case 2:
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    this.f76674l.transact(i, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
            case 3:
                Parcel parcelObtain3 = Parcel.obtain();
                try {
                    this.f76674l.transact(i, parcel, parcelObtain3, 0);
                    parcelObtain3.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    /* JADX INFO: renamed from: g2 */
    public void m43607g2(int i, Parcel parcel) {
        try {
            this.f76674l.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public Parcel m43608h2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f76675m);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: i2 */
    public Parcel m43609i2(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f76674l.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m43610v1(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f76674l.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
