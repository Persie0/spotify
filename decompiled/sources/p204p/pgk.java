package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class pgk implements Parcelable {
    public static final Parcelable.Creator<pgk> CREATOR = new kck(4);

    /* JADX INFO: renamed from: a */
    public final String f177351a;

    /* JADX INFO: renamed from: b */
    public final String f177352b;

    /* JADX INFO: renamed from: c */
    public final String f177353c;

    /* JADX INFO: renamed from: d */
    public final String f177354d;

    /* JADX INFO: renamed from: e */
    public final String f177355e;

    public pgk(String str, String str2, String str3, String str4, String str5) {
        this.f177351a = str;
        this.f177352b = str2;
        this.f177353c = str3;
        this.f177354d = str4;
        this.f177355e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgk)) {
            return false;
        }
        pgk pgkVar = (pgk) obj;
        return wj50.m88271j(this.f177351a, pgkVar.f177351a) && wj50.m88271j(this.f177352b, pgkVar.f177352b) && wj50.m88271j(this.f177353c, pgkVar.f177353c) && wj50.m88271j(this.f177354d, pgkVar.f177354d) && wj50.m88271j(this.f177355e, pgkVar.f177355e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f177351a.hashCode() * 31, 31, this.f177352b), 31, this.f177353c), 31, this.f177354d);
        String str = this.f177355e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f177351a);
        parcel.writeString(this.f177352b);
        parcel.writeString(this.f177353c);
        parcel.writeString(this.f177354d);
        parcel.writeString(this.f177355e);
    }
}
