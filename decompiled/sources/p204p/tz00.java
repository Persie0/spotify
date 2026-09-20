package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tz00 extends wz00 {

    /* JADX INFO: renamed from: a */
    public static final tz00 f225079a = new tz00();
    public static final Parcelable.Creator<tz00> CREATOR = new qz00(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
