package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fq00 implements Parcelable {
    public static final Parcelable.Creator<fq00> CREATOR = new k700(15);

    /* JADX INFO: renamed from: a */
    public final String f72029a;

    /* JADX INFO: renamed from: b */
    public final String f72030b;

    /* JADX INFO: renamed from: c */
    public final String f72031c;

    public fq00(String str, String str2, String str3) {
        this.f72029a = str;
        this.f72030b = str2;
        this.f72031c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m42390c() {
        return this.f72030b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq00)) {
            return false;
        }
        fq00 fq00Var = (fq00) obj;
        return wj50.m88271j(this.f72029a, fq00Var.f72029a) && wj50.m88271j(this.f72030b, fq00Var.f72030b) && wj50.m88271j(this.f72031c, fq00Var.f72031c);
    }

    public final String getUri() {
        return this.f72029a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f72029a.hashCode() * 31, 31, this.f72030b);
        String str = this.f72031c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f72029a);
        parcel.writeString(this.f72030b);
        parcel.writeString(this.f72031c);
    }
}
