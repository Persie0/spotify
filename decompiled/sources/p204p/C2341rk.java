package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.rk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2341rk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2341rk f199931b = new C2341rk(true);
    public static final Parcelable.Creator<C2341rk> CREATOR = new C2047kc(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2341rk);
    }

    public final int hashCode() {
        return 50134355;
    }

    public final String toString() {
        return "ParentalControls";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
