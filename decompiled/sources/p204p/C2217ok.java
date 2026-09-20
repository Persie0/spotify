package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ok */
/* JADX INFO: loaded from: classes7.dex */
public final class C2217ok extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2217ok f166194b = new C2217ok(false);
    public static final Parcelable.Creator<C2217ok> CREATOR = new C2047kc(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2217ok);
    }

    public final int hashCode() {
        return 547881549;
    }

    public final String toString() {
        return "Coppa";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
