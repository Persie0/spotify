package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.nk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2167nk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2167nk f154711b = new C2167nk(true);
    public static final Parcelable.Creator<C2167nk> CREATOR = new C2047kc(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2167nk);
    }

    public final int hashCode() {
        return -410914158;
    }

    public final String toString() {
        return "AgeVerification";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
