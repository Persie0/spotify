package p204p;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kzi0 extends ozi0 {

    /* JADX INFO: renamed from: r */
    public final Class f128137r;

    public kzi0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f128137r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: a */
    public final Object mo38907a(String str, Bundle bundle) {
        return (Parcelable[]) bundle.get(str);
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: b */
    public final String mo38908b() {
        return this.f128137r.getName();
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: d */
    public final Object mo38910d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: e */
    public final void mo38911e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        this.f128137r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kzi0.class.equals(obj.getClass())) {
            return false;
        }
        return wj50.m88271j(this.f128137r, ((kzi0) obj).f128137r);
    }

    public final int hashCode() {
        return this.f128137r.hashCode();
    }
}
