package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ume implements Parcelable {
    public static final Parcelable.Creator<ume> CREATOR = new rae(5);

    /* JADX INFO: renamed from: a */
    public final String f231838a;

    /* JADX INFO: renamed from: b */
    public final String f231839b;

    /* JADX INFO: renamed from: c */
    public final String f231840c;

    /* JADX INFO: renamed from: d */
    public final long f231841d;

    /* JADX INFO: renamed from: e */
    public final long f231842e;

    public ume(long j, long j2, String str, String str2, String str3) {
        this.f231838a = str;
        this.f231839b = str2;
        this.f231840c = str3;
        this.f231841d = j;
        this.f231842e = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ume)) {
            return false;
        }
        ume umeVar = (ume) obj;
        return wj50.m88271j(this.f231838a, umeVar.f231838a) && wj50.m88271j(this.f231839b, umeVar.f231839b) && wj50.m88271j(this.f231840c, umeVar.f231840c) && mu71.m62836c(this.f231841d, umeVar.f231841d) && mu71.m62836c(this.f231842e, umeVar.f231842e);
    }

    public final int hashCode() {
        return Long.hashCode(this.f231842e) + dq60.m36605e(s571.m77243b(s571.m77243b(this.f231838a.hashCode() * 31, 31, this.f231839b), 31, this.f231840c), this.f231841d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231838a);
        parcel.writeString(this.f231839b);
        parcel.writeString(this.f231840c);
        parcel.writeParcelable(new mu71(this.f231841d), i);
        parcel.writeParcelable(new mu71(this.f231842e), i);
    }
}
