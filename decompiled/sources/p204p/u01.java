package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class u01 extends z01 {
    public static final Parcelable.Creator<u01> CREATOR = new zz0(19);

    /* JADX INFO: renamed from: a */
    public final String f225343a;

    public u01(String str) {
        this.f225343a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u01) && wj50.m88271j(this.f225343a, ((u01) obj).f225343a);
    }

    public final int hashCode() {
        return this.f225343a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f225343a);
    }
}
