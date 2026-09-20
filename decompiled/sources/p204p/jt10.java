package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jt10 extends lt10 {

    /* JADX INFO: renamed from: a */
    public static final jt10 f115685a = new jt10();
    public static final Parcelable.Creator<jt10> CREATOR = new km10(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
