package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ac61 extends gc61 {
    public static final Parcelable.Creator<ac61> CREATOR = new e361(20);

    /* JADX INFO: renamed from: a */
    public final String f14275a;

    /* JADX INFO: renamed from: b */
    public final boolean f14276b;

    /* JADX INFO: renamed from: c */
    public final String f14277c;

    /* JADX INFO: renamed from: d */
    public final int f14278d;

    public ac61(String str, int i, String str2, boolean z) {
        this.f14275a = str;
        this.f14276b = z;
        this.f14277c = str2;
        this.f14278d = i;
    }

    @Override // p204p.gc61
    /* JADX INFO: renamed from: c */
    public final String mo25442c() {
        return this.f14275a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac61)) {
            return false;
        }
        ac61 ac61Var = (ac61) obj;
        return wj50.m88271j(this.f14275a, ac61Var.f14275a) && this.f14276b == ac61Var.f14276b && wj50.m88271j(this.f14277c, ac61Var.f14277c) && this.f14278d == ac61Var.f14278d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f14278d) + s571.m77243b(s571.m77245d(this.f14275a.hashCode() * 31, 31, this.f14276b), 31, this.f14277c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14275a);
        parcel.writeInt(this.f14276b ? 1 : 0);
        parcel.writeString(this.f14277c);
        if (this.f14278d != 1) {
            throw null;
        }
        parcel.writeString("COVER_CREATION");
    }
}
