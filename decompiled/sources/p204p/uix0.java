package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class uix0 implements Parcelable {
    public static final Parcelable.Creator<uix0> CREATOR = new xxw0(17);

    /* JADX INFO: renamed from: a */
    public final String f230829a;

    /* JADX INFO: renamed from: b */
    public final boolean f230830b;

    public uix0(String str, boolean z) {
        this.f230829a = str;
        this.f230830b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uix0)) {
            return false;
        }
        uix0 uix0Var = (uix0) obj;
        return wj50.m88271j(this.f230829a, uix0Var.f230829a) && this.f230830b == uix0Var.f230830b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230830b) + (this.f230829a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f230829a);
        parcel.writeInt(this.f230830b ? 1 : 0);
    }
}
