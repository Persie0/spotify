package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.dc */
/* JADX INFO: loaded from: classes8.dex */
public final class C1773dc extends AbstractC1892gc implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C1773dc f47398a = new C1773dc();
    public static final Parcelable.Creator<C1773dc> CREATOR = new ora(25);

    @Override // p204p.AbstractC1892gc
    /* JADX INFO: renamed from: c */
    public final boolean mo28653c() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
