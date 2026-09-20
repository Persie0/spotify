package p204p;

import com.comscore.streaming.ContentType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tfu {

    /* JADX INFO: renamed from: a */
    public static final tfu f220048a;

    /* JADX INFO: renamed from: b */
    public static final tfu f220049b;

    /* JADX INFO: renamed from: c */
    public static final tfu f220050c;

    /* JADX INFO: renamed from: d */
    public static final tfu f220051d;

    /* JADX INFO: renamed from: e */
    public static final tfu f220052e;

    /* JADX INFO: renamed from: f */
    public static final tfu f220053f;

    /* JADX INFO: renamed from: g */
    public static final tfu f220054g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ tfu[] f220055h;

    static {
        tfu tfuVar = new tfu("ExtraExtraSmall", 0);
        f220048a = tfuVar;
        tfu tfuVar2 = new tfu("ExtraSmall", 1);
        f220049b = tfuVar2;
        tfu tfuVar3 = new tfu("Small", 2);
        f220050c = tfuVar3;
        tfu tfuVar4 = new tfu("Medium", 3);
        f220051d = tfuVar4;
        tfu tfuVar5 = new tfu("Large", 4);
        f220052e = tfuVar5;
        tfu tfuVar6 = new tfu("ExtraLarge", 5);
        f220053f = tfuVar6;
        tfu tfuVar7 = new tfu("FacePileMini", 6);
        f220054g = tfuVar7;
        f220055h = new tfu[]{tfuVar, tfuVar2, tfuVar3, tfuVar4, tfuVar5, tfuVar6, tfuVar7};
    }

    public static tfu valueOf(String str) {
        return (tfu) Enum.valueOf(tfu.class, str);
    }

    public static tfu[] values() {
        return (tfu[]) f220055h.clone();
    }

    /* JADX INFO: renamed from: a */
    public final float m80707a(xq00 xq00Var) {
        int i;
        switch (ordinal()) {
            case 0:
                xq00Var.m91771i0(-921270174);
                float f = leu.m58816b(xq00Var).f117235g.f159604b;
                xq00Var.m91788r(false);
                return f;
            case 1:
                xq00Var.m91771i0(-921267873);
                float f2 = leu.m58816b(xq00Var).f117235g.f159605c;
                xq00Var.m91788r(false);
                return f2;
            case 2:
                xq00Var.m91771i0(-921265823);
                float f3 = leu.m58816b(xq00Var).f117235g.f159606d;
                xq00Var.m91788r(false);
                return f3;
            case 3:
                xq00Var.m91771i0(-921263678);
                float f4 = leu.m58816b(xq00Var).f117235g.f159608f;
                xq00Var.m91788r(false);
                return f4;
            case 4:
                xq00Var.m91771i0(-921261545);
                float fM60203b = leu.m58816b(xq00Var).f117232d.m60203b();
                xq00Var.m91788r(false);
                return fM60203b;
            case 5:
                xq00Var.m91771i0(-921260493);
                xq00Var.m91788r(false);
                i = ContentType.LONG_FORM_ON_DEMAND;
                break;
            case 6:
                xq00Var.m91771i0(-921259533);
                xq00Var.m91788r(false);
                i = 20;
                break;
            default:
                throw lq51.m59703i(-921272111, xq00Var, false);
        }
        return i;
    }
}
