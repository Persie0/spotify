package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final o0e f160366b = new o0e("downgrade_family_plan");
    public static final Parcelable.Creator<o0e> CREATOR = new j0e(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
