package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jr1 implements Parcelable {
    public static final Parcelable.Creator<jr1> CREATOR = new g11(22);

    /* JADX INFO: renamed from: a */
    public final String f115048a;

    /* JADX INFO: renamed from: b */
    public final String f115049b;

    public jr1(String str, String str2) {
        this.f115048a = str;
        this.f115049b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr1)) {
            return false;
        }
        jr1 jr1Var = (jr1) obj;
        return wj50.m88271j(this.f115048a, jr1Var.f115048a) && wj50.m88271j(this.f115049b, jr1Var.f115049b);
    }

    public final int hashCode() {
        return this.f115049b.hashCode() + (this.f115048a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115048a);
        parcel.writeString(this.f115049b);
    }
}
