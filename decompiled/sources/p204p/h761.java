package p204p;

import android.text.style.URLSpan;

/* JADX INFO: loaded from: classes5.dex */
public final class h761 implements i761 {

    /* JADX INFO: renamed from: a */
    public final int f88355a;

    /* JADX INFO: renamed from: b */
    public final int f88356b;

    /* JADX INFO: renamed from: c */
    public final URLSpan f88357c;

    public h761(int i, int i2, URLSpan uRLSpan) {
        this.f88355a = i;
        this.f88356b = i2;
        this.f88357c = uRLSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h761)) {
            return false;
        }
        h761 h761Var = (h761) obj;
        return this.f88355a == h761Var.f88355a && this.f88356b == h761Var.f88356b && this.f88357c.equals(h761Var.f88357c);
    }

    public final int hashCode() {
        return this.f88357c.hashCode() + mt60.m62800g(this.f88356b, Integer.hashCode(this.f88355a) * 31, 31);
    }
}
