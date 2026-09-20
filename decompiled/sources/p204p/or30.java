package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class or30 implements bk30, Parcelable {
    private final String category;
    private final fr70 hashCode$delegate = new wg61(new si20(this, 14));

    /* JADX INFO: renamed from: id */
    private final String f168432id;
    public static final nr30 Companion = new nr30();
    private static final or30 UNKNOWN = new or30("", "");
    public static final Parcelable.Creator<or30> CREATOR = new mz20(16);

    public or30(String str, String str2) {
        this.f168432id = str;
        this.category = str2;
    }

    public static final or30 create(String str, String str2) {
        Companion.getClass();
        return new or30(str, str2);
    }

    public static final or30 fromNullable(bk30 bk30Var) {
        Companion.getClass();
        if (bk30Var != null) {
            return bk30Var instanceof or30 ? (or30) bk30Var : new or30(bk30Var.mo29575id(), bk30Var.category());
        }
        return UNKNOWN;
    }

    public static final or30 unknown() {
        Companion.getClass();
        return UNKNOWN;
    }

    @Override // p204p.bk30
    public String category() {
        return this.category;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or30)) {
            return false;
        }
        or30 or30Var = (or30) obj;
        return wj50.m88271j(this.f168432id, or30Var.f168432id) && wj50.m88271j(this.category, or30Var.category);
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public String mo29575id() {
        return this.f168432id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f168432id);
        parcel.writeString(this.category);
    }
}
