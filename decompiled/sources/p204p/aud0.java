package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class aud0 implements Parcelable {
    public static final Parcelable.Creator<aud0> CREATOR = new jfd0(10);

    /* JADX INFO: renamed from: a */
    public final String f19916a;

    /* JADX INFO: renamed from: b */
    public final wtd0 f19917b;

    /* JADX INFO: renamed from: c */
    public final String f19918c;

    /* JADX INFO: renamed from: d */
    public final tvd0 f19919d;

    /* JADX INFO: renamed from: e */
    public final String f19920e;

    public aud0(String str, wtd0 wtd0Var, String str2, tvd0 tvd0Var, String str3) {
        this.f19916a = str;
        this.f19917b = wtd0Var;
        this.f19918c = str2;
        this.f19919d = tvd0Var;
        this.f19920e = str3;
    }

    /* JADX INFO: renamed from: c */
    public static aud0 m27175c(aud0 aud0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = aud0Var.f19916a;
        }
        String str3 = str;
        wtd0 wtd0Var = aud0Var.f19917b;
        if ((i & 4) != 0) {
            str2 = aud0Var.f19918c;
        }
        String str4 = str2;
        tvd0 tvd0Var = aud0Var.f19919d;
        String str5 = (i & 16) != 0 ? aud0Var.f19920e : "media_trimmer_button_result";
        aud0Var.getClass();
        return new aud0(str3, wtd0Var, str4, tvd0Var, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aud0)) {
            return false;
        }
        aud0 aud0Var = (aud0) obj;
        return wj50.m88271j(this.f19916a, aud0Var.f19916a) && wj50.m88271j(this.f19917b, aud0Var.f19917b) && wj50.m88271j(this.f19918c, aud0Var.f19918c) && this.f19919d == aud0Var.f19919d && wj50.m88271j(this.f19920e, aud0Var.f19920e);
    }

    /* JADX INFO: renamed from: g */
    public final wtd0 m27176g() {
        return this.f19917b;
    }

    public final int hashCode() {
        int iHashCode = (this.f19917b.hashCode() + (this.f19916a.hashCode() * 31)) * 31;
        String str = this.f19918c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tvd0 tvd0Var = this.f19919d;
        int iHashCode3 = (iHashCode2 + (tvd0Var == null ? 0 : tvd0Var.hashCode())) * 31;
        String str2 = this.f19920e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19916a);
        parcel.writeParcelable(this.f19917b, i);
        parcel.writeString(this.f19918c);
        tvd0 tvd0Var = this.f19919d;
        if (tvd0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tvd0Var.name());
        }
        parcel.writeString(this.f19920e);
    }

    public /* synthetic */ aud0(String str, wtd0 wtd0Var, String str2, tvd0 tvd0Var, String str3, int i) {
        this(str, wtd0Var, str2, (i & 8) != 0 ? null : tvd0Var, (i & 16) != 0 ? null : str3);
    }
}
