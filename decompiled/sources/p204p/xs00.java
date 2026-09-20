package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class xs00 implements Parcelable {
    public static final Parcelable.Creator<xs00> CREATOR = new k700(17);

    /* JADX INFO: renamed from: a */
    public final String f265443a;

    /* JADX INFO: renamed from: b */
    public final boolean f265444b;

    public xs00(String str, boolean z) {
        this.f265443a = str;
        this.f265444b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs00)) {
            return false;
        }
        xs00 xs00Var = (xs00) obj;
        return wj50.m88271j(this.f265443a, xs00Var.f265443a) && this.f265444b == xs00Var.f265444b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265444b) + (this.f265443a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f265443a);
        parcel.writeInt(this.f265444b ? 1 : 0);
    }
}
