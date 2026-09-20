package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class l4t0 extends p4t0 {

    /* JADX INFO: renamed from: a */
    public static final l4t0 f129758a = new l4t0();
    public static final Parcelable.Creator<l4t0> CREATOR = new wds0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
