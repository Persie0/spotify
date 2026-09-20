package p204p;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bk5 extends n0e1 {
    /* JADX INFO: renamed from: A0 */
    public static void m29578A0(Object[] objArr, ot30 ot30Var, int i, int i2) {
        Arrays.fill(objArr, i, i2, ot30Var);
    }

    /* JADX INFO: renamed from: B0 */
    public static void m29579B0(int i, int i2, int i3, int[] iArr) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    /* JADX INFO: renamed from: C0 */
    public static void m29580C0(long[] jArr, long j) {
        Arrays.fill(jArr, 0, jArr.length, j);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m29581D0(Object[] objArr, Object obj) {
        Arrays.fill(objArr, 0, objArr.length, obj);
    }

    /* JADX INFO: renamed from: E0 */
    public static List m29582E0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public static Object m29583F0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: G0 */
    public static Object m29584G0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: H0 */
    public static b450 m29585H0(int[] iArr) {
        return new b450(0, iArr.length - 1, 1);
    }

    /* JADX INFO: renamed from: I0 */
    public static Integer m29586I0(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* JADX INFO: renamed from: J0 */
    public static Object m29587J0(int i, Object[] objArr) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: K0 */
    public static int m29588K0(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: L0 */
    public static int m29589L0(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m29590M0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, gh00 gh00Var) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            q0f1.m71839n(sb, obj, gh00Var);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: N0 */
    public static String m29591N0(byte[] bArr, gh00 gh00Var, int i) {
        String str = (i & 1) != 0 ? ", " : "";
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            gh00Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (gh00Var != null) {
                sb.append((CharSequence) gh00Var.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public static String m29592O0(Object[] objArr, String str, String str2, String str3, gh00 gh00Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            gh00Var = null;
        }
        StringBuilder sb = new StringBuilder();
        m29590M0(objArr, sb, str4, str5, str6, gh00Var);
        return sb.toString();
    }

    /* JADX INFO: renamed from: P0 */
    public static Object m29593P0(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: Q0 */
    public static int m29594Q0(Object[] objArr, Object obj) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: R0 */
    public static int m29595R0(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: S0 */
    public static byte[] m29596S0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        wj50.m88279p(bArrCopyOf);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: T0 */
    public static int[] m29597T0(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        wj50.m88279p(iArrCopyOf);
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: U0 */
    public static Object[] m29598U0(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: V0 */
    public static Object[] m29599V0(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        wj50.m88279p(objArrCopyOf);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: W0 */
    public static Object m29600W0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: X0 */
    public static byte[] m29601X0(byte[] bArr, b450 b450Var) {
        return b450Var.isEmpty() ? new byte[0] : m29639x0(b450Var.f278778a, bArr, b450Var.f278779b + 1);
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m29602Y0(Object[] objArr) {
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public static final void m29603Z0(Object[] objArr, Comparator comparator) {
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static void m29604a1(Object[] objArr, Comparator comparator, int i) {
        Arrays.sort(objArr, 0, i, comparator);
    }

    /* JADX INFO: renamed from: b1 */
    public static List m29605b1(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            m29603Z0(objArr, comparator);
        }
        return m29611g0(objArr);
    }

    /* JADX INFO: renamed from: c1 */
    public static List m29606c1(byte[] bArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return lau.f131415a;
        }
        if (i >= bArr.length) {
            return m29610f1(bArr);
        }
        if (i == 1) {
            return geg1.m44518y(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d1 */
    public static List m29607d1(int[] iArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return lau.f131415a;
        }
        if (i >= iArr.length) {
            return m29616i1(iArr);
        }
        if (i == 1) {
            return geg1.m44518y(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m29608e1(Object[] objArr, AbstractSet abstractSet) {
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static Iterable m29609f0(Object[] objArr) {
        return objArr.length == 0 ? lau.f131415a : new dk5(objArr, 0);
    }

    /* JADX INFO: renamed from: f1 */
    public static List m29610f1(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return lau.f131415a;
        }
        if (length == 1) {
            return geg1.m44518y(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    public static List m29611g0(Object[] objArr) {
        return Arrays.asList(objArr);
    }

    /* JADX INFO: renamed from: g1 */
    public static List m29612g1(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return lau.f131415a;
        }
        if (length == 1) {
            return geg1.m44518y(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public static qsz0 m29613h0(Object[] objArr) {
        return objArr.length == 0 ? fbu.f67898a : new ek5(objArr, 0);
    }

    /* JADX INFO: renamed from: h1 */
    public static List m29614h1(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return lau.f131415a;
        }
        if (length == 1) {
            return geg1.m44518y(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m29615i0(float f, float[] fArr) {
        return Arrays.binarySearch(fArr, 0, fArr.length, f);
    }

    /* JADX INFO: renamed from: i1 */
    public static List m29616i1(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return lau.f131415a;
        }
        if (length == 1) {
            return geg1.m44518y(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    /* JADX INFO: renamed from: j0 */
    public static boolean m29617j0(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j1 */
    public static List m29618j1(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return lau.f131415a;
        }
        if (length == 1) {
            return geg1.m44518y(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m29619k0(int[] iArr, int i) {
        return m29588K0(iArr, i) >= 0;
    }

    /* JADX INFO: renamed from: k1 */
    public static List m29620k1(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? m29611g0(Arrays.copyOf(objArr, objArr.length)) : geg1.m44518y(objArr[0]);
        }
        return lau.f131415a;
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m29621l0(Object[] objArr, Object obj) {
        return m29589L0(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: l1 */
    public static List m29622l1(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return lau.f131415a;
        }
        if (length == 1) {
            return geg1.m44518y(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m29623m0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!m29623m0((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof vq91) && (obj2 instanceof vq91)) {
                    byte[] bArr = ((vq91) obj).f243904a;
                    byte[] bArr2 = ((vq91) obj2).f243904a;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof ps91) && (obj2 instanceof ps91)) {
                    short[] sArr = ((ps91) obj).f180794a;
                    short[] sArr2 = ((ps91) obj2).f180794a;
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof wr91) && (obj2 instanceof wr91)) {
                    int[] iArr = ((wr91) obj).f254297a;
                    int[] iArr2 = ((wr91) obj2).f254297a;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof bs91) && (obj2 instanceof bs91)) {
                    long[] jArr = ((bs91) obj).f30263a;
                    long[] jArr2 = ((bs91) obj2).f30263a;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m1 */
    public static Set m29624m1(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return gbu.f78413a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c95.m31820L(objArr.length));
        m29608e1(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: n0 */
    public static void m29625n0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: n1 */
    public static Float[] m29626n1(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m29627o0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: o1 */
    public static Integer[] m29628o1(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m29629p0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: p1 */
    public static co40 m29630p1(Object[] objArr) {
        return new co40(new mo4(objArr, 3));
    }

    /* JADX INFO: renamed from: q0 */
    public static void m29631q0(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: q1 */
    public static ArrayList m29632q1(Object[] objArr, Object[] objArr2) {
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(pft0.m69840u(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m29633r0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: s0 */
    public static void m29634s0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: t0 */
    public static void m29635t0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    /* JADX INFO: renamed from: u0 */
    public static void m29636u0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    /* JADX INFO: renamed from: v0 */
    public static void m29637v0(float[] fArr, float[] fArr2, int i) {
        int i2 = (i & 4) != 0 ? 0 : 1;
        System.arraycopy(fArr, i2, fArr2, 0, ((i & 8) != 0 ? fArr.length : 6) - i2);
    }

    /* JADX INFO: renamed from: w0 */
    public static void m29638w0(long[] jArr, long[] jArr2, int i) {
        System.arraycopy(jArr, 0, jArr2, i, jArr.length);
    }

    /* JADX INFO: renamed from: x0 */
    public static byte[] m29639x0(int i, byte[] bArr, int i2) {
        n0e1.m63444u(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX INFO: renamed from: y0 */
    public static Object[] m29640y0(int i, int i2, Object[] objArr) {
        n0e1.m63444u(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    /* JADX INFO: renamed from: z0 */
    public static void m29641z0(long[] jArr, int i) {
        Arrays.fill(jArr, 0, i, 9223372034707292159L);
    }
}
