package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class a9a0 implements baa0 {
    public static final Parcelable.Creator<a9a0> CREATOR = new z8a0(1);

    /* JADX INFO: renamed from: a */
    public final String f13525a;

    public a9a0(String str) {
        this.f13525a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9a0) && wj50.m88271j(this.f13525a, ((a9a0) obj).f13525a);
    }

    public final int hashCode() {
        return this.f13525a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13525a);
    }
}
