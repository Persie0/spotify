package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yyh0 extends azh0 {
    public static final Parcelable.Creator<yyh0> CREATOR = new ruh0(16);

    /* JADX INFO: renamed from: a */
    public final String f277512a;

    /* JADX INFO: renamed from: b */
    public final String f277513b;

    /* JADX INFO: renamed from: c */
    public final String f277514c;

    public yyh0(String str, String str2, String str3) {
        this.f277512a = str;
        this.f277513b = str2;
        this.f277514c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyh0)) {
            return false;
        }
        yyh0 yyh0Var = (yyh0) obj;
        return wj50.m88271j(this.f277512a, yyh0Var.f277512a) && wj50.m88271j(this.f277513b, yyh0Var.f277513b) && wj50.m88271j(this.f277514c, yyh0Var.f277514c);
    }

    public final int hashCode() {
        return this.f277514c.hashCode() + s571.m77243b(this.f277512a.hashCode() * 31, 31, this.f277513b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f277512a);
        parcel.writeString(this.f277513b);
        parcel.writeString(this.f277514c);
    }
}
