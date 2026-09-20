package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tth implements Parcelable {
    public static final Parcelable.Creator<tth> CREATOR = new n6f1(9);

    /* JADX INFO: renamed from: a */
    public final String f223596a;

    /* JADX INFO: renamed from: b */
    public final String f223597b;

    /* JADX INFO: renamed from: c */
    public final String f223598c;

    public tth(String str, String str2, String str3) {
        this.f223596a = str;
        this.f223597b = str2;
        this.f223598c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tth)) {
            return false;
        }
        tth tthVar = (tth) obj;
        return wj50.m88271j(this.f223596a, tthVar.f223596a) && wj50.m88271j(this.f223597b, tthVar.f223597b) && wj50.m88271j(this.f223598c, tthVar.f223598c);
    }

    public final String getUri() {
        return this.f223596a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f223596a.hashCode() * 31, 31, this.f223597b);
        String str = this.f223598c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f223596a);
        parcel.writeString(this.f223597b);
        parcel.writeString(this.f223598c);
    }

    public /* synthetic */ tth(String str, String str2) {
        this(str, str2, null);
    }
}
