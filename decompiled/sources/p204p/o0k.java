package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class o0k implements p0k {
    public static final Parcelable.Creator<o0k> CREATOR = new dnj(16);

    /* JADX INFO: renamed from: a */
    public final String f160414a;

    /* JADX INFO: renamed from: b */
    public final String f160415b;

    /* JADX INFO: renamed from: c */
    public final String f160416c;

    public o0k(String str, String str2, String str3) {
        this.f160414a = str;
        this.f160415b = str2;
        this.f160416c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0k)) {
            return false;
        }
        o0k o0kVar = (o0k) obj;
        return wj50.m88271j(this.f160414a, o0kVar.f160414a) && wj50.m88271j(this.f160415b, o0kVar.f160415b) && wj50.m88271j(this.f160416c, o0kVar.f160416c);
    }

    public final int hashCode() {
        return this.f160416c.hashCode() + s571.m77243b(this.f160414a.hashCode() * 31, 31, this.f160415b);
    }

    @Override // p204p.p0k
    /* JADX INFO: renamed from: m1 */
    public final sef mo63457m1() {
        return new ref(this.f160414a, this.f160415b, this.f160416c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f160414a);
        parcel.writeString(this.f160415b);
        parcel.writeString(this.f160416c);
    }
}
