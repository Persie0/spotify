package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class p01 extends z01 {

    /* JADX INFO: renamed from: a */
    public static final p01 f172423a = new p01();
    public static final Parcelable.Creator<p01> CREATOR = new zz0(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
