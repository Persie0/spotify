package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class um40 implements Parcelable {
    public static final Parcelable.Creator<um40> CREATOR = new y240(14);

    /* JADX INFO: renamed from: a */
    public final String f231722a;

    /* JADX INFO: renamed from: b */
    public final String f231723b;

    public um40(String str, String str2) {
        this.f231722a = str;
        this.f231723b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um40)) {
            return false;
        }
        um40 um40Var = (um40) obj;
        return wj50.m88271j(this.f231722a, um40Var.f231722a) && wj50.m88271j(this.f231723b, um40Var.f231723b);
    }

    public final int hashCode() {
        return this.f231723b.hashCode() + (this.f231722a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231722a);
        parcel.writeString(this.f231723b);
    }
}
