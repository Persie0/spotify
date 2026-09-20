package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sb41 implements ub41 {
    public static final Parcelable.Creator<sb41> CREATOR = new ln31(23);

    /* JADX INFO: renamed from: a */
    public final e1e f207349a;

    /* JADX INFO: renamed from: b */
    public final String f207350b;

    /* JADX INFO: renamed from: c */
    public final String f207351c;

    public sb41(e1e e1eVar, String str, String str2) {
        this.f207349a = e1eVar;
        this.f207350b = str;
        this.f207351c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb41)) {
            return false;
        }
        sb41 sb41Var = (sb41) obj;
        return wj50.m88271j(this.f207349a, sb41Var.f207349a) && wj50.m88271j(this.f207350b, sb41Var.f207350b) && wj50.m88271j(this.f207351c, sb41Var.f207351c);
    }

    @Override // p204p.ub41
    public final e1e getSource() {
        return this.f207349a;
    }

    public final int hashCode() {
        return this.f207351c.hashCode() + s571.m77243b(this.f207349a.hashCode() * 31, 31, this.f207350b);
    }

    @Override // p204p.ub41
    /* JADX INFO: renamed from: m0 */
    public final String mo75140m0() {
        return this.f207350b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f207349a, i);
        parcel.writeString(this.f207350b);
        parcel.writeString(this.f207351c);
    }
}
