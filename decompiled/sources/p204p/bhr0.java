package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class bhr0 extends dhr0 {

    /* JADX INFO: renamed from: a */
    public static final bhr0 f27231a = new bhr0();
    public static final Parcelable.Creator<bhr0> CREATOR = new vzq0(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
