package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gum0 implements Parcelable {
    public static final Parcelable.Creator<gum0> CREATOR = new cpl0(26);

    /* JADX INFO: renamed from: a */
    public final String f84507a;

    /* JADX INFO: renamed from: b */
    public final String f84508b;

    /* JADX INFO: renamed from: c */
    public final String f84509c;

    /* JADX INFO: renamed from: d */
    public final String f84510d;

    /* JADX INFO: renamed from: e */
    public final boolean f84511e;

    /* JADX INFO: renamed from: f */
    public final String f84512f;

    /* JADX INFO: renamed from: g */
    public final String f84513g;

    /* JADX INFO: renamed from: h */
    public final boolean f84514h;

    public gum0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.f84507a = str;
        this.f84508b = str2;
        this.f84509c = str3;
        this.f84510d = str4;
        this.f84511e = z;
        this.f84512f = str5;
        this.f84513g = str6;
        this.f84514h = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gum0)) {
            return false;
        }
        gum0 gum0Var = (gum0) obj;
        return wj50.m88271j(this.f84507a, gum0Var.f84507a) && wj50.m88271j(this.f84508b, gum0Var.f84508b) && wj50.m88271j(this.f84509c, gum0Var.f84509c) && wj50.m88271j(this.f84510d, gum0Var.f84510d) && this.f84511e == gum0Var.f84511e && wj50.m88271j(this.f84512f, gum0Var.f84512f) && wj50.m88271j(this.f84513g, gum0Var.f84513g) && this.f84514h == gum0Var.f84514h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84514h) + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f84507a.hashCode() * 31, 31, this.f84508b), 31, this.f84509c), 31, this.f84510d), 31, this.f84511e), 31, this.f84512f), 31, this.f84513g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f84507a);
        parcel.writeString(this.f84508b);
        parcel.writeString(this.f84509c);
        parcel.writeString(this.f84510d);
        parcel.writeInt(this.f84511e ? 1 : 0);
        parcel.writeString(this.f84512f);
        parcel.writeString(this.f84513g);
        parcel.writeInt(this.f84514h ? 1 : 0);
    }
}
