package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class hwc implements cwc {

    /* JADX INFO: renamed from: e */
    public static final fv31 f95905e = fv31.f73628b.m78183U("blocked_users_acknowledged");

    /* JADX INFO: renamed from: a */
    public final Context f95906a;

    /* JADX INFO: renamed from: b */
    public final vnb f95907b;

    /* JADX INFO: renamed from: c */
    public final Observable f95908c;

    /* JADX INFO: renamed from: d */
    public hv31 f95909d;

    public hwc(Context context, vnb vnbVar, Observable observable) {
        this.f95906a = context;
        this.f95907b = vnbVar;
        this.f95908c = observable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m48929a(ibk ibkVar) {
        dwc dwcVar;
        if (ibkVar instanceof dwc) {
            dwcVar = (dwc) ibkVar;
            int i = dwcVar.f53665c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dwcVar.f53665c = i - Integer.MIN_VALUE;
            } else {
                dwcVar = new dwc(this, ibkVar);
            }
        } else {
            dwcVar = new dwc(this, ibkVar);
        }
        Object objM48930b = dwcVar.f53663a;
        int i2 = dwcVar.f53665c;
        if (i2 == 0) {
            bga.m29073P(objM48930b);
            dwcVar.f53665c = 1;
            objM48930b = m48930b(dwcVar);
            Object obj = yuk.f276404a;
            if (objM48930b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM48930b);
        }
        fv31 fv31Var = f95905e;
        gbu gbuVar = gbu.f78413a;
        Set setMo48707b = ((hv31) objM48930b).mo48707b(fv31Var, gbuVar);
        return setMo48707b == null ? gbuVar : setMo48707b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m48930b(ibk ibkVar) {
        ewc ewcVar;
        hwc hwcVar;
        if (ibkVar instanceof ewc) {
            ewcVar = (ewc) ibkVar;
            int i = ewcVar.f63499d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ewcVar.f63499d = i - Integer.MIN_VALUE;
            } else {
                ewcVar = new ewc(this, ibkVar);
            }
        } else {
            ewcVar = new ewc(this, ibkVar);
        }
        Object objM86755t = ewcVar.f63497b;
        int i2 = ewcVar.f63499d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            hv31 hv31Var = this.f95909d;
            if (hv31Var != null) {
                return hv31Var;
            }
            yab yabVarM54985d = k0e1.m54985d(this.f95908c);
            ewcVar.f63496a = this;
            ewcVar.f63499d = 1;
            objM86755t = vyf1.m86755t(yabVarM54985d, ewcVar);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
            hwcVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hwcVar = ewcVar.f63496a;
            bga.m29073P(objM86755t);
        }
        vnb vnbVar = hwcVar.f95907b;
        Context context = hwcVar.f95906a;
        hv31 hv31VarMo35842b = vnbVar.f243033b.mo35842b(context, (String) objM86755t);
        hwcVar.f95909d = hv31VarMo35842b;
        return hv31VarMo35842b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m48931c(String str, String str2, ibk ibkVar) {
        fwc fwcVar;
        if (ibkVar instanceof fwc) {
            fwcVar = (fwc) ibkVar;
            int i = fwcVar.f74045e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwcVar.f74045e = i - Integer.MIN_VALUE;
            } else {
                fwcVar = new fwc(this, ibkVar);
            }
        } else {
            fwcVar = new fwc(this, ibkVar);
        }
        Object objM48929a = fwcVar.f74043c;
        int i2 = fwcVar.f74045e;
        if (i2 == 0) {
            bga.m29073P(objM48929a);
            fwcVar.f74041a = str;
            fwcVar.f74042b = str2;
            fwcVar.f74045e = 1;
            objM48929a = m48929a(fwcVar);
            Object obj = yuk.f276404a;
            if (objM48929a == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = fwcVar.f74042b;
            str = fwcVar.f74041a;
            bga.m29073P(objM48929a);
        }
        return Boolean.valueOf(((Set) objM48929a).contains(str + ":" + str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m48932d(String str, ArrayList arrayList, ibk ibkVar) {
        gwc gwcVar;
        Set set;
        if (ibkVar instanceof gwc) {
            gwcVar = (gwc) ibkVar;
            int i = gwcVar.f84979f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gwcVar.f84979f = i - Integer.MIN_VALUE;
            } else {
                gwcVar = new gwc(this, ibkVar);
            }
        } else {
            gwcVar = new gwc(this, ibkVar);
        }
        Object objM48929a = gwcVar.f84977d;
        int i2 = gwcVar.f84979f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM48929a);
            gwcVar.f84974a = str;
            gwcVar.f84975b = arrayList;
            gwcVar.f84979f = 1;
            objM48929a = m48929a(gwcVar);
            if (objM48929a != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            arrayList = gwcVar.f84975b;
            str = gwcVar.f84974a;
            bga.m29073P(objM48929a);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = gwcVar.f84976c;
            bga.m29073P(objM48929a);
        }
        lv31 lv31VarEdit = ((hv31) objM48929a).edit();
        lv31VarEdit.m60052e(f95905e, set);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
        Set setM43734m1 = g6f.m43734m1((Iterable) objM48929a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            setM43734m1.add(str + ":" + ((String) it.next()));
        }
        if (!setM43734m1.isEmpty()) {
            gwcVar.f84974a = null;
            gwcVar.f84975b = null;
            gwcVar.f84976c = setM43734m1;
            gwcVar.f84979f = 2;
            Object objM48930b = m48930b(gwcVar);
            if (objM48930b != obj) {
                objM48929a = objM48930b;
                set = setM43734m1;
                lv31 lv31VarEdit2 = ((hv31) objM48929a).edit();
                lv31VarEdit2.m60052e(f95905e, set);
                lv31VarEdit2.m60054g();
            }
            return obj;
        }
        return w2a1.f247311a;
    }
}
