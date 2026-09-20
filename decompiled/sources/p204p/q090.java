package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class q090 implements t090 {

    /* JADX INFO: renamed from: a */
    public static final q090 f183930a = new q090();
    public static final Parcelable.Creator<q090> CREATOR = new ct80(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
