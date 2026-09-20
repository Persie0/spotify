package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class d1e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final d1e f44241b = new d1e("upsell_sheet");
    public static final Parcelable.Creator<d1e> CREATOR = new j0e(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
