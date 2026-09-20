package p204p;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class nzi0 extends ozi0 {

    /* JADX INFO: renamed from: r */
    public final Class f160097r;

    public nzi0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f160097r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: a */
    public final Object mo38907a(String str, Bundle bundle) {
        return (Serializable) bundle.get(str);
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: b */
    public String mo38908b() {
        return this.f160097r.getName();
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: e */
    public final void mo38911e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        this.f160097r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzi0)) {
            return false;
        }
        return wj50.m88271j(this.f160097r, ((nzi0) obj).f160097r);
    }

    @Override // p204p.ozi0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable mo38910d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f160097r.hashCode();
    }

    public nzi0(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f160097r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
