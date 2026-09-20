package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class imc1 implements Parcelable {
    public static final Parcelable.Creator<imc1> CREATOR = new nlc1(19);

    /* JADX INFO: renamed from: a */
    public final String f103668a;

    /* JADX INFO: renamed from: b */
    public final k340 f103669b;

    /* JADX INFO: renamed from: c */
    public final String f103670c;

    /* JADX INFO: renamed from: d */
    public final String f103671d;

    /* JADX INFO: renamed from: e */
    public final String f103672e;

    public imc1(String str, k340 k340Var, String str2, String str3, String str4) {
        this.f103668a = str;
        this.f103669b = k340Var;
        this.f103670c = str2;
        this.f103671d = str3;
        this.f103672e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imc1)) {
            return false;
        }
        imc1 imc1Var = (imc1) obj;
        return wj50.m88271j(this.f103668a, imc1Var.f103668a) && wj50.m88271j(this.f103669b, imc1Var.f103669b) && wj50.m88271j(this.f103670c, imc1Var.f103670c) && wj50.m88271j(this.f103671d, imc1Var.f103671d) && wj50.m88271j(this.f103672e, imc1Var.f103672e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b((this.f103669b.hashCode() + (this.f103668a.hashCode() * 31)) * 31, 31, this.f103670c), 31, this.f103671d);
        String str = this.f103672e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f103668a);
        parcel.writeParcelable(this.f103669b, i);
        parcel.writeString(this.f103670c);
        parcel.writeString(this.f103671d);
        parcel.writeString(this.f103672e);
    }
}
