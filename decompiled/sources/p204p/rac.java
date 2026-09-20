package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class rac implements Parcelable {
    public static final Parcelable.Creator<rac> CREATOR = new a5c(6);

    /* JADX INFO: renamed from: a */
    public final String f197252a;

    /* JADX INFO: renamed from: b */
    public final String f197253b;

    /* JADX INFO: renamed from: c */
    public final String f197254c;

    /* JADX INFO: renamed from: d */
    public final String f197255d;

    /* JADX INFO: renamed from: e */
    public final String f197256e;

    /* JADX INFO: renamed from: f */
    public final boolean f197257f;

    /* JADX INFO: renamed from: g */
    public final boolean f197258g;

    /* JADX INFO: renamed from: h */
    public final boolean f197259h;

    /* JADX INFO: renamed from: i */
    public final boolean f197260i;

    public rac(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f197252a = str;
        this.f197253b = str2;
        this.f197254c = str3;
        this.f197255d = str4;
        this.f197256e = str5;
        this.f197257f = z;
        this.f197258g = z2;
        this.f197259h = z3;
        this.f197260i = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rac)) {
            return false;
        }
        rac racVar = (rac) obj;
        return wj50.m88271j(this.f197252a, racVar.f197252a) && wj50.m88271j(this.f197253b, racVar.f197253b) && wj50.m88271j(this.f197254c, racVar.f197254c) && wj50.m88271j(this.f197255d, racVar.f197255d) && wj50.m88271j(this.f197256e, racVar.f197256e) && this.f197257f == racVar.f197257f && this.f197258g == racVar.f197258g && this.f197259h == racVar.f197259h && this.f197260i == racVar.f197260i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197260i) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f197252a.hashCode() * 31, 31, this.f197253b), 31, this.f197254c), 31, this.f197255d), 31, this.f197256e), 31, this.f197257f), 31, this.f197258g), 31, this.f197259h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f197252a);
        parcel.writeString(this.f197253b);
        parcel.writeString(this.f197254c);
        parcel.writeString(this.f197255d);
        parcel.writeString(this.f197256e);
        parcel.writeInt(this.f197257f ? 1 : 0);
        parcel.writeInt(this.f197258g ? 1 : 0);
        parcel.writeInt(this.f197259h ? 1 : 0);
        parcel.writeInt(this.f197260i ? 1 : 0);
    }
}
