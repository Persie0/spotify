package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class qsz implements Parcelable {
    public static final Parcelable.Creator<qsz> CREATOR = new ygz(14);

    /* JADX INFO: renamed from: a */
    public final String f192233a;

    /* JADX INFO: renamed from: b */
    public final gn80 f192234b;

    /* JADX INFO: renamed from: c */
    public final String f192235c;

    /* JADX INFO: renamed from: d */
    public final String f192236d;

    /* JADX INFO: renamed from: e */
    public final String f192237e;

    public qsz(String str, gn80 gn80Var, String str2, String str3, String str4) {
        this.f192233a = str;
        this.f192234b = gn80Var;
        this.f192235c = str2;
        this.f192236d = str3;
        this.f192237e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsz)) {
            return false;
        }
        qsz qszVar = (qsz) obj;
        return wj50.m88271j(this.f192233a, qszVar.f192233a) && this.f192234b == qszVar.f192234b && wj50.m88271j(this.f192235c, qszVar.f192235c) && wj50.m88271j(this.f192236d, qszVar.f192236d) && wj50.m88271j(this.f192237e, qszVar.f192237e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f192234b.hashCode() + (this.f192233a.hashCode() * 31)) * 31, 31, this.f192235c);
        String str = this.f192236d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f192237e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f192233a);
        parcel.writeString(this.f192234b.name());
        parcel.writeString(this.f192235c);
        parcel.writeString(this.f192236d);
        parcel.writeString(this.f192237e);
    }
}
