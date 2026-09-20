package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class z0j0 implements j1j0 {

    /* JADX INFO: renamed from: a */
    public final String f278128a;

    /* JADX INFO: renamed from: b */
    public final String f278129b;

    /* JADX INFO: renamed from: c */
    public final String f278130c;

    /* JADX INFO: renamed from: d */
    public final String f278131d;

    public z0j0(String str, String str2, String str3) {
        this.f278128a = str;
        this.f278129b = str2;
        this.f278130c = str3;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f278131d = xgg1.m90725W1().f36166c;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public final String mo24455a() {
        return this.f278131d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0j0)) {
            return false;
        }
        z0j0 z0j0Var = (z0j0) obj;
        return wj50.m88271j(this.f278128a, z0j0Var.f278128a) && wj50.m88271j(this.f278129b, z0j0Var.f278129b) && wj50.m88271j(this.f278130c, z0j0Var.f278130c);
    }

    @Override // p204p.j1j0
    public final String getUri() {
        return this.f278128a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f278128a.hashCode() * 31, 31, this.f278129b);
        String str = this.f278130c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
