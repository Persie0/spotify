package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class qvv0 implements cut {

    /* JADX INFO: renamed from: P0 */
    public static final Set f193108P0 = Collections.singleton("mft_disallow");

    /* JADX INFO: renamed from: L0 */
    public final BehaviorProcessor f193109L0 = BehaviorProcessor.m23783e0(Boolean.FALSE);

    /* JADX INFO: renamed from: M0 */
    public final m7t0 f193110M0 = njg1.m64621n(new ovv0(this, 0), ruv0.f202919M0, duu0.f53285T0, new ovv0(this, 1), 8);

    /* JADX INFO: renamed from: N0 */
    public final eos f193111N0 = hxg1.m49008u(ruv0.f202920N0, ruv0.f202921O0, new ovv0(this, 2));

    /* JADX INFO: renamed from: O0 */
    public final i5x f193112O0 = mhf1.m61771p(this).m94133b(jvv0.f116526d, jvv0.f116527e);

    /* JADX INFO: renamed from: X */
    public final luv0 f193113X;

    /* JADX INFO: renamed from: Y */
    public final i4t0 f193114Y;

    /* JADX INFO: renamed from: Z */
    public final hv31 f193115Z;

    /* JADX INFO: renamed from: a */
    public final Flowable f193116a;

    /* JADX INFO: renamed from: b */
    public final Flowable f193117b;

    /* JADX INFO: renamed from: c */
    public final p8p0 f193118c;

    /* JADX INFO: renamed from: d */
    public final Consumer f193119d;

    /* JADX INFO: renamed from: e */
    public final qwn0 f193120e;

    /* JADX INFO: renamed from: f */
    public final u4l0 f193121f;

    /* JADX INFO: renamed from: g */
    public final fal0 f193122g;

    /* JADX INFO: renamed from: h */
    public final k5m0 f193123h;

    /* JADX INFO: renamed from: i */
    public final ovf f193124i;

    /* JADX INFO: renamed from: t */
    public final ac4 f193125t;

    public qvv0(Flowable flowable, Flowable flowable2, p8p0 p8p0Var, Consumer consumer, qwn0 qwn0Var, u4l0 u4l0Var, fal0 fal0Var, k5m0 k5m0Var, ovf ovfVar, ac4 ac4Var, luv0 luv0Var, i4t0 i4t0Var, hv31 hv31Var) {
        this.f193116a = flowable;
        this.f193117b = flowable2;
        this.f193118c = p8p0Var;
        this.f193119d = consumer;
        this.f193120e = qwn0Var;
        this.f193121f = u4l0Var;
        this.f193122g = fal0Var;
        this.f193123h = k5m0Var;
        this.f193124i = ovfVar;
        this.f193125t = ac4Var;
        this.f193113X = luv0Var;
        this.f193114Y = i4t0Var;
        this.f193115Z = hv31Var;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f193112O0;
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        return this.f193111N0;
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        return this.f193110M0;
    }
}
