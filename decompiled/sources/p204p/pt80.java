package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class pt80 implements rt80 {

    /* JADX INFO: renamed from: a */
    public static final pt80 f181071a = new pt80();
    public static final Parcelable.Creator<pt80> CREATOR = new ct80(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
