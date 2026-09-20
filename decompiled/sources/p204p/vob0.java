package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vob0 implements yob0 {

    /* JADX INFO: renamed from: a */
    public static final vob0 f243447a = new vob0();
    public static final Parcelable.Creator<vob0> CREATOR = new rib0(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
