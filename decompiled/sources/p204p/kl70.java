package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class kl70 implements Parcelable {
    public static final Parcelable.Creator<kl70> CREATOR = new w270(15);

    /* JADX INFO: renamed from: a */
    public final String f123811a;

    /* JADX INFO: renamed from: b */
    public final String f123812b;

    /* JADX INFO: renamed from: c */
    public final String f123813c;

    /* JADX INFO: renamed from: d */
    public final String f123814d;

    public kl70(String str, String str2, String str3, String str4) {
        this.f123811a = str;
        this.f123812b = str2;
        this.f123813c = str3;
        this.f123814d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl70)) {
            return false;
        }
        kl70 kl70Var = (kl70) obj;
        return wj50.m88271j(this.f123811a, kl70Var.f123811a) && wj50.m88271j(this.f123812b, kl70Var.f123812b) && wj50.m88271j(this.f123813c, kl70Var.f123813c) && wj50.m88271j(this.f123814d, kl70Var.f123814d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f123811a.hashCode() * 31, 31, this.f123812b), 31, this.f123813c);
        String str = this.f123814d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f123811a);
        parcel.writeString(this.f123812b);
        parcel.writeString(this.f123813c);
        parcel.writeString(this.f123814d);
    }
}
