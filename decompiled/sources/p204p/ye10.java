package p204p;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ye10 implements whi {

    /* JADX INFO: renamed from: a */
    public static final ye10 f271888a = new ye10();

    /* JADX INFO: renamed from: b */
    public static final lsi0 f271889b = msi0.m62770a();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f271890c = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m93515a(Context context, zzx0 zzx0Var, String str, ibk ibkVar) {
        ue10 ue10Var;
        lsi0 lsi0Var;
        if (ibkVar instanceof ue10) {
            ue10Var = (ue10) ibkVar;
            int i = ue10Var.f229365g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue10Var.f229365g = i - Integer.MIN_VALUE;
            } else {
                ue10Var = new ue10(this, ibkVar);
            }
        } else {
            ue10Var = new ue10(this, ibkVar);
        }
        Object obj = ue10Var.f229363e;
        int i2 = ue10Var.f229365g;
        if (i2 == 0) {
            bga.m29073P(obj);
            ue10Var.f229359a = context;
            ue10Var.f229360b = zzx0Var;
            ue10Var.f229361c = str;
            lsi0Var = f271889b;
            ue10Var.f229362d = lsi0Var;
            ue10Var.f229365g = 1;
            Object objMo54248a = lsi0Var.mo54248a(ue10Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = ue10Var.f229362d;
            str = ue10Var.f229361c;
            zzx0Var = ue10Var.f229360b;
            Context context2 = ue10Var.f229359a;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            context = context2;
        }
        try {
            f271890c.remove(str);
            zzx0Var.mo94334a(context, str).delete();
            return w2a1.f247311a;
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m93516b(Context context, ze10 ze10Var, String str, ibk ibkVar) throws Throwable {
        ve10 ve10Var;
        lsi0 lsi0Var;
        jsi0 jsi0Var;
        Object obj;
        Map map;
        if (ibkVar instanceof ve10) {
            ve10Var = (ve10) ibkVar;
            int i = ve10Var.f240551g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve10Var.f240551g = i - Integer.MIN_VALUE;
            } else {
                ve10Var = new ve10(this, ibkVar);
            }
        } else {
            ve10Var = new ve10(this, ibkVar);
        }
        Object obj2 = ve10Var.f240549e;
        int i2 = ve10Var.f240551g;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ve10Var.f240545a = context;
                ve10Var.f240546b = ze10Var;
                ve10Var.f240547c = str;
                lsi0Var = f271889b;
                ve10Var.f240548d = lsi0Var;
                ve10Var.f240551g = 1;
                if (lsi0Var.mo54248a(ve10Var) != yukVar) {
                }
                return yukVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) ve10Var.f240547c;
                jsi0Var = (jsi0) ve10Var.f240546b;
                str = (String) ve10Var.f240545a;
                try {
                    bga.m29073P(obj2);
                    obj = (wko) obj2;
                    map.put(str, obj);
                    wko wkoVar = (wko) obj;
                    jsi0Var.mo54249c(null);
                    return wkoVar;
                } catch (Throwable th) {
                    th = th;
                    jsi0Var.mo54249c(null);
                    throw th;
                }
            }
            lsi0 lsi0Var2 = ve10Var.f240548d;
            str = (String) ve10Var.f240547c;
            ze10Var = (ze10) ve10Var.f240546b;
            Context context2 = (Context) ve10Var.f240545a;
            bga.m29073P(obj2);
            lsi0Var = lsi0Var2;
            context = context2;
            LinkedHashMap linkedHashMap = f271890c;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                ve10Var.f240545a = str;
                ve10Var.f240546b = lsi0Var;
                ve10Var.f240547c = linkedHashMap;
                ve10Var.f240548d = null;
                ve10Var.f240551g = 2;
                Object objMo94335b = ze10Var.mo94335b(context, str);
                if (objMo94335b != yukVar) {
                    jsi0Var = lsi0Var;
                    obj2 = objMo94335b;
                    map = linkedHashMap;
                    obj = (wko) obj2;
                    map.put(str, obj);
                }
                return yukVar;
            }
            jsi0Var = lsi0Var;
            wko wkoVar2 = (wko) obj;
            jsi0Var.mo54249c(null);
            return wkoVar2;
        } catch (Throwable th2) {
            th = th2;
            jsi0Var = lsi0Var;
            jsi0Var.mo54249c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m93517c(Context context, ze10 ze10Var, String str, ibk ibkVar) {
        we10 we10Var;
        if (ibkVar instanceof we10) {
            we10Var = (we10) ibkVar;
            int i = we10Var.f250405c;
            if ((i & Integer.MIN_VALUE) != 0) {
                we10Var.f250405c = i - Integer.MIN_VALUE;
            } else {
                we10Var = new we10(this, ibkVar);
            }
        } else {
            we10Var = new we10(this, ibkVar);
        }
        Object objM93516b = we10Var.f250403a;
        int i2 = we10Var.f250405c;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM93516b);
            we10Var.f250405c = 1;
            objM93516b = m93516b(context, ze10Var, str, we10Var);
            if (objM93516b != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93516b);
            return objM93516b;
        }
        bga.m29073P(objM93516b);
        fiz data = ((wko) objM93516b).getData();
        we10Var.f250405c = 2;
        Object objM86755t = vyf1.m86755t(data, we10Var);
        return objM86755t == obj ? obj : objM86755t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Object m93518d(Context context, ze10 ze10Var, String str, th00 th00Var, ibk ibkVar) throws Throwable {
        xe10 xe10Var;
        th00 th00Var2;
        if (ibkVar instanceof xe10) {
            xe10Var = (xe10) ibkVar;
            int i = xe10Var.f260612d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe10Var.f260612d = i - Integer.MIN_VALUE;
            } else {
                xe10Var = new xe10(this, ibkVar);
            }
        } else {
            xe10Var = new xe10(this, ibkVar);
        }
        Object objM93516b = xe10Var.f260610b;
        int i2 = xe10Var.f260612d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM93516b);
            xe10Var.f260609a = (mb61) th00Var;
            xe10Var.f260612d = 1;
            objM93516b = m93516b(context, ze10Var, str, xe10Var);
            if (objM93516b != obj) {
            }
            th00Var2 = th00Var;
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93516b);
            return objM93516b;
        }
        th00 th00Var3 = (th00) xe10Var.f260609a;
        bga.m29073P(objM93516b);
        th00Var2 = th00Var3;
        th00Var2 = th00Var;
        xe10Var.f260609a = null;
        xe10Var.f260612d = 2;
        Object objMo29190a = ((wko) objM93516b).mo29190a(th00Var2, xe10Var);
        if (objMo29190a != obj) {
            return objMo29190a;
        }
        th00Var2 = th00Var;
        return obj;
    }
}
