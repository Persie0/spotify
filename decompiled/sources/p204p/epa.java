package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class epa implements Parcelable {
    public static final Parcelable.Creator<epa> CREATOR = new jja(5);

    /* JADX INFO: renamed from: a */
    public final String f61593a;

    /* JADX INFO: renamed from: b */
    public final String f61594b;

    /* JADX INFO: renamed from: c */
    public final int f61595c;

    /* JADX INFO: renamed from: d */
    public final String f61596d;

    /* JADX INFO: renamed from: e */
    public final String f61597e;

    public epa(int i, String str, String str2, String str3, String str4) {
        this.f61593a = str;
        this.f61594b = str2;
        this.f61595c = i;
        this.f61596d = str3;
        this.f61597e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epa)) {
            return false;
        }
        epa epaVar = (epa) obj;
        return wj50.m88271j(this.f61593a, epaVar.f61593a) && wj50.m88271j(this.f61594b, epaVar.f61594b) && this.f61595c == epaVar.f61595c && wj50.m88271j(this.f61596d, epaVar.f61596d) && wj50.m88271j(this.f61597e, epaVar.f61597e);
    }

    public final int hashCode() {
        return this.f61597e.hashCode() + s571.m77243b(f710.m40938f(this.f61595c, s571.m77243b(this.f61593a.hashCode() * 31, 31, this.f61594b), 31), 31, this.f61596d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f61593a);
        parcel.writeString(this.f61594b);
        int i2 = this.f61595c;
        if (i2 == 1) {
            str = "Small";
        } else if (i2 == 2) {
            str = "Medium";
        } else if (i2 == 3) {
            str = "Large";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "XLarge";
        }
        parcel.writeString(str);
        parcel.writeString(this.f61596d);
        parcel.writeString(this.f61597e);
    }
}
