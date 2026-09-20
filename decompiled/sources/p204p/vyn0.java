package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vyn0 implements wyn0 {
    public static final Parcelable.Creator<vyn0> CREATOR = new ejn0(22);

    /* JADX INFO: renamed from: a */
    public final String f246294a;

    /* JADX INFO: renamed from: b */
    public final long f246295b;

    public vyn0(String str, long j) {
        this.f246294a = str;
        this.f246295b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyn0)) {
            return false;
        }
        vyn0 vyn0Var = (vyn0) obj;
        return wj50.m88271j(this.f246294a, vyn0Var.f246294a) && this.f246295b == vyn0Var.f246295b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f246295b) + (this.f246294a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f246294a);
        parcel.writeLong(this.f246295b);
    }
}
