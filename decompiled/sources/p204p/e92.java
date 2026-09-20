package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class e92 implements g92 {

    /* JADX INFO: renamed from: a */
    public static final e92 f57331a = new e92();
    public static final Parcelable.Creator<e92> CREATOR = new zt1(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
