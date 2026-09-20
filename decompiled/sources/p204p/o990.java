package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class o990 implements p990 {
    public static final Parcelable.Creator<o990> CREATOR = new x390(17);

    /* JADX INFO: renamed from: a */
    public final String f162977a;

    /* JADX INFO: renamed from: b */
    public final String f162978b;

    /* JADX INFO: renamed from: c */
    public final w990 f162979c;

    /* JADX INFO: renamed from: d */
    public final String f162980d;

    /* JADX INFO: renamed from: e */
    public final String f162981e;

    /* JADX INFO: renamed from: f */
    public final long f162982f;

    public o990(String str, String str2, w990 w990Var, String str3, String str4, long j) {
        this.f162977a = str;
        this.f162978b = str2;
        this.f162979c = w990Var;
        this.f162980d = str3;
        this.f162981e = str4;
        this.f162982f = j;
    }

    @Override // p204p.p990
    /* JADX INFO: renamed from: I */
    public final Long mo61183I() {
        return Long.valueOf(this.f162982f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o990)) {
            return false;
        }
        o990 o990Var = (o990) obj;
        return wj50.m88271j(this.f162977a, o990Var.f162977a) && wj50.m88271j(this.f162978b, o990Var.f162978b) && wj50.m88271j(this.f162979c, o990Var.f162979c) && wj50.m88271j(this.f162980d, o990Var.f162980d) && wj50.m88271j(this.f162981e, o990Var.f162981e) && this.f162982f == o990Var.f162982f;
    }

    @Override // p204p.p990
    public final String getContextUri() {
        return this.f162981e;
    }

    @Override // p204p.p990
    public final String getEntityUri() {
        return this.f162980d;
    }

    @Override // p204p.p990
    public final String getUsername() {
        return this.f162977a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f162977a.hashCode() * 31, 31, this.f162978b);
        w990 w990Var = this.f162979c;
        int iM77243b2 = s571.m77243b((iM77243b + (w990Var == null ? 0 : w990Var.hashCode())) * 31, 31, this.f162980d);
        String str = this.f162981e;
        return Long.hashCode(this.f162982f) + ((iM77243b2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p204p.p990
    /* JADX INFO: renamed from: i */
    public final boolean mo61184i() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162977a);
        parcel.writeString(this.f162978b);
        w990 w990Var = this.f162979c;
        if (w990Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            w990Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f162980d);
        parcel.writeString(this.f162981e);
        parcel.writeLong(this.f162982f);
    }
}
