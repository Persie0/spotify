package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class kjb0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f123293a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f123294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ib31 f123295c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f123296d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rv41 f123297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjb0(List list, long j, ib31 ib31Var, float f, rv41 rv41Var) {
        super(1);
        this.f123293a = list;
        this.f123294b = j;
        this.f123295c = ib31Var;
        this.f123296d = f;
        this.f123297e = rv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        List list = this.f123293a;
        ((uw70) obj).mo30902e(list.size(), new ry60(18, list), new ry60(19, list), new fyf(new jjb0(list, this.f123294b, this.f123295c, this.f123296d, this.f123297e), true, 2039820996));
        return w2a1.f247311a;
    }
}
