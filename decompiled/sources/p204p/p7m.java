package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class p7m implements Parcelable {
    public static final Parcelable.Creator<p7m> CREATOR = new pkl(11);

    /* JADX INFO: renamed from: a */
    public final String f174718a;

    /* JADX INFO: renamed from: b */
    public final String f174719b;

    /* JADX INFO: renamed from: c */
    public final String f174720c;

    /* JADX INFO: renamed from: d */
    public final String f174721d;

    /* JADX INFO: renamed from: e */
    public final Uri f174722e;

    /* JADX INFO: renamed from: f */
    public final String f174723f;

    public p7m(Uri uri, String str, String str2, String str3, String str4, String str5) {
        this.f174718a = str;
        this.f174719b = str2;
        this.f174720c = str3;
        this.f174721d = str4;
        this.f174722e = uri;
        this.f174723f = str5;
    }

    /* JADX INFO: renamed from: c */
    public final String m69281c() {
        return this.f174718a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7m)) {
            return false;
        }
        p7m p7mVar = (p7m) obj;
        return wj50.m88271j(this.f174718a, p7mVar.f174718a) && wj50.m88271j(this.f174719b, p7mVar.f174719b) && wj50.m88271j(this.f174720c, p7mVar.f174720c) && wj50.m88271j(this.f174721d, p7mVar.f174721d) && wj50.m88271j(this.f174722e, p7mVar.f174722e) && wj50.m88271j(this.f174723f, p7mVar.f174723f);
    }

    /* JADX INFO: renamed from: g */
    public final String m69282g() {
        return this.f174719b;
    }

    public final int hashCode() {
        return this.f174723f.hashCode() + nap.m64019l(this.f174722e, s571.m77243b(s571.m77243b(s571.m77243b(this.f174718a.hashCode() * 31, 31, this.f174719b), 31, this.f174720c), 31, this.f174721d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f174718a);
        parcel.writeString(this.f174719b);
        parcel.writeString(this.f174720c);
        parcel.writeString(this.f174721d);
        parcel.writeParcelable(this.f174722e, i);
        parcel.writeString(this.f174723f);
    }
}
