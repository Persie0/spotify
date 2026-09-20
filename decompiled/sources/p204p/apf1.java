package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class apf1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final AtomicReference f17945l;

    /* JADX INFO: renamed from: m */
    public boolean f17946m;

    public apf1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver", 11);
        this.f17945l = new AtomicReference();
    }

    /* JADX INFO: renamed from: f2 */
    public static final Object m26674f2(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = pkf1.f178455a;
        Parcelable parcelable = parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
        pkf1.m70215c(parcel);
        m26678x1((Bundle) parcelable);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: renamed from: c2 */
    public final String m26675c2(long j) {
        return (String) m26674f2(m26677e2(j), String.class);
    }

    /* JADX INFO: renamed from: d2 */
    public final Long m26676d2() {
        return (Long) m26674f2(m26677e2(500L), Long.class);
    }

    /* JADX INFO: renamed from: e2 */
    public final Bundle m26677e2(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f17945l;
        synchronized (atomicReference) {
            if (!this.f17946m) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f17945l.get();
        }
        return bundle;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m26678x1(Bundle bundle) {
        AtomicReference atomicReference = this.f17945l;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f17946m = true;
                    this.f17945l.notify();
                } catch (Throwable th) {
                    this.f17945l.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
