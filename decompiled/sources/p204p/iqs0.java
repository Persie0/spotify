package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class iqs0 implements Parcelable {
    public static final Parcelable.Creator<iqs0> CREATOR = new wds0(8);

    /* JADX INFO: renamed from: a */
    public final String f104843a;

    /* JADX INFO: renamed from: b */
    public final String f104844b;

    public iqs0(String str, String str2) {
        this.f104843a = str;
        this.f104844b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqs0)) {
            return false;
        }
        iqs0 iqs0Var = (iqs0) obj;
        return wj50.m88271j(this.f104843a, iqs0Var.f104843a) && wj50.m88271j(this.f104844b, iqs0Var.f104844b);
    }

    public final int hashCode() {
        return this.f104844b.hashCode() + (this.f104843a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f104843a);
        parcel.writeString(this.f104844b);
    }
}
