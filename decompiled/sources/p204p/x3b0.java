package p204p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class x3b0 {

    /* JADX INFO: renamed from: a */
    public final khy0 f257729a;

    /* JADX INFO: renamed from: b */
    public final gd5 f257730b;

    /* JADX INFO: renamed from: c */
    public final tpz0 f257731c = upz0.m83743a(1);

    public x3b0(khy0 khy0Var, gd5 gd5Var) {
        this.f257729a = khy0Var;
        this.f257730b = gd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:32:0x009b, B:34:0x00a1), top: B:40:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m89785a(String str, List list, ibk ibkVar) throws Throwable {
        w3b0 w3b0Var;
        List listM43710X0;
        tpz0 tpz0Var;
        int i;
        opz0 opz0Var;
        Object obj;
        List list2;
        x3b0 x3b0Var;
        v3b0 u3b0Var;
        Object obj2;
        v3b0 v3b0Var;
        if (ibkVar instanceof w3b0) {
            w3b0Var = (w3b0) ibkVar;
            int i2 = w3b0Var.f247543i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w3b0Var.f247543i = i2 - Integer.MIN_VALUE;
            } else {
                w3b0Var = new w3b0(this, ibkVar);
            }
        } else {
            w3b0Var = new w3b0(this, ibkVar);
        }
        Object obj3 = w3b0Var.f247541g;
        int i3 = w3b0Var.f247543i;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj3);
                listM43710X0 = g6f.m43710X0(list);
                w3b0Var.f247535a = list;
                w3b0Var.f247536b = str;
                w3b0Var.f247537c = listM43710X0;
                tpz0Var = this.f257731c;
                w3b0Var.f247538d = tpz0Var;
                i = 0;
                w3b0Var.f247540f = 0;
                w3b0Var.f247543i = 1;
                if (tpz0Var.m78928b(w3b0Var) != yukVar) {
                }
                opz0Var = tpz0Var;
                return yukVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x3b0Var = w3b0Var.f247539e;
                obj = w3b0Var.f247538d;
                list2 = w3b0Var.f247537c;
                try {
                    bga.m29073P(obj3);
                    obj = obj;
                    v3b0Var = (v3b0) obj3;
                    if (v3b0Var instanceof u3b0) {
                        ((LinkedHashMap) x3b0Var.f257730b.f78730c).put(list2, new ebq(System.currentTimeMillis(), ((u3b0) v3b0Var).f226314a));
                    }
                    obj2 = obj;
                    u3b0Var = v3b0Var;
                    ((spz0) obj2).m78930e();
                    return u3b0Var;
                } catch (Throwable th) {
                    th = th;
                    ((spz0) obj).m78930e();
                    throw th;
                }
            }
            int i4 = w3b0Var.f247540f;
            opz0 opz0Var2 = w3b0Var.f247538d;
            List list3 = w3b0Var.f247537c;
            String str2 = w3b0Var.f247536b;
            List list4 = w3b0Var.f247535a;
            bga.m29073P(obj3);
            listM43710X0 = list3;
            opz0Var = opz0Var2;
            list = list4;
            i = i4;
            str = str2;
            opz0Var = tpz0Var;
            Map map = (Map) this.f257730b.m44359K(listM43710X0);
            if (map == null) {
                khy0 khy0Var = this.f257729a;
                w3b0Var.f247535a = null;
                w3b0Var.f247536b = null;
                w3b0Var.f247537c = listM43710X0;
                w3b0Var.f247538d = opz0Var;
                w3b0Var.f247539e = this;
                w3b0Var.f247540f = i;
                w3b0Var.f247543i = 2;
                Object objM93270g = ybg1.m93270g(khy0Var, list, str, w3b0Var);
                if (objM93270g != yukVar) {
                    list2 = listM43710X0;
                    obj = opz0Var;
                    obj3 = objM93270g;
                    x3b0Var = this;
                    v3b0Var = (v3b0) obj3;
                    if (v3b0Var instanceof u3b0) {
                        ((LinkedHashMap) x3b0Var.f257730b.f78730c).put(list2, new ebq(System.currentTimeMillis(), ((u3b0) v3b0Var).f226314a));
                    }
                    obj2 = obj;
                    u3b0Var = v3b0Var;
                }
                opz0Var = tpz0Var;
                return yukVar;
            }
            u3b0Var = new u3b0(map);
            obj2 = opz0Var;
            ((spz0) obj2).m78930e();
            return u3b0Var;
        } catch (Throwable th2) {
            th = th2;
            obj = opz0Var;
            ((spz0) obj).m78930e();
            throw th;
        }
    }
}
