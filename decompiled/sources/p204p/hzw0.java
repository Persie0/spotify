package p204p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class hzw0 {

    /* JADX INFO: renamed from: a */
    public final xvo f97023a;

    /* JADX INFO: renamed from: b */
    public final gd5 f97024b;

    /* JADX INFO: renamed from: c */
    public final tpz0 f97025c = upz0.m83743a(1);

    public hzw0(xvo xvoVar, gd5 gd5Var) {
        this.f97023a = xvoVar;
        this.f97024b = gd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:30:0x008c, B:32:0x0093), top: B:40:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m49286a(String str, ibk ibkVar) {
        gzw0 gzw0Var;
        int i;
        String str2;
        opz0 opz0Var;
        Object obj;
        g760 g760Var;
        String str3;
        hzw0 hzw0Var;
        Object obj2;
        if (ibkVar instanceof gzw0) {
            gzw0Var = (gzw0) ibkVar;
            int i2 = gzw0Var.f86055h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gzw0Var.f86055h = i2 - Integer.MIN_VALUE;
            } else {
                gzw0Var = new gzw0(this, ibkVar);
            }
        } else {
            gzw0Var = new gzw0(this, ibkVar);
        }
        Object obj3 = gzw0Var.f86053f;
        int i3 = gzw0Var.f86055h;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj3);
                gzw0Var.f86048a = str;
                gzw0Var.f86049b = str;
                tpz0 tpz0Var = this.f97025c;
                gzw0Var.f86050c = tpz0Var;
                i = 0;
                gzw0Var.f86052e = 0;
                gzw0Var.f86055h = 1;
                if (tpz0Var.m78928b(gzw0Var) != yukVar) {
                    str2 = str;
                    opz0Var = tpz0Var;
                }
                return yukVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hzw0Var = gzw0Var.f86051d;
                obj = gzw0Var.f86050c;
                str3 = gzw0Var.f86049b;
                try {
                    bga.m29073P(obj3);
                    obj = obj;
                    g760Var = (g760) obj3;
                    if (g760Var instanceof f760) {
                        ((LinkedHashMap) hzw0Var.f97024b.f78730c).put(str3, new ebq(System.currentTimeMillis(), g760Var));
                    }
                    obj2 = obj;
                    ((spz0) obj2).m78930e();
                    return g760Var;
                } catch (Throwable th) {
                    th = th;
                    ((spz0) obj).m78930e();
                    throw th;
                }
            }
            int i4 = gzw0Var.f86052e;
            opz0 opz0Var2 = gzw0Var.f86050c;
            String str4 = gzw0Var.f86049b;
            str2 = gzw0Var.f86048a;
            bga.m29073P(obj3);
            opz0Var = opz0Var2;
            i = i4;
            str = str4;
            g760Var = (g760) this.f97024b.m44359K(str);
            obj2 = opz0Var;
            if (g760Var == null) {
                xvo xvoVar = this.f97023a;
                Set setSingleton = Collections.singleton(xw50.f266593e);
                gzw0Var.f86048a = null;
                gzw0Var.f86049b = str;
                gzw0Var.f86050c = opz0Var;
                gzw0Var.f86051d = this;
                gzw0Var.f86052e = i;
                gzw0Var.f86055h = 2;
                Object objM92248g = xvoVar.m92248g(str2, setSingleton, gzw0Var);
                if (objM92248g != yukVar) {
                    obj = opz0Var;
                    obj3 = objM92248g;
                    str3 = str;
                    hzw0Var = this;
                    g760Var = (g760) obj3;
                    if (g760Var instanceof f760) {
                        ((LinkedHashMap) hzw0Var.f97024b.f78730c).put(str3, new ebq(System.currentTimeMillis(), g760Var));
                    }
                    obj2 = obj;
                }
                return yukVar;
            }
            ((spz0) obj2).m78930e();
            return g760Var;
        } catch (Throwable th2) {
            th = th2;
            obj = opz0Var;
            ((spz0) obj).m78930e();
            throw th;
        }
    }
}
