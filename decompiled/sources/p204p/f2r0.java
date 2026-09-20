package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class f2r0 extends h2r0 {

    /* JADX INFO: renamed from: a */
    public static final f2r0 f65259a = new f2r0();
    public static final Parcelable.Creator<f2r0> CREATOR = new vzq0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
