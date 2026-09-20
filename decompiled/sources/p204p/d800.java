package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d800 implements Parcelable {
    public static final Parcelable.Creator<d800> CREATOR = new n6f1(23);

    /* JADX INFO: renamed from: L0 */
    public final int f46310L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f46311M0;

    /* JADX INFO: renamed from: X */
    public final boolean f46312X;

    /* JADX INFO: renamed from: Y */
    public final int f46313Y;

    /* JADX INFO: renamed from: Z */
    public final String f46314Z;

    /* JADX INFO: renamed from: a */
    public final String f46315a;

    /* JADX INFO: renamed from: b */
    public final String f46316b;

    /* JADX INFO: renamed from: c */
    public final boolean f46317c;

    /* JADX INFO: renamed from: d */
    public final boolean f46318d;

    /* JADX INFO: renamed from: e */
    public final int f46319e;

    /* JADX INFO: renamed from: f */
    public final int f46320f;

    /* JADX INFO: renamed from: g */
    public final String f46321g;

    /* JADX INFO: renamed from: h */
    public final boolean f46322h;

    /* JADX INFO: renamed from: i */
    public final boolean f46323i;

    /* JADX INFO: renamed from: t */
    public final boolean f46324t;

    public d800(i500 i500Var) {
        this.f46315a = i500Var.getClass().getName();
        this.f46316b = i500Var.f98699e;
        this.f46317c = i500Var.f98674M0;
        this.f46318d = i500Var.f98676O0;
        this.f46319e = i500Var.f98684W0;
        this.f46320f = i500Var.f98686X0;
        this.f46321g = i500Var.f98688Y0;
        this.f46322h = i500Var.f98694b1;
        this.f46323i = i500Var.f98687Y;
        this.f46324t = i500Var.f98692a1;
        this.f46312X = i500Var.f98690Z0;
        this.f46313Y = i500Var.f98715p1.ordinal();
        this.f46314Z = i500Var.f98705h;
        this.f46310L0 = i500Var.f98707i;
        this.f46311M0 = i500Var.f98709j1;
    }

    /* JADX INFO: renamed from: c */
    public final i500 m35245c(a600 a600Var, ClassLoader classLoader) {
        i500 i500VarMo24828a = a600Var.mo24828a(classLoader, this.f46315a);
        i500VarMo24828a.f98699e = this.f46316b;
        i500VarMo24828a.f98674M0 = this.f46317c;
        i500VarMo24828a.f98676O0 = this.f46318d;
        i500VarMo24828a.f98677P0 = true;
        i500VarMo24828a.f98684W0 = this.f46319e;
        i500VarMo24828a.f98686X0 = this.f46320f;
        i500VarMo24828a.f98688Y0 = this.f46321g;
        i500VarMo24828a.f98694b1 = this.f46322h;
        i500VarMo24828a.f98687Y = this.f46323i;
        i500VarMo24828a.f98692a1 = this.f46324t;
        i500VarMo24828a.f98690Z0 = this.f46312X;
        i500VarMo24828a.f98715p1 = fb80.values()[this.f46313Y];
        i500VarMo24828a.f98705h = this.f46314Z;
        i500VarMo24828a.f98707i = this.f46310L0;
        i500VarMo24828a.f98709j1 = this.f46311M0;
        return i500VarMo24828a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f46315a);
        sb.append(" (");
        sb.append(this.f46316b);
        sb.append(")}:");
        if (this.f46317c) {
            sb.append(" fromLayout");
        }
        if (this.f46318d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f46320f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f46321g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f46322h) {
            sb.append(" retainInstance");
        }
        if (this.f46323i) {
            sb.append(" removing");
        }
        if (this.f46324t) {
            sb.append(" detached");
        }
        if (this.f46312X) {
            sb.append(" hidden");
        }
        String str2 = this.f46314Z;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f46310L0);
        }
        if (this.f46311M0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46315a);
        parcel.writeString(this.f46316b);
        parcel.writeInt(this.f46317c ? 1 : 0);
        parcel.writeInt(this.f46318d ? 1 : 0);
        parcel.writeInt(this.f46319e);
        parcel.writeInt(this.f46320f);
        parcel.writeString(this.f46321g);
        parcel.writeInt(this.f46322h ? 1 : 0);
        parcel.writeInt(this.f46323i ? 1 : 0);
        parcel.writeInt(this.f46324t ? 1 : 0);
        parcel.writeInt(this.f46312X ? 1 : 0);
        parcel.writeInt(this.f46313Y);
        parcel.writeString(this.f46314Z);
        parcel.writeInt(this.f46310L0);
        parcel.writeInt(this.f46311M0 ? 1 : 0);
    }

    public d800(Parcel parcel) {
        this.f46315a = parcel.readString();
        this.f46316b = parcel.readString();
        this.f46317c = parcel.readInt() != 0;
        this.f46318d = parcel.readInt() != 0;
        this.f46319e = parcel.readInt();
        this.f46320f = parcel.readInt();
        this.f46321g = parcel.readString();
        this.f46322h = parcel.readInt() != 0;
        this.f46323i = parcel.readInt() != 0;
        this.f46324t = parcel.readInt() != 0;
        this.f46312X = parcel.readInt() != 0;
        this.f46313Y = parcel.readInt();
        this.f46314Z = parcel.readString();
        this.f46310L0 = parcel.readInt();
        this.f46311M0 = parcel.readInt() != 0;
    }
}
