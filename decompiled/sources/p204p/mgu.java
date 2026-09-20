package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class mgu extends AbstractC2202o5 {
    public static final Parcelable.ClassLoaderCreator<mgu> CREATOR = new fb31(7);

    /* JADX INFO: renamed from: c */
    public boolean f143634c;

    public mgu(x2d0 x2d0Var) {
        super(x2d0Var);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61731g() {
        return this.f143634c;
    }

    /* JADX INFO: renamed from: h */
    public final void m61732h(boolean z) {
        this.f143634c = z;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161807a, i);
        parcel.writeInt(this.f143634c ? 1 : 0);
    }

    public mgu(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f143634c = parcel.readInt() == 1;
    }
}
