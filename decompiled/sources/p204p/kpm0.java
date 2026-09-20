package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kpm0 extends mpm0 {

    /* JADX INFO: renamed from: a */
    public static final kpm0 f125090a = new kpm0();
    public static final Parcelable.Creator<kpm0> CREATOR = new cpl0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
