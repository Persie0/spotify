package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class q0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final q0e f183980b = new q0e("member_details_audio_book_top_up");
    public static final Parcelable.Creator<q0e> CREATOR = new j0e(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
