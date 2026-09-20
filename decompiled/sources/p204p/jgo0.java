package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class jgo0 extends mgo0 {

    /* JADX INFO: renamed from: a */
    public static final jgo0 f112231a = new jgo0();
    public static final Parcelable.Creator<jgo0> CREATOR = new igo0(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
