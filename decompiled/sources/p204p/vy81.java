package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vy81 implements Parcelable {
    public static final Parcelable.Creator<vy81> CREATOR = new f881(23);

    /* JADX INFO: renamed from: X */
    public final int f246006X;

    /* JADX INFO: renamed from: Y */
    public final boolean f246007Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f246008Z;

    /* JADX INFO: renamed from: a */
    public final String f246009a;

    /* JADX INFO: renamed from: b */
    public final String f246010b;

    /* JADX INFO: renamed from: c */
    public final String f246011c;

    /* JADX INFO: renamed from: d */
    public final String f246012d;

    /* JADX INFO: renamed from: e */
    public final String f246013e;

    /* JADX INFO: renamed from: f */
    public final int f246014f;

    /* JADX INFO: renamed from: g */
    public final int f246015g;

    /* JADX INFO: renamed from: h */
    public final int f246016h;

    /* JADX INFO: renamed from: i */
    public final List f246017i;

    /* JADX INFO: renamed from: t */
    public final boolean f246018t;

    public vy81(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, List list, boolean z, int i4, boolean z2, boolean z3) {
        this.f246009a = str;
        this.f246010b = str2;
        this.f246011c = str3;
        this.f246012d = str4;
        this.f246013e = str5;
        this.f246014f = i;
        this.f246015g = i2;
        this.f246016h = i3;
        this.f246017i = list;
        this.f246018t = z;
        this.f246006X = i4;
        this.f246007Y = z2;
        this.f246008Z = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy81)) {
            return false;
        }
        vy81 vy81Var = (vy81) obj;
        return wj50.m88271j(this.f246009a, vy81Var.f246009a) && wj50.m88271j(this.f246010b, vy81Var.f246010b) && wj50.m88271j(this.f246011c, vy81Var.f246011c) && wj50.m88271j(this.f246012d, vy81Var.f246012d) && wj50.m88271j(this.f246013e, vy81Var.f246013e) && this.f246014f == vy81Var.f246014f && this.f246015g == vy81Var.f246015g && this.f246016h == vy81Var.f246016h && wj50.m88271j(this.f246017i, vy81Var.f246017i) && this.f246018t == vy81Var.f246018t && this.f246006X == vy81Var.f246006X && this.f246007Y == vy81Var.f246007Y && this.f246008Z == vy81Var.f246008Z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246008Z) + s571.m77245d(f710.m40938f(this.f246006X, s571.m77245d(s571.m77244c(mt60.m62800g(this.f246016h, mt60.m62800g(this.f246015g, mt60.m62800g(this.f246014f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f246009a.hashCode() * 31, 31, this.f246010b), 31, this.f246011c), 31, this.f246012d), 31, this.f246013e), 31), 31), 31), 31, this.f246017i), 31, this.f246018t), 31), 31, this.f246007Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f246009a);
        parcel.writeString(this.f246010b);
        parcel.writeString(this.f246011c);
        parcel.writeString(this.f246012d);
        parcel.writeString(this.f246013e);
        parcel.writeInt(this.f246014f);
        parcel.writeInt(this.f246015g);
        parcel.writeInt(this.f246016h);
        Iterator itM42468l = fr0.m42468l(parcel, this.f246017i);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeInt(this.f246018t ? 1 : 0);
        int i2 = this.f246006X;
        if (i2 == 1) {
            str = "Unknown";
        } else if (i2 == 2) {
            str = "Static";
        } else if (i2 == 3) {
            str = "SyllableSynced";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "SentenceSynced";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f246007Y ? 1 : 0);
        parcel.writeInt(this.f246008Z ? 1 : 0);
    }

    public /* synthetic */ vy81() {
        this("", "", "", "", "", 0, -1, -1, lau.f131415a, false, 1, false, false);
    }
}
