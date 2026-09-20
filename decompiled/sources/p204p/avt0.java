package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes11.dex */
public final class avt0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f20259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f20260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avt0(gh00 gh00Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f20258a = i;
        this.f20259b = gh00Var;
        this.f20260c = kqi0Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        switch (this.f20258a) {
            case 0:
                long j = ((Offset) obj2).f493a;
                kqi0 kqi0Var = this.f20260c;
                avt0 avt0Var = new avt0(this.f20259b, kqi0Var, (fbk) obj3, 0);
                w2a1 w2a1Var = w2a1.f247311a;
                avt0Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                ((Number) obj2).floatValue();
                kqi0 kqi0Var2 = this.f20260c;
                avt0 avt0Var2 = new avt0(this.f20259b, kqi0Var2, (fbk) obj3, 1);
                w2a1 w2a1Var2 = w2a1.f247311a;
                avt0Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f20258a) {
            case 0:
                bga.m29073P(obj);
                Boolean bool = Boolean.TRUE;
                this.f20260c.setValue(bool);
                this.f20259b.invoke(bool);
                break;
            default:
                bga.m29073P(obj);
                Boolean bool2 = Boolean.FALSE;
                this.f20260c.setValue(bool2);
                this.f20259b.invoke(bool2);
                break;
        }
        return w2a1.f247311a;
    }
}
