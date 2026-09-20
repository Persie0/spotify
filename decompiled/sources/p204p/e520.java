package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class e520 implements Parcelable {
    public static final Parcelable.Creator<e520> CREATOR = new t320(7);

    /* JADX INFO: renamed from: a */
    public final String f56232a;

    /* JADX INFO: renamed from: b */
    public final String f56233b;

    /* JADX INFO: renamed from: c */
    public final String f56234c;

    /* JADX INFO: renamed from: d */
    public final Integer f56235d;

    /* JADX INFO: renamed from: e */
    public final t420 f56236e;

    public e520(String str, String str2, String str3, Integer num, t420 t420Var) {
        this.f56232a = str;
        this.f56233b = str2;
        this.f56234c = str3;
        this.f56235d = num;
        this.f56236e = t420Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e520)) {
            return false;
        }
        e520 e520Var = (e520) obj;
        return wj50.m88271j(this.f56232a, e520Var.f56232a) && wj50.m88271j(this.f56233b, e520Var.f56233b) && wj50.m88271j(this.f56234c, e520Var.f56234c) && wj50.m88271j(this.f56235d, e520Var.f56235d) && wj50.m88271j(this.f56236e, e520Var.f56236e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f56232a.hashCode() * 31, 31, this.f56233b), 31, this.f56234c);
        Integer num = this.f56235d;
        int iHashCode = (iM77243b + (num == null ? 0 : num.hashCode())) * 31;
        t420 t420Var = this.f56236e;
        return iHashCode + (t420Var != null ? t420Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56232a);
        parcel.writeString(this.f56233b);
        parcel.writeString(this.f56234c);
        Integer num = this.f56235d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        t420 t420Var = this.f56236e;
        if (t420Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            t420Var.writeToParcel(parcel, i);
        }
    }
}
