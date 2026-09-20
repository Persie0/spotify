package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class n0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final n0e f149033b = new n0e("cultural_moments");
    public static final Parcelable.Creator<n0e> CREATOR = new j0e(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
