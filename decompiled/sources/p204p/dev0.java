package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class dev0 implements Parcelable {
    public static final Parcelable.Creator<dev0> CREATOR = new h1v0(9);

    /* JADX INFO: renamed from: a */
    public final String f48178a;

    /* JADX INFO: renamed from: b */
    public final String f48179b;

    /* JADX INFO: renamed from: c */
    public final String f48180c;

    /* JADX INFO: renamed from: d */
    public final String f48181d;

    /* JADX INFO: renamed from: e */
    public final Uri f48182e;

    public dev0(String str, String str2, String str3, String str4, Uri uri) {
        this.f48178a = str;
        this.f48179b = str2;
        this.f48180c = str3;
        this.f48181d = str4;
        this.f48182e = uri;
    }

    /* JADX INFO: renamed from: c */
    public static dev0 m35834c(dev0 dev0Var, String str, String str2, int i) {
        String str3 = dev0Var.f48178a;
        String str4 = dev0Var.f48179b;
        if ((i & 4) != 0) {
            str = dev0Var.f48180c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = dev0Var.f48181d;
        }
        return new dev0(str3, str4, str5, str2, dev0Var.f48182e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev0)) {
            return false;
        }
        dev0 dev0Var = (dev0) obj;
        return wj50.m88271j(this.f48178a, dev0Var.f48178a) && wj50.m88271j(this.f48179b, dev0Var.f48179b) && wj50.m88271j(this.f48180c, dev0Var.f48180c) && wj50.m88271j(this.f48181d, dev0Var.f48181d) && wj50.m88271j(this.f48182e, dev0Var.f48182e);
    }

    /* JADX INFO: renamed from: g */
    public final String m35835g() {
        return this.f48180c;
    }

    public final String getTitle() {
        return this.f48178a;
    }

    /* JADX INFO: renamed from: h */
    public final String m35836h() {
        return this.f48181d;
    }

    public final int hashCode() {
        return this.f48182e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f48178a.hashCode() * 31, 31, this.f48179b), 31, this.f48180c), 31, this.f48181d);
    }

    /* JADX INFO: renamed from: j */
    public final String m35837j() {
        return this.f48179b;
    }

    /* JADX INFO: renamed from: k */
    public final Uri m35838k() {
        return this.f48182e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f48178a);
        parcel.writeString(this.f48179b);
        parcel.writeString(this.f48180c);
        parcel.writeString(this.f48181d);
        parcel.writeParcelable(this.f48182e, i);
    }

    public /* synthetic */ dev0(Uri uri, String str, String str2, String str3) {
        this(str, str2, str3, "", uri);
    }
}
