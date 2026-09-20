package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class i11 implements j11 {

    /* JADX INFO: renamed from: a */
    public static final i11 f97349a = new i11();
    public static final Parcelable.Creator<i11> CREATOR = new g11(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
