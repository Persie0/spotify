package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class d7w0 implements h7w0 {

    /* JADX INFO: renamed from: a */
    public static final d7w0 f46282a = new d7w0();
    public static final Parcelable.Creator<d7w0> CREATOR = new h1v0(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
