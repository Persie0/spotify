package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class gdm0 implements Parcelable {
    public static final Parcelable.Creator<gdm0> CREATOR = new cpl0(11);

    /* JADX INFO: renamed from: a */
    public final String f78895a;

    /* JADX INFO: renamed from: b */
    public final String f78896b;

    /* JADX INFO: renamed from: c */
    public final String f78897c;

    public gdm0(String str, String str2, String str3) {
        this.f78895a = str;
        this.f78896b = str2;
        this.f78897c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdm0)) {
            return false;
        }
        gdm0 gdm0Var = (gdm0) obj;
        return wj50.m88271j(this.f78895a, gdm0Var.f78895a) && wj50.m88271j(this.f78896b, gdm0Var.f78896b) && wj50.m88271j(this.f78897c, gdm0Var.f78897c);
    }

    public final int hashCode() {
        return this.f78897c.hashCode() + s571.m77243b(this.f78895a.hashCode() * 31, 31, this.f78896b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f78895a);
        parcel.writeString(this.f78896b);
        parcel.writeString(this.f78897c);
    }
}
