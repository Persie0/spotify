package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class voz0 implements mpz0, Iterable, pq60 {

    /* JADX INFO: renamed from: a */
    public final cqi0 f243555a;

    /* JADX INFO: renamed from: b */
    public kjc0 f243556b;

    /* JADX INFO: renamed from: c */
    public boolean f243557c;

    /* JADX INFO: renamed from: d */
    public boolean f243558d;

    public voz0() {
        long[] jArr = rdy0.f198228a;
        this.f243555a = new cqi0();
    }

    @Override // p204p.mpz0
    /* JADX INFO: renamed from: a */
    public final void mo62511a(lpz0 lpz0Var, Object obj) {
        boolean z = obj instanceof C1811ee;
        cqi0 cqi0Var = this.f243555a;
        if (z && cqi0Var.m33619c(lpz0Var)) {
            C1811ee c1811ee = (C1811ee) cqi0Var.m33623g(lpz0Var);
            C1811ee c1811ee2 = (C1811ee) obj;
            String str = c1811ee2.f58629a;
            if (str == null) {
                str = c1811ee.f58629a;
            }
            ai00 ai00Var = c1811ee2.f58630b;
            if (ai00Var == null) {
                ai00Var = c1811ee.f58630b;
            }
            cqi0Var.m33629m(lpz0Var, new C1811ee(str, ai00Var));
        } else {
            cqi0Var.m33629m(lpz0Var, obj);
        }
        lpz0Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[LOOP:0: B:5:0x0023->B:15:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[EDGE_INSN: B:18:0x005d->B:16:0x005d BREAK  A[LOOP:0: B:5:0x0023->B:15:0x005a], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final voz0 m86109b() {
        voz0 voz0Var = new voz0();
        voz0Var.f243557c = this.f243557c;
        voz0Var.f243558d = this.f243558d;
        cqi0 cqi0Var = voz0Var.f243555a;
        cqi0Var.getClass();
        cqi0 cqi0Var2 = this.f243555a;
        Object[] objArr = cqi0Var2.f40897b;
        Object[] objArr2 = cqi0Var2.f40898c;
        long[] jArr = cqi0Var2.f40896a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            cqi0Var.m33629m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return voz0Var;
    }

    /* JADX INFO: renamed from: d */
    public final Object m86110d(lpz0 lpz0Var) {
        Object objM33623g = this.f243555a.m33623g(lpz0Var);
        if (objM33623g != null) {
            return objM33623g;
        }
        throw new IllegalStateException("Key not present: " + lpz0Var + " - consider getOrElse or getOrNull");
    }

    /* JADX INFO: renamed from: e */
    public final void m86111e(voz0 voz0Var) {
        cqi0 cqi0Var = voz0Var.f243555a;
        Object[] objArr = cqi0Var.f40897b;
        Object[] objArr2 = cqi0Var.f40898c;
        long[] jArr = cqi0Var.f40896a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        lpz0 lpz0Var = (lpz0) obj;
                        cqi0 cqi0Var2 = this.f243555a;
                        Object objInvoke = lpz0Var.f135863b.invoke(cqi0Var2.m33623g(lpz0Var), obj2);
                        if (objInvoke != null) {
                            cqi0Var2.m33629m(lpz0Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voz0)) {
            return false;
        }
        voz0 voz0Var = (voz0) obj;
        return wj50.m88271j(this.f243555a, voz0Var.f243555a) && this.f243557c == voz0Var.f243557c && this.f243558d == voz0Var.f243558d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243558d) + s571.m77245d(this.f243555a.hashCode() * 31, 31, this.f243557c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        kjc0 kjc0Var = this.f243556b;
        if (kjc0Var == null) {
            cqi0 cqi0Var = this.f243555a;
            cqi0Var.getClass();
            kjc0 kjc0Var2 = new kjc0(cqi0Var);
            this.f243556b = kjc0Var2;
            kjc0Var = kjc0Var2;
        }
        return ((kyv) kjc0Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f243557c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f243558d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        cqi0 cqi0Var = this.f243555a;
        Object[] objArr = cqi0Var.f40897b;
        Object[] objArr2 = cqi0Var.f40898c;
        long[] jArr = cqi0Var.f40896a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((lpz0) obj).f135862a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kpg1.m57050w(this) + "{ " + ((Object) sb) + " }";
    }
}
