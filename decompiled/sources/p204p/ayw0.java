package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ayw0 extends byw0 {

    /* JADX INFO: renamed from: a */
    public static final ayw0 f21369a = new ayw0();
    public static final Parcelable.Creator<ayw0> CREATOR = new xxw0(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
