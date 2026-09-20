package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cc00 implements Parcelable {
    public static final Parcelable.Creator<cc00> CREATOR = new k700(1);

    /* JADX INFO: renamed from: a */
    public final String f36275a;

    /* JADX INFO: renamed from: b */
    public final String f36276b;

    /* JADX INFO: renamed from: c */
    public final String f36277c;

    public cc00(String str, String str2, String str3) {
        this.f36275a = str;
        this.f36276b = str2;
        this.f36277c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc00)) {
            return false;
        }
        cc00 cc00Var = (cc00) obj;
        return wj50.m88271j(this.f36275a, cc00Var.f36275a) && wj50.m88271j(this.f36276b, cc00Var.f36276b) && wj50.m88271j(this.f36277c, cc00Var.f36277c);
    }

    public final int hashCode() {
        return this.f36277c.hashCode() + s571.m77243b(this.f36275a.hashCode() * 31, 31, this.f36276b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36275a);
        parcel.writeString(this.f36276b);
        parcel.writeString(this.f36277c);
    }
}
