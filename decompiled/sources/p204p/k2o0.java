package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class k2o0 implements n2o0 {

    /* JADX INFO: renamed from: a */
    public static final k2o0 f118674a = new k2o0();
    public static final Parcelable.Creator<k2o0> CREATOR = new ejn0(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
