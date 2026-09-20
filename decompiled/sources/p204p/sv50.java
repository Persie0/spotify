package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sv50 implements Parcelable {
    public static final Parcelable.Creator<sv50> CREATOR = new pq50(3);

    /* JADX INFO: renamed from: a */
    public final hk80 f214335a;

    /* JADX INFO: renamed from: b */
    public final String f214336b;

    public sv50(hk80 hk80Var, String str) {
        this.f214335a = hk80Var;
        this.f214336b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv50)) {
            return false;
        }
        sv50 sv50Var = (sv50) obj;
        return wj50.m88271j(this.f214335a, sv50Var.f214335a) && wj50.m88271j(this.f214336b, sv50Var.f214336b);
    }

    public final int hashCode() {
        return this.f214336b.hashCode() + (this.f214335a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f214335a.writeToParcel(parcel, i);
        parcel.writeString(this.f214336b);
    }
}
