package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e301 implements Parcelable {
    public static final Parcelable.Creator<e301> CREATOR = new vcz0(15);

    /* JADX INFO: renamed from: X */
    public final String f55569X;

    /* JADX INFO: renamed from: Y */
    public final C2654zl f55570Y;

    /* JADX INFO: renamed from: a */
    public final String f55571a;

    /* JADX INFO: renamed from: b */
    public final boolean f55572b;

    /* JADX INFO: renamed from: c */
    public final boolean f55573c;

    /* JADX INFO: renamed from: d */
    public final boolean f55574d;

    /* JADX INFO: renamed from: e */
    public final int f55575e;

    /* JADX INFO: renamed from: f */
    public final sh7 f55576f;

    /* JADX INFO: renamed from: g */
    public final String f55577g;

    /* JADX INFO: renamed from: h */
    public final boolean f55578h;

    /* JADX INFO: renamed from: i */
    public final boolean f55579i;

    /* JADX INFO: renamed from: t */
    public final qfn0 f55580t;

    public e301(String str, boolean z, boolean z2, boolean z3, int i, sh7 sh7Var, String str2, boolean z4, boolean z5, qfn0 qfn0Var, String str3, C2654zl c2654zl) {
        this.f55571a = str;
        this.f55572b = z;
        this.f55573c = z2;
        this.f55574d = z3;
        this.f55575e = i;
        this.f55576f = sh7Var;
        this.f55577g = str2;
        this.f55578h = z4;
        this.f55579i = z5;
        this.f55580t = qfn0Var;
        this.f55569X = str3;
        this.f55570Y = c2654zl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e301)) {
            return false;
        }
        e301 e301Var = (e301) obj;
        return wj50.m88271j(this.f55571a, e301Var.f55571a) && this.f55572b == e301Var.f55572b && this.f55573c == e301Var.f55573c && this.f55574d == e301Var.f55574d && this.f55575e == e301Var.f55575e && this.f55576f == e301Var.f55576f && wj50.m88271j(this.f55577g, e301Var.f55577g) && this.f55578h == e301Var.f55578h && this.f55579i == e301Var.f55579i && wj50.m88271j(this.f55580t, e301Var.f55580t) && wj50.m88271j(this.f55569X, e301Var.f55569X) && wj50.m88271j(this.f55570Y, e301Var.f55570Y);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f55575e, s571.m77245d(s571.m77245d(s571.m77245d(this.f55571a.hashCode() * 31, 31, this.f55572b), 31, this.f55573c), 31, this.f55574d), 31);
        sh7 sh7Var = this.f55576f;
        return this.f55570Y.hashCode() + s571.m77243b((s571.m77245d(s571.m77245d(s571.m77243b((iM62800g + (sh7Var == null ? 0 : sh7Var.hashCode())) * 31, 31, this.f55577g), 31, this.f55578h), 31, this.f55579i) + Arrays.hashCode(this.f55580t.f188266a)) * 31, 31, this.f55569X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55571a);
        parcel.writeInt(this.f55572b ? 1 : 0);
        parcel.writeInt(this.f55573c ? 1 : 0);
        parcel.writeInt(this.f55574d ? 1 : 0);
        parcel.writeInt(this.f55575e);
        sh7 sh7Var = this.f55576f;
        if (sh7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sh7Var.name());
        }
        parcel.writeString(this.f55577g);
        parcel.writeInt(this.f55578h ? 1 : 0);
        parcel.writeInt(this.f55579i ? 1 : 0);
        pug1.m71091w(this.f55580t, parcel);
        parcel.writeString(this.f55569X);
        this.f55570Y.writeToParcel(parcel, i);
    }

    public /* synthetic */ e301(String str, boolean z, sh7 sh7Var, String str2, boolean z2, boolean z3, qfn0 qfn0Var, String str3, C2654zl c2654zl, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, false, false, 0, (i & 32) != 0 ? null : sh7Var, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? new qfn0((String) null) : qfn0Var, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? new C2654zl("", "") : c2654zl);
    }
}
