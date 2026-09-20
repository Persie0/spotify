package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class bsh extends mb61 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30325a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Set f30326b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Set f30327c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Set f30328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsh() {
        super(4, null);
        this.f30325a = 0;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        Set set = (Set) obj;
        Set set2 = (Set) obj2;
        Set set3 = (Set) obj3;
        fbk fbkVar = (fbk) obj4;
        switch (this.f30325a) {
            case 0:
                bsh bshVar = new bsh(4, 0, fbkVar);
                bshVar.f30326b = set;
                bshVar.f30327c = set2;
                bshVar.f30328d = set3;
                return bshVar.invokeSuspend(w2a1.f247311a);
            default:
                bsh bshVar2 = new bsh(4, 1, fbkVar);
                bshVar2.f30326b = set;
                bshVar2.f30327c = set2;
                bshVar2.f30328d = set3;
                return bshVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f30325a) {
            case 0:
                Set set = this.f30326b;
                Set set2 = this.f30327c;
                Set set3 = this.f30328d;
                bga.m29073P(obj);
                return s601.m77309l0(s601.m77309l0(set, set2), set3);
            default:
                Set set4 = this.f30326b;
                Set set5 = this.f30327c;
                Set set6 = this.f30328d;
                bga.m29073P(obj);
                return s601.m77309l0(s601.m77309l0(set4, set5), set6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bsh(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f30325a = i2;
    }
}
