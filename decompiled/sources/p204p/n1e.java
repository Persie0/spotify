package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class n1e implements p1e {

    /* JADX INFO: renamed from: a */
    public static final n1e f149400a = new n1e();
    public static final Parcelable.Creator<n1e> CREATOR = new j0e(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
