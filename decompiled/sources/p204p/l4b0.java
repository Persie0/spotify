package p204p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.BitrateLevel;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: classes5.dex */
public final class l4b0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final l4b0 f129617L0;

    /* JADX INFO: renamed from: M0 */
    public static final l4b0 f129618M0;

    /* JADX INFO: renamed from: N0 */
    public static final l4b0 f129619N0;

    /* JADX INFO: renamed from: O0 */
    public static final l4b0 f129620O0;

    /* JADX INFO: renamed from: P0 */
    public static final l4b0 f129621P0;

    /* JADX INFO: renamed from: Q0 */
    public static final l4b0 f129622Q0;

    /* JADX INFO: renamed from: R0 */
    public static final l4b0 f129623R0;

    /* JADX INFO: renamed from: S0 */
    public static final l4b0 f129624S0;

    /* JADX INFO: renamed from: T0 */
    public static final l4b0 f129625T0;

    /* JADX INFO: renamed from: U0 */
    public static final l4b0 f129626U0;

    /* JADX INFO: renamed from: V0 */
    public static final l4b0 f129627V0;

    /* JADX INFO: renamed from: W0 */
    public static final l4b0 f129628W0;

    /* JADX INFO: renamed from: X */
    public static final l4b0 f129629X;

    /* JADX INFO: renamed from: X0 */
    public static final l4b0 f129630X0;

    /* JADX INFO: renamed from: Y */
    public static final l4b0 f129631Y;

    /* JADX INFO: renamed from: Y0 */
    public static final l4b0 f129632Y0;

    /* JADX INFO: renamed from: Z */
    public static final l4b0 f129633Z;

    /* JADX INFO: renamed from: Z0 */
    public static final l4b0 f129634Z0;

    /* JADX INFO: renamed from: a1 */
    public static final l4b0 f129635a1;

    /* JADX INFO: renamed from: b */
    public static final l4b0 f129636b;

    /* JADX INFO: renamed from: b1 */
    public static final l4b0 f129637b1;

    /* JADX INFO: renamed from: c */
    public static final l4b0 f129638c;

    /* JADX INFO: renamed from: c1 */
    public static final l4b0 f129639c1;

    /* JADX INFO: renamed from: d */
    public static final l4b0 f129640d;

    /* JADX INFO: renamed from: e */
    public static final l4b0 f129641e;

    /* JADX INFO: renamed from: f */
    public static final l4b0 f129642f;

    /* JADX INFO: renamed from: g */
    public static final l4b0 f129643g;

    /* JADX INFO: renamed from: h */
    public static final l4b0 f129644h;

    /* JADX INFO: renamed from: i */
    public static final l4b0 f129645i;

    /* JADX INFO: renamed from: t */
    public static final l4b0 f129646t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129647a;

    static {
        int i = 0;
        f129636b = new l4b0(i, 0);
        f129638c = new l4b0(i, 1);
        f129640d = new l4b0(i, 2);
        f129641e = new l4b0(i, 3);
        f129642f = new l4b0(i, 4);
        f129643g = new l4b0(i, 5);
        f129644h = new l4b0(i, 6);
        f129645i = new l4b0(i, 7);
        f129646t = new l4b0(i, 8);
        f129629X = new l4b0(i, 9);
        f129631Y = new l4b0(i, 10);
        f129633Z = new l4b0(i, 11);
        f129617L0 = new l4b0(i, 12);
        f129618M0 = new l4b0(i, 13);
        f129619N0 = new l4b0(i, 14);
        f129620O0 = new l4b0(i, 15);
        f129621P0 = new l4b0(i, 16);
        f129622Q0 = new l4b0(i, 17);
        f129623R0 = new l4b0(i, 18);
        f129624S0 = new l4b0(i, 19);
        f129625T0 = new l4b0(i, 20);
        f129626U0 = new l4b0(i, 21);
        f129627V0 = new l4b0(i, 22);
        f129628W0 = new l4b0(i, 23);
        f129630X0 = new l4b0(i, 24);
        f129632Y0 = new l4b0(i, 25);
        f129634Z0 = new l4b0(i, 26);
        f129635a1 = new l4b0(i, 27);
        f129637b1 = new l4b0(i, 28);
        f129639c1 = new l4b0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4b0(int i, int i2) {
        super(i);
        this.f129647a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f129647a;
        int i2 = 3;
        String str = null;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                throw new IllegalStateException("No BetamaxCacheStorage provided.");
            case 1:
                throw new IllegalStateException("No BetamaxPlayerPool provided.");
            case 2:
                o6k o6kVarM51369i = iqg1.m51369i();
                o6k o6kVarM51369i2 = iqg1.m51369i();
                o6k o6kVarM51369i3 = iqg1.m51369i();
                BitrateLevel bitrateLevel = BitrateLevel.HIFI;
                BitrateLevel bitrateLevel2 = BitrateLevel.HIFI_24;
                o6k o6kVarM51370j = iqg1.m51370j(new BitrateLevel[]{bitrateLevel2}, bitrateLevel);
                o6k o6kVar = li50.f133725a;
                o6k o6kVarM51369i4 = iqg1.m51369i();
                e6b0 e6b0Var = e6b0.f56611d;
                o6k o6kVarM51370j2 = iqg1.m51370j(new e6b0[0], e6b0Var);
                o6k o6kVarM51369i5 = iqg1.m51369i();
                Boolean bool = Boolean.TRUE;
                pqm0 pqm0Var = new pqm0(new w1c(o6kVarM51369i, o6kVarM51369i2, o6kVarM51369i3, o6kVarM51370j, o6kVar, o6kVarM51369i4, o6kVarM51370j2, o6kVarM51369i5, iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, null, null, null, null, null, null, null, 522240), al91.f16813d);
                uzi uziVar = uzi.f235589a;
                o6k o6kVarM51370j3 = iqg1.m51370j(new uzi[0], uziVar);
                o6k o6kVarM51370j4 = iqg1.m51370j(new ngj0[0], ngj0.f153723b);
                o6k o6kVarM51369i6 = iqg1.m51369i();
                o6k o6kVarM51369i7 = iqg1.m51369i();
                o6k o6kVarM51369i8 = iqg1.m51369i();
                o6k o6kVarM51369i9 = iqg1.m51369i();
                o6k o6kVarM51369i10 = iqg1.m51369i();
                o6k o6kVarM51369i11 = iqg1.m51369i();
                o6k o6kVarM51370j5 = iqg1.m51370j(new Boolean[0], bool);
                w4b0 w4b0Var = w4b0.f247768d;
                w4b0 w4b0Var2 = w4b0.f247767c;
                w4b0 w4b0Var3 = w4b0.f247765a;
                pqm0 pqm0Var2 = new pqm0(new w1c(o6kVarM51370j3, o6kVarM51370j4, o6kVarM51369i6, o6kVarM51369i7, o6kVarM51369i8, o6kVarM51369i9, o6kVarM51369i10, o6kVarM51369i11, o6kVarM51370j5, iqg1.m51370j(new w4b0[]{w4b0Var, w4b0Var2}, w4b0Var3), iqg1.m51369i(), null, null, null, null, null, null, null, null, 522240), al91.f16814e);
                o6k o6kVarM51370j6 = iqg1.m51370j(new uzi[0], uziVar);
                o6k o6kVarM51369i12 = iqg1.m51369i();
                o6k o6kVarM51369i13 = iqg1.m51369i();
                o6k o6kVarM51370j7 = iqg1.m51370j(new BitrateLevel[0], bitrateLevel);
                o6k o6kVarM51370j8 = iqg1.m51370j(new Boolean[0], bool);
                o6k o6kVarM51369i14 = iqg1.m51369i();
                ki50 ki50Var = ki50.f122820b;
                pqm0 pqm0Var3 = new pqm0(new w1c(o6kVarM51370j6, o6kVarM51369i12, o6kVarM51369i13, o6kVar, o6kVarM51370j7, o6kVarM51370j8, o6kVarM51369i14, iqg1.m51370j(new ki50[0], ki50Var), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, null, null, null, null, null, null, null, 522240), al91.f16817h);
                pqm0 pqm0Var4 = new pqm0(new w1c(iqg1.m51370j(new uzi[0], uziVar), iqg1.m51370j(new ngj0[0], ngj0.f153722a), iqg1.m51370j(new Boolean[0], bool), o6kVar, iqg1.m51370j(new BitrateLevel[0], bitrateLevel), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51370j(new ki50[0], ki50Var), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, null, null, null, null, null, null, null, 522240), al91.f16816g);
                o6k o6kVarM51369i15 = iqg1.m51369i();
                o6k o6kVarM51369i16 = iqg1.m51369i();
                o6k o6kVarM51369i17 = iqg1.m51369i();
                o6k o6kVarM51370j9 = iqg1.m51370j(new BitrateLevel[0], bitrateLevel);
                o6k o6kVarM51369i18 = iqg1.m51369i();
                e6b0 e6b0Var2 = e6b0.f56610c;
                pqm0 pqm0Var5 = new pqm0(new w1c(o6kVarM51369i15, o6kVarM51369i16, o6kVarM51369i17, o6kVar, o6kVarM51370j9, o6kVarM51369i18, iqg1.m51370j(new e6b0[0], e6b0Var2), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, null, null, null, null, null, null, null, 522240), al91.f16818i);
                o6k o6kVarM51370j10 = iqg1.m51370j(new uzi[0], uziVar);
                o6k o6kVarM51369i19 = iqg1.m51369i();
                o6k o6kVarM51369i20 = iqg1.m51369i();
                o6k o6kVarM51369i21 = iqg1.m51369i();
                e6b0 e6b0Var3 = e6b0.f56608a;
                pqm0 pqm0Var6 = new pqm0(new w1c(o6kVarM51370j10, o6kVarM51369i19, o6kVarM51369i20, o6kVar, o6kVar, o6kVarM51369i21, iqg1.m51370j(new e6b0[]{e6b0Var}, e6b0Var3), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new w4b0[]{w4b0Var2}, w4b0Var3), iqg1.m51370j(new Boolean[0], bool), null, null, null, null, null, null, null, null, 522240), al91.f16819t);
                o6k o6kVarM51369i22 = iqg1.m51369i();
                o6k o6kVarM51369i23 = iqg1.m51369i();
                Boolean bool2 = Boolean.FALSE;
                pqm0 pqm0Var7 = new pqm0(new w1c(o6kVarM51369i22, o6kVarM51369i23, iqg1.m51370j(new Boolean[0], bool2), iqg1.m51370j(new BitrateLevel[0], bitrateLevel), iqg1.m51370j(new BitrateLevel[0], bitrateLevel), iqg1.m51369i(), iqg1.m51370j(new e6b0[]{e6b0Var2}, e6b0Var3), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), null, null, null, null, null, null, null, 520192), al91.f16809X);
                o6k o6kVarM51369i24 = iqg1.m51369i();
                o6k o6kVarM51369i25 = iqg1.m51369i();
                o6k o6kVarM51369i26 = iqg1.m51369i();
                o6k o6kVarM51370j11 = iqg1.m51370j(new BitrateLevel[0], bitrateLevel);
                o6k o6kVarM51369i27 = iqg1.m51369i();
                e6b0 e6b0Var4 = e6b0.f56609b;
                return new uw41(pqm0Var, pqm0Var2, pqm0Var3, pqm0Var4, pqm0Var5, pqm0Var6, pqm0Var7, new pqm0(new w1c(o6kVarM51369i24, o6kVarM51369i25, o6kVarM51369i26, o6kVar, o6kVarM51370j11, o6kVarM51369i27, iqg1.m51370j(new e6b0[]{e6b0Var4, e6b0Var2, e6b0Var}, e6b0Var3), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool2), iqg1.m51369i(), iqg1.m51369i(), null, null, null, null, null, null, null, null, 522240), al91.f16812c), new pqm0(new w1c(iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51370j(new BitrateLevel[]{bitrateLevel2}, bitrateLevel), iqg1.m51370j(new BitrateLevel[0], bitrateLevel), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new w4b0[0], w4b0Var2), iqg1.m51369i(), null, null, null, null, null, null, null, null, 522240), al91.f16815f), new pqm0(new w1c(iqg1.m51370j(new uzi[0], uziVar), iqg1.m51369i(), iqg1.m51369i(), o6kVar, iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new e6b0[]{e6b0Var}, e6b0Var3), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new Boolean[0], bool2), iqg1.m51370j(new Boolean[0], bool2), null, iqg1.m51370j(new Boolean[0], bool2), null, null, 428032), al91.f16810Y), new pqm0(new w1c(iqg1.m51370j(new uzi[0], uziVar), iqg1.m51369i(), iqg1.m51369i(), o6kVar, iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new e6b0[]{e6b0Var}, e6b0Var3), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new Boolean[0], bool2), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new Boolean[0], bool2), null, null, 395264), al91.f16811Z), new pqm0(new w1c(iqg1.m51370j(new uzi[0], uziVar), iqg1.m51369i(), iqg1.m51369i(), o6kVar, iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new e6b0[]{e6b0Var}, e6b0Var3), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new Boolean[0], bool2), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new Boolean[0], bool2), iqg1.m51370j(new Boolean[0], bool2), null, null, 395264), al91.f16806L0), new pqm0(new w1c(iqg1.m51370j(new uzi[0], uziVar), iqg1.m51369i(), iqg1.m51369i(), o6kVar, iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51370j(new e6b0[]{e6b0Var4, e6b0Var}, e6b0Var3), iqg1.m51369i(), iqg1.m51370j(new Boolean[0], bool), iqg1.m51369i(), iqg1.m51369i(), null, null, null, null, null, null, iqg1.m51370j(new Boolean[0], bool2), iqg1.m51370j(new Boolean[0], bool), 129024), al91.f16807M0));
            case 3:
                return new pn80(ql51.f189738a, e450.f55982a);
            case 4:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 5:
                return 0;
            case 6:
                return new l971(str, i2);
            case 7:
                return sam.m77645B(Boolean.FALSE);
            case 8:
                return new l971(str, i2);
            case 9:
                return new mj5(lcb0.f131894a, 0);
            case 10:
                return new mj5(ql51.f189738a, 0);
            case 11:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 12:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 13:
                return 0;
            case 14:
            case 15:
                return w2a1Var;
            case 16:
                WorkRunners.MyThreadFactory myThreadFactory4 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 17:
                WorkRunners.MyThreadFactory myThreadFactory5 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 18:
                return fv31.f73628b.m78182S("lyrics_preference_font_scale_key");
            case 19:
                WorkRunners.MyThreadFactory myThreadFactory6 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 20:
                WorkRunners.MyThreadFactory myThreadFactory7 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 21:
                WorkRunners.MyThreadFactory myThreadFactory8 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 22:
                WorkRunners.MyThreadFactory myThreadFactory9 = WorkRunners.f5771a;
                return new ImmediateWorkRunner();
            case 23:
                return w2a1Var;
            case 24:
                return new ueh0(st91.f213865b);
            case 25:
                return new ueh0(st91.f213865b);
            case 26:
                return null;
            case 27:
                return sam.m77645B(qxb0.f193613b);
            case 28:
                top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
                bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
                bjp0VarM18365h0.m29531u();
                bjp0VarM18365h0.m29524j0();
                top0VarM18421v.m81216x(bjp0VarM18365h0);
                return (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
            default:
                return w2a1Var;
        }
    }
}
