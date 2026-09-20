package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sns0 extends uns0 {
    public static final Parcelable.Creator<sns0> CREATOR = new wds0(4);

    /* JADX INFO: renamed from: b */
    public final String f211021b;

    /* JADX INFO: renamed from: c */
    public final String f211022c;

    public sns0(String str, String str2) {
        super(null);
        this.f211021b = str;
        this.f211022c = str2;
    }

    @Override // p204p.uns0
    /* JADX INFO: renamed from: c */
    public final String mo73361c() {
        return this.f211021b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sns0)) {
            return false;
        }
        sns0 sns0Var = (sns0) obj;
        return wj50.m88271j(this.f211021b, sns0Var.f211021b) && wj50.m88271j(this.f211022c, sns0Var.f211022c);
    }

    public final int hashCode() {
        int iHashCode = this.f211021b.hashCode() * 31;
        String str = this.f211022c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f211021b);
        parcel.writeString(this.f211022c);
    }

    public /* synthetic */ sns0(String str) {
        this(str, null);
    }
}
