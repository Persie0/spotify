package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dx4 implements m6d0 {

    /* JADX INFO: renamed from: a */
    public final lx4 f53846a;

    public dx4(lx4 lx4Var) {
        this.f53846a = lx4Var;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: a */
    public final n6d0 mo24627a(o6d0 o6d0Var, List list, long j) {
        t5o0 t5o0Var;
        int i;
        t5o0 t5o0Var2;
        int i2;
        int i3;
        int size = list.size();
        t5o0[] t5o0VarArr = new t5o0[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            t5o0Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            h6d0 h6d0Var = (h6d0) list.get(i4);
            Object objMo30025g = h6d0Var.mo30025g();
            fx4 fx4Var = objMo30025g instanceof fx4 ? (fx4) objMo30025g : null;
            if (fx4Var != null && ((Boolean) fx4Var.f74237a.getValue()).booleanValue()) {
                t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
                long j3 = (((long) t5o0VarMo39619B.f217323b) & 4294967295L) | (((long) t5o0VarMo39619B.f217322a) << 32);
                t5o0VarArr[i4] = t5o0VarMo39619B;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            h6d0 h6d0Var2 = (h6d0) list.get(i5);
            if (t5o0VarArr[i5] == null) {
                t5o0VarArr[i5] = h6d0Var2.mo39619B(j);
            }
        }
        if (o6d0Var.mo34819a0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                t5o0Var2 = t5o0VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = t5o0Var2 != null ? t5o0Var2.f217322a : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            t5o0 t5o0Var3 = t5o0VarArr[i8];
                            int i9 = t5o0Var3 != null ? t5o0Var3.f217322a : 0;
                            if (i7 < i9) {
                                t5o0Var2 = t5o0Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                t5o0Var2 = null;
            }
            i2 = t5o0Var2 != null ? t5o0Var2.f217322a : 0;
        }
        if (o6d0Var.mo34819a0()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                t5o0Var = t5o0VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = t5o0Var != null ? t5o0Var.f217323b : 0;
                    if (1 <= i10) {
                        while (true) {
                            t5o0 t5o0Var4 = t5o0VarArr[i];
                            int i12 = t5o0Var4 != null ? t5o0Var4.f217323b : 0;
                            if (i11 < i12) {
                                t5o0Var = t5o0Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = t5o0Var != null ? t5o0Var.f217323b : 0;
        }
        if (!o6d0Var.mo34819a0()) {
            this.f53846a.f137719d.setValue(new g450((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return o6d0Var.mo44714T(i2, i3, nau.f152117a, new cx4(t5o0VarArr, this, i2, i3));
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: b */
    public final int mo24772b(rj50 rj50Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((h6d0) list.get(0)).mo39623w(i));
            int iM46714K = h6f.m46714K(list);
            int i2 = 1;
            if (1 <= iM46714K) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h6d0) list.get(i2)).mo39623w(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM46714K) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: c */
    public final int mo24773c(rj50 rj50Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((h6d0) list.get(0)).mo39621l(i));
            int iM46714K = h6f.m46714K(list);
            int i2 = 1;
            if (1 <= iM46714K) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h6d0) list.get(i2)).mo39621l(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM46714K) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: d */
    public final int mo24774d(rj50 rj50Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((h6d0) list.get(0)).mo39620d(i));
            int iM46714K = h6f.m46714K(list);
            int i2 = 1;
            if (1 <= iM46714K) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h6d0) list.get(i2)).mo39620d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM46714K) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: e */
    public final int mo24775e(rj50 rj50Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((h6d0) list.get(0)).mo39622u(i));
            int iM46714K = h6f.m46714K(list);
            int i2 = 1;
            if (1 <= iM46714K) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h6d0) list.get(i2)).mo39622u(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM46714K) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
