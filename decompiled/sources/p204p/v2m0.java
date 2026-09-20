package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v2m0 implements Parcelable {
    public static final Parcelable.Creator<v2m0> CREATOR = new cpl0(9);

    /* JADX INFO: renamed from: a */
    public final String f236697a;

    /* JADX INFO: renamed from: b */
    public final String f236698b;

    public v2m0(String str, String str2) {
        this.f236697a = str;
        this.f236698b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2m0)) {
            return false;
        }
        v2m0 v2m0Var = (v2m0) obj;
        return wj50.m88271j(this.f236697a, v2m0Var.f236697a) && wj50.m88271j(this.f236698b, v2m0Var.f236698b);
    }

    public final int hashCode() {
        return this.f236698b.hashCode() + (this.f236697a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236697a);
        parcel.writeString(this.f236698b);
    }
}
