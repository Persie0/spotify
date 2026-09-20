package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dsc1 implements Parcelable {
    public static final Parcelable.Creator<dsc1> CREATOR = new vmc1(12);

    /* JADX INFO: renamed from: a */
    public final String f52536a;

    /* JADX INFO: renamed from: b */
    public final String f52537b;

    /* JADX INFO: renamed from: c */
    public final String f52538c;

    /* JADX INFO: renamed from: d */
    public final String f52539d;

    public dsc1(String str, String str2, String str3, String str4) {
        this.f52536a = str;
        this.f52537b = str2;
        this.f52538c = str3;
        this.f52539d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsc1)) {
            return false;
        }
        dsc1 dsc1Var = (dsc1) obj;
        return wj50.m88271j(this.f52536a, dsc1Var.f52536a) && wj50.m88271j(this.f52537b, dsc1Var.f52537b) && wj50.m88271j(this.f52538c, dsc1Var.f52538c) && wj50.m88271j(this.f52539d, dsc1Var.f52539d);
    }

    public final int hashCode() {
        return this.f52539d.hashCode() + s571.m77243b(s571.m77243b(this.f52536a.hashCode() * 31, 31, this.f52537b), 31, this.f52538c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f52536a);
        parcel.writeString(this.f52537b);
        parcel.writeString(this.f52538c);
        parcel.writeString(this.f52539d);
    }
}
