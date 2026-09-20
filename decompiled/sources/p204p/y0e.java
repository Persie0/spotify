package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class y0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final y0e f267970b = new y0e("ppt_offer");
    public static final Parcelable.Creator<y0e> CREATOR = new j0e(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
