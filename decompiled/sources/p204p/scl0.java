package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class scl0 implements wcl0 {
    public static final Parcelable.Creator<scl0> CREATOR = new hbl0(16);

    /* JADX INFO: renamed from: a */
    public final String f207765a;

    public scl0(String str) {
        this.f207765a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scl0) && wj50.m88271j(this.f207765a, ((scl0) obj).f207765a);
    }

    public final int hashCode() {
        return this.f207765a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f207765a);
    }
}
