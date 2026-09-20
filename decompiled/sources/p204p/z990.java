package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class z990 implements Parcelable {
    public static final Parcelable.Creator<z990> CREATOR = new x390(20);

    /* JADX INFO: renamed from: a */
    public final String f280723a;

    /* JADX INFO: renamed from: b */
    public final h990 f280724b;

    public z990(String str, h990 h990Var) {
        this.f280723a = str;
        this.f280724b = h990Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z990)) {
            return false;
        }
        z990 z990Var = (z990) obj;
        return wj50.m88271j(this.f280723a, z990Var.f280723a) && wj50.m88271j(this.f280724b, z990Var.f280724b);
    }

    public final int hashCode() {
        int iHashCode = this.f280723a.hashCode() * 31;
        h990 h990Var = this.f280724b;
        return iHashCode + (h990Var == null ? 0 : h990Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f280723a);
        h990 h990Var = this.f280724b;
        if (h990Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            h990Var.writeToParcel(parcel, i);
        }
    }
}
