package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class xxz implements Parcelable {
    public static final Parcelable.Creator<xxz> CREATOR = new ygz(17);

    /* JADX INFO: renamed from: a */
    public final boolean f267161a;

    /* JADX INFO: renamed from: b */
    public final boolean f267162b;

    /* JADX INFO: renamed from: c */
    public final int f267163c;

    /* JADX INFO: renamed from: d */
    public final int f267164d;

    public xxz(int i, int i2, boolean z, boolean z2) {
        this.f267161a = z;
        this.f267162b = z2;
        this.f267163c = i;
        this.f267164d = i2;
    }

    /* JADX INFO: renamed from: c */
    public static xxz m92383c(xxz xxzVar, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = xxzVar.f267161a;
        }
        boolean z2 = xxzVar.f267162b;
        int i3 = xxzVar.f267163c;
        if ((i2 & 8) != 0) {
            i = xxzVar.f267164d;
        }
        xxzVar.getClass();
        return new xxz(i3, i, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxz)) {
            return false;
        }
        xxz xxzVar = (xxz) obj;
        return this.f267161a == xxzVar.f267161a && this.f267162b == xxzVar.f267162b && this.f267163c == xxzVar.f267163c && this.f267164d == xxzVar.f267164d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m92384g() {
        return this.f267162b;
    }

    /* JADX INFO: renamed from: h */
    public final int m92385h() {
        return this.f267163c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f267164d) + mt60.m62800g(this.f267163c, s571.m77245d(Boolean.hashCode(this.f267161a) * 31, 31, this.f267162b), 31);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m92386j() {
        return this.f267161a;
    }

    /* JADX INFO: renamed from: k */
    public final int m92387k() {
        return this.f267164d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f267161a ? 1 : 0);
        parcel.writeInt(this.f267162b ? 1 : 0);
        parcel.writeInt(this.f267163c);
        parcel.writeInt(this.f267164d);
    }

    public /* synthetic */ xxz(int i, int i2) {
        this((i2 & 4) != 0 ? 0 : i, 0, false, false);
    }
}
