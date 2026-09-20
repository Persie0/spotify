package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class lu01 implements Parcelable {
    public static final Parcelable.Creator<lu01> CREATOR = new sp01(25);

    /* JADX INFO: renamed from: a */
    public final String f136946a;

    /* JADX INFO: renamed from: b */
    public final String f136947b;

    /* JADX INFO: renamed from: c */
    public final ern0 f136948c;

    /* JADX INFO: renamed from: d */
    public final k1b1 f136949d;

    /* JADX INFO: renamed from: e */
    public final String f136950e;

    /* JADX INFO: renamed from: f */
    public final String f136951f;

    /* JADX INFO: renamed from: g */
    public final Bundle f136952g;

    public lu01(String str, String str2, ern0 ern0Var, k1b1 k1b1Var, String str3, String str4, Bundle bundle) {
        this.f136946a = str;
        this.f136947b = str2;
        this.f136948c = ern0Var;
        this.f136949d = k1b1Var;
        this.f136950e = str3;
        this.f136951f = str4;
        this.f136952g = bundle;
    }

    /* JADX INFO: renamed from: c */
    public static lu01 m59923c(lu01 lu01Var, String str, ern0 ern0Var, String str2, int i) {
        if ((i & 1) != 0) {
            str = lu01Var.f136946a;
        }
        String str3 = str;
        String str4 = lu01Var.f136947b;
        if ((i & 4) != 0) {
            ern0Var = lu01Var.f136948c;
        }
        ern0 ern0Var2 = ern0Var;
        k1b1 k1b1Var = lu01Var.f136949d;
        if ((i & 16) != 0) {
            str2 = lu01Var.f136950e;
        }
        String str5 = lu01Var.f136951f;
        Bundle bundle = lu01Var.f136952g;
        lu01Var.getClass();
        return new lu01(str3, str4, ern0Var2, k1b1Var, str2, str5, bundle);
    }

    /* JADX INFO: renamed from: g */
    public static an80 m59924g(lu01 lu01Var) {
        return new an80(lu01Var.f136946a, lu01Var.f136947b, lu01Var.f136948c, lu01Var.f136949d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu01)) {
            return false;
        }
        lu01 lu01Var = (lu01) obj;
        return wj50.m88271j(this.f136946a, lu01Var.f136946a) && wj50.m88271j(this.f136947b, lu01Var.f136947b) && wj50.m88271j(this.f136948c, lu01Var.f136948c) && wj50.m88271j(this.f136949d, lu01Var.f136949d) && wj50.m88271j(this.f136950e, lu01Var.f136950e) && wj50.m88271j(this.f136951f, lu01Var.f136951f) && wj50.m88271j(this.f136952g, lu01Var.f136952g);
    }

    /* JADX INFO: renamed from: h */
    public final bve0 m59925h() {
        return new bve0(this.f136946a, this.f136950e, this.f136951f, this.f136947b, this.f136949d, this.f136948c);
    }

    public final int hashCode() {
        int iHashCode = this.f136946a.hashCode() * 31;
        String str = this.f136947b;
        int iHashCode2 = (this.f136948c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        k1b1 k1b1Var = this.f136949d;
        int iHashCode3 = (iHashCode2 + (k1b1Var == null ? 0 : k1b1Var.hashCode())) * 31;
        String str2 = this.f136950e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f136951f;
        return this.f136952g.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f136946a);
        parcel.writeString(this.f136947b);
        AbstractC2328r7 abstractC2328r7 = (AbstractC2328r7) this.f136948c;
        parcel.writeInt(abstractC2328r7.mo36659c());
        for (Map.Entry entry : (ig40) abstractC2328r7.mo36657a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeParcelable(this.f136949d, i);
        parcel.writeString(this.f136950e);
        parcel.writeString(this.f136951f);
        parcel.writeBundle(this.f136952g);
    }

    public lu01(String str, String str2, ern0 ern0Var, k1b1 k1b1Var, String str3, String str4, Bundle bundle, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? grn0.f83797d : ern0Var, (i & 8) != 0 ? null : k1b1Var, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? Bundle.EMPTY : bundle);
    }
}
