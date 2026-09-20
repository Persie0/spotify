package p204p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fjq {

    /* JADX INFO: renamed from: A */
    public static final List f70338A;

    /* JADX INFO: renamed from: B */
    public static final lau f70339B;

    /* JADX INFO: renamed from: C */
    public static final List f70340C;

    /* JADX INFO: renamed from: a */
    public static final List f70341a = h6f.m46715L(2, 4, 8, 12, 16, 32);

    /* JADX INFO: renamed from: b */
    public static final Set f70342b = Collections.singleton(12);

    /* JADX INFO: renamed from: c */
    public static final List f70343c;

    /* JADX INFO: renamed from: d */
    public static final List f70344d;

    /* JADX INFO: renamed from: e */
    public static final List f70345e;

    /* JADX INFO: renamed from: f */
    public static final List f70346f;

    /* JADX INFO: renamed from: g */
    public static final List f70347g;

    /* JADX INFO: renamed from: h */
    public static final List f70348h;

    /* JADX INFO: renamed from: i */
    public static final List f70349i;

    /* JADX INFO: renamed from: j */
    public static final List f70350j;

    /* JADX INFO: renamed from: k */
    public static final List f70351k;

    /* JADX INFO: renamed from: l */
    public static final List f70352l;

    /* JADX INFO: renamed from: m */
    public static final List f70353m;

    /* JADX INFO: renamed from: n */
    public static final List f70354n;

    /* JADX INFO: renamed from: o */
    public static final List f70355o;

    /* JADX INFO: renamed from: p */
    public static final List f70356p;

    /* JADX INFO: renamed from: q */
    public static final List f70357q;

    /* JADX INFO: renamed from: r */
    public static final List f70358r;

    /* JADX INFO: renamed from: s */
    public static final lau f70359s;

    /* JADX INFO: renamed from: t */
    public static final List f70360t;

    /* JADX INFO: renamed from: u */
    public static final List f70361u;

    /* JADX INFO: renamed from: v */
    public static final List f70362v;

    /* JADX INFO: renamed from: w */
    public static final List f70363w;

    /* JADX INFO: renamed from: x */
    public static final List f70364x;

    /* JADX INFO: renamed from: y */
    public static final lau f70365y;

    /* JADX INFO: renamed from: z */
    public static final List f70366z;

    static {
        v1r0 v1r0Var = v1r0.SimpleFade;
        v1r0 v1r0Var2 = v1r0.BassSwap;
        v1r0 v1r0Var3 = v1r0.EqSwap;
        v1r0 v1r0Var4 = v1r0.BassSwapLowPassFilterIn;
        v1r0 v1r0Var5 = v1r0.BassSwapFilterIn;
        v1r0 v1r0Var6 = v1r0.SimpleCut;
        f70343c = h6f.m46715L(v1r0Var, v1r0Var2, v1r0Var3, v1r0Var4, v1r0Var5, v1r0Var6);
        mzc1 mzc1Var = mzc1.CrossShape;
        mzc1 mzc1Var2 = mzc1.FullOverlap;
        mzc1 mzc1Var3 = mzc1.SlowInSlowOut;
        mzc1 mzc1Var4 = mzc1.FastInAtStartSlowOut;
        mzc1 mzc1Var5 = mzc1.SlowInFastOutAtEnd;
        mzc1 mzc1Var6 = mzc1.Cut;
        mzc1 mzc1Var7 = mzc1.Crossfade;
        f70344d = h6f.m46715L(mzc1Var, mzc1Var2, mzc1Var3, mzc1Var4, mzc1Var5, mzc1Var6, mzc1Var7);
        wbw wbwVar = wbw.BassSwap;
        wbw wbwVar2 = wbw.BassSwapAtEnd;
        wbw wbwVar3 = wbw.EqSwap;
        wbw wbwVar4 = wbw.None;
        f70345e = h6f.m46715L(wbwVar, wbwVar2, wbwVar3, wbwVar4);
        f2z f2zVar = f2z.None;
        f2z f2zVar2 = f2z.LowPassFilterOut;
        f2z f2zVar3 = f2z.LowPassFilterIn;
        f2z f2zVar4 = f2z.LowPassFilterInLowPassFilterOut;
        f2z f2zVar5 = f2z.LowPassFilterInFilterOut;
        f2z f2zVar6 = f2z.FilterOut;
        f2z f2zVar7 = f2z.FilterIn;
        f2z f2zVar8 = f2z.FilterInFilterOut;
        f2z f2zVar9 = f2z.FilterInLowPassFilterOut;
        f70346f = h6f.m46715L(f2zVar, f2zVar2, f2zVar3, f2zVar4, f2zVar5, f2zVar6, f2zVar7, f2zVar8, f2zVar9);
        f70347g = h6f.m46715L(v1r0Var, v1r0Var2, v1r0Var3, v1r0Var4, v1r0Var5, v1r0Var6);
        mzc1 mzc1Var8 = mzc1.SlowInSemiFastOutAtEnd;
        f70348h = h6f.m46715L(mzc1Var, mzc1Var2, mzc1Var3, mzc1Var4, mzc1Var5, mzc1Var6, mzc1Var7, mzc1Var8);
        wbw wbwVar5 = wbw.StartFadeOut;
        wbw wbwVar6 = wbw.BassSwapAtStart;
        wbw wbwVar7 = wbw.BassCuts;
        wbw wbwVar8 = wbw.NoBass;
        f70349i = h6f.m46715L(wbwVar, wbwVar2, wbwVar3, wbwVar6, wbwVar7, wbwVar8, wbwVar5, wbwVar4);
        f70350j = h6f.m46715L(f2zVar, f2zVar2, f2zVar3, f2zVar4, f2zVar5, f2zVar6, f2zVar7, f2zVar8, f2zVar9);
        f70351k = h6f.m46715L(v1r0Var, v1r0Var2, v1r0Var3, v1r0Var4, v1r0Var5, v1r0Var6);
        f70352l = h6f.m46715L(mzc1Var, mzc1Var2, mzc1Var3, mzc1Var4, mzc1Var5, mzc1Var6, mzc1Var7, mzc1Var8);
        f70353m = h6f.m46715L(wbwVar, wbwVar2, wbwVar3, wbwVar7, wbwVar8, wbwVar4);
        f70354n = h6f.m46715L(f2zVar, f2zVar2, f2zVar3, f2zVar4, f2zVar5, f2zVar6, f2zVar7, f2zVar8, f2zVar9);
        f70355o = h6f.m46715L(v1r0Var, v1r0Var2, v1r0Var3, v1r0Var4, v1r0Var5, v1r0Var6);
        f70356p = h6f.m46715L(mzc1Var, mzc1Var2, mzc1Var3, mzc1Var4, mzc1Var5, mzc1Var6, mzc1Var7, mzc1Var8);
        f70357q = h6f.m46715L(wbwVar, wbwVar2, wbwVar6, wbwVar3, wbwVar7, wbwVar8, wbwVar4);
        f70358r = h6f.m46715L(f2zVar, f2zVar2, f2zVar3, f2zVar4, f2zVar5, f2zVar6, f2zVar7, f2zVar8, f2zVar9);
        lau lauVar = lau.f131415a;
        f70359s = lauVar;
        f70360t = h6f.m46715L(mzc1Var, mzc1Var2, mzc1Var3, mzc1Var4, mzc1Var5, mzc1Var6, mzc1Var7, mzc1Var8, mzc1.FadeInOneBarCutOut, mzc1.OverlapOneBarCutOut);
        f70361u = h6f.m46715L(v1r0Var, v1r0Var2, v1r0Var3, v1r0Var4, v1r0Var5, v1r0Var6, v1r0.Dissolve, v1r0.Surge, v1r0.Afterglow);
        f70362v = h6f.m46715L(wbwVar, wbwVar2, wbwVar6, wbwVar3, wbwVar7, wbwVar8, wbw.BassFadeOut, wbwVar4);
        f70363w = h6f.m46715L(f2zVar, f2zVar2, f2zVar3, f2zVar4, f2zVar5, f2zVar6, f2zVar7, f2zVar8, f2zVar9, f2z.HighPassFilterHalfOut, f2z.NoiseOutEnd);
        f70364x = h6f.m46715L(pk00.None, pk00.ReverbOutCentre, pk00.ReverbCutEnd, pk00.ReverbOutEnd, pk00.EchoHalfCutEnd, pk00.EchoHalfOutEnd, pk00.Echo3QCutEnd, pk00.Echo3QOutEnd, pk00.Echo1CutEnd, pk00.Echo1OutEnd, pk00.DelayHalfCutEnd, pk00.Delay3QCutEnd);
        f70365y = lauVar;
        h4b0 h4b0Var = h4b0.HalvingEnd;
        h4b0 h4b0Var2 = h4b0.None;
        h4b0 h4b0Var3 = h4b0.OneBeat;
        h4b0 h4b0Var4 = h4b0.TwoBeat;
        h4b0 h4b0Var5 = h4b0.FourBeat;
        h4b0 h4b0Var6 = h4b0.EightBeat;
        h4b0 h4b0Var7 = h4b0.SixteenBeat;
        f70366z = h6f.m46715L(h4b0Var2, h4b0Var3, h4b0Var4, h4b0Var5, h4b0Var6, h4b0Var7, h4b0Var);
        f70338A = h6f.m46715L(h4b0Var2, h4b0Var3, h4b0Var4, h4b0Var5, h4b0Var6, h4b0Var7);
        f70339B = lauVar;
        f70340C = h6f.m46715L(hg60.None, hg60.SpinbackEnd1Beat, hg60.SpinbackEnd2Beat, hg60.SpinbackEnd4Beat, hg60.VinylStopFast4End, hg60.VinylStopFast2End, hg60.VinylStopFast1End, hg60.VinylStopSlowEnd);
    }
}
