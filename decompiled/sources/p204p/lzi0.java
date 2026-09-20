package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class lzi0 extends ozi0 {

    /* JADX INFO: renamed from: r */
    public final Class f138375r;

    public lzi0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f138375r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: a */
    public final Object mo38907a(String str, Bundle bundle) {
        return bundle.get(str);
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: b */
    public final String mo38908b() {
        return this.f138375r.getName();
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: d */
    public final Object mo38910d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: e */
    public final void mo38911e(Bundle bundle, String str, Object obj) {
        this.f138375r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !lzi0.class.equals(obj.getClass())) {
            return false;
        }
        return wj50.m88271j(this.f138375r, ((lzi0) obj).f138375r);
    }

    public final int hashCode() {
        return this.f138375r.hashCode();
    }
}
