package p204p;

import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ttf0 {

    /* JADX INFO: renamed from: a */
    public final gfi0 f223585a;

    /* JADX INFO: renamed from: b */
    public final rb5 f223586b;

    /* JADX INFO: renamed from: c */
    public final nha0 f223587c;

    /* JADX INFO: renamed from: d */
    public final vmz f223588d;

    public ttf0(gfi0 gfi0Var, rb5 rb5Var, nha0 nha0Var, vmz vmzVar) {
        this.f223585a = gfi0Var;
        this.f223586b = rb5Var;
        this.f223587c = nha0Var;
        this.f223588d = vmzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m81502a(String str, mtf0 mtf0Var, ibk ibkVar) {
        qtf0 qtf0Var;
        if (ibkVar instanceof qtf0) {
            qtf0Var = (qtf0) ibkVar;
            int i = qtf0Var.f192377e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qtf0Var.f192377e = i - Integer.MIN_VALUE;
            } else {
                qtf0Var = new qtf0(this, ibkVar);
            }
        } else {
            qtf0Var = new qtf0(this, ibkVar);
        }
        Object objM81503b = qtf0Var.f192375c;
        int i2 = qtf0Var.f192377e;
        if (i2 == 0) {
            bga.m29073P(objM81503b);
            qtf0Var.f192373a = str;
            qtf0Var.f192374b = mtf0Var;
            qtf0Var.f192377e = 1;
            objM81503b = m81503b(mtf0Var, qtf0Var);
            Object obj = yuk.f276404a;
            if (objM81503b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mtf0Var = qtf0Var.f192374b;
            str = qtf0Var.f192373a;
            bga.m29073P(objM81503b);
        }
        if (((Boolean) objM81503b).booleanValue()) {
            return Boolean.FALSE;
        }
        ptf0 ptf0VarMo54285y = mtf0Var.mo54285y();
        if (!(ptf0VarMo54285y instanceof ntf0)) {
            if (!(ptf0VarMo54285y instanceof otf0)) {
                throw new NoWhenBranchMatchedException();
            }
            Set set = (Set) this.f223586b.m75147D().f247335a.get(str);
            if (set == null) {
                set = gbu.f78413a;
            }
            if (set.contains(((otf0) ptf0VarMo54285y).f169052a)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m81503b(mtf0 mtf0Var, ibk ibkVar) {
        rtf0 rtf0Var;
        if (ibkVar instanceof rtf0) {
            rtf0Var = (rtf0) ibkVar;
            int i = rtf0Var.f202576c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtf0Var.f202576c = i - Integer.MIN_VALUE;
            } else {
                rtf0Var = new rtf0(this, ibkVar);
            }
        } else {
            rtf0Var = new rtf0(this, ibkVar);
        }
        Object objM86755t = rtf0Var.f202574a;
        int i2 = rtf0Var.f202576c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (!(mtf0Var instanceof jtf0)) {
                return Boolean.FALSE;
            }
            yab yabVar = this.f223588d.f242953a;
            rtf0Var.f202576c = 1;
            objM86755t = vyf1.m86755t(yabVar, rtf0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        int iOrdinal = this.f223587c.m64460j((Map) objM86755t).ordinal();
        if (iOrdinal == 0) {
            z = false;
        } else if (iOrdinal != 1 && iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m81504c(String str, mtf0 mtf0Var, d850 d850Var, ibk ibkVar) {
        stf0 stf0Var;
        if (ibkVar instanceof stf0) {
            stf0Var = (stf0) ibkVar;
            int i = stf0Var.f213906f;
            if ((i & Integer.MIN_VALUE) != 0) {
                stf0Var.f213906f = i - Integer.MIN_VALUE;
            } else {
                stf0Var = new stf0(this, ibkVar);
            }
        } else {
            stf0Var = new stf0(this, ibkVar);
        }
        Object objM81502a = stf0Var.f213904d;
        int i2 = stf0Var.f213906f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM81502a);
            stf0Var.f213901a = str;
            stf0Var.f213902b = mtf0Var;
            stf0Var.f213903c = d850Var;
            stf0Var.f213906f = 1;
            objM81502a = m81502a(str, mtf0Var, stf0Var);
            if (objM81502a != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM81502a);
            return w2a1Var;
        }
        d850Var = stf0Var.f213903c;
        mtf0Var = stf0Var.f213902b;
        str = stf0Var.f213901a;
        bga.m29073P(objM81502a);
        if (((Boolean) objM81502a).booleanValue()) {
            ptf0 ptf0VarMo54285y = mtf0Var.mo54285y();
            if (ptf0VarMo54285y instanceof otf0) {
                String str2 = ((otf0) ptf0VarMo54285y).f169052a;
                rb5 rb5Var = this.f223586b;
                lv31 lv31VarEdit = ((hv31) rb5Var.f197471b).edit();
                fv31 fv31Var = x2f0.f257462a;
                fk60 fk60Var = (fk60) rb5Var.f197472c;
                rr60 rr60VarSerializer = w2f0.Companion.serializer();
                w2f0 w2f0VarM75147D = rb5Var.m75147D();
                Map map = w2f0VarM75147D.f247335a;
                Object linkedHashSet = map.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map.put(str, linkedHashSet);
                }
                ((Set) linkedHashSet).add(str2);
                lv31VarEdit.m60051d(fv31Var, fk60Var.m41881b(rr60VarSerializer, w2f0VarM75147D));
                lv31VarEdit.m60054g();
            }
            Bundle bundle = new Bundle();
            bundle.putString("list-uri", str);
            bundle.putParcelable("bottom-sheet", mtf0Var);
            stf0Var.f213901a = null;
            stf0Var.f213902b = null;
            stf0Var.f213903c = null;
            stf0Var.f213906f = 2;
            if (this.f223585a.m44623d("spotify:internal:playlist-overlap-messaging", d850Var, bundle, stf0Var) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }
}
