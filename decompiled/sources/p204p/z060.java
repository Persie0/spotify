package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class z060 implements Parcelable {
    public static final Parcelable.Creator<z060> CREATOR = new pq50(15);

    /* JADX INFO: renamed from: a */
    public final String f278002a;

    /* JADX INFO: renamed from: b */
    public final String f278003b;

    public z060(String str, String str2) {
        this.f278002a = str;
        this.f278003b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z060)) {
            return false;
        }
        z060 z060Var = (z060) obj;
        return wj50.m88271j(this.f278002a, z060Var.f278002a) && wj50.m88271j(this.f278003b, z060Var.f278003b);
    }

    public final int hashCode() {
        return this.f278003b.hashCode() + (this.f278002a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f278002a);
        parcel.writeString(this.f278003b);
    }
}
