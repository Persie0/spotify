package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.xk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2575xk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2575xk f262251b = new C2575xk(false);
    public static final Parcelable.Creator<C2575xk> CREATOR = new C2047kc(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2575xk);
    }

    public final int hashCode() {
        return -1486960326;
    }

    public final String toString() {
        return "Welcome";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
