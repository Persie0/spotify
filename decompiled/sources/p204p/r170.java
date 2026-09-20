package p204p;

import com.spotify.kidsaccount.api.p083v2.proto.NotEmpty;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;

/* JADX INFO: loaded from: classes2.dex */
public final class r170 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final hkh f194778a;

    /* JADX INFO: renamed from: b */
    public final v170 f194779b;

    /* JADX INFO: renamed from: c */
    public final i580 f194780c;

    /* JADX INFO: renamed from: d */
    public final t170 f194781d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2609yd f194782e;

    public r170(hkh hkhVar, v170 v170Var, i580 i580Var, t170 t170Var, InterfaceC2609yd interfaceC2609yd) {
        this.f194778a = hkhVar;
        this.f194779b = v170Var;
        this.f194780c = i580Var;
        this.f194781d = t170Var;
        this.f194782e = interfaceC2609yd;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        pw71 pw71Var = new pw71(new sl51(""));
        t170 t170Var = this.f194781d;
        return new pfm0(new qfm0[]{pw71Var, new q040(qsg1.m73713T(t170Var.m79866c()), qsg1.m73715V(t170Var.m79866c()), null), new e6m0(true), new maa0()}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        v170 v170Var = this.f194779b;
        e470 e470Var = v170Var.f236270b;
        l470 l470Var = e470Var.f56019a;
        ppj0 ppj0VarM12095p = NotEmpty.m12095p();
        ppj0VarM12095p.m70595m();
        return this.f194778a.m47840a(v3h1.m84575H(new CompletableToSingle(Completable.m23288l(l470Var.m58116a((NotEmpty) ppj0VarM12095p.build()).map(new oh3(e470Var, 15)).doOnSuccess(new dh30(v170Var, 11))), new yh1(this, 13), null)), xng.f263606a, new u5a0(new q170(this), new wa60(this, 7), yyx.f277624h, df60.f48483Y0), new hlh(null, null, null, false, 63));
    }
}
