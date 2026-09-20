package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class gs61 implements Parcelable {
    public static final Parcelable.Creator<gs61> CREATOR = new e361(29);

    /* JADX INFO: renamed from: a */
    public final String f83886a;

    /* JADX INFO: renamed from: b */
    public final String f83887b;

    public gs61(String str, String str2) {
        this.f83886a = str;
        this.f83887b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs61)) {
            return false;
        }
        gs61 gs61Var = (gs61) obj;
        return wj50.m88271j(this.f83886a, gs61Var.f83886a) && wj50.m88271j(this.f83887b, gs61Var.f83887b);
    }

    public final int hashCode() {
        return this.f83887b.hashCode() + (this.f83886a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f83886a);
        parcel.writeString(this.f83887b);
    }
}
