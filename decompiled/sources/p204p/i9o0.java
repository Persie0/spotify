package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class i9o0 implements Parcelable {
    public static final Parcelable.Creator<i9o0> CREATOR = new o2o0(8);

    /* JADX INFO: renamed from: a */
    public final h9o0 f100051a;

    /* JADX INFO: renamed from: b */
    public final String f100052b;

    /* JADX INFO: renamed from: c */
    public final String f100053c;

    /* JADX INFO: renamed from: d */
    public final String f100054d;

    /* JADX INFO: renamed from: e */
    public final boolean f100055e;

    public i9o0(String str, String str2, String str3, h9o0 h9o0Var, boolean z) {
        this.f100051a = h9o0Var;
        this.f100052b = str;
        this.f100053c = str2;
        this.f100054d = str3;
        this.f100055e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9o0)) {
            return false;
        }
        i9o0 i9o0Var = (i9o0) obj;
        return wj50.m88271j(this.f100051a, i9o0Var.f100051a) && wj50.m88271j(this.f100052b, i9o0Var.f100052b) && wj50.m88271j(this.f100053c, i9o0Var.f100053c) && wj50.m88271j(this.f100054d, i9o0Var.f100054d) && this.f100055e == i9o0Var.f100055e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100055e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f100051a.hashCode() * 31, 31, this.f100052b), 31, this.f100053c), 31, this.f100054d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100051a, i);
        parcel.writeString(this.f100052b);
        parcel.writeString(this.f100053c);
        parcel.writeString(this.f100054d);
        parcel.writeInt(this.f100055e ? 1 : 0);
    }
}
