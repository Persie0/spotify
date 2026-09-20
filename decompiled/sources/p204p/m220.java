package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class m220 implements Parcelable {
    public static final Parcelable.Creator<m220> CREATOR = new km10(28);

    /* JADX INFO: renamed from: a */
    public final wq50 f139191a;

    /* JADX INFO: renamed from: b */
    public final String f139192b;

    /* JADX INFO: renamed from: c */
    public final String f139193c;

    public m220(wq50 wq50Var, String str, String str2) {
        this.f139191a = wq50Var;
        this.f139192b = str;
        this.f139193c = str2;
    }

    /* JADX INFO: renamed from: c */
    public final wq50 m60560c() {
        return this.f139191a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m220)) {
            return false;
        }
        m220 m220Var = (m220) obj;
        return wj50.m88271j(this.f139191a, m220Var.f139191a) && wj50.m88271j(this.f139192b, m220Var.f139192b) && wj50.m88271j(this.f139193c, m220Var.f139193c);
    }

    /* JADX INFO: renamed from: g */
    public final String m60561g() {
        return this.f139192b;
    }

    public final int hashCode() {
        wq50 wq50Var = this.f139191a;
        int iHashCode = (wq50Var == null ? 0 : wq50Var.hashCode()) * 31;
        String str = this.f139192b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139193c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f139191a, i);
        parcel.writeString(this.f139192b);
        parcel.writeString(this.f139193c);
    }
}
