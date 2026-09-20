package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class iu01 implements Parcelable {
    public static final Parcelable.Creator<iu01> CREATOR = new sp01(22);

    /* JADX INFO: renamed from: a */
    public final Uri f105803a;

    /* JADX INFO: renamed from: b */
    public final String f105804b;

    /* JADX INFO: renamed from: c */
    public final ntd0 f105805c;

    /* JADX INFO: renamed from: d */
    public final Long f105806d;

    /* JADX INFO: renamed from: e */
    public final long f105807e;

    /* JADX INFO: renamed from: f */
    public final long f105808f;

    /* JADX INFO: renamed from: g */
    public final aob1 f105809g;

    /* JADX INFO: renamed from: h */
    public final boolean f105810h;

    public iu01(Uri uri, String str, ntd0 ntd0Var, Long l, long j, long j2, aob1 aob1Var, boolean z) {
        this.f105803a = uri;
        this.f105804b = str;
        this.f105805c = ntd0Var;
        this.f105806d = l;
        this.f105807e = j;
        this.f105808f = j2;
        this.f105809g = aob1Var;
        this.f105810h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu01)) {
            return false;
        }
        iu01 iu01Var = (iu01) obj;
        return wj50.m88271j(this.f105803a, iu01Var.f105803a) && wj50.m88271j(this.f105804b, iu01Var.f105804b) && this.f105805c == iu01Var.f105805c && wj50.m88271j(this.f105806d, iu01Var.f105806d) && this.f105807e == iu01Var.f105807e && this.f105808f == iu01Var.f105808f && wj50.m88271j(this.f105809g, iu01Var.f105809g) && this.f105810h == iu01Var.f105810h;
    }

    public final int hashCode() {
        int iHashCode = (this.f105805c.hashCode() + s571.m77243b(this.f105803a.hashCode() * 31, 31, this.f105804b)) * 31;
        Long l = this.f105806d;
        return Boolean.hashCode(this.f105810h) + ((this.f105809g.hashCode() + dq60.m36605e(dq60.m36605e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.f105807e, 31), this.f105808f, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f105803a, i);
        parcel.writeString(this.f105804b);
        this.f105805c.writeToParcel(parcel, i);
        Long l = this.f105806d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
        parcel.writeLong(this.f105807e);
        parcel.writeLong(this.f105808f);
        parcel.writeParcelable(this.f105809g, i);
        parcel.writeInt(this.f105810h ? 1 : 0);
    }
}
