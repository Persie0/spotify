package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jl10 implements ml10 {

    /* JADX INFO: renamed from: a */
    public static final jl10 f113460a = new jl10();
    public static final Parcelable.Creator<jl10> CREATOR = new qz00(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
