package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class opj implements Parcelable {
    public static final Parcelable.Creator<opj> CREATOR = new dnj(10);

    /* JADX INFO: renamed from: a */
    public final String f167944a;

    /* JADX INFO: renamed from: b */
    public final String f167945b;

    public opj(String str, String str2) {
        this.f167944a = str;
        this.f167945b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m67529c() {
        return this.f167944a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opj)) {
            return false;
        }
        opj opjVar = (opj) obj;
        return wj50.m88271j(this.f167944a, opjVar.f167944a) && wj50.m88271j(this.f167945b, opjVar.f167945b);
    }

    public final int hashCode() {
        return this.f167945b.hashCode() + (this.f167944a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f167944a);
        parcel.writeString(this.f167945b);
    }
}
