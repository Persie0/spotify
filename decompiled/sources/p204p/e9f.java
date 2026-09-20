package p204p;

import androidx.compose.p002ui.graphics.Brush;

/* JADX INFO: loaded from: classes.dex */
public final class e9f implements v971 {

    /* JADX INFO: renamed from: a */
    public final long f57431a;

    public e9f(long j) {
        this.f57431a = j;
        if (j != 16) {
            return;
        }
        nt40.m65597a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // p204p.v971
    /* JADX INFO: renamed from: a */
    public final long mo38247a() {
        return this.f57431a;
    }

    @Override // p204p.v971
    /* JADX INFO: renamed from: b */
    public final float mo38248b() {
        return n6f.m63766c(this.f57431a);
    }

    @Override // p204p.v971
    /* JADX INFO: renamed from: c */
    public final Brush mo38249c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9f)) {
            return false;
        }
        long j = ((e9f) obj).f57431a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f57431a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return as91.m27075c(this.f57431a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) n6f.m63771h(this.f57431a)) + ')';
    }
}
