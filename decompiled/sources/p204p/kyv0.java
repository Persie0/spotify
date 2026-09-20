package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kyv0 implements Parcelable {
    public static final Parcelable.Creator<kyv0> CREATOR = new h1v0(20);

    /* JADX INFO: renamed from: a */
    public final String f127926a;

    /* JADX INFO: renamed from: b */
    public final String f127927b;

    public kyv0(String str, String str2) {
        this.f127926a = str;
        this.f127927b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyv0)) {
            return false;
        }
        kyv0 kyv0Var = (kyv0) obj;
        return wj50.m88271j(this.f127926a, kyv0Var.f127926a) && wj50.m88271j(this.f127927b, kyv0Var.f127927b);
    }

    public final int hashCode() {
        return this.f127927b.hashCode() + (this.f127926a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f127926a);
        parcel.writeString(this.f127927b);
    }
}
