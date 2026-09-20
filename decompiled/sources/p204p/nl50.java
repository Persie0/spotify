package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class nl50 extends ql50 {

    /* JADX INFO: renamed from: a */
    public static final nl50 f155007a = new nl50();
    public static final Parcelable.Creator<nl50> CREATOR = new gd50(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
