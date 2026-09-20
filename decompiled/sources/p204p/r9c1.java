package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class r9c1 implements u9c1 {
    public static final Parcelable.Creator<r9c1> CREATOR = new c8b1(20);

    /* JADX INFO: renamed from: a */
    public final String f197019a;

    public r9c1(String str) {
        this.f197019a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9c1) && wj50.m88271j(this.f197019a, ((r9c1) obj).f197019a);
    }

    public final int hashCode() {
        return this.f197019a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f197019a);
    }
}
