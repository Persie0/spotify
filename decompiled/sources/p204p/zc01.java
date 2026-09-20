package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class zc01 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281432a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f281433b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f281434c;

    /* JADX WARN: Multi-variable type inference failed */
    public zc01(niz nizVar, gh00 gh00Var, int i) {
        this.f281432a = i;
        switch (i) {
            case 1:
                this.f281433b = nizVar;
                this.f281434c = (qe70) gh00Var;
                break;
            default:
                this.f281433b = nizVar;
                this.f281434c = (qe70) gh00Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r6v11, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r6v7, types: [p.gh00, p.qe70] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        yc01 yc01Var;
        fd01 dd01Var;
        b951 b951Var;
        switch (this.f281432a) {
            case 0:
                if (fbkVar instanceof yc01) {
                    yc01Var = (yc01) fbkVar;
                    int i = yc01Var.f271351b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        yc01Var.f271351b = i - Integer.MIN_VALUE;
                    } else {
                        yc01Var = new yc01(this, fbkVar);
                    }
                } else {
                    yc01Var = new yc01(this, fbkVar);
                }
                Object obj2 = yc01Var.f271350a;
                int i2 = yc01Var.f271351b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    fd01 fd01Var = (fd01) obj;
                    if (fd01Var instanceof ed01) {
                        dd01Var = (fd01) this.f281434c.invoke(((ed01) fd01Var).f58419a);
                    } else {
                        if (!(fd01Var instanceof dd01)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dd01Var = new dd01(0, ((dd01) fd01Var).f47688a);
                    }
                    yc01Var.f271351b = 1;
                    Object objEmit = this.f281433b.emit(dd01Var, yc01Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof b951) {
                    b951Var = (b951) fbkVar;
                    int i3 = b951Var.f24776b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b951Var.f24776b = i3 - Integer.MIN_VALUE;
                    } else {
                        b951Var = new b951(this, fbkVar);
                    }
                } else {
                    b951Var = new b951(this, fbkVar);
                }
                Object obj3 = b951Var.f24775a;
                int i4 = b951Var.f24776b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Object objInvoke = this.f281434c.invoke(obj);
                    b951Var.f24776b = 1;
                    Object objEmit2 = this.f281433b.emit(objInvoke, b951Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
