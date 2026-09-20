package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class q661 implements t661, osv0 {

    /* JADX INFO: renamed from: a */
    public static final q661 f185694a = new q661();
    public static final Parcelable.Creator<q661> CREATOR = new e361(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
