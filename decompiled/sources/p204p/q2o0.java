package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class q2o0 implements r2o0 {

    /* JADX INFO: renamed from: a */
    public static final q2o0 f184662a = new q2o0();
    public static final Parcelable.Creator<q2o0> CREATOR = new o2o0(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
