package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lme0 implements Parcelable {
    public static final Parcelable.Creator<lme0> CREATOR = new ube0(5);

    /* JADX INFO: renamed from: a */
    public final String f134954a;

    /* JADX INFO: renamed from: b */
    public final String f134955b;

    /* JADX INFO: renamed from: c */
    public final String f134956c;

    /* JADX INFO: renamed from: d */
    public final boolean f134957d;

    public lme0(String str, String str2, String str3, boolean z) {
        this.f134954a = str;
        this.f134955b = str2;
        this.f134956c = str3;
        this.f134957d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lme0)) {
            return false;
        }
        lme0 lme0Var = (lme0) obj;
        return wj50.m88271j(this.f134954a, lme0Var.f134954a) && wj50.m88271j(this.f134955b, lme0Var.f134955b) && wj50.m88271j(this.f134956c, lme0Var.f134956c) && this.f134957d == lme0Var.f134957d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f134954a.hashCode() * 31, 31, this.f134955b);
        String str = this.f134956c;
        return Boolean.hashCode(this.f134957d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134954a);
        parcel.writeString(this.f134955b);
        parcel.writeString(this.f134956c);
        parcel.writeInt(this.f134957d ? 1 : 0);
    }
}
