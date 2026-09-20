package p204p;

import android.media.SoundPool;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class qt31 {

    /* JADX INFO: renamed from: a */
    public final fsi0 f192273a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f192274b;

    /* JADX INFO: renamed from: c */
    public final l6b f192275c;

    /* JADX INFO: renamed from: e */
    public final c9k f192277e;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f192276d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f192278f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public final wg61 f192279g = new wg61(new cy11(this, 27));

    public qt31(fsi0 fsi0Var, i4t0 i4t0Var, l6b l6bVar, luk lukVar) {
        this.f192273a = fsi0Var;
        this.f192274b = i4t0Var;
        this.f192275c = l6bVar;
        this.f192277e = AbstractC0000a.m16o(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m73789a(qt31 qt31Var, nvo0 nvo0Var, ibk ibkVar) throws Throwable {
        nt31 nt31Var;
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        nvo0 nvo0Var2;
        String str;
        Integer num;
        Integer num2;
        Object objPutIfAbsent;
        qt31Var.getClass();
        if (ibkVar instanceof nt31) {
            nt31Var = (nt31) ibkVar;
            int i = nt31Var.f157974f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nt31Var.f157974f = i - Integer.MIN_VALUE;
            } else {
                nt31Var = new nt31(qt31Var, ibkVar);
            }
        } else {
            nt31Var = new nt31(qt31Var, ibkVar);
        }
        Object obj2 = nt31Var.f157972d;
        int i2 = nt31Var.f157974f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            long j = nvo0Var.f158936c;
            if (j > 0) {
                nt31Var.f157969a = nvo0Var;
                nt31Var.f157974f = 1;
                if (njg1.m64619l(j, nt31Var) != obj3) {
                }
                return obj3;
            }
            SoundPool soundPool = (SoundPool) qt31Var.f192279g.getValue();
            int iIntValue = ((Integer) obj).intValue();
            float f = nvo0Var.f158935b;
            soundPool.play(iIntValue, f, f, 1, 0, 1.0f);
            return w2a1Var;
        }
        if (i2 == 1) {
            nvo0Var = nt31Var.f157969a;
            bga.m29073P(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = nt31Var.f157971c;
            concurrentHashMap = nt31Var.f157970b;
            nvo0Var2 = nt31Var.f157969a;
            bga.m29073P(obj2);
        }
        num = (Integer) obj2;
        if (num != null) {
            return w2a1Var;
        }
        num2 = new Integer(num.intValue());
        objPutIfAbsent = concurrentHashMap.putIfAbsent(str, num2);
        if (objPutIfAbsent == null) {
            obj = num2;
        } else {
            obj = objPutIfAbsent;
        }
        nvo0Var = nvo0Var2;
        SoundPool soundPool2 = (SoundPool) qt31Var.f192279g.getValue();
        int iIntValue2 = ((Integer) obj).intValue();
        float f2 = nvo0Var.f158935b;
        soundPool2.play(iIntValue2, f2, f2, 1, 0, 1.0f);
        return w2a1Var;
        concurrentHashMap = qt31Var.f192276d;
        String str2 = nvo0Var.f158934a;
        obj = concurrentHashMap.get(str2);
        if (obj == null) {
            String str3 = nvo0Var.f158934a;
            nt31Var.f157969a = nvo0Var;
            nt31Var.f157970b = concurrentHashMap;
            nt31Var.f157971c = str2;
            nt31Var.f157974f = 2;
            Object objM73792d = qt31Var.m73792d(str3, nt31Var);
            if (objM73792d != obj3) {
                nvo0Var2 = nvo0Var;
                str = str2;
                obj2 = objM73792d;
                num = (Integer) obj2;
                if (num != null) {
                    return w2a1Var;
                }
                num2 = new Integer(num.intValue());
                objPutIfAbsent = concurrentHashMap.putIfAbsent(str, num2);
                if (objPutIfAbsent == null) {
                    obj = num2;
                } else {
                    obj = objPutIfAbsent;
                }
                nvo0Var = nvo0Var2;
            }
            return obj3;
        }
        SoundPool soundPool3 = (SoundPool) qt31Var.f192279g.getValue();
        int iIntValue3 = ((Integer) obj).intValue();
        float f3 = nvo0Var.f158935b;
        soundPool3.play(iIntValue3, f3, f3, 1, 0, 1.0f);
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:15:0x0041->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m73790b(p204p.qt31 r6, java.util.Collection r7, p204p.ibk r8) {
        /*
            boolean r0 = r8 instanceof p204p.ot31
            if (r0 == 0) goto L13
            r0 = r8
            p.ot31 r0 = (p204p.ot31) r0
            int r1 = r0.f168968g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168968g = r1
            goto L18
        L13:
            p.ot31 r0 = new p.ot31
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f168966e
            int r1 = r0.f168968g
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            int r7 = r0.f168965d
            java.lang.String r1 = r0.f168964c
            java.util.concurrent.ConcurrentHashMap r3 = r0.f168963b
            java.util.Iterator r4 = r0.f168962a
            p204p.bga.m29073P(r8)
            goto L6c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p204p.bga.m29073P(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
            r4 = r7
            r7 = r8
        L41:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r4.next()
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            java.util.concurrent.ConcurrentHashMap r3 = r6.f192276d
            java.lang.Object r8 = r3.get(r1)
            if (r8 != 0) goto L41
            r0.getClass()
            r0.f168962a = r4
            r0.f168963b = r3
            r0.f168964c = r1
            r0.f168965d = r7
            r0.f168968g = r2
            java.lang.Object r8 = r6.m73792d(r1, r0)
            p.yuk r5 = p204p.yuk.f276404a
            if (r8 != r5) goto L6c
            return r5
        L6c:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L41
            int r8 = r8.intValue()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            r3.putIfAbsent(r1, r5)
            goto L41
        L7d:
            p.w2a1 r6 = p204p.w2a1.f247311a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.qt31.m73790b(p.qt31, java.util.Collection, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m73791c(String str, ibk ibkVar) throws Throwable {
        kt31 kt31Var;
        if (ibkVar instanceof kt31) {
            kt31Var = (kt31) ibkVar;
            int i = kt31Var.f126135d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kt31Var.f126135d = i - Integer.MIN_VALUE;
            } else {
                kt31Var = new kt31(this, ibkVar);
            }
        } else {
            kt31Var = new kt31(this, ibkVar);
        }
        Object objM58324a = kt31Var.f126133b;
        int i2 = kt31Var.f126135d;
        if (i2 == 0) {
            bga.m29073P(objM58324a);
            kt31Var.f126132a = str;
            kt31Var.f126135d = 1;
            objM58324a = this.f192275c.m58324a(str, kt31Var);
            yuk yukVar = yuk.f276404a;
            if (objM58324a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = kt31Var.f126132a;
            bga.m29073P(objM58324a);
        }
        File file = (File) objM58324a;
        if (file == null) {
            Logger.m3973i(edb.m38564m("Failed to load sound: ", str), new Object[0]);
        }
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r9 == r5) goto L29;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m73792d(String str, ibk ibkVar) throws Throwable {
        lt31 lt31Var;
        if (ibkVar instanceof lt31) {
            lt31Var = (lt31) ibkVar;
            int i = lt31Var.f136693d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lt31Var.f136693d = i - Integer.MIN_VALUE;
            } else {
                lt31Var = new lt31(this, ibkVar);
            }
        } else {
            lt31Var = new lt31(this, ibkVar);
        }
        Object objM73791c = lt31Var.f136691b;
        int i2 = lt31Var.f136693d;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM73791c);
                lt31Var.f136690a = str;
                lt31Var.f136693d = 1;
                objM73791c = m73791c(str, lt31Var);
                if (objM73791c != obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                str = lt31Var.f136690a;
                bga.m29073P(objM73791c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = lt31Var.f136690a;
                bga.m29073P(objM73791c);
            }
            return (Integer) objM73791c;
            File file = (File) objM73791c;
            if (file == null) {
                return null;
            }
            guf gufVarM62210c = mlg1.m62210c();
            this.f192278f.put(new Integer(((SoundPool) this.f192279g.getValue()).load(file.getPath(), 1)), gufVarM62210c);
            lt31Var.f136690a = str;
            lt31Var.f136693d = 2;
            objM73791c = gufVarM62210c.m38777P(lt31Var);
        } catch (Exception e) {
            na6.m63971s("Failed to load sound: " + str + ", error: " + e.getMessage());
            return null;
        }
    }
}
