package p204p;

import android.content.Context;
import com.spotify.home.evopage.mobius.Effect;
import com.spotify.home.evopage.mobius.Event;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l1a0 {

    /* JADX INFO: renamed from: a */
    public final k530 f128664a;

    /* JADX INFO: renamed from: b */
    public final ts21 f128665b;

    /* JADX INFO: renamed from: c */
    public final it9 f128666c;

    /* JADX INFO: renamed from: d */
    public final rmx f128667d;

    /* JADX INFO: renamed from: e */
    public final n9v0 f128668e;

    /* JADX INFO: renamed from: f */
    public final n7m f128669f;

    /* JADX INFO: renamed from: g */
    public final ax7 f128670g;

    /* JADX INFO: renamed from: h */
    public final cgm f128671h;

    /* JADX INFO: renamed from: i */
    public final iz61 f128672i;

    /* JADX INFO: renamed from: j */
    public final Context f128673j;

    /* JADX INFO: renamed from: k */
    public final q530 f128674k;

    /* JADX INFO: renamed from: l */
    public final ifx f128675l;

    public l1a0(k530 k530Var, ts21 ts21Var, it9 it9Var, rmx rmxVar, n9v0 n9v0Var, n7m n7mVar, ax7 ax7Var, cgm cgmVar, iz61 iz61Var, Context context, q530 q530Var, ifx ifxVar) {
        this.f128664a = k530Var;
        this.f128665b = ts21Var;
        this.f128666c = it9Var;
        this.f128667d = rmxVar;
        this.f128668e = n9v0Var;
        this.f128669f = n7mVar;
        this.f128670g = ax7Var;
        this.f128671h = cgmVar;
        this.f128672i = iz61Var;
        this.f128673j = context;
        this.f128674k = q530Var;
        this.f128675l = ifxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m57866a(l1a0 l1a0Var, y430 y430Var, ibk ibkVar) {
        x0a0 x0a0Var;
        if (ibkVar instanceof x0a0) {
            x0a0Var = (x0a0) ibkVar;
            int i = x0a0Var.f256843d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0a0Var.f256843d = i - Integer.MIN_VALUE;
            } else {
                x0a0Var = new x0a0(l1a0Var, ibkVar);
            }
        } else {
            x0a0Var = new x0a0(l1a0Var, ibkVar);
        }
        Object objM57868c = x0a0Var.f256841b;
        int i2 = x0a0Var.f256843d;
        if (i2 == 0) {
            bga.m29073P(objM57868c);
            boolean z = y430Var.f269064a;
            String str = y430Var.f269066c.f259321g;
            x0a0Var.f256840a = y430Var;
            x0a0Var.f256843d = 1;
            objM57868c = l1a0Var.m57868c(str, x0a0Var, z);
            Object obj = yuk.f276404a;
            if (objM57868c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y430Var = x0a0Var.f256840a;
            bga.m29073P(objM57868c);
        }
        pqm0 pqm0Var = (pqm0) objM57868c;
        String str2 = (String) pqm0Var.f180350a;
        List list = (List) pqm0Var.f180351b;
        x9c x9cVar = y430Var.f269066c;
        return new y430(y430Var.f269064a, y430Var.f269065b, new x9c(g6f.m43700N0(list, x9cVar.f259315a), x9cVar.f259316b, x9cVar.f259317c, x9cVar.f259318d, x9cVar.f259319e, x9cVar.f259320f, str2, x9cVar.f259322h), y430Var.f269067d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m57867b(l1a0 l1a0Var, Effect.LoadHomeStructure loadHomeStructure, ibk ibkVar) {
        f1a0 f1a0Var;
        Object c6x0Var;
        kaa0 loadingStrategy;
        Throwable th;
        if (ibkVar instanceof f1a0) {
            f1a0Var = (f1a0) ibkVar;
            int i = f1a0Var.f64838f;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1a0Var.f64838f = i - Integer.MIN_VALUE;
            } else {
                f1a0Var = new f1a0(l1a0Var, ibkVar);
            }
        } else {
            f1a0Var = new f1a0(l1a0Var, ibkVar);
        }
        f1a0 f1a0Var2 = f1a0Var;
        Object objM96571q = f1a0Var2.f64836d;
        int i2 = f1a0Var2.f64838f;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    loadHomeStructure = f1a0Var2.f64833a;
                    bga.m29073P(objM96571q);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    loadingStrategy = f1a0Var2.f64835c;
                    th = f1a0Var2.f64834b;
                    bga.m29073P(objM96571q);
                }
                return new Event.FailedToLoadHomeStructure(th, loadingStrategy, l1a0Var.f128669f.f151186a, ((Boolean) objM96571q).booleanValue());
            }
            bga.m29073P(objM96571q);
            j1a0 j1a0Var = new j1a0(loadHomeStructure, null, l1a0Var);
            f1a0Var2.f64833a = loadHomeStructure;
            f1a0Var2.f64834b = null;
            f1a0Var2.f64838f = 1;
            objM96571q = kk40.m56684z(j1a0Var, f1a0Var2);
            if (objM96571q == yukVar) {
                return yukVar;
            }
            c6x0Var = (y430) objM96571q;
        } catch (Throwable th2) {
            c6x0Var = new c6x0(th2);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            loadingStrategy = loadHomeStructure.getLoadingStrategy();
            Observable observable = l1a0Var.f128670g.f20779b;
            f1a0Var2.f64833a = null;
            f1a0Var2.f64834b = thM77348a;
            f1a0Var2.f64835c = loadingStrategy;
            f1a0Var2.f64838f = 2;
            objM96571q = zn91.m96571q(observable, 1, null, f1a0Var2);
            if (objM96571q == yukVar) {
                return yukVar;
            }
            th = thM77348a;
            return new Event.FailedToLoadHomeStructure(th, loadingStrategy, l1a0Var.f128669f.f151186a, ((Boolean) objM96571q).booleanValue());
        }
        y430 y430Var = (y430) c6x0Var;
        boolean z = y430Var.f269064a;
        boolean z2 = y430Var.f269065b;
        x9c x9cVar = y430Var.f269066c;
        Set setM75983b = l1a0Var.f128667d.m75983b();
        ConcurrentHashMap concurrentHashMap = l1a0Var.f128668e.f151872b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((l9v0) entry.getValue()).f131181a.isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return y9c.m93152a(x9cVar, setM75983b, g6f.m43736n1(arrayList), z, z2, (Set) l1a0Var.f128672i.f107156a.getValue(), loadHomeStructure.getLoadingStrategy(), l1a0Var.f128673j);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:26:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.io.Serializable m57868c(java.lang.String r11, p204p.ibk r12, boolean r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p204p.k1a0
            if (r0 == 0) goto L14
            r0 = r12
            p.k1a0 r0 = (p204p.k1a0) r0
            int r1 = r0.f118262f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f118262f = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            p.k1a0 r0 = new p.k1a0
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.f118260d
            int r1 = r12.f118262f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L30
            boolean r11 = r12.f118257a
            p.rlv0 r13 = r12.f118259c
            java.util.List r1 = r12.f118258b
            p204p.bga.m29073P(r0)     // Catch: java.lang.Throwable -> L2e
            goto L6d
        L2e:
            r0 = move-exception
            goto L75
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            java.util.ArrayList r0 = p204p.yds.m93485o(r0)
            p.rlv0 r1 = new p.rlv0
            r1.<init>()
            r1.f200373a = r11
            r9 = r12
            r6 = r13
            r13 = r1
            r11 = r2
            r1 = r0
        L48:
            if (r11 != 0) goto L9d
            p.k530 r4 = r10.f128664a     // Catch: java.lang.Throwable -> L72
            p.n7m r11 = r10.f128669f     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = r11.f151186a     // Catch: java.lang.Throwable -> L72
            java.lang.Object r11 = r13.f200373a     // Catch: java.lang.Throwable -> L72
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L72
            p.kaa0 r8 = p204p.kaa0.f120848a     // Catch: java.lang.Throwable -> L72
            r9.getClass()     // Catch: java.lang.Throwable -> L72
            r9.f118258b = r1     // Catch: java.lang.Throwable -> L72
            r9.f118259c = r13     // Catch: java.lang.Throwable -> L72
            r9.f118257a = r6     // Catch: java.lang.Throwable -> L72
            r9.f118262f = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r4.mo28143a(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L72
            p.yuk r11 = p204p.yuk.f276404a
            if (r0 != r11) goto L6b
            return r11
        L6b:
            r11 = r6
            r12 = r9
        L6d:
            p.x9c r0 = (p204p.x9c) r0     // Catch: java.lang.Throwable -> L2e
        L6f:
            r6 = r11
            r9 = r12
            goto L7c
        L72:
            r0 = move-exception
            r11 = r6
            r12 = r9
        L75:
            p.c6x0 r4 = new p.c6x0
            r4.<init>(r0)
            r0 = r4
            goto L6f
        L7c:
            boolean r11 = r0 instanceof p204p.c6x0
            if (r11 == 0) goto L81
            r0 = 0
        L81:
            p.x9c r0 = (p204p.x9c) r0
            if (r0 == 0) goto L8e
            java.util.List r11 = r0.f259315a
            r1.addAll(r11)
            java.lang.String r11 = r0.f259321g
            r13.f200373a = r11
        L8e:
            if (r0 == 0) goto L9b
            java.lang.String r11 = r0.f259321g
            int r11 = r11.length()
            if (r11 != 0) goto L99
            goto L9b
        L99:
            r11 = r2
            goto L48
        L9b:
            r11 = r3
            goto L48
        L9d:
            java.lang.Object r11 = r13.f200373a
            p.pqm0 r11 = p204p.pft0.m69840u(r11, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.l1a0.m57868c(java.lang.String, p.ibk, boolean):java.io.Serializable");
    }
}
