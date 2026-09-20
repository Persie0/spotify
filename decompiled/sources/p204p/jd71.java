package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jd71 implements Parcelable {
    public static final Parcelable.Creator<jd71> CREATOR = new c071(7);

    /* JADX INFO: renamed from: a */
    public final long f111278a;

    /* JADX INFO: renamed from: b */
    public final long f111279b;

    /* JADX INFO: renamed from: c */
    public final String f111280c;

    /* JADX INFO: renamed from: d */
    public final String f111281d;

    /* JADX INFO: renamed from: e */
    public final List f111282e;

    public jd71(long j, long j2, String str, String str2, List list) {
        this.f111278a = j;
        this.f111279b = j2;
        this.f111280c = str;
        this.f111281d = str2;
        this.f111282e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd71)) {
            return false;
        }
        jd71 jd71Var = (jd71) obj;
        return this.f111278a == jd71Var.f111278a && this.f111279b == jd71Var.f111279b && wj50.m88271j(this.f111280c, jd71Var.f111280c) && wj50.m88271j(this.f111281d, jd71Var.f111281d) && wj50.m88271j(this.f111282e, jd71Var.f111282e);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(Long.hashCode(this.f111278a) * 31, this.f111279b, 31);
        String str = this.f111280c;
        return this.f111282e.hashCode() + s571.m77243b((iM36605e + (str == null ? 0 : str.hashCode())) * 31, 31, this.f111281d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f111278a);
        parcel.writeLong(this.f111279b);
        parcel.writeString(this.f111280c);
        parcel.writeString(this.f111281d);
        Iterator itM42468l = fr0.m42468l(parcel, this.f111282e);
        while (itM42468l.hasNext()) {
            ((as20) itM42468l.next()).writeToParcel(parcel, i);
        }
    }
}
