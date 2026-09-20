package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class gt80 implements nt80 {

    /* JADX INFO: renamed from: a */
    public static final gt80 f84105a = new gt80();
    public static final Parcelable.Creator<gt80> CREATOR = new ct80(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
