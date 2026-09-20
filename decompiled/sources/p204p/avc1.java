package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class avc1 implements Parcelable {
    public static final Parcelable.Creator<avc1> CREATOR = new vmc1(13);

    /* JADX INFO: renamed from: a */
    public final String f20158a;

    /* JADX INFO: renamed from: b */
    public final String f20159b;

    public avc1(String str, String str2) {
        this.f20158a = str;
        this.f20159b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avc1)) {
            return false;
        }
        avc1 avc1Var = (avc1) obj;
        return wj50.m88271j(this.f20158a, avc1Var.f20158a) && wj50.m88271j(this.f20159b, avc1Var.f20159b);
    }

    public final int hashCode() {
        return this.f20159b.hashCode() + (this.f20158a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20158a);
        parcel.writeString(this.f20159b);
    }
}
