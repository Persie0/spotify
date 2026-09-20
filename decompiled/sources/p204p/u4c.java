package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class u4c extends AbstractC2206o9 {
    public static final Parcelable.Creator<u4c> CREATOR = new jja(24);

    /* JADX INFO: renamed from: a */
    public final int f226644a;

    public u4c(int i) {
        this.f226644a = i;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4c) && this.f226644a == ((u4c) obj).f226644a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f226644a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(AbstractC0000a.m25x(this.f226644a));
    }
}
