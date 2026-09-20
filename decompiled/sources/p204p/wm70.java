package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class wm70 implements xm70 {
    public static final Parcelable.Creator<wm70> CREATOR = new w270(23);

    /* JADX INFO: renamed from: a */
    public final String f252749a;

    public wm70(String str) {
        this.f252749a = str;
    }

    @Override // p204p.xm70
    /* JADX INFO: renamed from: K */
    public final qm70 mo78518K() {
        return new lm70(this.f252749a);
    }

    @Override // p204p.xm70
    /* JADX INFO: renamed from: W0 */
    public final String mo78519W0() {
        return this.f252749a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm70) && wj50.m88271j(this.f252749a, ((wm70) obj).f252749a);
    }

    public final int hashCode() {
        return this.f252749a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f252749a);
    }
}
