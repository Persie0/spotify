package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ufc implements Parcelable {
    public static final Parcelable.Creator<ufc> CREATOR = new a5c(7);

    /* JADX INFO: renamed from: a */
    public final wq50 f229738a;

    /* JADX INFO: renamed from: b */
    public final String f229739b;

    public ufc(wq50 wq50Var, String str) {
        this.f229738a = wq50Var;
        this.f229739b = str;
    }

    /* JADX INFO: renamed from: c */
    public final wq50 m82961c() {
        return this.f229738a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufc)) {
            return false;
        }
        ufc ufcVar = (ufc) obj;
        return wj50.m88271j(this.f229738a, ufcVar.f229738a) && wj50.m88271j(this.f229739b, ufcVar.f229739b);
    }

    /* JADX INFO: renamed from: g */
    public final String m82962g() {
        return this.f229739b;
    }

    public final int hashCode() {
        wq50 wq50Var = this.f229738a;
        int iHashCode = (wq50Var == null ? 0 : wq50Var.hashCode()) * 31;
        String str = this.f229739b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f229738a, i);
        parcel.writeString(this.f229739b);
    }
}
