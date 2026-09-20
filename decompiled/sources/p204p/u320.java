package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class u320 implements Parcelable {
    public static final Parcelable.Creator<u320> CREATOR = new t320(0);

    /* JADX INFO: renamed from: a */
    public final String f226255a;

    /* JADX INFO: renamed from: b */
    public final String f226256b;

    /* JADX INFO: renamed from: c */
    public final String f226257c;

    /* JADX INFO: renamed from: d */
    public final boolean f226258d;

    /* JADX INFO: renamed from: e */
    public final Long f226259e;

    /* JADX INFO: renamed from: f */
    public final String f226260f;

    public u320(Long l, String str, String str2, String str3, String str4, boolean z) {
        this.f226255a = str;
        this.f226256b = str2;
        this.f226257c = str3;
        this.f226258d = z;
        this.f226259e = l;
        this.f226260f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u320)) {
            return false;
        }
        u320 u320Var = (u320) obj;
        return wj50.m88271j(this.f226255a, u320Var.f226255a) && wj50.m88271j(this.f226256b, u320Var.f226256b) && wj50.m88271j(this.f226257c, u320Var.f226257c) && this.f226258d == u320Var.f226258d && wj50.m88271j(this.f226259e, u320Var.f226259e) && wj50.m88271j(this.f226260f, u320Var.f226260f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f226255a.hashCode() * 31, 31, this.f226256b);
        String str = this.f226257c;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f226258d);
        Long l = this.f226259e;
        return this.f226260f.hashCode() + ((iM77245d + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f226255a);
        parcel.writeString(this.f226256b);
        parcel.writeString(this.f226257c);
        parcel.writeInt(this.f226258d ? 1 : 0);
        Long l = this.f226259e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
        parcel.writeString(this.f226260f);
    }
}
