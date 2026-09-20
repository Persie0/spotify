package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class an3 implements Parcelable {
    public static final Parcelable.Creator<an3> CREATOR = new bc3(11);

    /* JADX INFO: renamed from: a */
    public final String f17253a;

    /* JADX INFO: renamed from: b */
    public final String f17254b;

    /* JADX INFO: renamed from: c */
    public final boolean f17255c;

    /* JADX INFO: renamed from: d */
    public final String f17256d;

    public an3(String str, String str2, boolean z, String str3) {
        this.f17253a = str;
        this.f17254b = str2;
        this.f17255c = z;
        this.f17256d = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m26463c() {
        return this.f17253a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an3)) {
            return false;
        }
        an3 an3Var = (an3) obj;
        return wj50.m88271j(this.f17253a, an3Var.f17253a) && wj50.m88271j(this.f17254b, an3Var.f17254b) && this.f17255c == an3Var.f17255c && wj50.m88271j(this.f17256d, an3Var.f17256d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f17253a.hashCode() * 31, 31, this.f17254b), 31, this.f17255c);
        String str = this.f17256d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17253a);
        parcel.writeString(this.f17254b);
        parcel.writeInt(this.f17255c ? 1 : 0);
        parcel.writeString(this.f17256d);
    }

    public /* synthetic */ an3(String str, String str2, int i) {
        this(str, str2, (i & 4) != 0, null);
    }
}
