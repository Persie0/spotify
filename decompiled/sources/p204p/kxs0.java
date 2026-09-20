package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kxs0 extends mxs0 {
    public static final Parcelable.Creator<kxs0> CREATOR = new wds0(19);

    /* JADX INFO: renamed from: a */
    public final String f127585a;

    /* JADX INFO: renamed from: b */
    public final String f127586b;

    public kxs0(String str, String str2) {
        this.f127585a = str;
        this.f127586b = str2;
    }

    @Override // p204p.mxs0
    /* JADX INFO: renamed from: c */
    public final String mo49039c() {
        return this.f127585a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxs0)) {
            return false;
        }
        kxs0 kxs0Var = (kxs0) obj;
        return wj50.m88271j(this.f127585a, kxs0Var.f127585a) && wj50.m88271j(this.f127586b, kxs0Var.f127586b);
    }

    public final int hashCode() {
        int iHashCode = this.f127585a.hashCode() * 31;
        String str = this.f127586b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f127585a);
        parcel.writeString(this.f127586b);
    }
}
