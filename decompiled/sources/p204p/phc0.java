package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0044a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class phc0 {
    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0174  */
    /* JADX WARN: Code duplicated, block: B:60:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0182  */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:64:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0194  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0122 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static int m69975a(int i, Object obj, Object obj2) {
        int iM81698w0;
        int i2;
        xyd1 xyd1Var;
        int iM81677J0;
        jhc0 jhc0Var = (jhc0) obj;
        wgc0 wgc0Var = (wgc0) obj2;
        int iM81679L0 = 0;
        if (jhc0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : jhc0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            wgc0Var.getClass();
            int iM81677J1 = twe.m81677J0(i);
            rb5 rb5Var = wgc0Var.f251032a;
            xyd1 xyd1Var2 = (xyd1) rb5Var.f197471b;
            int i3 = muy.f147451c;
            int iM81698w1 = 1;
            int iM81677J2 = twe.m81677J0(1);
            oyd1 oyd1Var = xyd1.f267300d;
            if (xyd1Var2 == oyd1Var) {
                iM81677J2 *= 2;
            }
            switch (xyd1Var2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    iM81698w0 = 8;
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i4 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i4) + i4 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i5 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i5) + i5 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i6 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i6) + i6 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i7 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i7) + i7 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i8 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i8) + i8 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i9 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i9) + i9 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i10 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i10) + i10 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11) + i11 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i12 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i12) + i12 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i13 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i13) + i13 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i14 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i14) + i14 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i15 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i15) + i15 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i16 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i16) + i16 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i17 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i17) + i17 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i18 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i18) + i18 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i19 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i19) + i19 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i110) + i110 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111) + i111 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 1:
                    ((Float) key).getClass();
                    iM81698w0 = 4;
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i112) + i112 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i113) + i113 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i114) + i114 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i115) + i115 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i116) + i116 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i117) + i117 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i118) + i118 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i119) + i119 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i1110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1110) + i1110 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i1111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111) + i1111 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i1112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1112) + i1112 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i1113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1113) + i1113 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i1114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1114) + i1114 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i1115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1115) + i1115 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1116) + i1116 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1117) + i1117 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i1118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1118) + i1118 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i1119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1119) + i1119 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 2:
                    iM81698w0 = twe.m81698w0(((Long) key).longValue());
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i11110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11110) + i11110 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i11111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111) + i11111 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i11112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11112) + i11112 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i11113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11113) + i11113 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i11114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11114) + i11114 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11115) + i11115 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11116) + i11116 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11117) + i11117 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i11118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11118) + i11118 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i11119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11119) + i11119 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111110) + i111110 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111) + i111111 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111112) + i111112 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111113) + i111113 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111114) + i111114 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111115) + i111115 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111116) + i111116 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111117) + i111117 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 3:
                    iM81698w0 = twe.m81681N0(((Long) key).longValue());
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111118) + i111118 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111119) + i111119 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i1111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111110) + i1111110 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i1111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111) + i1111111 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i1111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111112) + i1111112 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111113) + i1111113 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111114) + i1111114 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111115) + i1111115 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i1111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111116) + i1111116 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i1111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111117) + i1111117 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i1111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111118) + i1111118 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i1111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111119) + i1111119 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i11111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111110) + i11111110 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i11111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111) + i11111111 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111112) + i11111112 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111113) + i11111113 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i11111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111114) + i11111114 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i11111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111115) + i11111115 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 4:
                    iM81698w0 = twe.m81696u0(((Integer) key).intValue());
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i11111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111116) + i11111116 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i11111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111117) + i11111117 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i11111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111118) + i11111118 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i11111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111119) + i11111119 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111110) + i111111110 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111) + i111111111 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111112) + i111111112 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111113) + i111111113 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111114) + i111111114 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111115) + i111111115 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111116) + i111111116 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111117) + i111111117 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111118) + i111111118 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111119) + i111111119 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111110) + i1111111110 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111) + i1111111111 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i1111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111112) + i1111111112 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i1111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111113) + i1111111113 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 5:
                    ((Long) key).getClass();
                    iM81698w0 = 8;
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i1111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111114) + i1111111114 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i1111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111115) + i1111111115 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i1111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111116) + i1111111116 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i1111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111117) + i1111111117 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i1111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111118) + i1111111118 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111119) + i1111111119 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111110) + i11111111110 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111) + i11111111111 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i11111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111112) + i11111111112 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i11111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111113) + i11111111113 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i11111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111114) + i11111111114 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i11111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111115) + i11111111115 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i11111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111116) + i11111111116 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i11111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111117) + i11111111117 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111118) + i11111111118 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111119) + i11111111119 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111110) + i111111111110 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111) + i111111111111 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 6:
                    ((Integer) key).getClass();
                    iM81698w0 = 4;
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111112) + i111111111112 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111113) + i111111111113 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111114) + i111111111114 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111115) + i111111111115 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111116) + i111111111116 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111117) + i111111111117 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111118) + i111111111118 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111119) + i111111111119 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i1111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111110) + i1111111111110 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i1111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111) + i1111111111111 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i1111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111112) + i1111111111112 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i1111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111113) + i1111111111113 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i1111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111114) + i1111111111114 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i1111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111115) + i1111111111115 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111116) + i1111111111116 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111117) + i1111111111117 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i1111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111118) + i1111111111118 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i1111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111119) + i1111111111119 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 7:
                    ((Boolean) key).getClass();
                    iM81698w0 = 1;
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111110) + i11111111111110 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111) + i11111111111111 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i11111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111112) + i11111111111112 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i11111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111113) + i11111111111113 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i11111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111114) + i11111111111114 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111115) + i11111111111115 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111116) + i11111111111116 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111117) + i11111111111117 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i11111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111118) + i11111111111118 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i11111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111119) + i11111111111119 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111110) + i111111111111110 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111) + i111111111111111 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111112) + i111111111111112 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111113) + i111111111111113 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111114) + i111111111111114 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111115) + i111111111111115 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111116) + i111111111111116 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111117) + i111111111111117 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 8:
                    iM81698w0 = key instanceof dva ? twe.m81686k0((dva) key) : twe.m81676I0((String) key);
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111118) + i111111111111118 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111119) + i111111111111119 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i1111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111110) + i1111111111111110 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i1111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111) + i1111111111111111 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i1111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111112) + i1111111111111112 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111113) + i1111111111111113 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111114) + i1111111111111114 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111115) + i1111111111111115 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i1111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111116) + i1111111111111116 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i1111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111117) + i1111111111111117 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i1111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111118) + i1111111111111118 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i1111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111119) + i1111111111111119 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i11111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111110) + i11111111111111110 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i11111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111) + i11111111111111111 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111112) + i11111111111111112 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111113) + i11111111111111113 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i11111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111114) + i11111111111111114 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i11111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111115) + i11111111111111115 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 9:
                    iM81698w0 = twe.m81694s0((AbstractC0044a) key);
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111116) + i11111111111111116 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111117) + i11111111111111117 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i11111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111118) + i11111111111111118 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i11111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111119) + i11111111111111119 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111110) + i111111111111111110 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111) + i111111111111111111 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111112) + i111111111111111112 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111113) + i111111111111111113 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111114) + i111111111111111114 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111115) + i111111111111111115 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111116) + i111111111111111116 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111117) + i111111111111111117 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111118) + i111111111111111118 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111119) + i111111111111111119 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111110) + i1111111111111111110 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111) + i1111111111111111111 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i1111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111112) + i1111111111111111112 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i1111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111113) + i1111111111111111113 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 10:
                    iM81698w0 = twe.m81700y0((AbstractC0044a) key);
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111114) + i1111111111111111114 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111115) + i1111111111111111115 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i1111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111116) + i1111111111111111116 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i1111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111117) + i1111111111111111117 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i1111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111118) + i1111111111111111118 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111119) + i1111111111111111119 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111110) + i11111111111111111110 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111) + i11111111111111111111 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i11111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111112) + i11111111111111111112 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i11111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111113) + i11111111111111111113 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i11111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111114) + i11111111111111111114 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i11111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111115) + i11111111111111111115 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i11111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111116) + i11111111111111111116 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i11111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111117) + i11111111111111111117 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111118) + i11111111111111111118 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111119) + i11111111111111111119 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111110) + i111111111111111111110 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111) + i111111111111111111111 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 11:
                    iM81698w0 = key instanceof dva ? twe.m81686k0((dva) key) : twe.m81684i0((byte[]) key);
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111112) + i111111111111111111112 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111113) + i111111111111111111113 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111114) + i111111111111111111114 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111115) + i111111111111111111115 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111116) + i111111111111111111116 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111117) + i111111111111111111117 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111118) + i111111111111111111118 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111119) + i111111111111111111119 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i1111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111110) + i1111111111111111111110 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i1111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111) + i1111111111111111111111 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i1111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111112) + i1111111111111111111112 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i1111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111113) + i1111111111111111111113 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i1111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111114) + i1111111111111111111114 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i1111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111115) + i1111111111111111111115 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111116) + i1111111111111111111116 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111117) + i1111111111111111111117 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i1111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111118) + i1111111111111111111118 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i1111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111119) + i1111111111111111111119 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 12:
                    iM81698w0 = twe.m81679L0(((Integer) key).intValue());
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111110) + i11111111111111111111110 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111) + i11111111111111111111111 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i11111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111112) + i11111111111111111111112 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i11111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111113) + i11111111111111111111113 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i11111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111114) + i11111111111111111111114 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111115) + i11111111111111111111115 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111116) + i11111111111111111111116 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111117) + i11111111111111111111117 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i11111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111118) + i11111111111111111111118 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i11111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111119) + i11111111111111111111119 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111110) + i111111111111111111111110 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111) + i111111111111111111111111 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111112) + i111111111111111111111112 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111113) + i111111111111111111111113 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111114) + i111111111111111111111114 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111115) + i111111111111111111111115 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111116) + i111111111111111111111116 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111117) + i111111111111111111111117 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 13:
                    iM81698w0 = twe.m81689n0(((Integer) key).intValue());
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111118) + i111111111111111111111118 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111119) + i111111111111111111111119 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i1111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111110) + i1111111111111111111111110 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i1111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111) + i1111111111111111111111111 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i1111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111112) + i1111111111111111111111112 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111113) + i1111111111111111111111113 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111114) + i1111111111111111111111114 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i1111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111115) + i1111111111111111111111115 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i1111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111116) + i1111111111111111111111116 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i1111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111117) + i1111111111111111111111117 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i1111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111118) + i1111111111111111111111118 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i1111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111119) + i1111111111111111111111119 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i11111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111110) + i11111111111111111111111110 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i11111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111) + i11111111111111111111111111 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111112) + i11111111111111111111111112 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111113) + i11111111111111111111111113 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i11111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111114) + i11111111111111111111111114 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i11111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111115) + i11111111111111111111111115 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 14:
                    ((Integer) key).getClass();
                    iM81698w0 = 4;
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111116) + i11111111111111111111111116 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111117) + i11111111111111111111111117 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i11111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111118) + i11111111111111111111111118 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i11111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111119) + i11111111111111111111111119 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i111111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111110) + i111111111111111111111111110 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111) + i111111111111111111111111111 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111112) + i111111111111111111111111112 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111113) + i111111111111111111111111113 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i111111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111114) + i111111111111111111111111114 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i111111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111115) + i111111111111111111111111115 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i111111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111116) + i111111111111111111111111116 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i111111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111117) + i111111111111111111111111117 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i111111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111118) + i111111111111111111111111118 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i111111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111119) + i111111111111111111111111119 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111110) + i1111111111111111111111111110 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111) + i1111111111111111111111111111 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i1111111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111112) + i1111111111111111111111111112 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i1111111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111113) + i1111111111111111111111111113 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 15:
                    ((Long) key).getClass();
                    iM81698w0 = 8;
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111114) + i1111111111111111111111111114 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111115) + i1111111111111111111111111115 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i1111111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111116) + i1111111111111111111111111116 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i1111111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111117) + i1111111111111111111111111117 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i1111111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111118) + i1111111111111111111111111118 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111119) + i1111111111111111111111111119 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111110) + i11111111111111111111111111110 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111) + i11111111111111111111111111111 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i11111111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111112) + i11111111111111111111111111112 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i11111111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111113) + i11111111111111111111111111113 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i11111111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111114) + i11111111111111111111111111114 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i11111111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111115) + i11111111111111111111111111115 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i11111111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111116) + i11111111111111111111111111116 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i11111111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111117) + i11111111111111111111111111117 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111118) + i11111111111111111111111111118 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111119) + i11111111111111111111111111119 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i111111111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111110) + i111111111111111111111111111110 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111111111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111) + i111111111111111111111111111111 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 16:
                    iM81698w0 = twe.m81672E0(((Integer) key).intValue());
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111112) + i111111111111111111111111111112 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111113) + i111111111111111111111111111113 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i111111111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111114) + i111111111111111111111111111114 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i111111111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111115) + i111111111111111111111111111115 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i111111111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111116) + i111111111111111111111111111116 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111117) + i111111111111111111111111111117 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111118) + i111111111111111111111111111118 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i111111111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111119) + i111111111111111111111111111119 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i1111111111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111110) + i1111111111111111111111111111110 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i1111111111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111111) + i1111111111111111111111111111111 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i1111111111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111112) + i1111111111111111111111111111112 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i1111111111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111113) + i1111111111111111111111111111113 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i1111111111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111114) + i1111111111111111111111111111114 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i1111111111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111115) + i1111111111111111111111111111115 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i1111111111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111116) + i1111111111111111111111111111116 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i1111111111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111117) + i1111111111111111111111111111117 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i1111111111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111118) + i1111111111111111111111111111118 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i1111111111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i1111111111111111111111111111119) + i1111111111111111111111111111119 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                case 17:
                    iM81698w0 = twe.m81674G0(((Long) key).longValue());
                    i2 = iM81698w0 + iM81677J2;
                    xyd1Var = (xyd1) rb5Var.f197472c;
                    iM81677J0 = twe.m81677J0(2);
                    if (xyd1Var == oyd1Var) {
                        iM81677J0 *= 2;
                    }
                    switch (xyd1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111110) + i11111111111111111111111111111110 + iM81677J1;
                            break;
                        case 1:
                            ((Float) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111111) + i11111111111111111111111111111111 + iM81677J1;
                            break;
                        case 2:
                            iM81698w1 = twe.m81698w0(((Long) value).longValue());
                            int i11111111111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111112) + i11111111111111111111111111111112 + iM81677J1;
                            break;
                        case 3:
                            iM81698w1 = twe.m81681N0(((Long) value).longValue());
                            int i11111111111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111113) + i11111111111111111111111111111113 + iM81677J1;
                            break;
                        case 4:
                            iM81698w1 = twe.m81696u0(((Integer) value).intValue());
                            int i11111111111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111114) + i11111111111111111111111111111114 + iM81677J1;
                            break;
                        case 5:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i11111111111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111115) + i11111111111111111111111111111115 + iM81677J1;
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i11111111111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111116) + i11111111111111111111111111111116 + iM81677J1;
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            int i11111111111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111117) + i11111111111111111111111111111117 + iM81677J1;
                            break;
                        case 8:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81676I0((String) value);
                            }
                            int i11111111111111111111111111111118 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111118) + i11111111111111111111111111111118 + iM81677J1;
                            break;
                        case 9:
                            iM81698w1 = twe.m81694s0((AbstractC0044a) value);
                            int i11111111111111111111111111111119 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i11111111111111111111111111111119) + i11111111111111111111111111111119 + iM81677J1;
                            break;
                        case 10:
                            iM81698w1 = twe.m81700y0((AbstractC0044a) value);
                            int i111111111111111111111111111111110 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111110) + i111111111111111111111111111111110 + iM81677J1;
                            break;
                        case 11:
                            if (value instanceof dva) {
                                iM81698w1 = twe.m81686k0((dva) value);
                            } else {
                                iM81698w1 = twe.m81684i0((byte[]) value);
                            }
                            int i111111111111111111111111111111111 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111111) + i111111111111111111111111111111111 + iM81677J1;
                            break;
                        case 12:
                            iM81698w1 = twe.m81679L0(((Integer) value).intValue());
                            int i111111111111111111111111111111112 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111112) + i111111111111111111111111111111112 + iM81677J1;
                            break;
                        case 13:
                            iM81698w1 = twe.m81689n0(((Integer) value).intValue());
                            int i111111111111111111111111111111113 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111113) + i111111111111111111111111111111113 + iM81677J1;
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            iM81698w1 = 4;
                            int i111111111111111111111111111111114 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111114) + i111111111111111111111111111111114 + iM81677J1;
                            break;
                        case 15:
                            ((Long) value).getClass();
                            iM81698w1 = 8;
                            int i111111111111111111111111111111115 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111115) + i111111111111111111111111111111115 + iM81677J1;
                            break;
                        case 16:
                            iM81698w1 = twe.m81672E0(((Integer) value).intValue());
                            int i111111111111111111111111111111116 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111116) + i111111111111111111111111111111116 + iM81677J1;
                            break;
                        case 17:
                            iM81698w1 = twe.m81674G0(((Long) value).longValue());
                            int i111111111111111111111111111111117 = iM81698w1 + iM81677J0 + i2;
                            iM81679L0 += twe.m81679L0(i111111111111111111111111111111117) + i111111111111111111111111111111117 + iM81677J1;
                            break;
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                    break;
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return iM81679L0;
    }

    /* JADX INFO: renamed from: b */
    public static jhc0 m69976b(Object obj, Object obj2) {
        jhc0 jhc0VarM53375c = (jhc0) obj;
        jhc0 jhc0Var = (jhc0) obj2;
        if (!jhc0Var.isEmpty()) {
            if (!jhc0VarM53375c.f112389a) {
                jhc0VarM53375c = jhc0VarM53375c.m53375c();
            }
            jhc0VarM53375c.m53374b();
            if (!jhc0Var.isEmpty()) {
                jhc0VarM53375c.putAll(jhc0Var);
            }
        }
        return jhc0VarM53375c;
    }
}
