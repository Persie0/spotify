package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class jui0 extends lui0 {

    /* JADX INFO: renamed from: b */
    public static final jui0 f116116b = new jui0("");
    public static final Parcelable.Creator<jui0> CREATOR = new rri0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
