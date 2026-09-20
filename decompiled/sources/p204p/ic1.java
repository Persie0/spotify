package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ic1 implements Parcelable {
    public static final Parcelable.Creator<ic1> CREATOR = new g11(17);

    /* JADX INFO: renamed from: a */
    public final String f100705a;

    public ic1(String str) {
        this.f100705a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic1) && wj50.m88271j(this.f100705a, ((ic1) obj).f100705a);
    }

    public final int hashCode() {
        return this.f100705a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f100705a);
    }
}
