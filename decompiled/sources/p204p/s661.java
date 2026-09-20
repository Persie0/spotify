package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class s661 implements t661, fpp {

    /* JADX INFO: renamed from: a */
    public static final s661 f206015a = new s661();
    public static final Parcelable.Creator<s661> CREATOR = new e361(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
