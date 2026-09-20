package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class jt90 implements Parcelable {
    public static final Parcelable.Creator<jt90> CREATOR = new ra90(22);

    /* JADX INFO: renamed from: a */
    public final String f115767a;

    /* JADX INFO: renamed from: b */
    public final boolean f115768b;

    public jt90(String str, boolean z) {
        this.f115767a = str;
        this.f115768b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt90)) {
            return false;
        }
        jt90 jt90Var = (jt90) obj;
        return wj50.m88271j(this.f115767a, jt90Var.f115767a) && this.f115768b == jt90Var.f115768b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115768b) + (this.f115767a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115767a);
        parcel.writeInt(this.f115768b ? 1 : 0);
    }
}
