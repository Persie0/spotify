package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class gp71 implements kp71 {

    /* JADX INFO: renamed from: a */
    public static final gp71 f83100a = new gp71();
    public static final Parcelable.Creator<gp71> CREATOR = new c071(20);

    @Override // p204p.kp71
    /* JADX INFO: renamed from: S0 */
    public final List mo39624S0() {
        return lau.f131415a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gp71);
    }

    public final int hashCode() {
        return 212273770;
    }

    public final String toString() {
        return "Initial";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
