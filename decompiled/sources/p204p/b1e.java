package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class b1e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final b1e f22300b = new b1e("the_stage");
    public static final Parcelable.Creator<b1e> CREATOR = new j0e(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
