package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class g1v0 extends j1v0 {

    /* JADX INFO: renamed from: a */
    public static final g1v0 f75757a = new g1v0();
    public static final Parcelable.Creator<g1v0> CREATOR = new v5u0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Disabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
