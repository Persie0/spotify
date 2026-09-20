package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class bbe0 implements Parcelable {
    public static final Parcelable.Creator<bbe0> CREATOR = new jfd0(27);

    /* JADX INFO: renamed from: a */
    public final String f25543a;

    /* JADX INFO: renamed from: b */
    public final String f25544b;

    /* JADX INFO: renamed from: c */
    public final String f25545c;

    /* JADX INFO: renamed from: d */
    public final jnc1 f25546d;

    public bbe0(String str, String str2, String str3, jnc1 jnc1Var) {
        this.f25543a = str;
        this.f25544b = str2;
        this.f25545c = str3;
        this.f25546d = jnc1Var;
    }

    /* JADX INFO: renamed from: c */
    public static bbe0 m28633c(bbe0 bbe0Var, jnc1 jnc1Var) {
        String str = bbe0Var.f25543a;
        String str2 = bbe0Var.f25544b;
        String str3 = bbe0Var.f25545c;
        bbe0Var.getClass();
        return new bbe0(str, str2, str3, jnc1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbe0)) {
            return false;
        }
        bbe0 bbe0Var = (bbe0) obj;
        return wj50.m88271j(this.f25543a, bbe0Var.f25543a) && wj50.m88271j(this.f25544b, bbe0Var.f25544b) && wj50.m88271j(this.f25545c, bbe0Var.f25545c) && wj50.m88271j(this.f25546d, bbe0Var.f25546d);
    }

    public final int hashCode() {
        return this.f25546d.hashCode() + s571.m77243b(s571.m77243b(this.f25543a.hashCode() * 31, 31, this.f25544b), 31, this.f25545c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25543a);
        parcel.writeString(this.f25544b);
        parcel.writeString(this.f25545c);
        parcel.writeParcelable(this.f25546d, i);
    }
}
