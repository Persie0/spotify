package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x6v0 implements xv41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f258757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ay7 f258758b;

    public x6v0(long j, ay7 ay7Var) {
        this.f258757a = j;
        this.f258758b = ay7Var;
    }

    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        return Collections.singletonList(pho.f177693a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (p204p.njg1.m64619l(r6.f258757a, r0) == r5) goto L24;
     */
    @Override // p204p.fiz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(niz nizVar, fbk fbkVar) {
        w6v0 w6v0Var;
        if (fbkVar instanceof w6v0) {
            w6v0Var = (w6v0) fbkVar;
            int i = w6v0Var.f248475d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6v0Var.f248475d = i - Integer.MIN_VALUE;
            } else {
                w6v0Var = new w6v0(this, fbkVar);
            }
        } else {
            w6v0Var = new w6v0(this, fbkVar);
        }
        Object obj = w6v0Var.f248473b;
        int i2 = w6v0Var.f248475d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            w6v0Var.f248472a = nizVar;
            w6v0Var.f248475d = 1;
            if (nizVar.emit(pho.f177693a, w6v0Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            nizVar = w6v0Var.f248472a;
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw edb.m38575x(obj);
            }
            nizVar = w6v0Var.f248472a;
            bga.m29073P(obj);
        }
        w6v0Var.f248472a = null;
        w6v0Var.f248475d = 3;
        this.f258758b.collect(nizVar, w6v0Var);
        return yukVar;
        w6v0Var.f248472a = nizVar;
        w6v0Var.f248475d = 2;
    }

    @Override // p204p.xv41
    public final /* bridge */ /* synthetic */ Object getValue() {
        return pho.f177693a;
    }
}
