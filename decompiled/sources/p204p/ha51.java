package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ha51 implements la51 {

    /* JADX INFO: renamed from: a */
    public static final ha51 f89127a = new ha51();
    public static final Parcelable.Creator<ha51> CREATOR = new q051(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
