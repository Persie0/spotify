package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vzc implements Parcelable {
    public static final Parcelable.Creator<vzc> CREATOR = new qvc(5);

    /* JADX INFO: renamed from: a */
    public final String f246434a;

    /* JADX INFO: renamed from: b */
    public final String f246435b;

    public vzc(String str, String str2) {
        this.f246434a = str;
        this.f246435b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m86877c() {
        return this.f246434a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzc)) {
            return false;
        }
        vzc vzcVar = (vzc) obj;
        return wj50.m88271j(this.f246434a, vzcVar.f246434a) && wj50.m88271j(this.f246435b, vzcVar.f246435b);
    }

    public final int hashCode() {
        return this.f246435b.hashCode() + (this.f246434a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f246434a);
        parcel.writeString(this.f246435b);
    }
}
