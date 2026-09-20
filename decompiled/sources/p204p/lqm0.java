package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class lqm0 implements Parcelable {
    public static final Parcelable.Creator<lqm0> CREATOR = new cpl0(18);

    /* JADX INFO: renamed from: a */
    public final String f136088a;

    /* JADX INFO: renamed from: b */
    public final String f136089b;

    /* JADX INFO: renamed from: c */
    public final String f136090c;

    public lqm0(String str, String str2, String str3) {
        this.f136088a = str;
        this.f136089b = str2;
        this.f136090c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqm0)) {
            return false;
        }
        lqm0 lqm0Var = (lqm0) obj;
        return wj50.m88271j(this.f136088a, lqm0Var.f136088a) && wj50.m88271j(this.f136089b, lqm0Var.f136089b) && wj50.m88271j(this.f136090c, lqm0Var.f136090c);
    }

    public final int hashCode() {
        return this.f136090c.hashCode() + s571.m77243b(this.f136088a.hashCode() * 31, 31, this.f136089b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f136088a);
        parcel.writeString(this.f136089b);
        parcel.writeString(this.f136090c);
    }
}
