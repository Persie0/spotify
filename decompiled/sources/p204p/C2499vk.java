package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.vk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2499vk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2499vk f242097b = new C2499vk(false);
    public static final Parcelable.Creator<C2499vk> CREATOR = new C2047kc(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2499vk);
    }

    public final int hashCode() {
        return -2134676747;
    }

    public final String toString() {
        return "TransitionSubmit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
