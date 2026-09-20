package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.hc */
/* JADX INFO: loaded from: classes8.dex */
public final class C1932hc extends AbstractC2010jc implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C1932hc f89644a = new C1932hc();
    public static final Parcelable.Creator<C1932hc> CREATOR = new ora(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1932hc);
    }

    public final int hashCode() {
        return 1180757374;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
