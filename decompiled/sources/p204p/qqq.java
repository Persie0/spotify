package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class qqq implements Parcelable {
    public static final Parcelable.Creator<qqq> CREATOR = new lso(11);

    /* JADX INFO: renamed from: a */
    public final String f191630a;

    /* JADX INFO: renamed from: b */
    public final String f191631b;

    /* JADX INFO: renamed from: c */
    public final boolean f191632c;

    public qqq(String str, String str2, boolean z) {
        this.f191630a = str;
        this.f191631b = str2;
        this.f191632c = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m73575c() {
        return this.f191630a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqq)) {
            return false;
        }
        qqq qqqVar = (qqq) obj;
        return wj50.m88271j(this.f191630a, qqqVar.f191630a) && wj50.m88271j(this.f191631b, qqqVar.f191631b) && this.f191632c == qqqVar.f191632c;
    }

    /* JADX INFO: renamed from: g */
    public final String m73576g() {
        return this.f191631b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191632c) + s571.m77243b(this.f191630a.hashCode() * 31, 31, this.f191631b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f191630a);
        parcel.writeString(this.f191631b);
        parcel.writeInt(this.f191632c ? 1 : 0);
    }
}
