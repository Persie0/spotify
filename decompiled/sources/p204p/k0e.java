package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class k0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final k0e f117991b = new k0e("audio_book_top_up");
    public static final Parcelable.Creator<k0e> CREATOR = new j0e(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
