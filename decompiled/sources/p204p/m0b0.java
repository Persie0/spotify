package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m0b0 extends w0b0 {
    public static final Parcelable.Creator<m0b0> CREATOR = new l0b0(0);

    /* JADX INFO: renamed from: a */
    public final ep10 f138622a;

    /* JADX INFO: renamed from: b */
    public final String f138623b;

    /* JADX INFO: renamed from: c */
    public final String f138624c;

    public m0b0(ep10 ep10Var, String str, String str2) {
        this.f138622a = ep10Var;
        this.f138623b = str;
        this.f138624c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0b0)) {
            return false;
        }
        m0b0 m0b0Var = (m0b0) obj;
        return wj50.m88271j(this.f138622a, m0b0Var.f138622a) && wj50.m88271j(this.f138623b, m0b0Var.f138623b) && wj50.m88271j(this.f138624c, m0b0Var.f138624c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f138622a.hashCode() * 31, 31, this.f138623b);
        String str = this.f138624c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f138622a, i);
        parcel.writeString(this.f138623b);
        parcel.writeString(this.f138624c);
    }
}
