package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class l0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final l0e f128395b = new l0e("churn_lock_state");
    public static final Parcelable.Creator<l0e> CREATOR = new j0e(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
