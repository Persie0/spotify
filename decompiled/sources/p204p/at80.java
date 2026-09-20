package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class at80 implements nt80 {

    /* JADX INFO: renamed from: a */
    public static final at80 f19613a = new at80();
    public static final Parcelable.Creator<at80> CREATOR = new i980(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
