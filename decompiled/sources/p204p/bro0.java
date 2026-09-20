package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class bro0 extends vro0 {

    /* JADX INFO: renamed from: a */
    public static final bro0 f30124a = new bro0();
    public static final Parcelable.Creator<bro0> CREATOR = new igo0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
