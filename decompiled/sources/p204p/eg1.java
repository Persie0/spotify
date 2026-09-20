package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class eg1 implements v5m {

    /* JADX INFO: renamed from: a */
    public final lqi0 f59194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gg1 f59195b;

    public eg1(lqi0 lqi0Var, gg1 gg1Var) {
        this.f59195b = gg1Var;
        this.f59194a = lqi0Var;
    }

    @Override // p204p.v5m
    /* JADX INFO: renamed from: a */
    public final xv41 mo38766a() {
        return this.f59194a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p204p.v5m
    /* JADX INFO: renamed from: b */
    public final Object mo38767b(String str, ibk ibkVar) {
        dg1 dg1Var;
        if (ibkVar instanceof dg1) {
            dg1Var = (dg1) ibkVar;
            int i = dg1Var.f48701c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dg1Var.f48701c = i - Integer.MIN_VALUE;
            } else {
                dg1Var = new dg1(this, ibkVar);
            }
        } else {
            dg1Var = new dg1(this, ibkVar);
        }
        Object objM96567o = dg1Var.f48699a;
        int i2 = dg1Var.f48701c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM63880c = this.f59195b.f79507a.m63880c(Collections.singletonList(str), "", "", ((z4m) ((zv41) this.f59194a).getValue()).f279296a.contains(str), new f93(31, null));
                dg1Var.f48701c = 1;
                objM96567o = zn91.m96567o(singleM63880c, dg1Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
        } catch (Throwable unused) {
        }
        return w2a1.f247311a;
    }
}
