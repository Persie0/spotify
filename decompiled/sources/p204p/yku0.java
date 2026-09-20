package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class yku0 implements Parcelable {
    public static final Parcelable.Creator<yku0> CREATOR = new v5u0(20);

    /* JADX INFO: renamed from: a */
    public final boolean f273840a;

    /* JADX INFO: renamed from: b */
    public final String f273841b;

    /* JADX INFO: renamed from: c */
    public final faa0 f273842c;

    /* JADX INFO: renamed from: d */
    public final int f273843d;

    public yku0(boolean z, String str, faa0 faa0Var, int i) {
        this.f273840a = z;
        this.f273841b = str;
        this.f273842c = faa0Var;
        this.f273843d = i;
    }

    /* JADX INFO: renamed from: c */
    public static yku0 m94128c(yku0 yku0Var, String str, faa0 faa0Var, int i, int i2) {
        boolean z = yku0Var.f273840a;
        if ((i2 & 2) != 0) {
            str = yku0Var.f273841b;
        }
        if ((i2 & 4) != 0) {
            faa0Var = yku0Var.f273842c;
        }
        if ((i2 & 8) != 0) {
            i = yku0Var.f273843d;
        }
        yku0Var.getClass();
        return new yku0(z, str, faa0Var, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yku0)) {
            return false;
        }
        yku0 yku0Var = (yku0) obj;
        return this.f273840a == yku0Var.f273840a && wj50.m88271j(this.f273841b, yku0Var.f273841b) && wj50.m88271j(this.f273842c, yku0Var.f273842c) && this.f273843d == yku0Var.f273843d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94129g() {
        return this.f273842c instanceof l9a0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273843d) + ((this.f273842c.hashCode() + s571.m77243b(Boolean.hashCode(this.f273840a) * 31, 31, this.f273841b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f273840a ? 1 : 0);
        parcel.writeString(this.f273841b);
        parcel.writeParcelable(this.f273842c, i);
        parcel.writeInt(this.f273843d);
    }

    public yku0(boolean z) {
        this(z, "", new u9a0(), 0);
    }
}
