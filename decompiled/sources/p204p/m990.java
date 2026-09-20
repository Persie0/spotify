package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class m990 implements p990 {
    public static final Parcelable.Creator<m990> CREATOR = new x390(15);

    /* JADX INFO: renamed from: a */
    public final String f141233a;

    /* JADX INFO: renamed from: b */
    public final String f141234b;

    /* JADX INFO: renamed from: c */
    public final String f141235c;

    /* JADX INFO: renamed from: d */
    public final String f141236d;

    /* JADX INFO: renamed from: e */
    public final Long f141237e;

    public m990(Long l, String str, String str2, String str3, String str4) {
        this.f141233a = str;
        this.f141234b = str2;
        this.f141235c = str3;
        this.f141236d = str4;
        this.f141237e = l;
    }

    @Override // p204p.p990
    /* JADX INFO: renamed from: I */
    public final Long mo61183I() {
        return this.f141237e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m990)) {
            return false;
        }
        m990 m990Var = (m990) obj;
        return wj50.m88271j(this.f141233a, m990Var.f141233a) && wj50.m88271j(this.f141234b, m990Var.f141234b) && wj50.m88271j(this.f141235c, m990Var.f141235c) && wj50.m88271j(this.f141236d, m990Var.f141236d) && wj50.m88271j(this.f141237e, m990Var.f141237e);
    }

    @Override // p204p.p990
    public final String getContextUri() {
        return this.f141236d;
    }

    @Override // p204p.p990
    public final String getEntityUri() {
        return this.f141235c;
    }

    @Override // p204p.p990
    public final String getUsername() {
        return this.f141233a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f141233a.hashCode() * 31, 31, this.f141234b), 31, this.f141235c);
        String str = this.f141236d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f141237e;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // p204p.p990
    /* JADX INFO: renamed from: i */
    public final boolean mo61184i() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f141233a);
        parcel.writeString(this.f141234b);
        parcel.writeString(this.f141235c);
        parcel.writeString(this.f141236d);
        Long l = this.f141237e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
