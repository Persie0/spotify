package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class j2o0 implements r2o0 {

    /* JADX INFO: renamed from: a */
    public static final j2o0 f108114a = new j2o0();
    public static final Parcelable.Creator<j2o0> CREATOR = new ejn0(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
