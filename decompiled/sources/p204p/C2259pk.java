package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.pk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2259pk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2259pk f178330b = new C2259pk(false);
    public static final Parcelable.Creator<C2259pk> CREATOR = new C2047kc(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2259pk);
    }

    public final int hashCode() {
        return 1366720384;
    }

    public final String toString() {
        return "Education";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
