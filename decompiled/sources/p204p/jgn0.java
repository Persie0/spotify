package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class jgn0 implements Parcelable {
    public static final Parcelable.Creator<jgn0> CREATOR = new n9n0(19);

    /* JADX INFO: renamed from: a */
    public final String f112224a;

    /* JADX INFO: renamed from: b */
    public final String f112225b;

    /* JADX INFO: renamed from: c */
    public final String f112226c;

    /* JADX INFO: renamed from: d */
    public final String f112227d;

    /* JADX INFO: renamed from: e */
    public final String f112228e;

    /* JADX INFO: renamed from: f */
    public final String f112229f;

    /* JADX INFO: renamed from: g */
    public final String f112230g;

    public jgn0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f112224a = str;
        this.f112225b = str2;
        this.f112226c = str3;
        this.f112227d = str4;
        this.f112228e = str5;
        this.f112229f = str6;
        this.f112230g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgn0)) {
            return false;
        }
        jgn0 jgn0Var = (jgn0) obj;
        return wj50.m88271j(this.f112224a, jgn0Var.f112224a) && wj50.m88271j(this.f112225b, jgn0Var.f112225b) && wj50.m88271j(this.f112226c, jgn0Var.f112226c) && wj50.m88271j(this.f112227d, jgn0Var.f112227d) && wj50.m88271j(this.f112228e, jgn0Var.f112228e) && wj50.m88271j(this.f112229f, jgn0Var.f112229f) && wj50.m88271j(this.f112230g, jgn0Var.f112230g);
    }

    public final int hashCode() {
        return this.f112230g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f112224a.hashCode() * 31, 31, this.f112225b), 31, this.f112226c), 31, this.f112227d), 31, this.f112228e), 31, this.f112229f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112224a);
        parcel.writeString(this.f112225b);
        parcel.writeString(this.f112226c);
        parcel.writeString(this.f112227d);
        parcel.writeString(this.f112228e);
        parcel.writeString(this.f112229f);
        parcel.writeString(this.f112230g);
    }
}
