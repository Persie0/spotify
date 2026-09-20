package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class enc1 implements jnc1 {

    /* JADX INFO: renamed from: a */
    public static final enc1 f61140a = new enc1();
    public static final Parcelable.Creator<enc1> CREATOR = new vmc1(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
