package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class x6d1 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final x6d1 f258644a = new x6d1();
    public static final Parcelable.Creator<x6d1> CREATOR = new vmc1(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
