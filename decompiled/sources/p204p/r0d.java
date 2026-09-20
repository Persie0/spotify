package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class r0d implements m6k {
    public static final Parcelable.Creator<r0d> CREATOR = new qvc(9);

    /* JADX INFO: renamed from: a */
    public final String f194431a;

    /* JADX INFO: renamed from: b */
    public final String f194432b;

    /* JADX INFO: renamed from: c */
    public final String f194433c;

    /* JADX INFO: renamed from: d */
    public final boolean f194434d;

    /* JADX INFO: renamed from: e */
    public final boolean f194435e;

    /* JADX INFO: renamed from: f */
    public final boolean f194436f;

    /* JADX INFO: renamed from: g */
    public final boolean f194437g;

    public r0d(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f194431a = str;
        this.f194432b = str2;
        this.f194433c = str3;
        this.f194434d = z;
        this.f194435e = z2;
        this.f194436f = z3;
        this.f194437g = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0d)) {
            return false;
        }
        r0d r0dVar = (r0d) obj;
        return wj50.m88271j(this.f194431a, r0dVar.f194431a) && wj50.m88271j(this.f194432b, r0dVar.f194432b) && wj50.m88271j(this.f194433c, r0dVar.f194433c) && this.f194434d == r0dVar.f194434d && this.f194435e == r0dVar.f194435e && this.f194436f == r0dVar.f194436f && this.f194437g == r0dVar.f194437g;
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194437g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f194431a.hashCode() * 31, 31, this.f194432b), 31, this.f194433c), 31, this.f194434d), 31, this.f194435e), 31, this.f194436f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f194431a);
        parcel.writeString(this.f194432b);
        parcel.writeString(this.f194433c);
        parcel.writeInt(this.f194434d ? 1 : 0);
        parcel.writeInt(this.f194435e ? 1 : 0);
        parcel.writeInt(this.f194436f ? 1 : 0);
        parcel.writeInt(this.f194437g ? 1 : 0);
    }
}
