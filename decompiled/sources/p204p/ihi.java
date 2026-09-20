package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ihi implements Parcelable {
    public static final Parcelable.Creator<ihi> CREATOR = new f2i(4);

    /* JADX INFO: renamed from: a */
    public final String f102294a;

    /* JADX INFO: renamed from: b */
    public final boolean f102295b;

    /* JADX INFO: renamed from: c */
    public final u300 f102296c;

    public ihi(String str, boolean z, u300 u300Var) {
        this.f102294a = str;
        this.f102295b = z;
        this.f102296c = u300Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihi)) {
            return false;
        }
        ihi ihiVar = (ihi) obj;
        return wj50.m88271j(this.f102294a, ihiVar.f102294a) && this.f102295b == ihiVar.f102295b && this.f102296c == ihiVar.f102296c;
    }

    public final int hashCode() {
        return this.f102296c.hashCode() + s571.m77245d(this.f102294a.hashCode() * 31, 31, this.f102295b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f102294a);
        parcel.writeInt(this.f102295b ? 1 : 0);
        parcel.writeString(this.f102296c.name());
    }
}
