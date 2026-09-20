package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ic01 implements Parcelable {
    public static final Parcelable.Creator<ic01> CREATOR = new vcz0(19);

    /* JADX INFO: renamed from: a */
    public final String f100703a;

    /* JADX INFO: renamed from: b */
    public final String f100704b;

    public ic01(String str, String str2) {
        this.f100703a = str;
        this.f100704b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic01)) {
            return false;
        }
        ic01 ic01Var = (ic01) obj;
        return wj50.m88271j(this.f100703a, ic01Var.f100703a) && wj50.m88271j(this.f100704b, ic01Var.f100704b);
    }

    public final String getUri() {
        return this.f100703a;
    }

    public final int hashCode() {
        return this.f100704b.hashCode() + (this.f100703a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f100703a);
        parcel.writeString(this.f100704b);
    }
}
