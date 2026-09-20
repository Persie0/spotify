package p204p;

import com.comscore.streaming.ContentType;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class m6d1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final h6a0 f140467a;

    /* JADX INFO: renamed from: b */
    public final ubo f140468b;

    /* JADX INFO: renamed from: c */
    public final lf7 f140469c;

    /* JADX INFO: renamed from: d */
    public final w4a0 f140470d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f140471e;

    public m6d1(h6a0 h6a0Var, ubo uboVar, lf7 lf7Var, w4a0 w4a0Var, o6d1 o6d1Var) {
        this.f140467a = h6a0Var;
        this.f140468b = uboVar;
        this.f140469c = lf7Var;
        this.f140470d = w4a0Var;
        pw71 pw71Var = new pw71(new sl51(""));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f140471e = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90771c6(), xoc1.f263904I1, null), new tkm0(pkm0.f178491a, 0, 2), new i200(o6d1Var.m66332c()), new zox()}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f140471e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f140467a.m46707a(this.f140470d, new l6d1(this, 0), new hcm0(p711.m69242u(), null, new l6d1(this, 1), false, false, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND));
    }
}
