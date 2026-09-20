package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class l661 implements t661, osv0, zyu0 {

    /* JADX INFO: renamed from: a */
    public static final l661 f130240a = new l661();
    public static final Parcelable.Creator<l661> CREATOR = new e361(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
