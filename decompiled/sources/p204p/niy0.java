package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class niy0 implements oiy0 {

    /* JADX INFO: renamed from: a */
    public static final niy0 f154382a = new niy0();
    public static final Parcelable.Creator<niy0> CREATOR = new csx0(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.oiy0
    /* JADX INFO: renamed from: e0 */
    public final String mo41778e0() {
        return "Unavailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
