package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kiy0 implements oiy0 {

    /* JADX INFO: renamed from: a */
    public static final kiy0 f123141a = new kiy0();
    public static final Parcelable.Creator<kiy0> CREATOR = new csx0(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.oiy0
    /* JADX INFO: renamed from: e0 */
    public final String mo41778e0() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
