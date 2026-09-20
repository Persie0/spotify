package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class zmc1 implements jnc1 {

    /* JADX INFO: renamed from: a */
    public static final zmc1 f284218a = new zmc1();
    public static final Parcelable.Creator<zmc1> CREATOR = new vmc1(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
