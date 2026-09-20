package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class fe2 extends he2 {

    /* JADX INFO: renamed from: a */
    public static final fe2 f68657a = new fe2();
    public static final Parcelable.Creator<fe2> CREATOR = new lb2(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
