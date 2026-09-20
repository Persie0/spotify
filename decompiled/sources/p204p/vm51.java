package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class vm51 implements hn51 {
    public static final Parcelable.Creator<vm51> CREATOR = new nc51(11);

    /* JADX INFO: renamed from: a */
    public final String f242708a;

    /* JADX INFO: renamed from: b */
    public final int f242709b;

    public vm51(String str, int i) {
        this.f242708a = str;
        this.f242709b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm51)) {
            return false;
        }
        vm51 vm51Var = (vm51) obj;
        return wj50.m88271j(this.f242708a, vm51Var.f242708a) && this.f242709b == vm51Var.f242709b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f242709b) + (this.f242708a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242708a);
        parcel.writeInt(this.f242709b);
    }
}
