package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rb41 implements ub41 {
    public static final Parcelable.Creator<rb41> CREATOR = new ln31(22);

    /* JADX INFO: renamed from: a */
    public final e1e f197459a;

    /* JADX INFO: renamed from: b */
    public final String f197460b;

    public rb41(e1e e1eVar, String str) {
        this.f197459a = e1eVar;
        this.f197460b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb41)) {
            return false;
        }
        rb41 rb41Var = (rb41) obj;
        return wj50.m88271j(this.f197459a, rb41Var.f197459a) && wj50.m88271j(this.f197460b, rb41Var.f197460b);
    }

    @Override // p204p.ub41
    public final e1e getSource() {
        return this.f197459a;
    }

    public final int hashCode() {
        return this.f197460b.hashCode() + (this.f197459a.hashCode() * 31);
    }

    @Override // p204p.ub41
    /* JADX INFO: renamed from: m0 */
    public final String mo75140m0() {
        return this.f197460b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f197459a, i);
        parcel.writeString(this.f197460b);
    }
}
