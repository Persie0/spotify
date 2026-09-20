package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;

/* JADX INFO: loaded from: classes7.dex */
public class ds30 implements wq30, Parcelable {
    private final fr70 hashCode$delegate = new wg61(new ias(this, 22));
    private final cs30 impl;
    public static final as30 Companion = new as30();
    private static final ds30 EMPTY = as30.m27054a(null, null, null);
    public static final Parcelable.Creator<ds30> CREATOR = new mz20(20);

    public ds30(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.impl = new cs30(this, str, str2, hubsImmutableComponentBundle);
    }

    public static final vq30 builder() {
        Companion.getClass();
        return EMPTY.toBuilder();
    }

    public static final ds30 create(String str, String str2, wj30 wj30Var) {
        Companion.getClass();
        return as30.m27054a(str, str2, wj30Var);
    }

    public static final ds30 immutable(wq30 wq30Var) {
        Companion.getClass();
        return as30.m27055b(wq30Var);
    }

    @Override // p204p.wq30
    public wj30 custom() {
        return this.impl.f41456c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ds30) {
            return wj50.m88271j(this.impl, ((ds30) obj).impl);
        }
        return false;
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @Override // p204p.wq30
    public String placeholder() {
        return this.impl.f41455b;
    }

    @Override // p204p.wq30
    public vq30 toBuilder() {
        return this.impl;
    }

    @Override // p204p.wq30
    public String uri() {
        return this.impl.f41454a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.impl.f41454a);
        parcel.writeString(this.impl.f41455b);
        parcel.writeTypedObject(vvx.m86524y(this.impl.f41456c, null) ? null : this.impl.f41456c, i);
    }
}
