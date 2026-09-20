package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jn7 extends zq50 {

    /* JADX INFO: renamed from: a */
    public static final jn7 f114035a = new jn7();
    public static final Parcelable.Creator<jn7> CREATOR = new na7(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
