package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jm10 extends mm10 {

    /* JADX INFO: renamed from: a */
    public static final jm10 f113730a = new jm10();
    public static final Parcelable.Creator<jm10> CREATOR = new qz00(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
