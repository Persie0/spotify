package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class cr41 implements iet0 {
    public static final Parcelable.Creator<cr41> CREATOR = new tj41(9);

    /* JADX INFO: renamed from: a */
    public final int f41185a;

    /* JADX INFO: renamed from: b */
    public final String f41186b;

    /* JADX INFO: renamed from: c */
    public final String f41187c;

    /* JADX INFO: renamed from: d */
    public final String f41188d;

    /* JADX INFO: renamed from: e */
    public final String f41189e;

    public cr41(int i, String str, String str2, String str3, String str4) {
        this.f41185a = i;
        this.f41186b = str;
        this.f41187c = str2;
        this.f41188d = str3;
        this.f41189e = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f41185a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr41)) {
            return false;
        }
        cr41 cr41Var = (cr41) obj;
        return this.f41185a == cr41Var.f41185a && wj50.m88271j(this.f41186b, cr41Var.f41186b) && wj50.m88271j(this.f41187c, cr41Var.f41187c) && wj50.m88271j(this.f41188d, cr41Var.f41188d) && wj50.m88271j(this.f41189e, cr41Var.f41189e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f41185a) * 31, 31, this.f41186b), 31, this.f41187c), 31, this.f41188d);
        String str = this.f41189e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41185a);
        parcel.writeString(this.f41186b);
        parcel.writeString(this.f41187c);
        parcel.writeString(this.f41188d);
        parcel.writeString(this.f41189e);
    }
}
