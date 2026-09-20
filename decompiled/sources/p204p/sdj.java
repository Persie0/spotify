package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sdj implements vdj {
    public static final Parcelable.Creator<sdj> CREATOR = new wcj(17);

    /* JADX INFO: renamed from: a */
    public final String f208018a;

    /* JADX INFO: renamed from: b */
    public final String f208019b;

    /* JADX INFO: renamed from: c */
    public final String f208020c;

    /* JADX INFO: renamed from: d */
    public final String f208021d;

    public sdj(String str, String str2, String str3, String str4) {
        this.f208018a = str;
        this.f208019b = str2;
        this.f208020c = str3;
        this.f208021d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdj)) {
            return false;
        }
        sdj sdjVar = (sdj) obj;
        return wj50.m88271j(this.f208018a, sdjVar.f208018a) && wj50.m88271j(this.f208019b, sdjVar.f208019b) && wj50.m88271j(this.f208020c, sdjVar.f208020c) && wj50.m88271j(this.f208021d, sdjVar.f208021d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f208018a.hashCode() * 31, 31, this.f208019b), 31, this.f208020c);
        String str = this.f208021d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f208018a);
        parcel.writeString(this.f208019b);
        parcel.writeString(this.f208020c);
        parcel.writeString(this.f208021d);
    }

    public /* synthetic */ sdj(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }
}
