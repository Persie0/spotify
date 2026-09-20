package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class z4c extends AbstractC2206o9 {
    public static final Parcelable.Creator<z4c> CREATOR = new jja(29);

    /* JADX INFO: renamed from: a */
    public final String f279202a;

    /* JADX INFO: renamed from: b */
    public final int f279203b;

    /* JADX INFO: renamed from: c */
    public final int f279204c;

    public z4c(String str, int i, int i2) {
        this.f279202a = str;
        this.f279203b = i;
        this.f279204c = i2;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4c)) {
            return false;
        }
        z4c z4cVar = (z4c) obj;
        return wj50.m88271j(this.f279202a, z4cVar.f279202a) && this.f279203b == z4cVar.f279203b && this.f279204c == z4cVar.f279204c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f279204c) + mt60.m62800g(this.f279203b, this.f279202a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f279202a);
        parcel.writeInt(this.f279203b);
        parcel.writeInt(this.f279204c);
    }
}
