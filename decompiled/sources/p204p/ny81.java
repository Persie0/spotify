package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ny81 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f159744a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f159745b;

    public ny81() {
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        this.f159744a = atomicReference;
        this.f159745b = atomicReference2;
    }

    /* JADX INFO: renamed from: a */
    public final AtomicReference m65869a() {
        return this.f159745b;
    }

    /* JADX INFO: renamed from: b */
    public final AtomicReference m65870b() {
        return this.f159744a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny81)) {
            return false;
        }
        ny81 ny81Var = (ny81) obj;
        return wj50.m88271j(this.f159744a, ny81Var.f159744a) && wj50.m88271j(this.f159745b, ny81Var.f159745b);
    }

    public final int hashCode() {
        return this.f159745b.hashCode() + (this.f159744a.hashCode() * 31);
    }
}
