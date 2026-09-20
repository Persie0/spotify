package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class q3h1 {

    /* JADX INFO: renamed from: a */
    public final long[] f184885a;

    /* JADX INFO: renamed from: b */
    public final long[] f184886b;

    /* JADX INFO: renamed from: c */
    public final long[] f184887c;

    public q3h1(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f184885a = jArr;
        this.f184886b = jArr2;
        this.f184887c = jArr3;
    }

    /* JADX INFO: renamed from: a */
    public void mo72120a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    /* JADX INFO: renamed from: b */
    public final void m72121b(q3h1 q3h1Var, int i) {
        hvf1.m48847s(this.f184885a, q3h1Var.f184885a, i);
        hvf1.m48847s(this.f184886b, q3h1Var.f184886b, i);
        hvf1.m48847s(this.f184887c, q3h1Var.f184887c, i);
    }

    public q3h1() {
        q3h1 q3h1Var = x3h1.f257815a;
        this.f184885a = Arrays.copyOf(q3h1Var.f184885a, 10);
        this.f184886b = Arrays.copyOf(q3h1Var.f184886b, 10);
        this.f184887c = Arrays.copyOf(q3h1Var.f184887c, 10);
    }
}
