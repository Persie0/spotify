package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class h9a0 implements caa0 {

    /* JADX INFO: renamed from: a */
    public static final h9a0 f88906a = new h9a0();
    public static final Parcelable.Creator<h9a0> CREATOR = new z8a0(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
