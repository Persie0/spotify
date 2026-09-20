package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sfx0 extends ufx0 {
    public static final Parcelable.Creator<sfx0> CREATOR = new xxw0(14);

    /* JADX INFO: renamed from: a */
    public final String f208653a;

    /* JADX INFO: renamed from: b */
    public final String f208654b;

    /* JADX INFO: renamed from: c */
    public final int f208655c;

    /* JADX INFO: renamed from: d */
    public final int f208656d;

    /* JADX INFO: renamed from: e */
    public final String f208657e;

    public sfx0(int i, int i2, String str, String str2, String str3) {
        this.f208653a = str;
        this.f208654b = str2;
        this.f208655c = i;
        this.f208656d = i2;
        this.f208657e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfx0)) {
            return false;
        }
        sfx0 sfx0Var = (sfx0) obj;
        return wj50.m88271j(this.f208653a, sfx0Var.f208653a) && wj50.m88271j(this.f208654b, sfx0Var.f208654b) && this.f208655c == sfx0Var.f208655c && this.f208656d == sfx0Var.f208656d && wj50.m88271j(this.f208657e, sfx0Var.f208657e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f208656d, mt60.m62800g(this.f208655c, s571.m77243b(this.f208653a.hashCode() * 31, 31, this.f208654b), 31), 31);
        String str = this.f208657e;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f208653a);
        parcel.writeString(this.f208654b);
        parcel.writeInt(this.f208655c);
        parcel.writeInt(this.f208656d);
        parcel.writeString(this.f208657e);
    }
}
