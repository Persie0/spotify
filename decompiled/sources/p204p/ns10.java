package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ns10 implements Parcelable {
    public static final Parcelable.Creator<ns10> CREATOR = new km10(9);

    /* JADX INFO: renamed from: a */
    public final ss10 f157636a;

    /* JADX INFO: renamed from: b */
    public final Integer f157637b;

    /* JADX INFO: renamed from: c */
    public final boolean f157638c;

    /* JADX INFO: renamed from: d */
    public final String f157639d;

    /* JADX INFO: renamed from: e */
    public final boolean f157640e;

    /* JADX INFO: renamed from: f */
    public final boolean f157641f;

    /* JADX INFO: renamed from: g */
    public final vct f157642g;

    public ns10(ss10 ss10Var, Integer num, boolean z, String str, boolean z2, boolean z3, vct vctVar) {
        this.f157636a = ss10Var;
        this.f157637b = num;
        this.f157638c = z;
        this.f157639d = str;
        this.f157640e = z2;
        this.f157641f = z3;
        this.f157642g = vctVar;
    }

    /* JADX INFO: renamed from: c */
    public static ns10 m65502c(ns10 ns10Var, boolean z, boolean z2, vct vctVar, int i) {
        ss10 ss10Var = ns10Var.f157636a;
        Integer num = ns10Var.f157637b;
        boolean z3 = ns10Var.f157638c;
        String str = ns10Var.f157639d;
        if ((i & 16) != 0) {
            z = ns10Var.f157640e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = ns10Var.f157641f;
        }
        ns10Var.getClass();
        return new ns10(ss10Var, num, z3, str, z4, z2, vctVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns10)) {
            return false;
        }
        ns10 ns10Var = (ns10) obj;
        return this.f157636a == ns10Var.f157636a && wj50.m88271j(this.f157637b, ns10Var.f157637b) && this.f157638c == ns10Var.f157638c && wj50.m88271j(this.f157639d, ns10Var.f157639d) && this.f157640e == ns10Var.f157640e && this.f157641f == ns10Var.f157641f && wj50.m88271j(this.f157642g, ns10Var.f157642g);
    }

    public final int hashCode() {
        int iHashCode = this.f157636a.hashCode() * 31;
        Integer num = this.f157637b;
        return this.f157642g.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77245d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f157638c), 31, this.f157639d), 31, this.f157640e), 31, this.f157641f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f157636a.name());
        Integer num = this.f157637b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f157638c ? 1 : 0);
        parcel.writeString(this.f157639d);
        parcel.writeInt(this.f157640e ? 1 : 0);
        parcel.writeInt(this.f157641f ? 1 : 0);
        parcel.writeParcelable(this.f157642g, i);
    }
}
