package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ej80 implements fj80 {

    /* JADX INFO: renamed from: a */
    public static final ej80 f60159a = new ej80();
    public static final Parcelable.Creator<ej80> CREATOR = new i980(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
