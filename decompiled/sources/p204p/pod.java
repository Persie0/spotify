package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pod implements Parcelable {
    public static final Parcelable.Creator<pod> CREATOR = new fjd(9);

    /* JADX INFO: renamed from: a */
    public final String f179675a;

    /* JADX INFO: renamed from: b */
    public final String f179676b;

    /* JADX INFO: renamed from: c */
    public final String f179677c;

    public pod(String str, String str2, String str3) {
        this.f179675a = str;
        this.f179676b = str2;
        this.f179677c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pod)) {
            return false;
        }
        pod podVar = (pod) obj;
        return wj50.m88271j(this.f179675a, podVar.f179675a) && wj50.m88271j(this.f179676b, podVar.f179676b) && wj50.m88271j(this.f179677c, podVar.f179677c);
    }

    public final int hashCode() {
        return this.f179677c.hashCode() + s571.m77243b(this.f179675a.hashCode() * 31, 31, this.f179676b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f179675a);
        parcel.writeString(this.f179676b);
        parcel.writeString(this.f179677c);
    }
}
