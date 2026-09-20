package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m05 implements Parcelable {
    public static final Parcelable.Creator<m05> CREATOR = new n6f1(3);

    /* JADX INFO: renamed from: a */
    public final boolean f138513a;

    /* JADX INFO: renamed from: b */
    public final int f138514b;

    /* JADX INFO: renamed from: c */
    public final int f138515c;

    /* JADX INFO: renamed from: d */
    public final int f138516d;

    /* JADX INFO: renamed from: e */
    public final int f138517e;

    public m05(int i, int i2, boolean z) {
        this.f138513a = z;
        this.f138514b = i;
        this.f138515c = i2;
        if (i == 0 && i2 == 0) {
            this.f138516d = R.anim.fade_in_hard;
            this.f138517e = R.anim.fade_out_hard;
        } else {
            this.f138516d = i;
            this.f138517e = i2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m05)) {
            return false;
        }
        m05 m05Var = (m05) obj;
        return this.f138513a == m05Var.f138513a && this.f138516d == m05Var.f138516d && this.f138517e == m05Var.f138517e;
    }

    public final int hashCode() {
        return ((((this.f138513a ? 1 : 0) * 31) + this.f138516d) * 31) + this.f138517e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationSpec{crossfade=");
        sb.append(this.f138513a);
        sb.append(", enterAnim=");
        sb.append(this.f138516d);
        sb.append(", exitAnim=");
        return klh.m56832d(this.f138517e, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f138513a ? 1 : 0);
        parcel.writeInt(this.f138514b);
        parcel.writeInt(this.f138515c);
    }
}
