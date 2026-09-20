package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class m9e implements dae {

    /* JADX INFO: renamed from: a */
    public static final m9e f141284a = new m9e();
    public static final Parcelable.Creator<m9e> CREATOR = new n6e(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
