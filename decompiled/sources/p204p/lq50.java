package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lq50 implements br50, Parcelable {
    public static final Parcelable.Creator<lq50> CREATOR = new gd50(28);

    /* JADX INFO: renamed from: a */
    public final String f135951a;

    /* JADX INFO: renamed from: b */
    public final String f135952b;

    /* JADX INFO: renamed from: c */
    public final String f135953c;

    public lq50(String str, String str2, String str3) {
        this.f135951a = str;
        this.f135952b = str2;
        this.f135953c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq50)) {
            return false;
        }
        lq50 lq50Var = (lq50) obj;
        return wj50.m88271j(this.f135951a, lq50Var.f135951a) && wj50.m88271j(this.f135952b, lq50Var.f135952b) && wj50.m88271j(this.f135953c, lq50Var.f135953c);
    }

    @Override // p204p.br50
    public final String getImageUri() {
        return this.f135953c;
    }

    @Override // p204p.br50
    public final String getName() {
        return this.f135952b;
    }

    @Override // p204p.br50
    public final String getUri() {
        return this.f135951a;
    }

    public final int hashCode() {
        return this.f135953c.hashCode() + s571.m77243b(this.f135951a.hashCode() * 31, 31, this.f135952b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f135951a);
        parcel.writeString(this.f135952b);
        parcel.writeString(this.f135953c);
    }
}
