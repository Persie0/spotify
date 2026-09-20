package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class t0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final t0e f215853b = new t0e("pam.cancel");
    public static final Parcelable.Creator<t0e> CREATOR = new j0e(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
