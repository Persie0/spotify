package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ss80 implements nt80 {

    /* JADX INFO: renamed from: a */
    public static final ss80 f213529a = new ss80();
    public static final Parcelable.Creator<ss80> CREATOR = new i980(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
