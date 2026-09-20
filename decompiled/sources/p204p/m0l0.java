package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class m0l0 implements Parcelable {
    public static final Parcelable.Creator<m0l0> CREATOR = new oxk0(5);

    /* JADX INFO: renamed from: a */
    public final String f138696a;

    /* JADX INFO: renamed from: b */
    public final String f138697b;

    /* JADX INFO: renamed from: c */
    public final String f138698c;

    public m0l0(String str, String str2, String str3) {
        this.f138696a = str;
        this.f138697b = str2;
        this.f138698c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0l0)) {
            return false;
        }
        m0l0 m0l0Var = (m0l0) obj;
        return wj50.m88271j(this.f138696a, m0l0Var.f138696a) && wj50.m88271j(this.f138697b, m0l0Var.f138697b) && wj50.m88271j(this.f138698c, m0l0Var.f138698c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f138696a.hashCode() * 31, 31, this.f138697b);
        String str = this.f138698c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f138696a);
        parcel.writeString(this.f138697b);
        parcel.writeString(this.f138698c);
    }
}
