package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class a0z0 extends l0z0 {

    /* JADX INFO: renamed from: a */
    public static final a0z0 f11217a = new a0z0();
    public static final Parcelable.Creator<a0z0> CREATOR = new lpy0(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
