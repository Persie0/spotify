package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class tm70 implements xm70 {
    public static final Parcelable.Creator<tm70> CREATOR = new w270(20);

    /* JADX INFO: renamed from: a */
    public final String f221619a;

    public tm70(String str) {
        this.f221619a = str;
    }

    @Override // p204p.xm70
    /* JADX INFO: renamed from: K */
    public final qm70 mo78518K() {
        return new im70(this.f221619a);
    }

    @Override // p204p.xm70
    /* JADX INFO: renamed from: W0 */
    public final String mo78519W0() {
        return this.f221619a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm70) && wj50.m88271j(this.f221619a, ((tm70) obj).f221619a);
    }

    public final int hashCode() {
        return this.f221619a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f221619a);
    }
}
