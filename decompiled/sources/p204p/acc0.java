package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class acc0 implements Parcelable {
    public static final Parcelable.Creator<acc0> CREATOR = new f4c0(4);

    /* JADX INFO: renamed from: a */
    public final String f14314a;

    /* JADX INFO: renamed from: b */
    public final String f14315b;

    public acc0(String str, String str2) {
        this.f14314a = str;
        this.f14315b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acc0)) {
            return false;
        }
        acc0 acc0Var = (acc0) obj;
        return wj50.m88271j(this.f14314a, acc0Var.f14314a) && wj50.m88271j(this.f14315b, acc0Var.f14315b);
    }

    public final int hashCode() {
        return this.f14315b.hashCode() + (this.f14314a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14314a);
        parcel.writeString(this.f14315b);
    }
}
