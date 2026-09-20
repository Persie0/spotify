package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class f2d extends i2d {

    /* JADX INFO: renamed from: a */
    public static final f2d f65151a = new f2d();
    public static final Parcelable.Creator<f2d> CREATOR = new qvc(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f2d);
    }

    public final int hashCode() {
        return 40240583;
    }

    public final String toString() {
        return "ChatDeleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
