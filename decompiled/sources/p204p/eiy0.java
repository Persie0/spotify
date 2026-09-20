package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class eiy0 implements Parcelable {
    public static final Parcelable.Creator<eiy0> CREATOR = new csx0(17);

    /* JADX INFO: renamed from: a */
    public final String f60060a;

    /* JADX INFO: renamed from: b */
    public final String f60061b;

    /* JADX INFO: renamed from: c */
    public final String f60062c;

    /* JADX INFO: renamed from: d */
    public final String f60063d;

    /* JADX INFO: renamed from: e */
    public final String f60064e;

    /* JADX INFO: renamed from: f */
    public final String f60065f;

    /* JADX INFO: renamed from: g */
    public final String f60066g;

    public eiy0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f60060a = str;
        this.f60061b = str2;
        this.f60062c = str3;
        this.f60063d = str4;
        this.f60064e = str5;
        this.f60065f = str6;
        this.f60066g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiy0)) {
            return false;
        }
        eiy0 eiy0Var = (eiy0) obj;
        return wj50.m88271j(this.f60060a, eiy0Var.f60060a) && wj50.m88271j(this.f60061b, eiy0Var.f60061b) && wj50.m88271j(this.f60062c, eiy0Var.f60062c) && wj50.m88271j(this.f60063d, eiy0Var.f60063d) && wj50.m88271j(this.f60064e, eiy0Var.f60064e) && wj50.m88271j(this.f60065f, eiy0Var.f60065f) && wj50.m88271j(this.f60066g, eiy0Var.f60066g);
    }

    public final int hashCode() {
        return this.f60066g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f60060a.hashCode() * 31, 31, this.f60061b), 31, this.f60062c), 31, this.f60063d), 31, this.f60064e), 31, this.f60065f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60060a);
        parcel.writeString(this.f60061b);
        parcel.writeString(this.f60062c);
        parcel.writeString(this.f60063d);
        parcel.writeString(this.f60064e);
        parcel.writeString(this.f60065f);
        parcel.writeString(this.f60066g);
    }
}
