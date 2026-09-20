package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f8y0 implements e8y0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f67125a;

    /* JADX INFO: renamed from: b */
    public final cqi0 f67126b;

    /* JADX INFO: renamed from: c */
    public cqi0 f67127c;

    public f8y0(Map map, gh00 gh00Var) {
        cqi0 cqi0Var;
        this.f67125a = gh00Var;
        if (map == null || map.isEmpty()) {
            cqi0Var = null;
        } else {
            cqi0Var = new cqi0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                cqi0Var.m33629m(entry.getKey(), entry.getValue());
            }
        }
        this.f67126b = cqi0Var;
    }

    @Override // p204p.e8y0
    /* JADX INFO: renamed from: b */
    public final boolean mo38133b(Object obj) {
        return ((Boolean) this.f67125a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // p204p.e8y0
    /* JADX INFO: renamed from: c */
    public final Map mo38134c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        cqi0 cqi0Var = this.f67126b;
        if (cqi0Var == null && this.f67127c == null) {
            return nau.f152117a;
        }
        int i3 = 0;
        int i4 = cqi0Var != null ? cqi0Var.f40900e : 0;
        cqi0 cqi0Var2 = this.f67127c;
        HashMap map = new HashMap(i4 + (cqi0Var2 != null ? cqi0Var2.f40900e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (cqi0Var != null) {
            Object[] objArr = cqi0Var.f40897b;
            Object[] objArr2 = cqi0Var.f40898c;
            long[] jArr3 = cqi0Var.f40896a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        cqi0 cqi0Var3 = this.f67127c;
        if (cqi0Var3 != null) {
            Object[] objArr3 = cqi0Var3.f40897b;
            Object[] objArr4 = cqi0Var3.f40898c;
            long[] jArr4 = cqi0Var3.f40896a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((eh00) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!mo38133b(objInvoke)) {
                                            throw new IllegalStateException(dul.m37009l(objInvoke).toString());
                                        }
                                        map.put(str, h6f.m46710G(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((eh00) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !mo38133b(objInvoke2)) {
                                            throw new IllegalStateException(dul.m37009l(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // p204p.e8y0
    /* JADX INFO: renamed from: d */
    public final Object mo38135d(String str) {
        cqi0 cqi0Var = this.f67126b;
        List list = cqi0Var != null ? (List) cqi0Var.m33627k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && cqi0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iM33622f = cqi0Var.m33622f(str);
            if (iM33622f < 0) {
                iM33622f = ~iM33622f;
            }
            Object[] objArr = cqi0Var.f40898c;
            Object obj = objArr[iM33622f];
            cqi0Var.f40897b[iM33622f] = str;
            objArr[iM33622f] = listSubList;
        }
        return list.get(0);
    }

    @Override // p204p.e8y0
    /* JADX INFO: renamed from: f */
    public final d8y0 mo38136f(String str, eh00 eh00Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!zn91.m96537Y(str.charAt(i))) {
                cqi0 cqi0Var = this.f67127c;
                if (cqi0Var == null) {
                    long[] jArr = rdy0.f198228a;
                    cqi0Var = new cqi0();
                    this.f67127c = cqi0Var;
                }
                Object objM33623g = cqi0Var.m33623g(str);
                if (objM33623g == null) {
                    objM33623g = new ArrayList();
                    cqi0Var.m33629m(str, objM33623g);
                }
                ((List) objM33623g).add(eh00Var);
                return new ezw0(cqi0Var, str, eh00Var, 6);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
