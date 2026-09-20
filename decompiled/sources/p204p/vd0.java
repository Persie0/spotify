package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class vd0 implements Parcelable {
    public static final Parcelable.Creator<vd0> CREATOR = new C2267ps(18);

    /* JADX INFO: renamed from: a */
    public final String f240284a;

    /* JADX INFO: renamed from: b */
    public final String f240285b;

    /* JADX INFO: renamed from: c */
    public final String f240286c;

    public vd0(String str, String str2, String str3) {
        this.f240284a = str;
        this.f240285b = str2;
        this.f240286c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0)) {
            return false;
        }
        vd0 vd0Var = (vd0) obj;
        return wj50.m88271j(this.f240284a, vd0Var.f240284a) && wj50.m88271j(this.f240285b, vd0Var.f240285b) && wj50.m88271j(this.f240286c, vd0Var.f240286c);
    }

    public final int hashCode() {
        return this.f240286c.hashCode() + s571.m77243b(this.f240284a.hashCode() * 31, 31, this.f240285b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240284a);
        parcel.writeString(this.f240285b);
        parcel.writeString(this.f240286c);
    }
}
