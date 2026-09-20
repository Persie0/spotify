package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class g361 implements zz41 {
    public static final Parcelable.Creator<g361> CREATOR = new e361(1);

    /* JADX INFO: renamed from: a */
    public final int f76116a;

    /* JADX INFO: renamed from: b */
    public final fuz0 f76117b;

    /* JADX INFO: renamed from: c */
    public final fuz0 f76118c;

    /* JADX INFO: renamed from: d */
    public final String f76119d;

    /* JADX INFO: renamed from: e */
    public final String f76120e;

    /* JADX INFO: renamed from: f */
    public final f361 f76121f;

    /* JADX INFO: renamed from: g */
    public final Integer f76122g;

    /* JADX INFO: renamed from: h */
    public final String f76123h;

    public g361(int i, fuz0 fuz0Var, fuz0 fuz0Var2, String str, String str2, f361 f361Var, Integer num) {
        this.f76116a = i;
        this.f76117b = fuz0Var;
        this.f76118c = fuz0Var2;
        this.f76119d = str;
        this.f76120e = str2;
        this.f76121f = f361Var;
        this.f76122g = num;
        this.f76123h = "Summary";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g361)) {
            return false;
        }
        g361 g361Var = (g361) obj;
        return this.f76116a == g361Var.f76116a && wj50.m88271j(this.f76117b, g361Var.f76117b) && wj50.m88271j(this.f76118c, g361Var.f76118c) && wj50.m88271j(this.f76119d, g361Var.f76119d) && wj50.m88271j(this.f76120e, g361Var.f76120e) && wj50.m88271j(this.f76121f, g361Var.f76121f) && wj50.m88271j(this.f76122g, g361Var.f76122g);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f76123h;
    }

    public final int hashCode() {
        int iM80647e = tfe.m80647e(Integer.hashCode(this.f76116a) * 31, this.f76117b.f73606a, 31);
        fuz0 fuz0Var = this.f76118c;
        int iHashCode = (iM80647e + (fuz0Var == null ? 0 : Arrays.hashCode(fuz0Var.f73606a))) * 31;
        String str = this.f76119d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f76120e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f361 f361Var = this.f76121f;
        int iHashCode4 = (iHashCode3 + (f361Var == null ? 0 : f361Var.hashCode())) * 31;
        Integer num = this.f76122g;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f76116a);
        parcel.writeParcelable(this.f76117b, i);
        parcel.writeParcelable(this.f76118c, i);
        parcel.writeString(this.f76119d);
        parcel.writeString(this.f76120e);
        f361 f361Var = this.f76121f;
        if (f361Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            f361Var.writeToParcel(parcel, i);
        }
        Integer num = this.f76122g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }

    public /* synthetic */ g361(int i, fuz0 fuz0Var, fuz0 fuz0Var2, String str, String str2, f361 f361Var, Integer num, int i2) {
        this(i, fuz0Var, fuz0Var2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : f361Var, (i2 & 64) != 0 ? null : num);
    }
}
