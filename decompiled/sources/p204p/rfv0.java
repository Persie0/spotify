package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rfv0 implements zz41 {
    public static final Parcelable.Creator<rfv0> CREATOR = new h1v0(12);

    /* JADX INFO: renamed from: a */
    public final String f198750a;

    /* JADX INFO: renamed from: b */
    public final String f198751b;

    /* JADX INFO: renamed from: c */
    public final String f198752c;

    /* JADX INFO: renamed from: d */
    public final String f198753d;

    /* JADX INFO: renamed from: e */
    public final String f198754e;

    public rfv0(String str, String str2, String str3, String str4, String str5) {
        this.f198750a = str;
        this.f198751b = str2;
        this.f198752c = str3;
        this.f198753d = str4;
        this.f198754e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfv0)) {
            return false;
        }
        rfv0 rfv0Var = (rfv0) obj;
        return wj50.m88271j(this.f198750a, rfv0Var.f198750a) && wj50.m88271j(this.f198751b, rfv0Var.f198751b) && wj50.m88271j(this.f198752c, rfv0Var.f198752c) && wj50.m88271j(this.f198753d, rfv0Var.f198753d) && wj50.m88271j(this.f198754e, rfv0Var.f198754e);
    }

    @Override // p204p.zz41
    public final String getId() {
        return "RecommendedPlaylist";
    }

    public final int hashCode() {
        return this.f198754e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f198750a.hashCode() * 31, 31, this.f198751b), 31, this.f198752c), 31, this.f198753d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f198750a);
        parcel.writeString(this.f198751b);
        parcel.writeString(this.f198752c);
        parcel.writeString(this.f198753d);
        parcel.writeString(this.f198754e);
    }
}
