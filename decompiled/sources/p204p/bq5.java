package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class bq5 implements Parcelable {
    public static final Parcelable.Creator<bq5> CREATOR = new vp5(2);

    /* JADX INFO: renamed from: a */
    public final String f29676a;

    /* JADX INFO: renamed from: b */
    public final String f29677b;

    /* JADX INFO: renamed from: c */
    public final String f29678c;

    public bq5(String str, String str2, String str3) {
        this.f29676a = str;
        this.f29677b = str2;
        this.f29678c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq5)) {
            return false;
        }
        bq5 bq5Var = (bq5) obj;
        return wj50.m88271j(this.f29676a, bq5Var.f29676a) && wj50.m88271j(this.f29677b, bq5Var.f29677b) && wj50.m88271j(this.f29678c, bq5Var.f29678c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f29676a.hashCode() * 31, 31, this.f29677b);
        String str = this.f29678c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29676a);
        parcel.writeString(this.f29677b);
        parcel.writeString(this.f29678c);
    }
}
