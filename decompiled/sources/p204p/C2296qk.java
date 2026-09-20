package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.qk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2296qk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2296qk f189394b = new C2296qk(true);
    public static final Parcelable.Creator<C2296qk> CREATOR = new C2047kc(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2296qk);
    }

    public final int hashCode() {
        return 555886225;
    }

    public final String toString() {
        return "Legal";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
