package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class paq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f175597a;

    /* JADX INFO: renamed from: b */
    public final float f175598b;

    /* JADX INFO: renamed from: c */
    public final boolean f175599c;

    public paq0(float f, boolean z, boolean z2) {
        this.f175597a = z;
        this.f175598b = f;
        this.f175599c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paq0)) {
            return false;
        }
        paq0 paq0Var = (paq0) obj;
        return this.f175597a == paq0Var.f175597a && Float.compare(this.f175598b, paq0Var.f175598b) == 0 && this.f175599c == paq0Var.f175599c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175599c) + AbstractC0000a.m8g(Boolean.hashCode(this.f175597a) * 31, 31, this.f175598b);
    }
}
