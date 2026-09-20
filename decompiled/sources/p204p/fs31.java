package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class fs31 implements Parcelable {
    public static final Parcelable.Creator<fs31> CREATOR = new ln31(10);

    /* JADX INFO: renamed from: a */
    public final String f72761a;

    /* JADX INFO: renamed from: b */
    public final boolean f72762b;

    /* JADX INFO: renamed from: c */
    public final fs31 f72763c;

    public fs31(String str, boolean z, fs31 fs31Var) {
        this.f72761a = str;
        this.f72762b = z;
        this.f72763c = fs31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs31)) {
            return false;
        }
        fs31 fs31Var = (fs31) obj;
        return wj50.m88271j(this.f72761a, fs31Var.f72761a) && this.f72762b == fs31Var.f72762b && wj50.m88271j(this.f72763c, fs31Var.f72763c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f72761a.hashCode() * 31, 31, this.f72762b);
        fs31 fs31Var = this.f72763c;
        return iM77245d + (fs31Var == null ? 0 : fs31Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f72761a);
        parcel.writeInt(this.f72762b ? 1 : 0);
        fs31 fs31Var = this.f72763c;
        if (fs31Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fs31Var.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ fs31(String str, boolean z, fs31 fs31Var, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : fs31Var);
    }
}
