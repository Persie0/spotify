package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class fnc1 implements jnc1 {

    /* JADX INFO: renamed from: a */
    public static final fnc1 f71263a = new fnc1();
    public static final Parcelable.Creator<fnc1> CREATOR = new vmc1(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
