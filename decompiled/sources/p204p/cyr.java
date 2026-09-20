package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cyr implements zz41, Parcelable {

    /* JADX INFO: renamed from: a */
    public static final cyr f43342a = new cyr();
    public static final Parcelable.Creator<cyr> CREATOR = new o5r(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.zz41
    public final String getId() {
        return "divider";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
