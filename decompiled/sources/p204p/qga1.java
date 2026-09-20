package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class qga1 {

    /* JADX INFO: renamed from: a */
    public final Context f188428a;

    /* JADX INFO: renamed from: b */
    public final luk f188429b;

    public qga1(Context context, luk lukVar) {
        this.f188428a = context;
        this.f188429b = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m72735a(String str, ibk ibkVar) throws Throwable {
        pga1 pga1Var;
        if (ibkVar instanceof pga1) {
            pga1Var = (pga1) ibkVar;
            int i = pga1Var.f177277c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pga1Var.f177277c = i - Integer.MIN_VALUE;
            } else {
                pga1Var = new pga1(this, ibkVar);
            }
        } else {
            pga1Var = new pga1(this, ibkVar);
        }
        Object obj = pga1Var.f177275a;
        int i2 = pga1Var.f177277c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        zm81 zm81Var = new zm81(this, str, null, 8);
        pga1Var.f177277c = 1;
        Object objM89557A = x0h1.m89557A(this.f188429b, zm81Var, pga1Var);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }

    public qga1(Context context, luk lukVar, xv4 xv4Var) {
        this.f188428a = context;
        this.f188429b = lukVar;
    }
}
