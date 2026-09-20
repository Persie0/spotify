package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class u0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final u0e f225466b = new u0e("pam.unknown");
    public static final Parcelable.Creator<u0e> CREATOR = new j0e(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
