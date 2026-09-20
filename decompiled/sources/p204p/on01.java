package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class on01 implements Parcelable {
    public static final Parcelable.Creator<on01> CREATOR = new vj01(11);

    /* JADX INFO: renamed from: a */
    public final String f167129a;

    /* JADX INFO: renamed from: b */
    public final String f167130b;

    /* JADX INFO: renamed from: c */
    public final String f167131c;

    /* JADX INFO: renamed from: d */
    public final String f167132d;

    /* JADX INFO: renamed from: e */
    public final String f167133e;

    /* JADX INFO: renamed from: f */
    public final String f167134f;

    public on01(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f167129a = str;
        this.f167130b = str2;
        this.f167131c = str3;
        this.f167132d = str4;
        this.f167133e = str5;
        this.f167134f = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on01)) {
            return false;
        }
        on01 on01Var = (on01) obj;
        return wj50.m88271j(this.f167129a, on01Var.f167129a) && wj50.m88271j(this.f167130b, on01Var.f167130b) && wj50.m88271j(this.f167131c, on01Var.f167131c) && wj50.m88271j(this.f167132d, on01Var.f167132d) && wj50.m88271j(this.f167133e, on01Var.f167133e) && wj50.m88271j(this.f167134f, on01Var.f167134f);
    }

    public final int hashCode() {
        String str = this.f167129a;
        return this.f167134f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f167130b), 31, this.f167131c), 31, this.f167132d), 31, this.f167133e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f167129a);
        parcel.writeString(this.f167130b);
        parcel.writeString(this.f167131c);
        parcel.writeString(this.f167132d);
        parcel.writeString(this.f167133e);
        parcel.writeString(this.f167134f);
    }
}
