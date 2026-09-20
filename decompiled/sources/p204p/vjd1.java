package p204p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vjd1 {

    /* JADX INFO: renamed from: L0 */
    public static final vjd1 f241956L0;

    /* JADX INFO: renamed from: M0 */
    public static final vjd1 f241957M0;

    /* JADX INFO: renamed from: N0 */
    public static final vjd1 f241958N0;

    /* JADX INFO: renamed from: O0 */
    public static final vjd1 f241959O0;

    /* JADX INFO: renamed from: P0 */
    public static final vjd1 f241960P0;

    /* JADX INFO: renamed from: Q0 */
    public static final vjd1 f241961Q0;

    /* JADX INFO: renamed from: R0 */
    public static final vjd1 f241962R0;

    /* JADX INFO: renamed from: S0 */
    public static final vjd1 f241963S0;

    /* JADX INFO: renamed from: T0 */
    public static final vjd1 f241964T0;

    /* JADX INFO: renamed from: U0 */
    public static final /* synthetic */ vjd1[] f241965U0;

    /* JADX INFO: renamed from: X */
    public static final vjd1 f241966X;

    /* JADX INFO: renamed from: Y */
    public static final vjd1 f241967Y;

    /* JADX INFO: renamed from: Z */
    public static final vjd1 f241968Z;

    /* JADX INFO: renamed from: a */
    public static final List f241969a;

    /* JADX INFO: renamed from: b */
    public static final vjd1 f241970b;

    /* JADX INFO: renamed from: c */
    public static final vjd1 f241971c;

    /* JADX INFO: renamed from: d */
    public static final vjd1 f241972d;

    /* JADX INFO: renamed from: e */
    public static final vjd1 f241973e;

    /* JADX INFO: renamed from: f */
    public static final vjd1 f241974f;

    /* JADX INFO: renamed from: g */
    public static final vjd1 f241975g;

    /* JADX INFO: renamed from: h */
    public static final vjd1 f241976h;

    /* JADX INFO: renamed from: i */
    public static final vjd1 f241977i;

    /* JADX INFO: renamed from: t */
    public static final vjd1 f241978t;

    static {
        vjd1 vjd1Var = new vjd1("NONE", 0);
        f241970b = vjd1Var;
        vjd1 vjd1Var2 = new vjd1("TURN_LEFT", 1);
        f241971c = vjd1Var2;
        vjd1 vjd1Var3 = new vjd1("TURN_RIGHT", 2);
        f241972d = vjd1Var3;
        vjd1 vjd1Var4 = new vjd1("KEEP_LEFT", 3);
        f241973e = vjd1Var4;
        vjd1 vjd1Var5 = new vjd1("KEEP_RIGHT", 4);
        f241974f = vjd1Var5;
        vjd1 vjd1Var6 = new vjd1("CONTINUE_STRAIGHT", 5);
        f241975g = vjd1Var6;
        vjd1 vjd1Var7 = new vjd1("ROUNDABOUT_ENTER", 6);
        f241976h = vjd1Var7;
        vjd1 vjd1Var8 = new vjd1("ROUNDABOUT_EXIT", 7);
        f241977i = vjd1Var8;
        vjd1 vjd1Var9 = new vjd1("ROUNDABOUT_LEFT", 8);
        f241978t = vjd1Var9;
        vjd1 vjd1Var10 = new vjd1("ROUNDABOUT_EXIT_LEFT", 9);
        f241966X = vjd1Var10;
        vjd1 vjd1Var11 = new vjd1("ROUNDABOUT_STRAIGHT", 10);
        f241967Y = vjd1Var11;
        vjd1 vjd1Var12 = new vjd1("ROUNDABOUT_EXIT_STRAIGHT", 11);
        f241968Z = vjd1Var12;
        vjd1 vjd1Var13 = new vjd1("ROUNDABOUT_RIGHT", 12);
        f241956L0 = vjd1Var13;
        vjd1 vjd1Var14 = new vjd1("ROUNDABOUT_EXIT_RIGHT", 13);
        f241957M0 = vjd1Var14;
        vjd1 vjd1Var15 = new vjd1("ROUNDABOUT_U", 14);
        f241958N0 = vjd1Var15;
        vjd1 vjd1Var16 = new vjd1("ROUNDABOUT_EXIT_U", 15);
        f241959O0 = vjd1Var16;
        vjd1 vjd1Var17 = new vjd1("APPROACHING_DESTINATION", 16);
        f241960P0 = vjd1Var17;
        vjd1 vjd1Var18 = new vjd1("EXIT_LEFT", 17);
        f241961Q0 = vjd1Var18;
        vjd1 vjd1Var19 = new vjd1("EXIT_RIGHT", 18);
        f241962R0 = vjd1Var19;
        vjd1 vjd1Var20 = new vjd1("WAYPOINT_DELAY", 19);
        f241963S0 = vjd1Var20;
        vjd1 vjd1Var21 = new vjd1("U_TURN", 20);
        f241964T0 = vjd1Var21;
        f241965U0 = new vjd1[]{vjd1Var, vjd1Var2, vjd1Var3, vjd1Var4, vjd1Var5, vjd1Var6, vjd1Var7, vjd1Var8, vjd1Var9, vjd1Var10, vjd1Var11, vjd1Var12, vjd1Var13, vjd1Var14, vjd1Var15, vjd1Var16, vjd1Var17, vjd1Var18, vjd1Var19, vjd1Var20, vjd1Var21, new vjd1("NAV_INSTR_COUNT", 21)};
        vjd1[] vjd1VarArrValues = values();
        f241969a = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(vjd1VarArrValues, vjd1VarArrValues.length)));
    }

    public static vjd1 valueOf(String str) {
        return (vjd1) Enum.valueOf(vjd1.class, str);
    }

    public static vjd1[] values() {
        return (vjd1[]) f241965U0.clone();
    }
}
