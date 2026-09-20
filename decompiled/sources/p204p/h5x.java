package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class h5x implements n4y {
    public static final Parcelable.Creator<h5x> CREATOR = new wfw(9);

    /* JADX INFO: renamed from: a */
    public final long f87920a;

    /* JADX INFO: renamed from: b */
    public final String f87921b;

    /* JADX INFO: renamed from: c */
    public final String f87922c;

    public h5x(long j, String str, String str2) {
        this.f87920a = j;
        this.f87921b = str;
        this.f87922c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5x)) {
            return false;
        }
        h5x h5xVar = (h5x) obj;
        return this.f87920a == h5xVar.f87920a && wj50.m88271j(this.f87921b, h5xVar.f87921b) && wj50.m88271j(this.f87922c, h5xVar.f87922c);
    }

    public final int hashCode() {
        return this.f87922c.hashCode() + s571.m77243b(Long.hashCode(this.f87920a) * 31, 31, this.f87921b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f87920a);
        parcel.writeString(this.f87921b);
        parcel.writeString(this.f87922c);
    }
}
