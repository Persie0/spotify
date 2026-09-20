package p204p;

import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class gpz0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final gpz0 f83275L0;

    /* JADX INFO: renamed from: M0 */
    public static final gpz0 f83276M0;

    /* JADX INFO: renamed from: N0 */
    public static final gpz0 f83277N0;

    /* JADX INFO: renamed from: O0 */
    public static final gpz0 f83278O0;

    /* JADX INFO: renamed from: P0 */
    public static final gpz0 f83279P0;

    /* JADX INFO: renamed from: Q0 */
    public static final gpz0 f83280Q0;

    /* JADX INFO: renamed from: R0 */
    public static final gpz0 f83281R0;

    /* JADX INFO: renamed from: S0 */
    public static final gpz0 f83282S0;

    /* JADX INFO: renamed from: T0 */
    public static final gpz0 f83283T0;

    /* JADX INFO: renamed from: U0 */
    public static final gpz0 f83284U0;

    /* JADX INFO: renamed from: V0 */
    public static final gpz0 f83285V0;

    /* JADX INFO: renamed from: W0 */
    public static final gpz0 f83286W0;

    /* JADX INFO: renamed from: X */
    public static final gpz0 f83287X;

    /* JADX INFO: renamed from: X0 */
    public static final gpz0 f83288X0;

    /* JADX INFO: renamed from: Y */
    public static final gpz0 f83289Y;

    /* JADX INFO: renamed from: Y0 */
    public static final gpz0 f83290Y0;

    /* JADX INFO: renamed from: Z */
    public static final gpz0 f83291Z;

    /* JADX INFO: renamed from: Z0 */
    public static final gpz0 f83292Z0;

    /* JADX INFO: renamed from: a1 */
    public static final gpz0 f83293a1;

    /* JADX INFO: renamed from: b */
    public static final gpz0 f83294b;

    /* JADX INFO: renamed from: b1 */
    public static final gpz0 f83295b1;

    /* JADX INFO: renamed from: c */
    public static final gpz0 f83296c;

    /* JADX INFO: renamed from: c1 */
    public static final gpz0 f83297c1;

    /* JADX INFO: renamed from: d */
    public static final gpz0 f83298d;

    /* JADX INFO: renamed from: e */
    public static final gpz0 f83299e;

    /* JADX INFO: renamed from: f */
    public static final gpz0 f83300f;

    /* JADX INFO: renamed from: g */
    public static final gpz0 f83301g;

    /* JADX INFO: renamed from: h */
    public static final gpz0 f83302h;

    /* JADX INFO: renamed from: i */
    public static final gpz0 f83303i;

    /* JADX INFO: renamed from: t */
    public static final gpz0 f83304t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83305a;

    static {
        int i = 2;
        f83294b = new gpz0(i, 0);
        f83296c = new gpz0(i, 1);
        f83298d = new gpz0(i, 2);
        f83299e = new gpz0(i, 3);
        f83300f = new gpz0(i, 4);
        f83301g = new gpz0(i, 5);
        f83302h = new gpz0(i, 6);
        f83303i = new gpz0(i, 7);
        f83304t = new gpz0(i, 8);
        f83287X = new gpz0(i, 9);
        f83289Y = new gpz0(i, 10);
        f83291Z = new gpz0(i, 11);
        f83275L0 = new gpz0(i, 12);
        f83276M0 = new gpz0(i, 13);
        f83277N0 = new gpz0(i, 14);
        f83278O0 = new gpz0(i, 15);
        f83279P0 = new gpz0(i, 16);
        f83280Q0 = new gpz0(i, 17);
        f83281R0 = new gpz0(i, 18);
        f83282S0 = new gpz0(i, 19);
        f83283T0 = new gpz0(i, 20);
        f83284U0 = new gpz0(i, 21);
        f83285V0 = new gpz0(i, 22);
        f83286W0 = new gpz0(i, 23);
        f83288X0 = new gpz0(i, 24);
        f83290Y0 = new gpz0(i, 25);
        f83292Z0 = new gpz0(i, 26);
        f83293a1 = new gpz0(i, 27);
        f83295b1 = new gpz0(i, 28);
        f83297c1 = new gpz0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gpz0(int i, int i2) {
        super(i);
        this.f83305a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String str;
        ai00 ai00Var;
        long j;
        long j2;
        switch (this.f83305a) {
            case 0:
                return (n04) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 2:
                return (hyj) obj;
            case 3:
                return (wxy) obj;
            case 4:
                return (w2a1) obj;
            case 5:
                return (w2a1) obj;
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 8:
                return (w2a1) obj;
            case 9:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 10:
                tix0 tix0Var = (tix0) obj;
                int i = ((tix0) obj2).f220762a;
                return tix0Var;
            case 11:
                return (ch01) obj;
            case 12:
                return (String) obj;
            case 13:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 14:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 15:
                return (String) obj;
            case 16:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 17:
                C1811ee c1811ee = (C1811ee) obj;
                C1811ee c1811ee2 = (C1811ee) obj2;
                if (c1811ee == null || (str = c1811ee.f58629a) == null) {
                    str = c1811ee2.f58629a;
                }
                if (c1811ee == null || (ai00Var = c1811ee.f58630b) == null) {
                    ai00Var = c1811ee2.f58630b;
                }
                return new C1811ee(str, ai00Var);
            case 18:
                cpz0 cpz0Var = (cpz0) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                voz0 voz0Var = ((cpz0) obj).f40689d;
                lpz0 lpz0Var = hpz0.f93964u;
                Object objM33623g = voz0Var.f243555a.m33623g(lpz0Var);
                if (objM33623g == null) {
                    objM33623g = objValueOf;
                }
                float fFloatValue = ((Number) objM33623g).floatValue();
                Object objM33623g2 = cpz0Var.f40689d.f243555a.m33623g(lpz0Var);
                if (objM33623g2 != null) {
                    objValueOf = objM33623g2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 19:
                zqz0 zqz0Var = (zqz0) obj;
                return Next.m15606h(new brz0(zqz0Var.f285487a, zqz0Var.f285488b, zqz0Var.f285489c, zqz0Var.f285490d, false, zqz0Var.f285491e, zqz0Var.f285492f));
            case 20:
                return null;
            case 21:
                return null;
            case 22:
                return new lvz0((v140) obj, (erc1) obj2);
            case 23:
                return null;
            case 24:
                return (iyz0) obj2;
            case 25:
                ufu ufuVar = ((jiu) obj).f112823a;
                int iOrdinal = ((ixu) obj2).ordinal();
                if (iOrdinal == 0) {
                    j = ufuVar.f229874a.f123094b;
                } else if (iOrdinal == 1) {
                    j = ufuVar.f229875b.f123094b;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = ufuVar.f229877d;
                }
                return new n6f(j);
            case 26:
                List list5 = (List) obj2;
                int iM31820L = c95.m31820L(i6f.m49804T(list5, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj3 : list5) {
                    linkedHashMap.put(((wyz0) obj3).f256414a, obj3);
                }
                return new xyz0(linkedHashMap);
            case 27:
                ufu ufuVar2 = ((jiu) obj).f112823a;
                int iOrdinal2 = ((ixu) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    j2 = ufuVar2.f229874a.f123094b;
                } else if (iOrdinal2 == 1) {
                    j2 = ufuVar2.f229875b.f123094b;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 = ufuVar2.f229874a.f123094b;
                }
                return new n6f(j2);
            case 28:
                return lau.f131415a;
            default:
                Set set = dd41.f47702f;
                String strM35694A = r46.m74730Y(r46.m74726U(((f1w0) obj).f64988a).m35710h()).m35694A();
                wj50.m88279p(strM35694A);
                return Next.m15606h(y801.m93035a((y801) obj2, false, strM35694A, 5));
        }
    }
}
