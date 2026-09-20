package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class c5o0 implements Parcelable {
    public static final Parcelable.Creator<c5o0> CREATOR = new o2o0(3);

    /* JADX INFO: renamed from: a */
    public final String f34228a;

    /* JADX INFO: renamed from: b */
    public final String f34229b;

    /* JADX INFO: renamed from: c */
    public final boolean f34230c;

    public c5o0(String str, String str2, boolean z) {
        this.f34228a = str;
        this.f34229b = str2;
        this.f34230c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5o0)) {
            return false;
        }
        c5o0 c5o0Var = (c5o0) obj;
        return wj50.m88271j(this.f34228a, c5o0Var.f34228a) && wj50.m88271j(this.f34229b, c5o0Var.f34229b) && this.f34230c == c5o0Var.f34230c;
    }

    public final String getUri() {
        return this.f34228a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34230c) + s571.m77243b(this.f34228a.hashCode() * 31, 31, this.f34229b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34228a);
        parcel.writeString(this.f34229b);
        parcel.writeInt(this.f34230c ? 1 : 0);
    }
}
