package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class gdj0 implements Parcelable {
    public static final Parcelable.Creator<gdj0> CREATOR = new rri0(24);

    /* JADX INFO: renamed from: a */
    public final int f78882a;

    /* JADX INFO: renamed from: b */
    public final String f78883b;

    /* JADX INFO: renamed from: c */
    public final String f78884c;

    /* JADX INFO: renamed from: d */
    public final boolean f78885d;

    /* JADX INFO: renamed from: e */
    public final taj0 f78886e;

    public gdj0(int i, String str, String str2, boolean z, taj0 taj0Var) {
        this.f78882a = i;
        this.f78883b = str;
        this.f78884c = str2;
        this.f78885d = z;
        this.f78886e = taj0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdj0)) {
            return false;
        }
        gdj0 gdj0Var = (gdj0) obj;
        return this.f78882a == gdj0Var.f78882a && wj50.m88271j(this.f78883b, gdj0Var.f78883b) && wj50.m88271j(this.f78884c, gdj0Var.f78884c) && this.f78885d == gdj0Var.f78885d && wj50.m88271j(this.f78886e, gdj0Var.f78886e);
    }

    public final int hashCode() {
        return this.f78886e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(Integer.hashCode(this.f78882a) * 31, 31, this.f78883b), 31, this.f78884c), 31, this.f78885d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f78882a);
        parcel.writeString(this.f78883b);
        parcel.writeString(this.f78884c);
        parcel.writeInt(this.f78885d ? 1 : 0);
        parcel.writeParcelable(this.f78886e, i);
    }
}
