package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class nk80 implements Parcelable {
    public static final Parcelable.Creator<nk80> CREATOR = new i980(14);

    /* JADX INFO: renamed from: a */
    public final String f154826a;

    /* JADX INFO: renamed from: b */
    public final String f154827b;

    /* JADX INFO: renamed from: c */
    public final String f154828c;

    public nk80(String str, String str2, String str3) {
        this.f154826a = str;
        this.f154827b = str2;
        this.f154828c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m64655c() {
        return this.f154827b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk80)) {
            return false;
        }
        nk80 nk80Var = (nk80) obj;
        return wj50.m88271j(this.f154826a, nk80Var.f154826a) && wj50.m88271j(this.f154827b, nk80Var.f154827b) && wj50.m88271j(this.f154828c, nk80Var.f154828c);
    }

    /* JADX INFO: renamed from: g */
    public final String m64656g() {
        return this.f154826a;
    }

    /* JADX INFO: renamed from: h */
    public final String m64657h() {
        return this.f154828c;
    }

    public final int hashCode() {
        int iHashCode = this.f154826a.hashCode() * 31;
        String str = this.f154827b;
        return this.f154828c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f154826a);
        parcel.writeString(this.f154827b);
        parcel.writeString(this.f154828c);
    }
}
