package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class jt80 implements nt80 {
    public static final Parcelable.Creator<jt80> CREATOR = new ct80(6);

    /* JADX INFO: renamed from: a */
    public final String f115762a;

    public jt80(String str) {
        this.f115762a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt80) && wj50.m88271j(this.f115762a, ((jt80) obj).f115762a);
    }

    public final int hashCode() {
        return this.f115762a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115762a);
    }
}
