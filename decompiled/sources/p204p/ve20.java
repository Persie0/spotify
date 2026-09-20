package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ve20 implements z5z0, Parcelable {
    public static final Parcelable.Creator<ve20> CREATOR = new t320(12);

    /* JADX INFO: renamed from: a */
    public final String f240554a;

    /* JADX INFO: renamed from: b */
    public final String f240555b;

    public ve20(String str, String str2) {
        this.f240554a = str;
        this.f240555b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve20)) {
            return false;
        }
        ve20 ve20Var = (ve20) obj;
        return wj50.m88271j(this.f240554a, ve20Var.f240554a) && wj50.m88271j(this.f240555b, ve20Var.f240555b);
    }

    public final int hashCode() {
        return this.f240555b.hashCode() + (this.f240554a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240554a);
        parcel.writeString(this.f240555b);
    }
}
