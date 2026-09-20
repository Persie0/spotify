package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jq50 implements br50, Parcelable {
    public static final Parcelable.Creator<jq50> CREATOR = new gd50(26);

    /* JADX INFO: renamed from: a */
    public final String f114791a;

    /* JADX INFO: renamed from: b */
    public final String f114792b;

    /* JADX INFO: renamed from: c */
    public final String f114793c;

    /* JADX INFO: renamed from: d */
    public final String f114794d;

    /* JADX INFO: renamed from: e */
    public final String f114795e;

    /* JADX INFO: renamed from: f */
    public final String f114796f;

    /* JADX INFO: renamed from: g */
    public final boolean f114797g;

    /* JADX INFO: renamed from: h */
    public final boolean f114798h;

    /* JADX INFO: renamed from: i */
    public final long f114799i;

    /* JADX INFO: renamed from: t */
    public final long f114800t;

    public jq50(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, long j, long j2) {
        this.f114791a = str;
        this.f114792b = str2;
        this.f114793c = str3;
        this.f114794d = str4;
        this.f114795e = str5;
        this.f114796f = str6;
        this.f114797g = z;
        this.f114798h = z2;
        this.f114799i = j;
        this.f114800t = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq50)) {
            return false;
        }
        jq50 jq50Var = (jq50) obj;
        return wj50.m88271j(this.f114791a, jq50Var.f114791a) && wj50.m88271j(this.f114792b, jq50Var.f114792b) && wj50.m88271j(this.f114793c, jq50Var.f114793c) && wj50.m88271j(this.f114794d, jq50Var.f114794d) && wj50.m88271j(this.f114795e, jq50Var.f114795e) && wj50.m88271j(this.f114796f, jq50Var.f114796f) && this.f114797g == jq50Var.f114797g && this.f114798h == jq50Var.f114798h && this.f114799i == jq50Var.f114799i && this.f114800t == jq50Var.f114800t;
    }

    @Override // p204p.br50
    public final String getImageUri() {
        return this.f114793c;
    }

    @Override // p204p.br50
    public final String getName() {
        return this.f114792b;
    }

    @Override // p204p.br50
    public final String getUri() {
        return this.f114791a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f114800t) + dq60.m36605e(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f114791a.hashCode() * 31, 31, this.f114792b), 31, this.f114793c), 31, this.f114794d), 31, this.f114795e), 31, this.f114796f), 31, this.f114797g), 31, this.f114798h), this.f114799i, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f114791a);
        parcel.writeString(this.f114792b);
        parcel.writeString(this.f114793c);
        parcel.writeString(this.f114794d);
        parcel.writeString(this.f114795e);
        parcel.writeString(this.f114796f);
        parcel.writeInt(this.f114797g ? 1 : 0);
        parcel.writeInt(this.f114798h ? 1 : 0);
        parcel.writeLong(this.f114799i);
        parcel.writeLong(this.f114800t);
    }
}
