package p204p;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class ay8 implements rr1 {

    /* JADX INFO: renamed from: a */
    public final Resources f21131a;

    /* JADX INFO: renamed from: b */
    public final int f21132b;

    /* JADX INFO: renamed from: c */
    public final boolean f21133c;

    public ay8(Resources resources, int i, boolean z) {
        this.f21131a = resources;
        this.f21132b = i;
        this.f21133c = z;
    }

    @Override // p204p.rr1
    /* JADX INFO: renamed from: b */
    public final int mo27506b(tca tcaVar) {
        int i = this.f21131a.getDisplayMetrics().heightPixels;
        return this.f21133c ? i : oxg1.m68215h(tcaVar, i, this.f21132b);
    }

    @Override // p204p.rr1
    /* JADX INFO: renamed from: c */
    public final boolean mo27507c() {
        return !this.f21133c;
    }
}
