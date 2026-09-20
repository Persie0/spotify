package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class o05 {

    /* JADX INFO: renamed from: a */
    public final boolean f160234a;

    /* JADX INFO: renamed from: b */
    public final float f160235b;

    /* JADX INFO: renamed from: c */
    public final float f160236c;

    /* JADX INFO: renamed from: d */
    public final float f160237d;

    public o05(boolean z, float f, float f2, float f3) {
        this.f160234a = z;
        this.f160235b = f;
        this.f160236c = f2;
        this.f160237d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o05)) {
            return false;
        }
        o05 o05Var = (o05) obj;
        return this.f160234a == o05Var.f160234a && Float.compare(this.f160235b, o05Var.f160235b) == 0 && Float.compare(this.f160236c, o05Var.f160236c) == 0 && Float.compare(this.f160237d, o05Var.f160237d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f160237d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Boolean.hashCode(this.f160234a) * 31, 31, this.f160235b), 31, this.f160236c);
    }
}
