package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gs30 implements it30, Parcelable {
    public static final Parcelable.Creator<gs30> CREATOR;
    public static final es30 Companion = new es30();
    private static final gs30 EMPTY;
    private final fr70 hashCode$delegate = new wg61(new si20(this, 18));
    private final fs30 impl;

    static {
        kf40 kf40Var = pf40.f176960b;
        EMPTY = new gs30(null, vie1.m85631m(wsv0.f254763e));
        CREATOR = new mz20(21);
    }

    public gs30(String str, pf40 pf40Var) {
        this.impl = new fs30(str, pf40Var);
    }

    public static final ht30 builder() {
        Companion.getClass();
        return EMPTY.toBuilder();
    }

    public static final gs30 create(String str, String... strArr) {
        Companion.getClass();
        return new gs30(str, vie1.m85631m(Arrays.asList(strArr)));
    }

    public static final gs30 immutable(it30 it30Var) {
        Companion.getClass();
        return it30Var instanceof gs30 ? (gs30) it30Var : new gs30(it30Var.uri(), vie1.m85631m(it30Var.actions()));
    }

    public static final gs30 immutableOrNull(it30 it30Var) {
        Companion.getClass();
        if (it30Var != null) {
            return it30Var instanceof gs30 ? (gs30) it30Var : new gs30(it30Var.uri(), vie1.m85631m(it30Var.actions()));
        }
        return null;
    }

    @Override // p204p.it30
    @gtq
    public List<String> actions() {
        return this.impl.f72760b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gs30) {
            return wj50.m88271j(this.impl, ((gs30) obj).impl);
        }
        return false;
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @gtq
    public ht30 toBuilder() {
        return this.impl;
    }

    @Override // p204p.it30
    @gtq
    public String uri() {
        return this.impl.f72759a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.impl.f72759a);
        pf40 pf40Var = this.impl.f72760b;
        if (pf40Var.isEmpty()) {
            pf40Var = null;
        }
        parcel.writeStringList(pf40Var);
    }

    public static final gs30 create(String str, List<String> list) {
        Companion.getClass();
        return new gs30(str, vie1.m85631m(list));
    }
}
