package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ar30 implements mj30, Parcelable {
    private final HubsImmutableComponentBundle data;
    private final fr70 hashCode$delegate = new wg61(new si20(this, 13));
    private final zq30 impl;
    private final String name;
    public static final xq30 Companion = new xq30();
    private static final ar30 EMPTY = xq30.m91813a("", null);
    public static final Parcelable.Creator<ar30> CREATOR = new mz20(14);

    public ar30(String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.name = str;
        this.data = hubsImmutableComponentBundle;
        this.impl = new zq30(this, str, hubsImmutableComponentBundle);
    }

    public static final xf40 asImmutableCommandMap(Map<String, ? extends mj30> map) {
        Companion.getClass();
        return ihf1.m50641y(map, ar30.class, fh30.f69558d);
    }

    public static final lj30 builder() {
        Companion.getClass();
        return EMPTY.toBuilder();
    }

    public static final ar30 create(String str, wj30 wj30Var) {
        Companion.getClass();
        return xq30.m91813a(str, wj30Var);
    }

    public static final ar30 empty() {
        Companion.getClass();
        return EMPTY;
    }

    public static final ar30 immutable(mj30 mj30Var) {
        Companion.getClass();
        return xq30.m91814b(mj30Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ar30) {
            return wj50.m88271j(this.impl, ((ar30) obj).impl);
        }
        return false;
    }

    public final HubsImmutableComponentBundle getData() {
        return this.data;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @Override // p204p.mj30
    public String name() {
        return this.impl.f285299a;
    }

    public lj30 toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.impl.f285299a);
        parcel.writeTypedObject(vvx.m86524y(this.impl.f285300b, null) ? null : this.impl.f285300b, i);
    }

    @Override // p204p.mj30
    public HubsImmutableComponentBundle data() {
        return this.impl.f285300b;
    }
}
