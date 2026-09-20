package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class d3d implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final d3d f44851a = new d3d();
    public static final Parcelable.Creator<d3d> CREATOR = new qvc(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
