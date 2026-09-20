package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class z1u extends b2u {
    public static final Parcelable.Creator<z1u> CREATOR = new qct(12);

    /* JADX INFO: renamed from: a */
    public final String f278417a;

    /* JADX INFO: renamed from: b */
    public final String f278418b;

    public z1u(String str, String str2) {
        this.f278417a = str;
        this.f278418b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1u)) {
            return false;
        }
        z1u z1uVar = (z1u) obj;
        return wj50.m88271j(this.f278417a, z1uVar.f278417a) && wj50.m88271j(this.f278418b, z1uVar.f278418b);
    }

    public final int hashCode() {
        int iHashCode = this.f278417a.hashCode() * 31;
        String str = this.f278418b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f278417a);
        parcel.writeString(this.f278418b);
    }
}
