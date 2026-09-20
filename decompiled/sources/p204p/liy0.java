package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class liy0 implements oiy0 {

    /* JADX INFO: renamed from: a */
    public static final liy0 f133908a = new liy0();
    public static final Parcelable.Creator<liy0> CREATOR = new csx0(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.oiy0
    /* JADX INFO: renamed from: e0 */
    public final String mo41778e0() {
        return "NotificationOptIn";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
