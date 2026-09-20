package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.wk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2538wk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2538wk f252074b = new C2538wk(true);
    public static final Parcelable.Creator<C2538wk> CREATOR = new C2047kc(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2538wk);
    }

    public final int hashCode() {
        return 1310684225;
    }

    public final String toString() {
        return "UserInfo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
