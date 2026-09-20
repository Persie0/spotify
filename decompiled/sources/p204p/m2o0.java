package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class m2o0 implements n2o0 {

    /* JADX INFO: renamed from: a */
    public static final m2o0 f139435a = new m2o0();
    public static final Parcelable.Creator<m2o0> CREATOR = new ejn0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
