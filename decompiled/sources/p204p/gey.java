package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class gey extends AbstractC2206o9 {
    public static final Parcelable.Creator<gey> CREATOR = new c5f1(23);

    /* JADX INFO: renamed from: a */
    public final String f79230a;

    /* JADX INFO: renamed from: b */
    public final int f79231b;

    /* JADX INFO: renamed from: c */
    public final long f79232c;

    /* JADX INFO: renamed from: d */
    public final boolean f79233d;

    public gey(String str, int i, long j, boolean z) {
        this.f79230a = str;
        this.f79231b = i;
        this.f79232c = j;
        this.f79233d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gey) {
            gey geyVar = (gey) obj;
            if (mvl0.m62956s(this.f79230a, geyVar.f79230a) && m44535k() == geyVar.m44535k() && this.f79233d == geyVar.f79233d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return mvl0.m62961x(this.f79230a, Long.valueOf(m44535k()), Boolean.valueOf(this.f79233d));
    }

    /* JADX INFO: renamed from: k */
    public final long m44535k() {
        long j = this.f79232c;
        return j == -1 ? this.f79231b : j;
    }

    public final String toString() {
        a9i0 a9i0VarM62936D = mvl0.m62936D(this);
        a9i0VarM62936D.m25120b(this.f79230a, "name");
        a9i0VarM62936D.m25120b(Long.valueOf(m44535k()), "version");
        a9i0VarM62936D.m25120b(Boolean.valueOf(this.f79233d), "is_fully_rolled_out");
        return a9i0VarM62936D.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26308N(parcel, 1, this.f79230a);
        alf1.m26302H(parcel, 2, this.f79231b);
        alf1.m26305K(parcel, 3, m44535k());
        alf1.m26295A(parcel, 4, this.f79233d);
        alf1.m26331n(iM26329l, parcel);
    }

    public gey(String str, long j) {
        this(str, -1, j, false);
    }
}
