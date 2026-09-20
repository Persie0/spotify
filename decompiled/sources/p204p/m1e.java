package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class m1e implements p1e {

    /* JADX INFO: renamed from: a */
    public static final m1e f138948a = new m1e();
    public static final Parcelable.Creator<m1e> CREATOR = new j0e(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
