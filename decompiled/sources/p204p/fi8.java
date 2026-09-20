package p204p;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class fi8 {

    /* JADX INFO: renamed from: a */
    public final float f69803a;

    /* JADX INFO: renamed from: b */
    public final float f69804b;

    /* JADX INFO: renamed from: c */
    public final float f69805c;

    /* JADX INFO: renamed from: d */
    public final int f69806d;

    public fi8(BackEvent backEvent) {
        float fM24666c = a45.m24666c(backEvent);
        float fM24667d = a45.m24667d(backEvent);
        float fM24664a = a45.m24664a(backEvent);
        int iM24665b = a45.m24665b(backEvent);
        this.f69803a = fM24666c;
        this.f69804b = fM24667d;
        this.f69805c = fM24664a;
        this.f69806d = iM24665b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f69803a);
        sb.append(", touchY=");
        sb.append(this.f69804b);
        sb.append(", progress=");
        sb.append(this.f69805c);
        sb.append(", swipeEdge=");
        return edb.m38567p(sb, this.f69806d, '}');
    }
}
