package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class tgk implements Parcelable {
    public static final Parcelable.Creator<tgk> CREATOR = new kck(5);

    /* JADX INFO: renamed from: a */
    public final String f220205a;

    /* JADX INFO: renamed from: b */
    public final String f220206b;

    /* JADX INFO: renamed from: c */
    public final String f220207c;

    /* JADX INFO: renamed from: d */
    public final String f220208d;

    public tgk(String str, String str2, String str3, String str4) {
        this.f220205a = str;
        this.f220206b = str2;
        this.f220207c = str3;
        this.f220208d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgk)) {
            return false;
        }
        tgk tgkVar = (tgk) obj;
        return wj50.m88271j(this.f220205a, tgkVar.f220205a) && wj50.m88271j(this.f220206b, tgkVar.f220206b) && wj50.m88271j(this.f220207c, tgkVar.f220207c) && wj50.m88271j(this.f220208d, tgkVar.f220208d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f220205a.hashCode() * 31, 31, this.f220206b), 31, this.f220207c);
        String str = this.f220208d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f220205a);
        parcel.writeString(this.f220206b);
        parcel.writeString(this.f220207c);
        parcel.writeString(this.f220208d);
    }
}
