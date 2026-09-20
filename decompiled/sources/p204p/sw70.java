package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sw70 implements n6d0 {

    /* JADX INFO: renamed from: a */
    public final tw70 f214595a;

    /* JADX INFO: renamed from: b */
    public final int f214596b;

    /* JADX INFO: renamed from: c */
    public final boolean f214597c;

    /* JADX INFO: renamed from: d */
    public final float f214598d;

    /* JADX INFO: renamed from: e */
    public final n6d0 f214599e;

    /* JADX INFO: renamed from: f */
    public final float f214600f;

    /* JADX INFO: renamed from: g */
    public final boolean f214601g;

    /* JADX INFO: renamed from: h */
    public final xuk f214602h;

    /* JADX INFO: renamed from: i */
    public final yqq f214603i;

    /* JADX INFO: renamed from: j */
    public final long f214604j;

    /* JADX INFO: renamed from: k */
    public final Object f214605k;

    /* JADX INFO: renamed from: l */
    public final int f214606l;

    /* JADX INFO: renamed from: m */
    public final int f214607m;

    /* JADX INFO: renamed from: n */
    public final int f214608n;

    /* JADX INFO: renamed from: o */
    public final boolean f214609o;

    /* JADX INFO: renamed from: p */
    public final vvl0 f214610p;

    /* JADX INFO: renamed from: q */
    public final int f214611q;

    /* JADX INFO: renamed from: r */
    public final int f214612r;

    public sw70(tw70 tw70Var, int i, boolean z, float f, n6d0 n6d0Var, float f2, boolean z2, xuk xukVar, yqq yqqVar, long j, List list, int i2, int i3, int i4, boolean z3, vvl0 vvl0Var, int i5, int i6) {
        this.f214595a = tw70Var;
        this.f214596b = i;
        this.f214597c = z;
        this.f214598d = f;
        this.f214599e = n6d0Var;
        this.f214600f = f2;
        this.f214601g = z2;
        this.f214602h = xukVar;
        this.f214603i = yqqVar;
        this.f214604j = j;
        this.f214605k = list;
        this.f214606l = i2;
        this.f214607m = i3;
        this.f214608n = i4;
        this.f214609o = z3;
        this.f214610p = vvl0Var;
        this.f214611q = i5;
        this.f214612r = i6;
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: a */
    public final void mo27119a() {
        this.f214599e.mo27119a();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: b */
    public final int mo27120b() {
        return this.f214599e.mo27120b();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: c */
    public final Map mo27121c() {
        return this.f214599e.mo27121c();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: d */
    public final int mo27122d() {
        return this.f214599e.mo27122d();
    }

    @Override // p204p.n6d0
    /* JADX INFO: renamed from: e */
    public final gh00 mo31376e() {
        return this.f214599e.mo31376e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final sw70 m79528f(int i, boolean z) {
        tw70 tw70Var;
        int i2;
        int i3;
        if (this.f214601g) {
            return null;
        }
        ?? r15 = this.f214605k;
        if (r15.isEmpty() || (tw70Var = this.f214595a) == null) {
            return null;
        }
        int i4 = tw70Var.f224342r;
        int i5 = this.f214596b - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        tw70 tw70Var2 = (tw70) g6f.m43741q0(r15);
        tw70 tw70Var3 = (tw70) g6f.m43687A0(r15);
        if (tw70Var2.f224344t || tw70Var3.f224344t) {
            return null;
        }
        int i6 = this.f214607m;
        int i7 = this.f214606l;
        if (i < 0) {
            if (Math.min((tw70Var2.f224340p + tw70Var2.f224342r) - i7, (tw70Var3.f224340p + tw70Var3.f224342r) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - tw70Var2.f224340p, i6 - tw70Var3.f224340p) <= i) {
            return null;
        }
        int size = r15.size();
        int i8 = 0;
        while (i8 < size) {
            tw70 tw70Var4 = (tw70) r15.get(i8);
            boolean z2 = tw70Var4.f224327c;
            int[] iArr = tw70Var4.f224348x;
            if (!tw70Var4.f224344t) {
                tw70Var4.f224340p += i;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z2 && i10 != 0) || (!z2 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i;
                    }
                }
                if (z) {
                    int size2 = tw70Var4.f224326b.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        zu70 zu70VarM42766a = tw70Var4.f224338n.m42766a(i11, tw70Var4.f224336l);
                        if (zu70VarM42766a != null) {
                            long j = zu70VarM42766a.f286376l;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            zu70VarM42766a.f286376l = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i8 = i8;
                        }
                        i11++;
                        i8 = i8;
                    }
                }
            }
            i8++;
        }
        return new sw70(this.f214595a, i5, this.f214597c || i > 0, i, this.f214599e, this.f214600f, this.f214601g, this.f214602h, this.f214603i, this.f214604j, r15, this.f214606l, this.f214607m, this.f214608n, this.f214609o, this.f214610p, this.f214611q, this.f214612r);
    }

    /* JADX INFO: renamed from: g */
    public final long m79529g() {
        n6d0 n6d0Var = this.f214599e;
        return (((long) n6d0Var.mo27122d()) << 32) | (((long) n6d0Var.mo27120b()) & 4294967295L);
    }
}
