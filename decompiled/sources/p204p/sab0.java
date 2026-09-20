package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class sab0 implements Parcelable {
    public static final Parcelable.Creator<sab0> CREATOR = new l0b0(17);

    /* JADX INFO: renamed from: a */
    public final String f207168a;

    /* JADX INFO: renamed from: b */
    public final String f207169b;

    /* JADX INFO: renamed from: c */
    public final String f207170c;

    public sab0(String str, String str2, String str3) {
        this.f207168a = str;
        this.f207169b = str2;
        this.f207170c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sab0)) {
            return false;
        }
        sab0 sab0Var = (sab0) obj;
        return wj50.m88271j(this.f207168a, sab0Var.f207168a) && wj50.m88271j(this.f207169b, sab0Var.f207169b) && wj50.m88271j(this.f207170c, sab0Var.f207170c);
    }

    public final String getId() {
        return this.f207168a;
    }

    public final String getName() {
        return this.f207169b;
    }

    public final int hashCode() {
        return this.f207170c.hashCode() + s571.m77243b(this.f207168a.hashCode() * 31, 31, this.f207169b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f207168a);
        parcel.writeString(this.f207169b);
        parcel.writeString(this.f207170c);
    }
}
