package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class cl1 implements jt50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39144a;

    /* JADX INFO: renamed from: b */
    public final Object f39145b;

    /* JADX INFO: renamed from: c */
    public final Object f39146c;

    /* JADX INFO: renamed from: d */
    public final Object f39147d;

    /* JADX INFO: renamed from: e */
    public final Object f39148e;

    public /* synthetic */ cl1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f39144a = i;
        this.f39145b = obj;
        this.f39146c = obj2;
        this.f39147d = obj3;
        this.f39148e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // p204p.jt50
    /* JADX INFO: renamed from: i */
    public final Enum mo33214i(vs50 vs50Var, ibk ibkVar) {
        bl1 bl1Var;
        rn3 rn3Var;
        vs50 vs50Var2 = vs50Var;
        int i = this.f39144a;
        it50 it50Var = it50.f105437b;
        Object obj = this.f39145b;
        Object obj2 = this.f39147d;
        Object obj3 = this.f39148e;
        yuk yukVar = yuk.f276404a;
        it50 it50Var2 = it50.f105436a;
        int i2 = 0;
        switch (i) {
            case 0:
                if (ibkVar instanceof bl1) {
                    bl1Var = (bl1) ibkVar;
                    int i3 = bl1Var.f28055c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bl1Var.f28055c = i3 - Integer.MIN_VALUE;
                    } else {
                        bl1Var = new bl1(this, ibkVar);
                    }
                } else {
                    bl1Var = new bl1(this, ibkVar);
                }
                Object obj4 = bl1Var.f28053a;
                int i4 = bl1Var.f28055c;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return it50Var;
                }
                bga.m29073P(obj4);
                if (!(vs50Var2 instanceof ns50)) {
                    return it50Var2;
                }
                ns50 ns50Var = (ns50) vs50Var2;
                int i5 = ns50Var.f157687a;
                nw80 nw80Var = ns50Var.f157688b;
                boolean z = nw80Var.f159056j;
                String str = nw80Var.f159049c;
                String str2 = (String) obj;
                Completable completableIgnoreElement = (z ? new CompletableFromAction(new al1(this, str, i5, i2)) : ((ya3) obj3).m93175i(str).flatMapCompletable(new zk1(this, str, i5, i2))).m23294e(((n93) obj2).m63880c(Collections.singletonList(str), str2, str2, z, new f93(31, null))).ignoreElement();
                completableIgnoreElement.getClass();
                CompletableOnErrorComplete completableOnErrorCompleteM23299p = completableIgnoreElement.m23299p(Functions.f7232h);
                bl1Var.f28055c = 1;
                return zn91.m96565n(completableOnErrorCompleteM23299p, bl1Var) == yukVar ? yukVar : it50Var;
            default:
                if (ibkVar instanceof rn3) {
                    rn3Var = (rn3) ibkVar;
                    int i6 = rn3Var.f200710d;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        rn3Var.f200710d = i6 - Integer.MIN_VALUE;
                    } else {
                        rn3Var = new rn3(this, ibkVar);
                    }
                } else {
                    rn3Var = new rn3(this, ibkVar);
                }
                Object objM86755t = rn3Var.f200708b;
                int i7 = rn3Var.f200710d;
                if (i7 == 0) {
                    bga.m29073P(objM86755t);
                    if (vs50Var2 instanceof ss50) {
                        pgq0 pgq0Var = (pgq0) obj3;
                        ss50 ss50Var = (ss50) vs50Var2;
                        nw80 nw80Var2 = ss50Var.f213490b;
                        rn3Var.f200707a = ss50Var;
                        rn3Var.f200710d = 1;
                        objM86755t = (((my00) pgq0Var.f177385b).f148246b.m95562c() && nw80Var2.m65751b() == hto0.f95101c) ? vyf1.m86755t(((vmz) pgq0Var.f177386c).m86024a("apply-child-content-restrictions", false), rn3Var) : Boolean.FALSE;
                        if (objM86755t != yukVar) {
                        }
                        return yukVar;
                    }
                    return it50Var2;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM86755t);
                    return it50Var;
                }
                vs50Var2 = rn3Var.f200707a;
                bga.m29073P(objM86755t);
                if (((Boolean) objM86755t).booleanValue()) {
                    ss50 ss50Var2 = (ss50) vs50Var2;
                    String str3 = ss50Var2.f213490b.f159049c;
                    kv91 kv91Var = (kv91) this.f39146c;
                    st91 st91Var = (st91) obj2;
                    Integer num = new Integer(ss50Var2.f213489a);
                    zt91 zt91Var = zt91.f286105i;
                    yt91 yt91VarM50626j = ihf1.m50626j();
                    yt91VarM50626j.f276054h = "music";
                    yt91VarM50626j.f276047a = "mobile-playlist-entity-item-list-item";
                    yt91VarM50626j.f276052f = "2.0.0";
                    yt91VarM50626j.f276053g = "20.0.5";
                    yt91VarM50626j.f276049c = num;
                    yt91VarM50626j.f276050d = str3;
                    zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = str3 != null ? str3.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    d850 d850VarMo57453r = kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91Var, System.currentTimeMillis()), null);
                    String str4 = xoc1.f263964P5.f243453a;
                    Bundle bundleM70529j = pp91.m70529j(new pqm0("com.spotify.genalphablocking.childallowlistingrequest.bottomsheetpage.EXTRA_ITEM_URI", str3));
                    rn3Var.f200707a = null;
                    rn3Var.f200710d = 2;
                    if (((gfi0) obj).m44623d(str4, d850VarMo57453r, bundleM70529j, rn3Var) != yukVar) {
                        return it50Var;
                    }
                    return yukVar;
                }
                return it50Var2;
        }
    }
}
