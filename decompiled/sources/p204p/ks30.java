package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ks30 implements nt30, Parcelable {
    private final fr70 hashCode$delegate = new wg61(new si20(this, 19));
    private final js30 impl;
    public static final hs30 Companion = new hs30();
    public static final ks30 EMPTY = hs30.m48414a(null, null, null, null, null, null, null);
    public static final Parcelable.Creator<ks30> CREATOR = new mz20(22);

    public ks30(String str, String str2, wr30 wr30Var, pf40 pf40Var, pf40 pf40Var2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.impl = new js30(this, str, str2, wr30Var, pf40Var, pf40Var2, str3, hubsImmutableComponentBundle);
    }

    public static final mt30 builder() {
        Companion.getClass();
        return EMPTY.toBuilder();
    }

    public static final ks30 create(String str, String str2, fk30 fk30Var, List<? extends fk30> list, List<? extends fk30> list2, String str3, wj30 wj30Var) {
        Companion.getClass();
        return hs30.m48414a(str, str2, fk30Var, list, list2, str3, wj30Var);
    }

    public static final ks30 immutable(nt30 nt30Var) {
        Companion.getClass();
        return hs30.m48415b(nt30Var);
    }

    @Override // p204p.nt30
    public List<wr30> body() {
        return this.impl.f115379d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ks30) {
            return wj50.m88271j(this.impl, ((ks30) obj).impl);
        }
        return false;
    }

    @Override // p204p.nt30
    public String extension() {
        return this.impl.f115381f;
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @Override // p204p.nt30
    /* JADX INFO: renamed from: id */
    public String mo57184id() {
        return this.impl.f115376a;
    }

    @Override // p204p.nt30
    public List<wr30> overlays() {
        return this.impl.f115380e;
    }

    @Override // p204p.nt30
    public String title() {
        return this.impl.f115377b;
    }

    @Override // p204p.nt30
    public mt30 toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.impl.f115376a);
        parcel.writeString(this.impl.f115377b);
        parcel.writeTypedObject(vvx.m86511l(this.impl.f115378c, null) ? null : this.impl.f115378c, i);
        pf40 pf40Var = this.impl.f115379d;
        parcel.writeInt(pf40Var.size());
        parcel.writeTypedList(pf40Var);
        pf40 pf40Var2 = this.impl.f115380e;
        parcel.writeInt(pf40Var2.size());
        parcel.writeTypedList(pf40Var2);
        parcel.writeString(this.impl.f115381f);
        parcel.writeTypedObject(vvx.m86524y(this.impl.f115382g, null) ? null : this.impl.f115382g, i);
    }

    @Override // p204p.nt30
    public HubsImmutableComponentBundle custom() {
        return this.impl.f115382g;
    }

    @Override // p204p.nt30
    public wr30 header() {
        return this.impl.f115378c;
    }
}
