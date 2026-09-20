package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class nu71 implements pu71 {
    public static final Parcelable.Creator<nu71> CREATOR = new sr71(3);

    /* JADX INFO: renamed from: a */
    public final long f158526a;

    public /* synthetic */ nu71(long j) {
        this.f158526a = j;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m65679c(long j, long j2) {
        return j == j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nu71) {
            return this.f158526a == ((nu71) obj).f158526a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f158526a);
    }

    public final String toString() {
        return edb.m38562k(this.f158526a, "User(ms=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f158526a);
    }
}
