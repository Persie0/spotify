package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g9s implements Parcelable {
    public static final Parcelable.Creator<g9s> CREATOR = new f9s(0);

    /* JADX INFO: renamed from: a */
    public final long f77867a;

    /* JADX INFO: renamed from: b */
    public final long f77868b;

    public g9s(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        c95.m31843i(j >= 0);
        c95.m31843i(j2 >= 0 || j2 == -1);
        this.f77867a = j;
        this.f77868b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g9s)) {
            return false;
        }
        g9s g9sVar = (g9s) obj;
        return this.f77867a == g9sVar.f77867a && this.f77868b == g9sVar.f77868b;
    }

    public final int hashCode() {
        return (((int) this.f77867a) * 961) + ((int) this.f77868b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f77867a);
        parcel.writeLong(this.f77868b);
    }
}
