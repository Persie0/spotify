package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class gha1 implements Parcelable {
    public static final Parcelable.Creator<gha1> CREATOR = new u2a1(9);

    /* JADX INFO: renamed from: a */
    public final String f79865a;

    /* JADX INFO: renamed from: b */
    public final String f79866b;

    /* JADX INFO: renamed from: c */
    public final String f79867c;

    /* JADX INFO: renamed from: d */
    public final String f79868d;

    /* JADX INFO: renamed from: e */
    public final String f79869e;

    /* JADX INFO: renamed from: f */
    public final String f79870f;

    /* JADX INFO: renamed from: g */
    public final String f79871g;

    /* JADX INFO: renamed from: h */
    public final String f79872h;

    /* JADX INFO: renamed from: i */
    public final String f79873i;

    public gha1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f79865a = str;
        this.f79866b = str2;
        this.f79867c = str3;
        this.f79868d = str4;
        this.f79869e = str5;
        this.f79870f = str6;
        this.f79871g = str7;
        this.f79872h = str8;
        this.f79873i = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gha1)) {
            return false;
        }
        gha1 gha1Var = (gha1) obj;
        return wj50.m88271j(this.f79865a, gha1Var.f79865a) && wj50.m88271j(this.f79866b, gha1Var.f79866b) && wj50.m88271j(this.f79867c, gha1Var.f79867c) && wj50.m88271j(this.f79868d, gha1Var.f79868d) && wj50.m88271j(this.f79869e, gha1Var.f79869e) && wj50.m88271j(this.f79870f, gha1Var.f79870f) && wj50.m88271j(this.f79871g, gha1Var.f79871g) && wj50.m88271j(this.f79872h, gha1Var.f79872h) && wj50.m88271j(this.f79873i, gha1Var.f79873i);
    }

    public final int hashCode() {
        return this.f79873i.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f79865a.hashCode() * 31, 31, this.f79866b), 31, this.f79867c), 31, this.f79868d), 31, this.f79869e), 31, this.f79870f), 31, this.f79871g), 31, this.f79872h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f79865a);
        parcel.writeString(this.f79866b);
        parcel.writeString(this.f79867c);
        parcel.writeString(this.f79868d);
        parcel.writeString(this.f79869e);
        parcel.writeString(this.f79870f);
        parcel.writeString(this.f79871g);
        parcel.writeString(this.f79872h);
        parcel.writeString(this.f79873i);
    }

    public /* synthetic */ gha1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, "");
    }
}
