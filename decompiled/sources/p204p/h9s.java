package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h9s implements Parcelable {
    public static final Parcelable.Creator<h9s> CREATOR = new f9s(1);

    /* JADX INFO: renamed from: a */
    public final long f89028a;

    /* JADX INFO: renamed from: b */
    public final long f89029b;

    public h9s(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        c95.m31843i(j2 >= 0 || j2 == -9223372036854775807L);
        this.f89028a = j;
        this.f89029b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h9s)) {
            return false;
        }
        h9s h9sVar = (h9s) obj;
        return this.f89028a == h9sVar.f89028a && this.f89029b == h9sVar.f89029b;
    }

    public final int hashCode() {
        return (((int) this.f89028a) * 961) + ((int) this.f89029b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f89028a);
        parcel.writeLong(this.f89029b);
    }
}
