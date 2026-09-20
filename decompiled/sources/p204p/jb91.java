package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jb91 extends nb91 {

    /* JADX INFO: renamed from: a */
    public static final jb91 f110716a = new jb91();
    public static final Parcelable.Creator<jb91> CREATOR = new f891(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
