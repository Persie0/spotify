package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class wr30 implements fk30, Parcelable {
    private final fr70 hashCode$delegate = new wg61(new si20(this, 16));
    private final vr30 impl;
    public static final tr30 Companion = new tr30();
    private static final wr30 EMPTY = tr30.m81339b(null, null, null, null, null, null, null, null, null, null, null);
    public static final Parcelable.Creator<wr30> CREATOR = new mz20(18);

    public wr30(or30 or30Var, zr30 zr30Var, sr30 sr30Var, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, gs30 gs30Var, String str, String str2, xf40 xf40Var, pf40 pf40Var) {
        this.impl = new vr30(this, or30Var, zr30Var, sr30Var, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, gs30Var, str, str2, xf40Var, pf40Var);
    }

    public static final ek30 builder() {
        Companion.getClass();
        return tr30.m81338a();
    }

    public static final wr30 create(bk30 bk30Var, qk30 qk30Var, dk30 dk30Var, wj30 wj30Var, wj30 wj30Var2, wj30 wj30Var3, it30 it30Var, String str, String str2, Map<String, ? extends mj30> map, List<? extends fk30> list) {
        Companion.getClass();
        return tr30.m81339b(bk30Var, qk30Var, dk30Var, wj30Var, wj30Var2, wj30Var3, it30Var, str, str2, map, list);
    }

    public static final wr30 empty() {
        Companion.getClass();
        return EMPTY;
    }

    public static final wr30 immutable(fk30 fk30Var) {
        Companion.getClass();
        return tr30.m81340c(fk30Var);
    }

    @Override // p204p.fk30
    public List<wr30> childGroup(String str) {
        List<wr30> listChildren = children();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listChildren) {
            if (wj50.m88271j(((wr30) obj).group(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p204p.fk30
    public List<wr30> children() {
        return this.impl.f244067k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wr30) {
            return wj50.m88271j(this.impl, ((wr30) obj).impl);
        }
        return false;
    }

    @Override // p204p.fk30
    public Map<String, ar30> events() {
        return this.impl.f244066j;
    }

    public fk30 findChildById(String str) {
        Object next;
        Iterator<T> it = children().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (wj50.m88271j(((wr30) next).mo41867id(), str)) {
                return (fk30) next;
            }
        }
        next = null;
        return (fk30) next;
    }

    @Override // p204p.fk30
    public String group() {
        return this.impl.f244065i;
    }

    public int hashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    @Override // p204p.fk30
    /* JADX INFO: renamed from: id */
    public String mo41867id() {
        return this.impl.f244064h;
    }

    @Override // p204p.fk30
    public ek30 toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean zM88271j;
        boolean zM88271j2;
        or30 or30Var = this.impl.f244057a;
        boolean zM88271j3 = true;
        if (or30Var == null) {
            zM88271j = true;
        } else {
            or30.Companion.getClass();
            zM88271j = wj50.m88271j(or30Var, or30.UNKNOWN);
        }
        parcel.writeTypedObject(zM88271j ? null : this.impl.f244057a, i);
        zr30 zr30Var = this.impl.f244058b;
        if (zr30Var == null) {
            zM88271j2 = true;
        } else {
            zr30.Companion.getClass();
            zM88271j2 = wj50.m88271j(zr30Var, zr30.EMPTY);
        }
        parcel.writeTypedObject(zM88271j2 ? null : this.impl.f244058b, i);
        sr30 sr30Var = this.impl.f244059c;
        if (sr30Var != null) {
            sr30.Companion.getClass();
            zM88271j3 = wj50.m88271j(sr30Var, sr30.EMPTY);
        }
        parcel.writeTypedObject(zM88271j3 ? null : this.impl.f244059c, i);
        parcel.writeTypedObject(vvx.m86524y(this.impl.f244060d, null) ? null : this.impl.f244060d, i);
        parcel.writeTypedObject(vvx.m86524y(this.impl.f244061e, null) ? null : this.impl.f244061e, i);
        parcel.writeTypedObject(vvx.m86524y(this.impl.f244062f, null) ? null : this.impl.f244062f, i);
        parcel.writeTypedObject(this.impl.f244063g, i);
        parcel.writeString(this.impl.f244064h);
        parcel.writeString(this.impl.f244065i);
        mqg1.m62561u(parcel, this.impl.f244066j);
        pf40 pf40Var = this.impl.f244067k;
        parcel.writeInt(pf40Var.size());
        parcel.writeTypedList(pf40Var);
    }

    @Override // p204p.fk30
    public or30 componentId() {
        return this.impl.f244057a;
    }

    @Override // p204p.fk30
    public HubsImmutableComponentBundle custom() {
        return this.impl.f244062f;
    }

    @Override // p204p.fk30
    public sr30 images() {
        return this.impl.f244059c;
    }

    @Override // p204p.fk30
    public HubsImmutableComponentBundle logging() {
        return this.impl.f244061e;
    }

    @Override // p204p.fk30
    public HubsImmutableComponentBundle metadata() {
        return this.impl.f244060d;
    }

    @Override // p204p.fk30
    @gtq
    public gs30 target() {
        return this.impl.f244063g;
    }

    @Override // p204p.fk30
    public zr30 text() {
        return this.impl.f244058b;
    }
}
