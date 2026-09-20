package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class h990 implements Parcelable {
    public static final Parcelable.Creator<h990> CREATOR = new x390(10);

    /* JADX INFO: renamed from: a */
    public final String f88901a;

    /* JADX INFO: renamed from: b */
    public final String f88902b;

    /* JADX INFO: renamed from: c */
    public final boolean f88903c;

    /* JADX INFO: renamed from: d */
    public final Long f88904d;

    public h990(Long l, String str, String str2, boolean z) {
        this.f88901a = str;
        this.f88902b = str2;
        this.f88903c = z;
        this.f88904d = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h990)) {
            return false;
        }
        h990 h990Var = (h990) obj;
        return wj50.m88271j(this.f88901a, h990Var.f88901a) && wj50.m88271j(this.f88902b, h990Var.f88902b) && this.f88903c == h990Var.f88903c && wj50.m88271j(this.f88904d, h990Var.f88904d);
    }

    public final int hashCode() {
        int iHashCode = this.f88901a.hashCode() * 31;
        String str = this.f88902b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f88903c);
        Long l = this.f88904d;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f88901a);
        parcel.writeString(this.f88902b);
        parcel.writeInt(this.f88903c ? 1 : 0);
        Long l = this.f88904d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
