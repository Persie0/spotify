package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public final class u5u {

    /* JADX INFO: renamed from: a */
    public final b7g0 f227108a;

    /* JADX INFO: renamed from: b */
    public final fiz f227109b;

    /* JADX INFO: renamed from: c */
    public final nzx0 f227110c;

    /* JADX INFO: renamed from: d */
    public final cw0 f227111d;

    /* JADX INFO: renamed from: e */
    public final hqi0 f227112e;

    /* JADX INFO: renamed from: f */
    public final u4u f227113f;

    /* JADX INFO: renamed from: g */
    public final etq f227114g;

    /* JADX INFO: renamed from: h */
    public final hu3 f227115h;

    /* JADX INFO: renamed from: i */
    public final luk f227116i;

    /* JADX INFO: renamed from: j */
    public final xv41 f227117j;

    /* JADX INFO: renamed from: k */
    public final c9k f227118k;

    /* JADX INFO: renamed from: l */
    public di41 f227119l;

    /* JADX INFO: renamed from: m */
    public i5u f227120m;

    public u5u(b7g0 b7g0Var, fiz fizVar, nzx0 nzx0Var, cw0 cw0Var, hqi0 hqi0Var, u4u u4uVar, etq etqVar, hu3 hu3Var, luk lukVar, luk lukVar2, xv41 xv41Var) {
        this.f227108a = b7g0Var;
        this.f227109b = fizVar;
        this.f227110c = nzx0Var;
        this.f227111d = cw0Var;
        this.f227112e = hqi0Var;
        this.f227113f = u4uVar;
        this.f227114g = etqVar;
        this.f227115h = hu3Var;
        this.f227116i = lukVar;
        this.f227117j = xv41Var;
        this.f227118k = AbstractC0000a.m16o(lukVar2);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX INFO: renamed from: a */
    public static final Object m82417a(u5u u5uVar, nyt nytVar, qs0 qs0Var, ibk ibkVar) {
        j5u j5uVar;
        nyt nytVar2;
        String str;
        ?? r10;
        u5u u5uVar2;
        qs0 qs0Var2;
        String str2;
        ?? r11;
        ?? r12;
        di41 di41Var;
        u5uVar.getClass();
        if (ibkVar instanceof j5u) {
            j5uVar = (j5u) ibkVar;
            int i = j5uVar.f109102g;
            if ((i & Integer.MIN_VALUE) != 0) {
                j5uVar.f109102g = i - Integer.MIN_VALUE;
            } else {
                j5uVar = new j5u(u5uVar, ibkVar);
            }
        } else {
            j5uVar = new j5u(u5uVar, ibkVar);
        }
        j5u j5uVar2 = j5uVar;
        Object objM34074b = j5uVar2.f109100e;
        int i2 = j5uVar2.f109102g;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM34074b);
            cw0 cw0Var = u5uVar.f227111d;
            Map mapSingletonMap = Collections.singletonMap("trigger_origin", qs0Var.f191938a);
            j5uVar2.f109096a = nytVar;
            j5uVar2.f109097b = qs0Var;
            j5uVar2.f109102g = 1;
            objM34074b = cw0.m34074b(cw0Var, mapSingletonMap, j5uVar2);
            if (objM34074b != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            qs0Var = j5uVar2.f109097b;
            nytVar = j5uVar2.f109096a;
            bga.m29073P(objM34074b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = j5uVar2.f109099d;
            str2 = j5uVar2.f109098c;
            qs0Var2 = j5uVar2.f109097b;
            nyt nytVar3 = j5uVar2.f109096a;
            bga.m29073P(objM34074b);
            nytVar2 = nytVar3;
            u5uVar2 = u5uVar;
            r12 = list;
        }
        di41Var = u5uVar2.f227119l;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        r11 = r12;
        if (qs0Var2 != qs0.NPV_PAUSE) {
            u5uVar2.f227119l = x0h1.m89578u(u5uVar2.f227118k, null, 0, new lzr(u5uVar2, str2, fbkVar, 14), 3);
            r11 = r12;
        }
        return new ef81((fh0) g6f.m43745s0(r11), nytVar2);
        nytVar2 = nytVar;
        qs0 qs0Var3 = qs0Var;
        gs21 gs21Var = (gs21) objM34074b;
        if (gs21Var instanceof fs21) {
            fs21 fs21Var = (fs21) gs21Var;
            str = fs21Var.f72753a;
            r10 = fs21Var.f72754b;
        } else {
            if (!(gs21Var instanceof es21)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
            r10 = lau.f131415a;
        }
        boolean zIsEmpty = r10.isEmpty();
        r11 = r10;
        if (zIsEmpty) {
            j5uVar2.f109096a = nytVar2;
            j5uVar2.f109097b = qs0Var3;
            j5uVar2.f109098c = str;
            j5uVar2.f109099d = (List) r10;
            j5uVar2.f109102g = 2;
            u5uVar2 = u5uVar;
            if (u5uVar2.m82419c(nytVar2, 2, qs0Var3, str, j5uVar2) != yukVar) {
                qs0Var2 = qs0Var3;
                str2 = str;
                r12 = r10;
                di41Var = u5uVar2.f227119l;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                r11 = r12;
                if (qs0Var2 != qs0.NPV_PAUSE) {
                    u5uVar2.f227119l = x0h1.m89578u(u5uVar2.f227118k, null, 0, new lzr(u5uVar2, str2, fbkVar, 14), 3);
                    r11 = r12;
                }
            }
            return yukVar;
        }
        return new ef81((fh0) g6f.m43745s0(r11), nytVar2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: b */
    public static final Serializable m82418b(u5u u5uVar, pqm0 pqm0Var, ibk ibkVar) {
        n5u n5uVar;
        nyt nytVar;
        qs0 qs0Var;
        u5uVar.getClass();
        if (ibkVar instanceof n5u) {
            n5uVar = (n5u) ibkVar;
            int i = n5uVar.f150620e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n5uVar.f150620e = i - Integer.MIN_VALUE;
            } else {
                n5uVar = new n5u(u5uVar, ibkVar);
            }
        } else {
            n5uVar = new n5u(u5uVar, ibkVar);
        }
        n5u n5uVar2 = n5uVar;
        Object obj = n5uVar2.f150618c;
        int i2 = n5uVar2.f150620e;
        if (i2 == 0) {
            bga.m29073P(obj);
            nyt nytVar2 = (nyt) pqm0Var.f180350a;
            qs0 qs0Var2 = (qs0) pqm0Var.f180351b;
            if (!(nytVar2 instanceof jyt) && !wj50.m88271j(nytVar2, lyt.f138114a)) {
                if (nytVar2 instanceof kyt) {
                    return new pqm0(nytVar2, qs0Var2);
                }
                throw new NoWhenBranchMatchedException();
            }
            n5uVar2.f150616a = nytVar2;
            n5uVar2.f150617b = qs0Var2;
            n5uVar2.f150620e = 1;
            Object objM82419c = u5uVar.m82419c(nytVar2, 3, qs0Var2, null, n5uVar2);
            yuk yukVar = yuk.f276404a;
            if (objM82419c == yukVar) {
                return yukVar;
            }
            nytVar = nytVar2;
            qs0Var = qs0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qs0Var = n5uVar2.f150617b;
            nytVar = n5uVar2.f150616a;
            bga.m29073P(obj);
        }
        return new pqm0(nytVar, qs0Var);
    }

    /* JADX INFO: renamed from: c */
    public final Object m82419c(nyt nytVar, int i, qs0 qs0Var, String str, ibk ibkVar) {
        mv0 mv0Var = mv0.f147461b;
        String strMo54816a = nytVar.mo54816a();
        int status = nytVar.getStatus();
        Set setMo54817b = nytVar.mo54817b();
        ArrayList arrayList = new ArrayList(i6f.m49804T(setMo54817b, 10));
        Iterator it = setMo54817b.iterator();
        while (it.hasNext()) {
            arrayList.add(((gyt) it.next()).f85725a);
        }
        List listM43728j1 = g6f.m43728j1(arrayList);
        etq etqVar = this.f227114g;
        return x0h1.m89557A((luk) etqVar.f62757c, new ts0("embedded-npv", i, status, qs0Var, listM43728j1, strMo54816a, str, etqVar, null), ibkVar);
    }
}
