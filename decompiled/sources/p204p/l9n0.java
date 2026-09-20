package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class l9n0 extends v9n0 {

    /* JADX INFO: renamed from: b */
    public static final l9n0 f131153b = new l9n0(null);
    public static final Parcelable.Creator<l9n0> CREATOR = new pum0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
