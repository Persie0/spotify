package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class fgr implements Parcelable {
    public static final Parcelable.Creator<fgr> CREATOR = new o5r(8);

    /* JADX INFO: renamed from: a */
    public final boolean f69386a;

    /* JADX INFO: renamed from: b */
    public final boolean f69387b;

    /* JADX INFO: renamed from: c */
    public final f5r f69388c;

    /* JADX INFO: renamed from: d */
    public final a1x0 f69389d;

    /* JADX INFO: renamed from: e */
    public final boolean f69390e;

    /* JADX INFO: renamed from: f */
    public final boolean f69391f;

    /* JADX INFO: renamed from: g */
    public final long f69392g;

    public fgr(boolean z, boolean z2, f5r f5rVar, a1x0 a1x0Var, boolean z3, boolean z4, long j) {
        this.f69386a = z;
        this.f69387b = z2;
        this.f69388c = f5rVar;
        this.f69389d = a1x0Var;
        this.f69390e = z3;
        this.f69391f = z4;
        this.f69392g = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgr)) {
            return false;
        }
        fgr fgrVar = (fgr) obj;
        return this.f69386a == fgrVar.f69386a && this.f69387b == fgrVar.f69387b && wj50.m88271j(this.f69388c, fgrVar.f69388c) && wj50.m88271j(this.f69389d, fgrVar.f69389d) && this.f69390e == fgrVar.f69390e && this.f69391f == fgrVar.f69391f && this.f69392g == fgrVar.f69392g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69392g) + s571.m77245d(s571.m77245d((this.f69389d.hashCode() + ((this.f69388c.hashCode() + s571.m77245d(Boolean.hashCode(this.f69386a) * 31, 31, this.f69387b)) * 31)) * 31, 31, this.f69390e), 31, this.f69391f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f69386a ? 1 : 0);
        parcel.writeInt(this.f69387b ? 1 : 0);
        this.f69388c.writeToParcel(parcel, i);
        this.f69389d.writeToParcel(parcel, i);
        parcel.writeInt(this.f69390e ? 1 : 0);
        parcel.writeInt(this.f69391f ? 1 : 0);
        parcel.writeLong(this.f69392g);
    }
}
