package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class nee1 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final nee1 f152980a = new nee1();
    public static final Parcelable.Creator<nee1> CREATOR = new xed1(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
