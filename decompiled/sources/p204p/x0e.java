package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class x0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final x0e f256868b = new x0e("post_signup");
    public static final Parcelable.Creator<x0e> CREATOR = new j0e(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
