package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class fgo0 extends mgo0 {

    /* JADX INFO: renamed from: a */
    public static final fgo0 f69377a = new fgo0();
    public static final Parcelable.Creator<fgo0> CREATOR = new o2o0(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
