package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class j01 extends z01 {

    /* JADX INFO: renamed from: a */
    public static final j01 f107324a = new j01();
    public static final Parcelable.Creator<j01> CREATOR = new zz0(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
