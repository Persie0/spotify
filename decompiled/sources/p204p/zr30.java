package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class zr30 implements qk30, Parcelable {
    private final fr70 hashCode$delegate = new wg61(new si20(this, 17));
    private final yr30 impl;
    public static final xr30 Companion = new xr30();
    private static final zr30 EMPTY = new zr30(null, null, null, null);
    public static final Parcelable.Creator<zr30> CREATOR = new mz20(19);

    public zr30(String str, String str2, String str3, String str4) {
        this.impl = new yr30(this, str, str2, str3, str4);
    }

    public static final pk30 builder() {
        Companion.getClass();
        return xr30.m91912a();
    }

    public static final zr30 create(String str, String str2, String str3, String str4) {
        Companion.getClass();
        return new zr30(str, str2, str3, str4);
    }

    public static final zr30 empty() {
        Companion.getClass();
        return EMPTY;
    }

    public static final zr30 fromNullable(qk30 qk30Var) {
        Companion.getClass();
        if (qk30Var != null) {
            return qk30Var instanceof zr30 ? (zr30) qk30Var : new zr30(qk30Var.title(), qk30Var.subtitle(), qk30Var.accessory(), qk30Var.description());
        }
        return EMPTY;
    }

    public static final zr30 immutable(qk30 qk30Var) {
        Companion.getClass();
        return qk30Var instanceof zr30 ? (zr30) qk30Var : new zr30(qk30Var.title(), qk30Var.subtitle(), qk30Var.accessory(), qk30Var.description());
    }

    @Override // p204p.qk30
    public String accessory() {
        return this.impl.f275381c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p204p.qk30
    public String description() {
        return this.impl.f275382d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zr30) {
            return wj50.m88271j(this.impl, ((zr30) obj).impl);
        }
        return false;
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @Override // p204p.qk30
    public String subtitle() {
        return this.impl.f275380b;
    }

    @Override // p204p.qk30
    public String title() {
        return this.impl.f275379a;
    }

    @Override // p204p.qk30
    public pk30 toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.impl.f275379a);
        parcel.writeString(this.impl.f275380b);
        parcel.writeString(this.impl.f275381c);
        parcel.writeString(this.impl.f275382d);
    }
}
