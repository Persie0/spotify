package p204p;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class mzi0 extends ozi0 {

    /* JADX INFO: renamed from: r */
    public final Class f148720r;

    public mzi0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f148720r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: a */
    public final Object mo38907a(String str, Bundle bundle) {
        return (Serializable[]) bundle.get(str);
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: b */
    public final String mo38908b() {
        return this.f148720r.getName();
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: d */
    public final Object mo38910d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // p204p.ozi0
    /* JADX INFO: renamed from: e */
    public final void mo38911e(Bundle bundle, String str, Object obj) {
        ?? r4 = (Serializable[]) obj;
        this.f148720r.cast(r4);
        bundle.putSerializable(str, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !mzi0.class.equals(obj.getClass())) {
            return false;
        }
        return wj50.m88271j(this.f148720r, ((mzi0) obj).f148720r);
    }

    public final int hashCode() {
        return this.f148720r.hashCode();
    }
}
