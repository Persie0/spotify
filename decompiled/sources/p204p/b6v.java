package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class b6v implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final b6v f24051a = new b6v();
    public static final Parcelable.Creator<b6v> CREATOR = new rvu(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
