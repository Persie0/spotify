package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.tk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2418tk extends AbstractC2616yk {

    /* JADX INFO: renamed from: b */
    public static final C2418tk f221040b = new C2418tk(false);
    public static final Parcelable.Creator<C2418tk> CREATOR = new C2047kc(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2418tk);
    }

    public final int hashCode() {
        return 267646784;
    }

    public final String toString() {
        return "Submit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
