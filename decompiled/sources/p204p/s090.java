package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class s090 implements t090 {

    /* JADX INFO: renamed from: a */
    public static final s090 f204322a = new s090();
    public static final Parcelable.Creator<s090> CREATOR = new ct80(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
