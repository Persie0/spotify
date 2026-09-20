package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kl50 extends b221 {

    /* JADX INFO: renamed from: a */
    public static final kl50 f123802a = new kl50();
    public static final Parcelable.Creator<kl50> CREATOR = new gd50(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.b221
    public final String getUri() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
