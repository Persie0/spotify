package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class gm10 implements hm10 {

    /* JADX INFO: renamed from: a */
    public static final gm10 f81252a = new gm10();
    public static final Parcelable.Creator<gm10> CREATOR = new qz00(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
