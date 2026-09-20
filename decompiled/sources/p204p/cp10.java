package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cp10 extends ep10 {
    public static final Parcelable.Creator<cp10> CREATOR = new km10(2);

    /* JADX INFO: renamed from: a */
    public final String f40401a;

    /* JADX INFO: renamed from: b */
    public final String f40402b;

    public cp10(String str, String str2) {
        this.f40401a = str;
        this.f40402b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m33513c() {
        return this.f40401a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp10)) {
            return false;
        }
        cp10 cp10Var = (cp10) obj;
        return wj50.m88271j(this.f40401a, cp10Var.f40401a) && wj50.m88271j(this.f40402b, cp10Var.f40402b);
    }

    /* JADX INFO: renamed from: g */
    public final String m33514g() {
        return this.f40402b;
    }

    public final int hashCode() {
        int iHashCode = this.f40401a.hashCode() * 31;
        String str = this.f40402b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40401a);
        parcel.writeString(this.f40402b);
    }
}
