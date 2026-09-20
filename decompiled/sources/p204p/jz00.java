package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class jz00 extends kz00 {

    /* JADX INFO: renamed from: a */
    public static final jz00 f117531a = new jz00();
    public static final Parcelable.Creator<jz00> CREATOR = new k700(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
