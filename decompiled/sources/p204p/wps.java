package p204p;

import android.media.SoundPool;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFromFuture;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class wps {

    /* JADX INFO: renamed from: a */
    public final ezm f253830a;

    /* JADX INFO: renamed from: b */
    public final av3 f253831b;

    /* JADX INFO: renamed from: c */
    public final wg61 f253832c = new wg61(new edq(this, 28));

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f253833d = new LinkedHashMap();

    public wps(ezm ezmVar, av3 av3Var) {
        this.f253830a = ezmVar;
        this.f253831b = av3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m88722a(xps xpsVar, ibk ibkVar) {
        tps tpsVar;
        if (ibkVar instanceof tps) {
            tpsVar = (tps) ibkVar;
            int i = tpsVar.f222591c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpsVar.f222591c = i - Integer.MIN_VALUE;
            } else {
                tpsVar = new tps(this, ibkVar);
            }
        } else {
            tpsVar = new tps(this, ibkVar);
        }
        Object objM96573r = tpsVar.f222589a;
        int i2 = tpsVar.f222591c;
        if (i2 == 0) {
            bga.m29073P(objM96573r);
            String str = xpsVar.f264714a;
            tpsVar.f222591c = 1;
            av3 av3Var = this.f253831b;
            if (!av3Var.f20083e) {
                throw new IllegalStateException("Asset loader not initialized!");
            }
            qa6 qa6Var = (qa6) ((ta6) av3Var.f20080b.get()).f218462b.get(str);
            if (qa6Var == null) {
                throw new NoSuchElementException(s571.m77251j("No asset found with name ", str, "."));
            }
            FutureTask futureTask = new FutureTask(new x31(av3Var, qa6Var));
            av3Var.f20079a.execute(futureTask);
            objM96573r = zn91.m96573r(new MaybeFlatten(new MaybeFromFuture(futureTask).m23373k(Schedulers.f10370c), new vah1(str, 2)), tpsVar);
            yuk yukVar = yuk.f276404a;
            if (objM96573r == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96573r);
        }
        File file = (File) objM96573r;
        if (file != null) {
            return qyg1.m74180J(((SoundPool) this.f253832c.getValue()).load(file.getPath(), 1));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m88723b(xps xpsVar, fbk fbkVar) {
        ups upsVar;
        Object objM74180J;
        LinkedHashMap linkedHashMap;
        if (fbkVar instanceof ups) {
            upsVar = (ups) fbkVar;
            int i = upsVar.f232819e;
            if ((i & Integer.MIN_VALUE) != 0) {
                upsVar.f232819e = i - Integer.MIN_VALUE;
            } else {
                upsVar = new ups(this, fbkVar);
            }
        } else {
            upsVar = new ups(this, fbkVar);
        }
        Object obj = upsVar.f232817c;
        int i2 = upsVar.f232819e;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            LinkedHashMap linkedHashMap2 = this.f253833d;
            objM74180J = linkedHashMap2.get(xpsVar);
            if (objM74180J == null) {
                upsVar.f232815a = linkedHashMap2;
                upsVar.f232816b = xpsVar;
                upsVar.f232819e = 1;
                Object objM88722a = m88722a(xpsVar, upsVar);
                Object obj2 = yuk.f276404a;
                if (objM88722a == obj2) {
                    return obj2;
                }
                linkedHashMap = linkedHashMap2;
                obj = objM88722a;
            }
            ((SoundPool) this.f253832c.getValue()).play(((Number) objM74180J).intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xpsVar = upsVar.f232816b;
        linkedHashMap = upsVar.f232815a;
        bga.m29073P(obj);
        Integer num = (Integer) obj;
        if (num == null) {
            return w2a1Var;
        }
        objM74180J = qyg1.m74180J(num.intValue());
        linkedHashMap.put(xpsVar, objM74180J);
        ((SoundPool) this.f253832c.getValue()).play(((Number) objM74180J).intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:15:0x003f->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0067 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m88724c(java.util.List r7, p204p.ibk r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p204p.vps
            if (r0 == 0) goto L13
            r0 = r8
            p.vps r0 = (p204p.vps) r0
            int r1 = r0.f243770g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243770g = r1
            goto L18
        L13:
            p.vps r0 = new p.vps
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f243768e
            int r1 = r0.f243770g
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            int r7 = r0.f243767d
            p.xps r1 = r0.f243766c
            java.util.LinkedHashMap r3 = r0.f243765b
            java.util.Iterator r4 = r0.f243764a
            p204p.bga.m29073P(r8)
            goto L6a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p204p.bga.m29073P(r8)
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
            r4 = r7
            r7 = r8
        L3f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r4.next()
            r1 = r8
            p.xps r1 = (p204p.xps) r1
            java.util.LinkedHashMap r3 = r6.f253833d
            java.lang.Object r8 = r3.get(r1)
            if (r8 != 0) goto L3f
            r0.getClass()
            r0.f243764a = r4
            r0.f243765b = r3
            r0.f243766c = r1
            r0.f243767d = r7
            r0.f243770g = r2
            java.lang.Object r8 = r6.m88722a(r1, r0)
            p.yuk r5 = p204p.yuk.f276404a
            if (r8 != r5) goto L6a
            return r5
        L6a:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L3f
            int r8 = r8.intValue()
            java.lang.Integer r8 = p204p.qyg1.m74180J(r8)
            r3.put(r1, r8)
            goto L3f
        L7a:
            p.w2a1 r7 = p204p.w2a1.f247311a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.wps.m88724c(java.util.List, p.ibk):java.lang.Object");
    }
}
