package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bpl0 {

    /* JADX INFO: renamed from: a */
    public final epx f29543a;

    /* JADX INFO: renamed from: b */
    public final sr31 f29544b;

    public bpl0(epx epxVar, sr31 sr31Var) {
        this.f29543a = epxVar;
        this.f29544b = sr31Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m30161a(String str, String str2, String str3, Map map, boolean z, long j, d850 d850Var, ibk ibkVar) {
        apl0 apl0Var;
        boolean z2;
        long j2;
        String str4;
        Map map2;
        String str5;
        String str6;
        d850 d850Var2;
        m340 m340Var;
        long j3;
        long j4;
        ufu ufuVar;
        jiu jiuVar;
        ufu ufuVar2;
        if (ibkVar instanceof apl0) {
            apl0Var = (apl0) ibkVar;
            int i = apl0Var.f17982t;
            if ((i & Integer.MIN_VALUE) != 0) {
                apl0Var.f17982t = i - Integer.MIN_VALUE;
            } else {
                apl0Var = new apl0(this, ibkVar);
            }
        } else {
            apl0Var = new apl0(this, ibkVar);
        }
        Object objM96571q = apl0Var.f17980h;
        int i2 = apl0Var.f17982t;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable observableFlatMap = ((jpx) this.f29543a).m53978b(new C1668ai("transcript-selection-page", false, (gh00) new eve0(str, 24))).filter(a0y.f11191U0).flatMap(new m08(str, 6));
            apl0Var.f17973a = str;
            apl0Var.f17974b = str2;
            apl0Var.f17975c = str3;
            apl0Var.f17976d = map;
            apl0Var.f17977e = d850Var;
            apl0Var.f17978f = z;
            apl0Var.f17979g = j;
            apl0Var.f17982t = 1;
            objM96571q = zn91.m96571q(observableFlatMap, 2, null, apl0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
            z2 = z;
            j2 = j;
            str4 = str;
            map2 = map;
            str5 = str3;
            str6 = str2;
            d850Var2 = d850Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = apl0Var.f17979g;
            boolean z3 = apl0Var.f17978f;
            d850Var2 = apl0Var.f17977e;
            Map map3 = apl0Var.f17976d;
            String str7 = apl0Var.f17975c;
            String str8 = apl0Var.f17974b;
            String str9 = apl0Var.f17973a;
            bga.m29073P(objM96571q);
            z2 = z3;
            j2 = j5;
            map2 = map3;
            str5 = str7;
            str6 = str8;
            str4 = str9;
        }
        erc1 erc1Var = (erc1) objM96571q;
        if (erc1Var == null || (m340Var = erc1Var.f62079a) == null) {
            m340Var = new m340(7, null);
        }
        z240 z240VarM60640a = m340Var.m60640a(a340.f11860a);
        String str10 = z240VarM60640a != null ? z240VarM60640a.f278475a.f198763a : null;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = str10;
        w240 w240Var = m340Var.f139525b;
        if (w240Var == null || (jiuVar = w240Var.f247224c) == null || (ufuVar2 = jiuVar.f112823a) == null) {
            gfp gfpVar = leu.f132721a;
            j3 = ((giu) iiu.f102631a.f258039d).f80259c;
        } else {
            j3 = ufuVar2.f229876c;
        }
        int iM75429D = rfg1.m75429D(j3);
        if (w240Var == null || (ufuVar = w240Var.f247223b.f112823a) == null) {
            gfp gfpVar2 = leu.f132721a;
            j4 = ((diu) iiu.f102631a.f258037b).f49478c;
        } else {
            j4 = ufuVar.f229876c;
        }
        this.f29544b.m79007x(new vi01(str6, str5, str11, str4, map2, new b8f(iM75429D, rfg1.m75429D(j4)), z2, j2), d850Var2);
        return w2a1.f247311a;
    }
}
