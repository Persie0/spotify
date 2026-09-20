package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class v0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final v0e f235976b = new v0e("parental_consent_card_verification");
    public static final Parcelable.Creator<v0e> CREATOR = new j0e(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
