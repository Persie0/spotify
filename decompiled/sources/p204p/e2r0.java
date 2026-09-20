package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class e2r0 extends h2r0 {

    /* JADX INFO: renamed from: a */
    public static final e2r0 f55505a = new e2r0();
    public static final Parcelable.Creator<e2r0> CREATOR = new vzq0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
