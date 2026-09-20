package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class pq4 {

    /* JADX INFO: renamed from: a */
    public final h611 f180181a;

    /* JADX INFO: renamed from: b */
    public final c03 f180182b;

    /* JADX INFO: renamed from: c */
    public final luk f180183c;

    public pq4(h611 h611Var, c03 c03Var, luk lukVar) {
        this.f180181a = h611Var;
        this.f180182b = c03Var;
        this.f180183c = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m70620a(Context context, ho01 ho01Var, String str, String str2, String str3, String str4, ibk ibkVar) {
        nq4 nq4Var;
        String str5;
        String str6;
        String str7;
        Context context2;
        String str8;
        ho01 ho01Var2;
        if (ibkVar instanceof nq4) {
            nq4Var = (nq4) ibkVar;
            int i = nq4Var.f157123i;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq4Var.f157123i = i - Integer.MIN_VALUE;
            } else {
                nq4Var = new nq4(this, ibkVar);
            }
        } else {
            nq4Var = new nq4(this, ibkVar);
        }
        nq4 nq4Var2 = nq4Var;
        Object obj = nq4Var2.f157121g;
        int i2 = nq4Var2.f157123i;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            String strMo26482c = ho01Var.mo26482c();
            String strMo26481b = ho01Var.mo26481b();
            k1b1 k1b1VarMo26484e = ho01Var.mo26484e();
            i611 i611Var = new i611(strMo26482c, strMo26481b, k1b1VarMo26484e != null ? k1b1VarMo26484e.m55090c() : null, ho01Var.mo26483d(), qp01.f191110d.getValue(), null);
            nq4Var2.f157115a = context;
            nq4Var2.f157116b = ho01Var;
            str5 = str;
            nq4Var2.f157117c = str5;
            str6 = str2;
            nq4Var2.f157118d = str6;
            str7 = str3;
            nq4Var2.f157119e = str7;
            nq4Var2.f157120f = str4;
            nq4Var2.f157123i = 1;
            Object objMo31502a = this.f180181a.mo31502a(i611Var, nq4Var2);
            if (objMo31502a != yukVar) {
                context2 = context;
                obj = objMo31502a;
                str8 = str4;
                ho01Var2 = ho01Var;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        String str9 = nq4Var2.f157120f;
        String str10 = nq4Var2.f157119e;
        String str11 = nq4Var2.f157118d;
        String str12 = nq4Var2.f157117c;
        ho01 ho01Var3 = nq4Var2.f157116b;
        Context context3 = nq4Var2.f157115a;
        bga.m29073P(obj);
        str7 = str10;
        ho01Var2 = ho01Var3;
        str6 = str11;
        str5 = str12;
        str8 = str9;
        context2 = context3;
        oq4 oq4Var = new oq4(this, (a611) obj, ho01Var2, str5, str6, str7, (xr01) null, str8, context2, (fbk) null);
        nq4Var2.f157115a = null;
        nq4Var2.f157116b = null;
        nq4Var2.f157117c = null;
        nq4Var2.f157118d = null;
        nq4Var2.f157119e = null;
        nq4Var2.f157120f = null;
        nq4Var2.f157123i = 2;
        Object objM89557A = x0h1.m89557A(this.f180183c, oq4Var, nq4Var2);
        return objM89557A == yukVar ? yukVar : objM89557A;
    }
}
