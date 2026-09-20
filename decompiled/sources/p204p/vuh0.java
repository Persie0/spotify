package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class vuh0 implements Parcelable {
    public static final Parcelable.Creator<vuh0> CREATOR = new ruh0(5);

    /* JADX INFO: renamed from: a */
    public final String f244962a;

    /* JADX INFO: renamed from: b */
    public final String f244963b;

    public vuh0(String str, String str2) {
        this.f244962a = str;
        this.f244963b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuh0)) {
            return false;
        }
        vuh0 vuh0Var = (vuh0) obj;
        return wj50.m88271j(this.f244962a, vuh0Var.f244962a) && wj50.m88271j(this.f244963b, vuh0Var.f244963b);
    }

    public final int hashCode() {
        return this.f244963b.hashCode() + (this.f244962a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f244962a);
        parcel.writeString(this.f244963b);
    }
}
