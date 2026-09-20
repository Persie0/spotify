package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ml */
/* JADX INFO: loaded from: classes8.dex */
public final class C2131ml implements Parcelable {
    public static final Parcelable.Creator<C2131ml> CREATOR = new C2047kc(18);

    /* JADX INFO: renamed from: a */
    public final boolean f144720a;

    /* JADX INFO: renamed from: b */
    public final Boolean f144721b;

    /* JADX INFO: renamed from: c */
    public final Boolean f144722c;

    /* JADX INFO: renamed from: d */
    public final Boolean f144723d;

    /* JADX INFO: renamed from: e */
    public final Boolean f144724e;

    /* JADX INFO: renamed from: f */
    public final Boolean f144725f;

    public C2131ml(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.f144720a = z;
        this.f144721b = bool;
        this.f144722c = bool2;
        this.f144723d = bool3;
        this.f144724e = bool4;
        this.f144725f = bool5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2131ml)) {
            return false;
        }
        C2131ml c2131ml = (C2131ml) obj;
        return this.f144720a == c2131ml.f144720a && wj50.m88271j(this.f144721b, c2131ml.f144721b) && wj50.m88271j(this.f144722c, c2131ml.f144722c) && wj50.m88271j(this.f144723d, c2131ml.f144723d) && wj50.m88271j(this.f144724e, c2131ml.f144724e) && wj50.m88271j(this.f144725f, c2131ml.f144725f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f144720a) * 31;
        Boolean bool = this.f144721b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f144722c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f144723d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f144724e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f144725f;
        return iHashCode5 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f144720a ? 1 : 0);
        Boolean bool = this.f144721b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        Boolean bool2 = this.f144722c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool2);
        }
        Boolean bool3 = this.f144723d;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool3);
        }
        Boolean bool4 = this.f144724e;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool4);
        }
        Boolean bool5 = this.f144725f;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool5);
        }
    }
}
