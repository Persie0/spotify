package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class k3a0 implements u3a0 {
    public static final Parcelable.Creator<k3a0> CREATOR = new ra90(24);

    /* JADX INFO: renamed from: a */
    public final String f118819a;

    public k3a0(String str) {
        this.f118819a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3a0) && wj50.m88271j(this.f118819a, ((k3a0) obj).f118819a);
    }

    public final int hashCode() {
        String str = this.f118819a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118819a);
    }
}
