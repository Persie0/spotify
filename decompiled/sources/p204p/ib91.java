package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ib91 extends nb91 {

    /* JADX INFO: renamed from: a */
    public static final ib91 f100492a = new ib91();
    public static final Parcelable.Creator<ib91> CREATOR = new f891(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
