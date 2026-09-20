package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class qq80 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191506a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Set f191507b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ i490 f191508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq80() {
        super(3, null);
        this.f191506a = 1;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        Set set = (Set) obj;
        i490 i490Var = (i490) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f191506a) {
            case 0:
                qq80 qq80Var = new qq80(3, 0, fbkVar);
                qq80Var.f191507b = set;
                qq80Var.f191508c = i490Var;
                return qq80Var.invokeSuspend(w2a1.f247311a);
            default:
                qq80 qq80Var2 = new qq80(3, 1, fbkVar);
                qq80Var2.f191507b = set;
                qq80Var2.f191508c = i490Var;
                return qq80Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f191506a) {
            case 0:
                Set set = this.f191507b;
                i490 i490Var = this.f191508c;
                bga.m29073P(obj);
                return new pqm0(set, i490Var);
            default:
                Set set2 = this.f191507b;
                i490 i490Var2 = this.f191508c;
                bga.m29073P(obj);
                return new l3p0(set2, i490Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq80(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f191506a = i2;
    }
}
