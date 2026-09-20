package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ct5 implements Parcelable {
    public static final Parcelable.Creator<ct5> CREATOR = new vp5(4);

    /* JADX INFO: renamed from: a */
    public final String f41770a;

    /* JADX INFO: renamed from: b */
    public final String f41771b;

    /* JADX INFO: renamed from: c */
    public final String f41772c;

    /* JADX INFO: renamed from: d */
    public final String f41773d;

    /* JADX INFO: renamed from: e */
    public final String f41774e;

    /* JADX INFO: renamed from: f */
    public final boolean f41775f;

    public ct5(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f41770a = str;
        this.f41771b = str2;
        this.f41772c = str3;
        this.f41773d = str4;
        this.f41774e = str5;
        this.f41775f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct5)) {
            return false;
        }
        ct5 ct5Var = (ct5) obj;
        return wj50.m88271j(this.f41770a, ct5Var.f41770a) && wj50.m88271j(this.f41771b, ct5Var.f41771b) && wj50.m88271j(this.f41772c, ct5Var.f41772c) && wj50.m88271j(this.f41773d, ct5Var.f41773d) && wj50.m88271j(this.f41774e, ct5Var.f41774e) && this.f41775f == ct5Var.f41775f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41775f) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f41770a.hashCode() * 31, 31, this.f41771b), 31, this.f41772c), 31, this.f41773d), 31, this.f41774e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41770a);
        parcel.writeString(this.f41771b);
        parcel.writeString(this.f41772c);
        parcel.writeString(this.f41773d);
        parcel.writeString(this.f41774e);
        parcel.writeInt(this.f41775f ? 1 : 0);
    }
}
