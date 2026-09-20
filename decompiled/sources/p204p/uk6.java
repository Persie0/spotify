package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class uk6 implements Parcelable {
    public static final Parcelable.Creator<uk6> CREATOR = new fi6(10);

    /* JADX INFO: renamed from: a */
    public final String f231235a;

    /* JADX INFO: renamed from: b */
    public final String f231236b;

    public uk6(String str, String str2) {
        this.f231235a = str;
        this.f231236b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk6)) {
            return false;
        }
        uk6 uk6Var = (uk6) obj;
        return wj50.m88271j(this.f231235a, uk6Var.f231235a) && wj50.m88271j(this.f231236b, uk6Var.f231236b);
    }

    public final int hashCode() {
        int iHashCode = this.f231235a.hashCode() * 31;
        String str = this.f231236b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231235a);
        parcel.writeString(this.f231236b);
    }
}
