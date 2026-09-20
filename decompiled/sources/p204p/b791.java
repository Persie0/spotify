package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class b791 implements Parcelable {
    public static final Parcelable.Creator<b791> CREATOR = new f881(27);

    /* JADX INFO: renamed from: a */
    public final i0r0 f24195a;

    /* JADX INFO: renamed from: b */
    public final rzl0 f24196b;

    /* JADX INFO: renamed from: c */
    public final boolean f24197c;

    /* JADX INFO: renamed from: d */
    public final boolean f24198d;

    public b791(i0r0 i0r0Var, rzl0 rzl0Var, boolean z, boolean z2) {
        this.f24195a = i0r0Var;
        this.f24196b = rzl0Var;
        this.f24197c = z;
        this.f24198d = z2;
    }

    /* JADX INFO: renamed from: c */
    public static b791 m28366c(b791 b791Var, i0r0 i0r0Var, rzl0 rzl0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            i0r0Var = b791Var.f24195a;
        }
        if ((i & 2) != 0) {
            rzl0Var = b791Var.f24196b;
        }
        if ((i & 4) != 0) {
            z = b791Var.f24197c;
        }
        if ((i & 8) != 0) {
            z2 = b791Var.f24198d;
        }
        b791Var.getClass();
        return new b791(i0r0Var, rzl0Var, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b791)) {
            return false;
        }
        b791 b791Var = (b791) obj;
        return wj50.m88271j(this.f24195a, b791Var.f24195a) && wj50.m88271j(this.f24196b, b791Var.f24196b) && this.f24197c == b791Var.f24197c && this.f24198d == b791Var.f24198d;
    }

    /* JADX INFO: renamed from: g */
    public final String m28367g() {
        v1r0 v1r0Var = this.f24195a.f97302a;
        rzl0 rzl0Var = this.f24196b;
        return "Transition(preset=" + v1r0Var + ", overlap=" + rzl0Var.f204171X + "ms/" + rzl0Var.f204165L0 + "bars, beatmatched=" + rzl0Var.f204166M0 + ", overlapOverride=" + this.f24197c + ", presetOverride=" + this.f24198d + ")";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24198d) + s571.m77245d((this.f24196b.hashCode() + (this.f24195a.hashCode() * 31)) * 31, 31, this.f24197c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f24195a.writeToParcel(parcel, i);
        this.f24196b.writeToParcel(parcel, i);
        parcel.writeInt(this.f24197c ? 1 : 0);
        parcel.writeInt(this.f24198d ? 1 : 0);
    }

    public /* synthetic */ b791(i0r0 i0r0Var, rzl0 rzl0Var, int i) {
        this((i & 1) != 0 ? new i0r0(null, 32767) : i0r0Var, (i & 2) != 0 ? new rzl0("", "", "", "", "", "", "", "", 0, 0, 0, null, null, null, false, 0.0f, 0.0f, 0.0d, 0.0d) : rzl0Var, false, false);
    }
}
