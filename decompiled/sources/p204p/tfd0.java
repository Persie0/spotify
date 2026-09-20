package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tfd0 implements Parcelable {
    public static final Parcelable.Creator<tfd0> CREATOR = new jfd0(0);

    /* JADX INFO: renamed from: a */
    public final long f219919a;

    /* JADX INFO: renamed from: b */
    public final Uri f219920b;

    /* JADX INFO: renamed from: c */
    public final long f219921c;

    /* JADX INFO: renamed from: d */
    public final int f219922d;

    /* JADX INFO: renamed from: e */
    public final int f219923e;

    /* JADX INFO: renamed from: f */
    public final wxd0 f219924f;

    /* JADX INFO: renamed from: g */
    public final long f219925g;

    /* JADX INFO: renamed from: h */
    public final long f219926h;

    public tfd0(long j, Uri uri, long j2, int i, int i2, wxd0 wxd0Var, long j3, long j4) {
        this.f219919a = j;
        this.f219920b = uri;
        this.f219921c = j2;
        this.f219922d = i;
        this.f219923e = i2;
        this.f219924f = wxd0Var;
        this.f219925g = j3;
        this.f219926h = j4;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m80639c() {
        return this.f219920b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfd0)) {
            return false;
        }
        tfd0 tfd0Var = (tfd0) obj;
        return this.f219919a == tfd0Var.f219919a && wj50.m88271j(this.f219920b, tfd0Var.f219920b) && this.f219921c == tfd0Var.f219921c && this.f219922d == tfd0Var.f219922d && this.f219923e == tfd0Var.f219923e && this.f219924f == tfd0Var.f219924f && this.f219925g == tfd0Var.f219925g && this.f219926h == tfd0Var.f219926h;
    }

    /* JADX INFO: renamed from: g */
    public final long m80640g() {
        return this.f219926h;
    }

    /* JADX INFO: renamed from: h */
    public final wxd0 m80641h() {
        return this.f219924f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f219926h) + dq60.m36605e((this.f219924f.hashCode() + mt60.m62800g(this.f219923e, mt60.m62800g(this.f219922d, dq60.m36605e(nap.m64019l(this.f219920b, Long.hashCode(this.f219919a) * 31, 31), this.f219921c, 31), 31), 31)) * 31, this.f219925g, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f219919a);
        parcel.writeParcelable(this.f219920b, i);
        parcel.writeLong(this.f219921c);
        parcel.writeInt(this.f219922d);
        parcel.writeInt(this.f219923e);
        parcel.writeString(this.f219924f.name());
        parcel.writeLong(this.f219925g);
        parcel.writeLong(this.f219926h);
    }
}
