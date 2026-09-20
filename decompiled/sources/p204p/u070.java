package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class u070 implements Parcelable {
    public static final Parcelable.Creator<u070> CREATOR = new pq50(23);

    /* JADX INFO: renamed from: a */
    public final String f225398a;

    /* JADX INFO: renamed from: b */
    public final int f225399b;

    /* JADX INFO: renamed from: c */
    public final inc1 f225400c;

    public u070(String str, int i, inc1 inc1Var) {
        this.f225398a = str;
        this.f225399b = i;
        this.f225400c = inc1Var;
    }

    /* JADX INFO: renamed from: c */
    public static u070 m82111c(u070 u070Var, int i, int i2) {
        String str = u070Var.f225398a;
        if ((i2 & 2) != 0) {
            i = u070Var.f225399b;
        }
        inc1 inc1Var = (i2 & 4) != 0 ? u070Var.f225400c : inc1.f103953c;
        u070Var.getClass();
        return new u070(str, i, inc1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u070)) {
            return false;
        }
        u070 u070Var = (u070) obj;
        return wj50.m88271j(this.f225398a, u070Var.f225398a) && this.f225399b == u070Var.f225399b && this.f225400c == u070Var.f225400c;
    }

    public final int hashCode() {
        return this.f225400c.hashCode() + f710.m40938f(this.f225399b, this.f225398a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f225398a);
        int i2 = this.f225399b;
        if (i2 == 1) {
            str = "NOT_CHECKED";
        } else if (i2 == 2) {
            str = "DATE_INVALID";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "VALID";
        }
        parcel.writeString(str);
        parcel.writeString(this.f225400c.name());
    }
}
