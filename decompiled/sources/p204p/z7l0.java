package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class z7l0 implements Parcelable {
    public static final Parcelable.Creator<z7l0> CREATOR = new oxk0(28);

    /* JADX INFO: renamed from: a */
    public final String f280252a;

    /* JADX INFO: renamed from: b */
    public final String f280253b;

    public z7l0(String str, String str2) {
        this.f280252a = str;
        this.f280253b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7l0)) {
            return false;
        }
        z7l0 z7l0Var = (z7l0) obj;
        return wj50.m88271j(this.f280252a, z7l0Var.f280252a) && wj50.m88271j(this.f280253b, z7l0Var.f280253b);
    }

    public final int hashCode() {
        return this.f280253b.hashCode() + (this.f280252a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f280252a);
        parcel.writeString(this.f280253b);
    }
}
