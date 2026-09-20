package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class gsa1 implements Parcelable {
    public static final Parcelable.Creator<gsa1> CREATOR = new u2a1(17);

    /* JADX INFO: renamed from: a */
    public final String f83923a;

    /* JADX INFO: renamed from: b */
    public final kmo f83924b;

    /* JADX INFO: renamed from: c */
    public final int f83925c;

    /* JADX INFO: renamed from: d */
    public final int f83926d;

    /* JADX INFO: renamed from: e */
    public final int f83927e;

    /* JADX INFO: renamed from: f */
    public final b370 f83928f;

    public gsa1(String str, kmo kmoVar, int i, int i2, int i3, b370 b370Var) {
        this.f83923a = str;
        this.f83924b = kmoVar;
        this.f83925c = i;
        this.f83926d = i2;
        this.f83927e = i3;
        this.f83928f = b370Var;
    }

    /* JADX INFO: renamed from: c */
    public static gsa1 m45642c(gsa1 gsa1Var, String str, kmo kmoVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = gsa1Var.f83923a;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            kmoVar = gsa1Var.f83924b;
        }
        kmo kmoVar2 = kmoVar;
        int i3 = gsa1Var.f83925c;
        int i4 = gsa1Var.f83926d;
        if ((i2 & 16) != 0) {
            i = gsa1Var.f83927e;
        }
        b370 b370Var = gsa1Var.f83928f;
        gsa1Var.getClass();
        return new gsa1(str2, kmoVar2, i3, i4, i, b370Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsa1)) {
            return false;
        }
        gsa1 gsa1Var = (gsa1) obj;
        return wj50.m88271j(this.f83923a, gsa1Var.f83923a) && wj50.m88271j(this.f83924b, gsa1Var.f83924b) && this.f83925c == gsa1Var.f83925c && this.f83926d == gsa1Var.f83926d && this.f83927e == gsa1Var.f83927e && wj50.m88271j(this.f83928f, gsa1Var.f83928f);
    }

    public final int hashCode() {
        return this.f83928f.hashCode() + f710.m40938f(this.f83927e, mt60.m62800g(this.f83926d, mt60.m62800g(this.f83925c, (this.f83924b.hashCode() + (this.f83923a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f83923a);
        this.f83924b.writeToParcel(parcel, i);
        parcel.writeInt(this.f83925c);
        parcel.writeInt(this.f83926d);
        int i2 = this.f83927e;
        if (i2 == 1) {
            str = "EMPTY";
        } else if (i2 == 2) {
            str = "READY";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "DATE_ERROR";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.f83928f, i);
    }
}
