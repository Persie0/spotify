package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Offset;
import p204p.as91;
import p204p.dq60;
import p204p.ms2;
import p204p.n6f;
import p204p.rfg1;
import p204p.y8a0;

/* JADX INFO: loaded from: classes.dex */
public final class Shadow {

    /* JADX INFO: renamed from: d */
    public static final Shadow f496d = new Shadow(0.0f, rfg1.m75434d(4278190080L), 0);

    /* JADX INFO: renamed from: a */
    public final long f497a;

    /* JADX INFO: renamed from: b */
    public final long f498b;

    /* JADX INFO: renamed from: c */
    public final float f499c;

    public Shadow(float f, long j, long j2) {
        this.f497a = j;
        this.f498b = j2;
        this.f499c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        long j = shadow.f497a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f497a, j) && Offset.m253c(this.f498b, shadow.f498b) && this.f499c == shadow.f499c;
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Float.hashCode(this.f499c) + dq60.m36605e(as91.m27075c(this.f497a) * 31, this.f498b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        y8a0.m93103h(this.f497a, ", offset=", sb);
        sb.append((Object) Offset.m259i(this.f498b));
        sb.append(", blurRadius=");
        return ms2.m62684i(sb, this.f499c, ')');
    }
}
