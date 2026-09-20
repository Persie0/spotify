package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class sm70 implements xm70 {
    public static final Parcelable.Creator<sm70> CREATOR = new w270(19);

    /* JADX INFO: renamed from: a */
    public final String f210577a;

    public sm70(String str) {
        this.f210577a = str;
    }

    @Override // p204p.xm70
    /* JADX INFO: renamed from: K */
    public final qm70 mo78518K() {
        return new hm70(this.f210577a);
    }

    @Override // p204p.xm70
    /* JADX INFO: renamed from: W0 */
    public final String mo78519W0() {
        return this.f210577a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm70) && wj50.m88271j(this.f210577a, ((sm70) obj).f210577a);
    }

    public final int hashCode() {
        return this.f210577a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f210577a);
    }
}
