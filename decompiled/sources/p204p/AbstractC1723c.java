package p204p;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1723c {

    /* JADX INFO: renamed from: a */
    public static final iva f32631a;

    /* JADX INFO: renamed from: b */
    public static final iva f32632b;

    /* JADX INFO: renamed from: c */
    public static final iva f32633c;

    /* JADX INFO: renamed from: d */
    public static final iva f32634d;

    /* JADX INFO: renamed from: e */
    public static final iva f32635e;

    static {
        iva ivaVar = new iva(kk40.m56679u("/"));
        ivaVar.f106180c = "/";
        f32631a = ivaVar;
        iva ivaVar2 = new iva(kk40.m56679u("\\"));
        ivaVar2.f106180c = "\\";
        f32632b = ivaVar2;
        iva ivaVar3 = new iva(kk40.m56679u("/\\"));
        ivaVar3.f106180c = "/\\";
        f32633c = ivaVar3;
        iva ivaVar4 = new iva(kk40.m56679u("."));
        ivaVar4.f106180c = ".";
        f32634d = ivaVar4;
        iva ivaVar5 = new iva(kk40.m56679u(".."));
        ivaVar5.f106180c = "..";
        f32635e = ivaVar5;
    }

    /* JADX INFO: renamed from: a */
    public static final int m31058a(tbn0 tbn0Var) {
        iva ivaVar = tbn0Var.f218908a;
        if (ivaVar.mo51747d() != 0) {
            if (ivaVar.mo51751i(0) != 47) {
                if (ivaVar.mo51751i(0) == 92) {
                    if (ivaVar.mo51747d() > 2 && ivaVar.mo51751i(1) == 92) {
                        int iMo51749f = ivaVar.mo51749f(f32632b.mo51750h(), 2);
                        return iMo51749f == -1 ? ivaVar.mo51747d() : iMo51749f;
                    }
                } else if (ivaVar.mo51747d() > 2 && ivaVar.mo51751i(1) == 58 && ivaVar.mo51751i(2) == 92) {
                    char cMo51751i = (char) ivaVar.mo51751i(0);
                    if ('a' <= cMo51751i && cMo51751i < '{') {
                        return 3;
                    }
                    if ('A' <= cMo51751i && cMo51751i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final tbn0 m31059b(tbn0 tbn0Var, tbn0 tbn0Var2, boolean z) {
        if (m31058a(tbn0Var2) != -1 || tbn0Var2.m80404f() != null) {
            return tbn0Var2;
        }
        iva ivaVarM31060c = m31060c(tbn0Var);
        if (ivaVarM31060c == null && (ivaVarM31060c = m31060c(tbn0Var2)) == null) {
            ivaVarM31060c = m31063f(tbn0.f218907b);
        }
        npa npaVar = new npa();
        npaVar.m65297I(tbn0Var.f218908a);
        if (npaVar.f156904b > 0) {
            npaVar.m65297I(ivaVarM31060c);
        }
        npaVar.m65297I(tbn0Var2.f218908a);
        return m31061d(npaVar, z);
    }

    /* JADX INFO: renamed from: c */
    public static final iva m31060c(tbn0 tbn0Var) {
        iva ivaVar = tbn0Var.f218908a;
        iva ivaVar2 = f32631a;
        if (iva.m51742g(ivaVar, ivaVar2) != -1) {
            return ivaVar2;
        }
        iva ivaVar3 = tbn0Var.f218908a;
        iva ivaVar4 = f32632b;
        if (iva.m51742g(ivaVar3, ivaVar4) != -1) {
            return ivaVar4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c A[EDGE_INSN: B:98:0x011c->B:81:0x011c BREAK  A[LOOP:1: B:53:0x00b7->B:112:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x010a A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final tbn0 m31061d(npa npaVar, boolean z) throws EOFException {
        iva ivaVar;
        long j;
        char cM65309h;
        boolean z2;
        ArrayList arrayList;
        boolean zMo45420R0;
        iva ivaVar2;
        int size;
        int i;
        long jM65311k;
        iva ivaVarMo45417J0;
        iva ivaVar3;
        npa npaVar2 = new npa();
        iva ivaVarM31062e = null;
        int i2 = 0;
        while (true) {
            if (!npaVar.mo45430x0(0L, f32631a)) {
                ivaVar = f32632b;
                if (!npaVar.mo45430x0(0L, ivaVar)) {
                    break;
                }
            }
            byte b = npaVar.readByte();
            if (ivaVarM31062e == null) {
                ivaVarM31062e = m31062e(b);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && wj50.m88271j(ivaVarM31062e, ivaVar);
        iva ivaVar4 = f32633c;
        if (z3) {
            wj50.m88279p(ivaVarM31062e);
            ivaVarM31062e.mo51760s(npaVar2, ivaVarM31062e.mo51747d());
            ivaVarM31062e.mo51760s(npaVar2, ivaVarM31062e.mo51747d());
        } else {
            if (i2 <= 0) {
                long jM65311k2 = npaVar.m65311k(0L, ivaVar4);
                if (ivaVarM31062e == null) {
                    ivaVarM31062e = jM65311k2 == -1 ? m31063f(tbn0.f218907b) : m31062e(npaVar.m65309h(jM65311k2));
                }
                if (wj50.m88271j(ivaVarM31062e, ivaVar) && npaVar.f156904b >= 2) {
                    j = -1;
                    if (npaVar.m65309h(1L) == 58 && (('a' <= (cM65309h = (char) npaVar.m65309h(0L)) && cM65309h < '{') || ('A' <= cM65309h && cM65309h < '['))) {
                        if (jM65311k2 == 2) {
                            npaVar2.mo25160U0(npaVar, 3L);
                        } else {
                            npaVar2.mo25160U0(npaVar, 2L);
                        }
                    }
                }
                if (npaVar2.f156904b > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zMo45420R0 = npaVar.mo45420R0();
                    ivaVar2 = f32634d;
                    if (!zMo45420R0) {
                        break;
                    }
                    jM65311k = npaVar.m65311k(0L, ivaVar4);
                    if (jM65311k == j) {
                        ivaVarMo45417J0 = npaVar.mo45417J0(npaVar.f156904b);
                    } else {
                        ivaVarMo45417J0 = npaVar.mo45417J0(jM65311k);
                        npaVar.readByte();
                    }
                    ivaVar3 = f32635e;
                    if (ivaVarMo45417J0.equals(ivaVar3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || wj50.m88271j(g6f.m43687A0(arrayList), ivaVar3)))) {
                                arrayList.add(ivaVarMo45417J0);
                            } else if (!z3 || arrayList.size() != 1) {
                                j6f.m52571c0(arrayList);
                            }
                        }
                    } else if (ivaVarMo45417J0.equals(ivaVar2) && !ivaVarMo45417J0.equals(iva.f106177d)) {
                        arrayList.add(ivaVarMo45417J0);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        npaVar2.m65297I(ivaVarM31062e);
                    }
                    npaVar2.m65297I((iva) arrayList.get(i));
                }
                if (npaVar2.f156904b == 0) {
                    npaVar2.m65297I(ivaVar2);
                }
                return new tbn0(npaVar2.mo45417J0(npaVar2.f156904b));
            }
            wj50.m88279p(ivaVarM31062e);
            ivaVarM31062e.mo51760s(npaVar2, ivaVarM31062e.mo51747d());
        }
        j = -1;
        if (npaVar2.f156904b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zMo45420R0 = npaVar.mo45420R0();
            ivaVar2 = f32634d;
            if (!zMo45420R0) {
                break;
                break;
            }
            jM65311k = npaVar.m65311k(0L, ivaVar4);
            if (jM65311k == j) {
                ivaVarMo45417J0 = npaVar.mo45417J0(npaVar.f156904b);
            } else {
                ivaVarMo45417J0 = npaVar.mo45417J0(jM65311k);
                npaVar.readByte();
            }
            ivaVar3 = f32635e;
            if (ivaVarMo45417J0.equals(ivaVar3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(ivaVarMo45417J0);
            } else if (ivaVarMo45417J0.equals(ivaVar2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                npaVar2.m65297I(ivaVarM31062e);
            }
            npaVar2.m65297I((iva) arrayList.get(i));
        }
        if (npaVar2.f156904b == 0) {
            npaVar2.m65297I(ivaVar2);
        }
        return new tbn0(npaVar2.mo45417J0(npaVar2.f156904b));
    }

    /* JADX INFO: renamed from: e */
    public static final iva m31062e(byte b) {
        if (b == 47) {
            return f32631a;
        }
        if (b == 92) {
            return f32632b;
        }
        throw new IllegalArgumentException(s571.m77246e(b, "not a directory separator: "));
    }

    /* JADX INFO: renamed from: f */
    public static final iva m31063f(String str) {
        if (wj50.m88271j(str, "/")) {
            return f32631a;
        }
        if (wj50.m88271j(str, "\\")) {
            return f32632b;
        }
        throw new IllegalArgumentException(edb.m38564m("not a directory separator: ", str));
    }
}
