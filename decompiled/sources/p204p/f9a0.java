package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class f9a0 implements caa0 {

    /* JADX INFO: renamed from: a */
    public static final f9a0 f67209a = new f9a0();
    public static final Parcelable.Creator<f9a0> CREATOR = new z8a0(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
