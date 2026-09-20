package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class cba implements Parcelable {
    public static final Parcelable.Creator<cba> CREATOR = new dc9(15);

    /* JADX INFO: renamed from: a */
    public final String f36057a;

    /* JADX INFO: renamed from: b */
    public final String f36058b;

    /* JADX INFO: renamed from: c */
    public final String f36059c;

    /* JADX INFO: renamed from: d */
    public final String f36060d;

    /* JADX INFO: renamed from: e */
    public final String f36061e;

    /* JADX INFO: renamed from: f */
    public final String f36062f;

    /* JADX INFO: renamed from: g */
    public final String f36063g;

    public cba(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f36057a = str;
        this.f36058b = str2;
        this.f36059c = str3;
        this.f36060d = str4;
        this.f36061e = str5;
        this.f36062f = str6;
        this.f36063g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cba)) {
            return false;
        }
        cba cbaVar = (cba) obj;
        return wj50.m88271j(this.f36057a, cbaVar.f36057a) && wj50.m88271j(this.f36058b, cbaVar.f36058b) && wj50.m88271j(this.f36059c, cbaVar.f36059c) && wj50.m88271j(this.f36060d, cbaVar.f36060d) && wj50.m88271j(this.f36061e, cbaVar.f36061e) && wj50.m88271j(this.f36062f, cbaVar.f36062f) && wj50.m88271j(this.f36063g, cbaVar.f36063g);
    }

    public final int hashCode() {
        return this.f36063g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f36057a.hashCode() * 31, 31, this.f36058b), 31, this.f36059c), 31, this.f36060d), 31, this.f36061e), 31, this.f36062f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36057a);
        parcel.writeString(this.f36058b);
        parcel.writeString(this.f36059c);
        parcel.writeString(this.f36060d);
        parcel.writeString(this.f36061e);
        parcel.writeString(this.f36062f);
        parcel.writeString(this.f36063g);
    }
}
