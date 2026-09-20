package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class j230 {

    /* JADX INFO: renamed from: a */
    public final float f107914a;

    /* JADX INFO: renamed from: b */
    public final float f107915b;

    /* JADX INFO: renamed from: c */
    public final float f107916c;

    public j230(float f, float f2, float f3) {
        this.f107914a = f;
        this.f107915b = f2;
        this.f107916c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j230)) {
            return false;
        }
        j230 j230Var = (j230) obj;
        return Float.compare(this.f107914a, j230Var.f107914a) == 0 && Float.compare(this.f107915b, j230Var.f107915b) == 0 && Float.compare(this.f107916c, j230Var.f107916c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f107916c) + AbstractC0000a.m8g(Float.hashCode(this.f107914a) * 31, 31, this.f107915b);
    }
}
