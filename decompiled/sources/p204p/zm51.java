package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zm51 implements gn51 {
    public static final Parcelable.Creator<zm51> CREATOR = new nc51(14);

    /* JADX INFO: renamed from: a */
    public final String f284162a;

    /* JADX INFO: renamed from: b */
    public final String f284163b;

    /* JADX INFO: renamed from: c */
    public final xm51 f284164c;

    public zm51(String str, String str2, xm51 xm51Var) {
        this.f284162a = str;
        this.f284163b = str2;
        this.f284164c = xm51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm51)) {
            return false;
        }
        zm51 zm51Var = (zm51) obj;
        return wj50.m88271j(this.f284162a, zm51Var.f284162a) && wj50.m88271j(this.f284163b, zm51Var.f284163b) && wj50.m88271j(this.f284164c, zm51Var.f284164c);
    }

    public final int hashCode() {
        int iHashCode = this.f284162a.hashCode() * 31;
        String str = this.f284163b;
        return this.f284164c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f284162a);
        parcel.writeString(this.f284163b);
        this.f284164c.writeToParcel(parcel, i);
    }
}
