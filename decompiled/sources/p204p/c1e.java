package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c1e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final c1e f33059b = new c1e("unknown");
    public static final Parcelable.Creator<c1e> CREATOR = new j0e(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
