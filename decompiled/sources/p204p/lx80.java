package p204p;

import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class lx80 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137753a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f137754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aps f137755c;

    public /* synthetic */ lx80(niz nizVar, aps apsVar, int i) {
        this.f137753a = i;
        this.f137754b = nizVar;
        this.f137755c = apsVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws IOException {
        kx80 kx80Var;
        sx80 sx80Var;
        switch (this.f137753a) {
            case 0:
                if (fbkVar instanceof kx80) {
                    kx80Var = (kx80) fbkVar;
                    int i = kx80Var.f127359b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kx80Var.f127359b = i - Integer.MIN_VALUE;
                    } else {
                        kx80Var = new kx80(this, fbkVar);
                    }
                } else {
                    kx80Var = new kx80(this, fbkVar);
                }
                Object obj2 = kx80Var.f127358a;
                int i2 = kx80Var.f127359b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    p2x0 p2x0Var = (p2x0) obj;
                    nx80 nx80Var = new nx80(this.f137755c, 0);
                    p2x0Var.getClass();
                    if (p2x0Var instanceof k2x0) {
                        throw new IOException("Failed to get playlist: " + ((k2x0) p2x0Var).f118699a);
                    }
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objInvoke = nx80Var.invoke(((m2x0) p2x0Var).f139474a);
                    kx80Var.f127359b = 1;
                    Object objEmit = this.f137754b.emit(objInvoke, kx80Var);
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
                if (fbkVar instanceof sx80) {
                    sx80Var = (sx80) fbkVar;
                    int i3 = sx80Var.f214844b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        sx80Var.f214844b = i3 - Integer.MIN_VALUE;
                    } else {
                        sx80Var = new sx80(this, fbkVar);
                    }
                } else {
                    sx80Var = new sx80(this, fbkVar);
                }
                Object obj3 = sx80Var.f214843a;
                int i4 = sx80Var.f214844b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    p2x0 p2x0Var2 = (p2x0) obj;
                    nx80 nx80Var2 = new nx80(this.f137755c, 3);
                    p2x0Var2.getClass();
                    if (p2x0Var2 instanceof k2x0) {
                        throw new IOException("Failed to get playlist: " + ((k2x0) p2x0Var2).f118699a);
                    }
                    if (!(p2x0Var2 instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objInvoke2 = nx80Var2.invoke(((m2x0) p2x0Var2).f139474a);
                    sx80Var.f214844b = 1;
                    Object objEmit2 = this.f137754b.emit(objInvoke2, sx80Var);
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
