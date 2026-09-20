package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class m01 extends n01 {

    /* JADX INFO: renamed from: a */
    public static final m01 f138483a = new m01();
    public static final Parcelable.Creator<m01> CREATOR = new zz0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
