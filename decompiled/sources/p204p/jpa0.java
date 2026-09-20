package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class jpa0 {

    /* JADX INFO: renamed from: a */
    public final float f114596a;

    /* JADX INFO: renamed from: b */
    public final float f114597b;

    /* JADX INFO: renamed from: c */
    public final float f114598c;

    /* JADX INFO: renamed from: d */
    public final float f114599d;

    public jpa0(float f, float f2, float f3, float f4) {
        this.f114596a = f;
        this.f114597b = f2;
        this.f114598c = f3;
        this.f114599d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpa0)) {
            return false;
        }
        jpa0 jpa0Var = (jpa0) obj;
        return Float.compare(this.f114596a, jpa0Var.f114596a) == 0 && Float.compare(this.f114597b, jpa0Var.f114597b) == 0 && Float.compare(this.f114598c, jpa0Var.f114598c) == 0 && Float.compare(this.f114599d, jpa0Var.f114599d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f114599d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f114596a) * 31, 31, this.f114597b), 31, this.f114598c);
    }
}
