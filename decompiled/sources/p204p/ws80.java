package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ws80 implements nt80 {

    /* JADX INFO: renamed from: a */
    public static final ws80 f254555a = new ws80();
    public static final Parcelable.Creator<ws80> CREATOR = new i980(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
