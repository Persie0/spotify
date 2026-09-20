package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class pb2 implements Parcelable {
    public static final Parcelable.Creator<pb2> CREATOR = new lb2(2);

    /* JADX INFO: renamed from: a */
    public final String f175687a;

    /* JADX INFO: renamed from: b */
    public final ib2 f175688b;

    /* JADX INFO: renamed from: c */
    public final String f175689c;

    /* JADX INFO: renamed from: d */
    public final ob2 f175690d;

    /* JADX INFO: renamed from: e */
    public final boolean f175691e;

    /* JADX INFO: renamed from: f */
    public final boolean f175692f;

    /* JADX INFO: renamed from: g */
    public final int f175693g;

    public pb2(String str, ib2 ib2Var, String str2, ob2 ob2Var, boolean z, boolean z2, int i) {
        this.f175687a = str;
        this.f175688b = ib2Var;
        this.f175689c = str2;
        this.f175690d = ob2Var;
        this.f175691e = z;
        this.f175692f = z2;
        this.f175693g = i;
    }

    /* JADX INFO: renamed from: c */
    public static pb2 m69507c(pb2 pb2Var, String str, ib2 ib2Var, String str2, ob2 ob2Var, boolean z, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = pb2Var.f175687a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            ib2Var = pb2Var.f175688b;
        }
        ib2 ib2Var2 = ib2Var;
        if ((i2 & 4) != 0) {
            str2 = pb2Var.f175689c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            ob2Var = pb2Var.f175690d;
        }
        ob2 ob2Var2 = ob2Var;
        if ((i2 & 16) != 0) {
            z = pb2Var.f175691e;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = pb2Var.f175692f;
        }
        boolean z4 = z2;
        if ((i2 & 64) != 0) {
            i = pb2Var.f175693g;
        }
        pb2Var.getClass();
        return new pb2(str3, ib2Var2, str4, ob2Var2, z3, z4, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb2)) {
            return false;
        }
        pb2 pb2Var = (pb2) obj;
        return wj50.m88271j(this.f175687a, pb2Var.f175687a) && wj50.m88271j(this.f175688b, pb2Var.f175688b) && wj50.m88271j(this.f175689c, pb2Var.f175689c) && wj50.m88271j(this.f175690d, pb2Var.f175690d) && this.f175691e == pb2Var.f175691e && this.f175692f == pb2Var.f175692f && this.f175693g == pb2Var.f175693g;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m69508g() {
        ob2 ob2Var = this.f175690d;
        if (ob2Var instanceof jb2) {
            return true;
        }
        return (ob2Var instanceof mb2) && !(((mb2) ob2Var).f141765a instanceof ol50);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175693g) + s571.m77245d(s571.m77245d((this.f175690d.hashCode() + s571.m77243b((this.f175688b.hashCode() + (this.f175687a.hashCode() * 31)) * 31, 31, this.f175689c)) * 31, 31, this.f175691e), 31, this.f175692f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f175687a);
        this.f175688b.writeToParcel(parcel, i);
        parcel.writeString(this.f175689c);
        parcel.writeParcelable(this.f175690d, i);
        parcel.writeInt(this.f175691e ? 1 : 0);
        parcel.writeInt(this.f175692f ? 1 : 0);
        parcel.writeInt(this.f175693g);
    }

    public /* synthetic */ pb2() {
        this("", new ib2("", -1), "", kb2.f121033a, false, false, -1);
    }
}
