package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class b9g1 implements w9g1 {

    /* JADX INFO: renamed from: a */
    public final sxf1 f24905a;

    /* JADX INFO: renamed from: b */
    public final ece1 f24906b;

    public b9g1(ece1 ece1Var, sxf1 sxf1Var) {
        wed1 wed1Var = n2g1.f149765a;
        this.f24906b = ece1Var;
        this.f24905a = sxf1Var;
    }

    @Override // p204p.w9g1
    /* JADX INFO: renamed from: a */
    public final boolean mo28475a(Object obj) {
        throw ei6.m39072i(obj);
    }

    @Override // p204p.w9g1
    /* JADX INFO: renamed from: b */
    public final void mo28476b(Object obj, byte[] bArr, int i, int i2, n9f1 n9f1Var) {
        r3g1 r3g1Var = (r3g1) obj;
        if (r3g1Var.zzc == dcg1.f47554f) {
            r3g1Var.zzc = dcg1.m35653b();
        }
        throw ei6.m39072i(obj);
    }

    @Override // p204p.w9g1
    /* JADX INFO: renamed from: c */
    public final int mo28477c(sxf1 sxf1Var) {
        dcg1 dcg1Var = ((r3g1) sxf1Var).zzc;
        int i = dcg1Var.f47558d;
        if (i != -1) {
            return i;
        }
        int iM51026n = 0;
        for (int i2 = 0; i2 < dcg1Var.f47555a; i2++) {
            int i3 = dcg1Var.f47556b[i2] >>> 3;
            rzf1 rzf1Var = (rzf1) dcg1Var.f47557c[i2];
            int iM84377P = v0g1.m84377P(8);
            int iM84377P2 = v0g1.m84377P(i3) + v0g1.m84377P(16);
            int iM84377P3 = v0g1.m84377P(24);
            int iMo40353e = rzf1Var.mo40353e();
            iM51026n += iM84377P + iM84377P + iM84377P2 + ilf1.m51026n(iMo40353e, iMo40353e, iM84377P3);
        }
        dcg1Var.f47558d = iM51026n;
        return iM51026n;
    }

    @Override // p204p.w9g1
    /* JADX INFO: renamed from: d */
    public final int mo28478d(r3g1 r3g1Var) {
        return r3g1Var.zzc.hashCode();
    }

    @Override // p204p.w9g1
    /* JADX INFO: renamed from: e */
    public final boolean mo28479e(r3g1 r3g1Var, r3g1 r3g1Var2) {
        return r3g1Var.zzc.equals(r3g1Var2.zzc);
    }

    @Override // p204p.w9g1
    /* JADX INFO: renamed from: f */
    public final void mo28480f(Object obj, use1 use1Var) {
        throw ei6.m39072i(obj);
    }

    @Override // p204p.w9g1
    public final r3g1 zze() {
        sxf1 sxf1Var = this.f24905a;
        return sxf1Var instanceof r3g1 ? ((r3g1) sxf1Var).m74652n() : ((g3g1) ((r3g1) sxf1Var).mo29132j(5)).m43488c();
    }

    @Override // p204p.w9g1
    public final void zzf(Object obj) {
        this.f24906b.getClass();
        dcg1 dcg1Var = ((r3g1) obj).zzc;
        if (dcg1Var.f47559e) {
            dcg1Var.f47559e = false;
        }
        wed1 wed1Var = n2g1.f149765a;
        throw ei6.m39072i(obj);
    }

    @Override // p204p.w9g1
    public final void zzg(Object obj, Object obj2) {
        cag1.m32045p(obj, obj2);
    }
}
