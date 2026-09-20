package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a490 extends i490 {

    /* JADX INFO: renamed from: a */
    public static final a490 f12157a = new a490();
    public static final Parcelable.Creator<a490> CREATOR = new x390(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
