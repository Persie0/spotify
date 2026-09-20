package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class o4z0 extends v4z0 {
    public static final n4z0 Companion = new n4z0();
    public static final Parcelable.Creator<o4z0> CREATOR = new lpy0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
