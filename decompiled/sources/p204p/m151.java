package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class m151 implements p151 {
    public static final Parcelable.Creator<m151> CREATOR = new q051(6);

    /* JADX INFO: renamed from: a */
    public final String f138847a;

    /* JADX INFO: renamed from: b */
    public final int f138848b;

    public m151(String str, int i) {
        this.f138847a = str;
        this.f138848b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m151)) {
            return false;
        }
        m151 m151Var = (m151) obj;
        return wj50.m88271j(this.f138847a, m151Var.f138847a) && this.f138848b == m151Var.f138848b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f138848b) + (this.f138847a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f138847a);
        parcel.writeInt(this.f138848b);
    }
}
