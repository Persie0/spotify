package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class sr30 implements dk30, Parcelable {
    private final fr70 hashCode$delegate = new wg61(new si20(this, 15));
    private final rr30 impl;
    public static final pr30 Companion = new pr30();
    private static final sr30 EMPTY = pr30.m70700b(null, null, null, null);
    public static final Parcelable.Creator<sr30> CREATOR = new mz20(17);

    public sr30(ds30 ds30Var, ds30 ds30Var2, xf40 xf40Var, String str) {
        this.impl = new rr30(this, ds30Var, ds30Var2, xf40Var, str);
    }

    public static final ck30 builder() {
        Companion.getClass();
        return pr30.m70699a();
    }

    public static final sr30 create(wq30 wq30Var, wq30 wq30Var2, Map<String, ? extends wq30> map, String str) {
        Companion.getClass();
        return pr30.m70700b(wq30Var, wq30Var2, map, str);
    }

    public static final sr30 empty() {
        Companion.getClass();
        return EMPTY;
    }

    public static final sr30 fromNullable(dk30 dk30Var) {
        Companion.getClass();
        if (dk30Var != null) {
            return dk30Var instanceof sr30 ? (sr30) dk30Var : pr30.m70700b(dk30Var.main(), dk30Var.background(), dk30Var.custom(), dk30Var.icon());
        }
        return EMPTY;
    }

    public static final sr30 immutable(dk30 dk30Var) {
        Companion.getClass();
        return dk30Var instanceof sr30 ? (sr30) dk30Var : pr30.m70700b(dk30Var.main(), dk30Var.background(), dk30Var.custom(), dk30Var.icon());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sr30) {
            return wj50.m88271j(this.impl, ((sr30) obj).impl);
        }
        return false;
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @Override // p204p.dk30
    public String icon() {
        return this.impl.f201943d;
    }

    @Override // p204p.dk30
    public ck30 toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedObject(this.impl.f201940a, i);
        parcel.writeTypedObject(this.impl.f201941b, i);
        mqg1.m62561u(parcel, this.impl.f201942c);
        parcel.writeString(this.impl.f201943d);
    }

    @Override // p204p.dk30
    public ds30 background() {
        return this.impl.f201941b;
    }

    @Override // p204p.dk30
    public xf40 custom() {
        return this.impl.f201942c;
    }

    @Override // p204p.dk30
    public ds30 main() {
        return this.impl.f201940a;
    }
}
