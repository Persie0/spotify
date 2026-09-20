package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class btv0 extends xf40 {

    /* JADX INFO: renamed from: g */
    public static final btv0 f30940g = new btv0(0, null, new Object[0]);

    /* JADX INFO: renamed from: d */
    public final transient Object f30941d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f30942e;

    /* JADX INFO: renamed from: f */
    public final transient int f30943f;

    public btv0(int i, Object obj, Object[] objArr) {
        this.f30941d = obj;
        this.f30942e = objArr;
        this.f30943f = i;
    }

    /* JADX INFO: renamed from: q */
    public static btv0 m30469q(int i, Object[] objArr, vf40 vf40Var) {
        if (i == 0) {
            return f30940g;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new btv0(1, null, objArr);
        }
        c95.m31851q(i, objArr.length >> 1);
        Object objM30470r = m30470r(objArr, i, hg40.m47403m(i), 0);
        if (objM30470r instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM30470r;
            uf40 uf40Var = (uf40) objArr2[2];
            if (vf40Var == null) {
                throw uf40Var.m82952a();
            }
            vf40Var.f240895c = uf40Var;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM30470r = obj;
            i = iIntValue;
        }
        return new btv0(i, objM30470r, objArr);
    }

    /* JADX INFO: renamed from: r */
    public static Object m30470r(Object[] objArr, int i, int i2, int i3) {
        uf40 uf40Var = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int iM30840q = bxg1.m30840q(obj.hashCode());
                while (true) {
                    int i9 = iM30840q & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                        break;
                    }
                    if (obj.equals(objArr[i10])) {
                        int i11 = i10 ^ 1;
                        Object obj3 = objArr[i11];
                        Objects.requireNonNull(obj3);
                        uf40Var = new uf40(obj, obj2, obj3);
                        objArr[i11] = obj2;
                        break;
                    }
                    iM30840q = i9 + 1;
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), uf40Var};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int iM30840q2 = bxg1.m30840q(obj4.hashCode());
                while (true) {
                    int i15 = iM30840q2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                        break;
                    }
                    if (obj4.equals(objArr[i16])) {
                        int i17 = i16 ^ 1;
                        Object obj6 = objArr[i17];
                        Objects.requireNonNull(obj6);
                        uf40Var = new uf40(obj4, obj5, obj6);
                        objArr[i17] = obj5;
                        break;
                    }
                    iM30840q2 = i15 + 1;
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), uf40Var};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int iM30840q3 = bxg1.m30840q(obj7.hashCode());
            while (true) {
                int i21 = iM30840q3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                    break;
                }
                if (obj7.equals(objArr[i22])) {
                    int i23 = i22 ^ 1;
                    Object obj9 = objArr[i23];
                    Objects.requireNonNull(obj9);
                    uf40Var = new uf40(obj7, obj8, obj9);
                    objArr[i23] = obj8;
                    break;
                }
                iM30840q3 = i21 + 1;
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), uf40Var};
    }

    /* JADX INFO: renamed from: s */
    public static Object m30471s(int i, int i2, Object obj, Object obj2, Object[] objArr) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iM30840q = bxg1.m30840q(obj2.hashCode());
            while (true) {
                int i3 = iM30840q & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iM30840q = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM30840q2 = bxg1.m30840q(obj2.hashCode());
            while (true) {
                int i5 = iM30840q2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iM30840q2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM30840q3 = bxg1.m30840q(obj2.hashCode());
            while (true) {
                int i7 = iM30840q3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iM30840q3 = i7 + 1;
            }
        }
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: d */
    public final hg40 mo30472d() {
        return new ysv0(this, this.f30942e, 0, this.f30943f);
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: e */
    public final hg40 mo30473e() {
        return new zsv0(this, new atv0(0, this.f30943f, this.f30942e));
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: f */
    public final ef40 mo30474f() {
        return new atv0(1, this.f30943f, this.f30942e);
    }

    @Override // p204p.xf40, java.util.Map
    public final Object get(Object obj) {
        Object objM30471s = m30471s(this.f30943f, 0, this.f30941d, obj, this.f30942e);
        if (objM30471s == null) {
            return null;
        }
        return objM30471s;
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f30943f;
    }

    @Override // p204p.xf40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
