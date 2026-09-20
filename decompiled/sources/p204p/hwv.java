package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hwv extends as01 {
    public static final Parcelable.Creator<hwv> CREATOR = new bwv(1);

    /* JADX INFO: renamed from: a */
    public final String f96056a;

    /* JADX INFO: renamed from: b */
    public final a081 f96057b;

    /* JADX INFO: renamed from: c */
    public final int f96058c;

    /* JADX INFO: renamed from: d */
    public final boolean f96059d;

    /* JADX INFO: renamed from: e */
    public final shv f96060e;

    /* JADX INFO: renamed from: f */
    public final tu71 f96061f;

    /* JADX INFO: renamed from: g */
    public final mrp0 f96062g;

    public hwv(String str, a081 a081Var, int i, boolean z, shv shvVar, tu71 tu71Var, mrp0 mrp0Var) {
        this.f96056a = str;
        this.f96057b = a081Var;
        this.f96058c = i;
        this.f96059d = z;
        this.f96060e = shvVar;
        this.f96061f = tu71Var;
        this.f96062g = mrp0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwv)) {
            return false;
        }
        hwv hwvVar = (hwv) obj;
        return wj50.m88271j(this.f96056a, hwvVar.f96056a) && wj50.m88271j(this.f96057b, hwvVar.f96057b) && this.f96058c == hwvVar.f96058c && this.f96059d == hwvVar.f96059d && wj50.m88271j(this.f96060e, hwvVar.f96060e) && wj50.m88271j(this.f96061f, hwvVar.f96061f) && wj50.m88271j(this.f96062g, hwvVar.f96062g);
    }

    public final int hashCode() {
        String str = this.f96056a;
        int iHashCode = (this.f96057b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        int i = this.f96058c;
        int iM77245d = s571.m77245d((iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31, 31, this.f96059d);
        shv shvVar = this.f96060e;
        int iHashCode2 = (iM77245d + (shvVar == null ? 0 : shvVar.hashCode())) * 31;
        tu71 tu71Var = this.f96061f;
        int iHashCode3 = (iHashCode2 + (tu71Var == null ? 0 : Long.hashCode(tu71Var.f223785a))) * 31;
        mrp0 mrp0Var = this.f96062g;
        return iHashCode3 + (mrp0Var != null ? mrp0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f96056a);
        parcel.writeParcelable(this.f96057b, i);
        int i2 = this.f96058c;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            switch (i2) {
                case 1:
                    str = "PLAYLIST_WITH_TRACKS";
                    break;
                case 2:
                    str = "PRO_PLAYLIST";
                    break;
                case 3:
                    str = "AI_PLAYLIST_DEFAULT_STICKER";
                    break;
                case 4:
                    str = "AI_PLAYLIST_FUN_COLLECTIBLE";
                    break;
                case 5:
                    str = "AI_PLAYLIST_BETTER_SCREENSHOT";
                    break;
                case 6:
                    str = "PRO_PLAYLIST_WITH_TRACKS";
                    break;
                default:
                    throw null;
            }
            parcel.writeString(str);
        }
        parcel.writeInt(this.f96059d ? 1 : 0);
        shv shvVar = this.f96060e;
        if (shvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shvVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f96061f, i);
        parcel.writeParcelable(this.f96062g, i);
    }
}
