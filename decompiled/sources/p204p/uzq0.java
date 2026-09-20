package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class uzq0 extends zzq0 {

    /* JADX INFO: renamed from: a */
    public static final uzq0 f235620a = new uzq0();
    public static final Parcelable.Creator<uzq0> CREATOR = new vnp0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
