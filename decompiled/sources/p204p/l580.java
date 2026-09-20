package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class l580 implements Parcelable {
    public static final Parcelable.Creator<l580> CREATOR = new w270(28);

    /* JADX INFO: renamed from: a */
    public final m580 f129850a;

    /* JADX INFO: renamed from: b */
    public final String f129851b;

    /* JADX INFO: renamed from: c */
    public final String f129852c;

    public l580(m580 m580Var, String str, String str2) {
        this.f129850a = m580Var;
        this.f129851b = str;
        this.f129852c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l580)) {
            return false;
        }
        l580 l580Var = (l580) obj;
        return this.f129850a == l580Var.f129850a && wj50.m88271j(this.f129851b, l580Var.f129851b) && wj50.m88271j(this.f129852c, l580Var.f129852c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f129850a.hashCode() * 31, 31, this.f129851b);
        String str = this.f129852c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f129850a.writeToParcel(parcel, i);
        parcel.writeString(this.f129851b);
        parcel.writeString(this.f129852c);
    }
}
