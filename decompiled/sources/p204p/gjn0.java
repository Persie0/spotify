package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class gjn0 implements Parcelable {
    public static final Parcelable.Creator<gjn0> CREATOR = new ejn0(1);

    /* JADX INFO: renamed from: a */
    public final String f80511a;

    /* JADX INFO: renamed from: b */
    public final String f80512b;

    public gjn0(String str, String str2) {
        this.f80511a = str;
        this.f80512b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjn0)) {
            return false;
        }
        gjn0 gjn0Var = (gjn0) obj;
        return wj50.m88271j(this.f80511a, gjn0Var.f80511a) && wj50.m88271j(this.f80512b, gjn0Var.f80512b);
    }

    public final int hashCode() {
        int iHashCode = this.f80511a.hashCode() * 31;
        String str = this.f80512b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80511a);
        parcel.writeString(this.f80512b);
    }
}
