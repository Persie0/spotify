package p204p;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes9.dex */
public final class ge21 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nx4 f78999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sb91 f79000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f79001c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f79002d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qf40 f79003e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f79004f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ th00 f79005g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f79006h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ jc20 f79007i;

    public ge21(nx4 nx4Var, sb91 sb91Var, float f, float f2, qf40 qf40Var, boolean z, th00 th00Var, boolean z2, jc20 jc20Var) {
        this.f78999a = nx4Var;
        this.f79000b = sb91Var;
        this.f79001c = f;
        this.f79002d = f2;
        this.f79003e = qf40Var;
        this.f79004f = z;
        this.f79005g = th00Var;
        this.f79006h = z2;
        this.f79007i = jc20Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(o6q0 o6q0Var, fbk fbkVar) {
        Object objM33883e = cu61.m33883e(o6q0Var, null, null, null, new fe21(this.f78999a, this.f79000b, this.f79001c, this.f79002d, this.f79003e, this.f79004f, this.f79005g, this.f79006h, this.f79007i), fbkVar, 7);
        return objM33883e == yuk.f276404a ? objM33883e : w2a1.f247311a;
    }
}
