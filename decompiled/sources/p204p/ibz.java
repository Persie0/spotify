package p204p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ibz {

    /* JADX INFO: renamed from: a */
    public static final ibz f100691a = new ibz();

    /* JADX INFO: renamed from: b */
    public static final Map f100692b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: a */
    public static gbz m50220a(m301 m301Var) {
        Object obj = f100692b.get(m301Var);
        if (obj != null) {
            return (gbz) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + m301Var + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:21:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m50221b(p204p.ibk r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p204p.hbz
            if (r0 == 0) goto L13
            r0 = r10
            p.hbz r0 = (p204p.hbz) r0
            int r1 = r0.f89640i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89640i = r1
            goto L18
        L13:
            p.hbz r0 = new p.hbz
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f89638g
            int r1 = r0.f89640i
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r1 = r0.f89637f
            java.util.Map r3 = r0.f89636e
            p.lsi0 r4 = r0.f89635d
            p.m301 r5 = r0.f89634c
            java.util.Iterator r6 = r0.f89633b
            java.util.Map r7 = r0.f89632a
            p204p.bga.m29073P(r10)
            goto L8e
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            p204p.bga.m29073P(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            java.util.Map r1 = p204p.ibz.f100692b
            int r3 = r1.size()
            int r3 = p204p.c95.m31820L(r3)
            r10.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r10
            r6 = r1
        L57:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r4 = r10.getKey()
            r5 = r4
            p.m301 r5 = (p204p.m301) r5
            java.lang.Object r10 = r10.getValue()
            p.gbz r10 = (p204p.gbz) r10
            p.lsi0 r4 = r10.f78439a
            r0.f89632a = r3
            r0.f89633b = r6
            r0.f89634c = r5
            r0.f89635d = r4
            r0.f89636e = r3
            r0.f89637f = r1
            r0.f89640i = r2
            java.lang.Object r10 = r4.mo54248a(r0)
            p.yuk r7 = p204p.yuk.f276404a
            if (r10 != r7) goto L8d
            return r7
        L8d:
            r7 = r3
        L8e:
            r10 = 0
            p.gbz r8 = m50220a(r5)     // Catch: java.lang.Throwable -> Lb8
            p.s2l r8 = r8.f78440b     // Catch: java.lang.Throwable -> Lb8
            if (r8 == 0) goto L9f
            r4.mo54249c(r10)
            r3.put(r1, r8)
            r3 = r7
            goto L57
        L9f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb8
            r1.append(r5)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r0 = move-exception
            r4.mo54249c(r10)
            throw r0
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ibz.m50221b(p.ibk):java.lang.Object");
    }
}
