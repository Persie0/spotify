package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class e0z0 extends j0z0 {

    /* JADX INFO: renamed from: a */
    public static final e0z0 f55071a = new e0z0();
    public static final Parcelable.Creator<e0z0> CREATOR = new lpy0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
