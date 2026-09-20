package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yrx0 implements jsx0 {
    public static final Parcelable.Creator<yrx0> CREATOR = new xxw0(26);

    /* JADX INFO: renamed from: a */
    public final String f275608a;

    /* JADX INFO: renamed from: b */
    public final String f275609b;

    /* JADX INFO: renamed from: c */
    public final String f275610c;

    /* JADX INFO: renamed from: d */
    public final String f275611d;

    /* JADX INFO: renamed from: e */
    public final String f275612e;

    /* JADX INFO: renamed from: f */
    public final String f275613f;

    /* JADX INFO: renamed from: g */
    public final String f275614g;

    /* JADX INFO: renamed from: h */
    public final String f275615h;

    public yrx0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f275608a = str;
        this.f275609b = str2;
        this.f275610c = str3;
        this.f275611d = str4;
        this.f275612e = str5;
        this.f275613f = str6;
        this.f275614g = str7;
        this.f275615h = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrx0)) {
            return false;
        }
        yrx0 yrx0Var = (yrx0) obj;
        return wj50.m88271j(this.f275608a, yrx0Var.f275608a) && wj50.m88271j(this.f275609b, yrx0Var.f275609b) && wj50.m88271j(this.f275610c, yrx0Var.f275610c) && wj50.m88271j(this.f275611d, yrx0Var.f275611d) && wj50.m88271j(this.f275612e, yrx0Var.f275612e) && wj50.m88271j(this.f275613f, yrx0Var.f275613f) && wj50.m88271j(this.f275614g, yrx0Var.f275614g) && wj50.m88271j(this.f275615h, yrx0Var.f275615h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f275608a.hashCode() * 31, 31, this.f275609b), 31, this.f275610c), 31, this.f275611d);
        String str = this.f275612e;
        return this.f275615h.hashCode() + s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f275613f), 31, this.f275614g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f275608a);
        parcel.writeString(this.f275609b);
        parcel.writeString(this.f275610c);
        parcel.writeString(this.f275611d);
        parcel.writeString(this.f275612e);
        parcel.writeString(this.f275613f);
        parcel.writeString(this.f275614g);
        parcel.writeString(this.f275615h);
    }
}
