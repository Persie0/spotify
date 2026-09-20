package p204p;

import java.util.HashMap;
import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sp50 implements dz61 {

    /* JADX INFO: renamed from: a */
    public static final op50 f212734a;

    /* JADX INFO: renamed from: b */
    public static final pp50 f212735b;

    /* JADX INFO: renamed from: c */
    public static final qp50 f212736c;

    /* JADX INFO: renamed from: d */
    public static final rp50 f212737d;

    /* JADX INFO: renamed from: e */
    public static final int[] f212738e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ sp50[] f212739f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.op50] */
    static {
        ?? r0 = new sp50() { // from class: p.op50
            @Override // p204p.dz61
            /* JADX INFO: renamed from: a */
            public final boolean mo35640a(bz61 bz61Var) {
                return bz61Var.mo26516d(dce.DAY_OF_YEAR) && bz61Var.mo26516d(dce.MONTH_OF_YEAR) && bz61Var.mo26516d(dce.YEAR) && ice.m50249a(bz61Var).equals(np50.f156881a);
            }

            @Override // p204p.dz61
            /* JADX INFO: renamed from: b */
            public final az61 mo35641b(az61 az61Var, long j) {
                long jMo35644e = mo35644e(az61Var);
                range().m24690b(j, this);
                dce dceVar = dce.DAY_OF_YEAR;
                return az61Var.mo27575l((j - jMo35644e) + az61Var.mo26517g(dceVar), dceVar);
            }

            @Override // p204p.sp50, p204p.dz61
            /* JADX INFO: renamed from: c */
            public final a4b1 mo35642c(bz61 bz61Var) {
                if (!bz61Var.mo26516d(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long jMo26517g = bz61Var.mo26517g(sp50.f212735b);
                if (jMo26517g == 1) {
                    long jMo26517g2 = bz61Var.mo26517g(dce.YEAR);
                    np50 np50Var = np50.f156881a;
                    return np50.isLeapYear(jMo26517g2) ? a4b1.m24687d(1L, 91L) : a4b1.m24687d(1L, 90L);
                }
                if (jMo26517g == 2) {
                    return a4b1.m24687d(1L, 91L);
                }
                return (jMo26517g == 3 || jMo26517g == 4) ? a4b1.m24687d(1L, 92L) : range();
            }

            @Override // p204p.sp50, p204p.dz61
            /* JADX INFO: renamed from: d */
            public final bz61 mo35643d(HashMap map, ano anoVar, z0x0 z0x0Var) {
                jba0 jba0VarM52888D6;
                dce dceVar = dce.YEAR;
                Long l = (Long) map.get(dceVar);
                dz61 dz61Var = sp50.f212735b;
                Long l2 = (Long) map.get(dz61Var);
                if (l == null || l2 == null) {
                    return null;
                }
                int iM24689a = dceVar.f47538b.m24689a(l.longValue(), dceVar);
                long jLongValue = ((Long) map.get(sp50.f212734a)).longValue();
                if (z0x0Var == z0x0.f278182c) {
                    jba0VarM52888D6 = jba0.m52886z6(iM24689a, 1, 1).m52889E6(jlg1.m53683B(3, jlg1.m53686E(l2.longValue(), 1L))).m52888D6(jlg1.m53686E(jLongValue, 1L));
                } else {
                    int iM24689a2 = dz61Var.range().m24689a(l2.longValue(), dz61Var);
                    if (z0x0Var == z0x0.f278180a) {
                        int i = 91;
                        if (iM24689a2 == 1) {
                            np50 np50Var = np50.f156881a;
                            if (!np50.isLeapYear(iM24689a)) {
                                i = 90;
                            }
                        } else if (iM24689a2 != 2) {
                            i = 92;
                        }
                        a4b1.m24687d(1L, i).m24690b(jLongValue, this);
                    } else {
                        range().m24690b(jLongValue, this);
                    }
                    jba0VarM52888D6 = jba0.m52886z6(iM24689a, ((iM24689a2 - 1) * 3) + 1, 1).m52888D6(jLongValue - 1);
                }
                map.remove(this);
                map.remove(dceVar);
                map.remove(dz61Var);
                return jba0VarM52888D6;
            }

            @Override // p204p.dz61
            /* JADX INFO: renamed from: e */
            public final long mo35644e(bz61 bz61Var) {
                if (!bz61Var.mo26516d(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                int iMo30952h = bz61Var.mo30952h(dce.DAY_OF_YEAR);
                int iMo30952h2 = bz61Var.mo30952h(dce.MONTH_OF_YEAR);
                long jMo26517g = bz61Var.mo26517g(dce.YEAR);
                int i = (iMo30952h2 - 1) / 3;
                np50 np50Var = np50.f156881a;
                return iMo30952h - sp50.f212738e[i + (np50.isLeapYear(jMo26517g) ? 4 : 0)];
            }

            @Override // p204p.dz61
            public final a4b1 range() {
                return a4b1.m24688e(1L, 90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        f212734a = r0;
        pp50 pp50Var = new pp50();
        f212735b = pp50Var;
        qp50 qp50Var = new qp50();
        f212736c = qp50Var;
        rp50 rp50Var = new rp50();
        f212737d = rp50Var;
        f212739f = new sp50[]{r0, pp50Var, qp50Var, rp50Var};
        f212738e = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: renamed from: f */
    public static int m78856f(jba0 jba0Var) {
        int iOrdinal = jba0Var.m52898q6().ordinal();
        int iM52899r6 = jba0Var.m52899r6() - 1;
        int i = (3 - iOrdinal) + iM52899r6;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iM52899r6 < i3) {
            if (jba0Var.m52899r6() != 180) {
                jba0Var = jba0.m52879B6(jba0Var.f110722d, 180);
            }
            return (int) m78859i(jba0Var.m52891G6(-1L)).f12191d;
        }
        int iM38556e = edb.m38556e(iM52899r6, i3, 7, 1);
        if (iM38556e != 53 || i3 == -3 || (i3 == -2 && jba0Var.isLeapYear())) {
            return iM38556e;
        }
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m78857g(jba0 jba0Var) {
        int i = jba0Var.f110722d;
        int iM52899r6 = jba0Var.m52899r6();
        if (iM52899r6 <= 3) {
            return iM52899r6 - jba0Var.m52898q6().ordinal() < -2 ? i - 1 : i;
        }
        if (iM52899r6 >= 363) {
            return ((iM52899r6 - 363) - (jba0Var.isLeapYear() ? 1 : 0)) - jba0Var.m52898q6().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public static int m78858h(int i) {
        jba0 jba0VarM52886z6 = jba0.m52886z6(i, 1, 1);
        if (jba0VarM52886z6.m52898q6() != ioo.f104257c) {
            return (jba0VarM52886z6.m52898q6() == ioo.f104256b && jba0VarM52886z6.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: renamed from: i */
    public static a4b1 m78859i(jba0 jba0Var) {
        return a4b1.m24687d(1L, m78858h(m78857g(jba0Var)));
    }

    public static sp50 valueOf(String str) {
        return (sp50) Enum.valueOf(sp50.class, str);
    }

    public static sp50[] values() {
        return (sp50[]) f212739f.clone();
    }

    /* JADX INFO: renamed from: c */
    public a4b1 mo35642c(bz61 bz61Var) {
        return range();
    }

    /* JADX INFO: renamed from: d */
    public bz61 mo35643d(HashMap map, ano anoVar, z0x0 z0x0Var) {
        return null;
    }

    @Override // p204p.dz61
    public final boolean isDateBased() {
        return true;
    }
}
