package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class mst implements rx0 {

    /* JADX INFO: renamed from: a */
    public final Context f146855a;

    /* JADX INFO: renamed from: b */
    public final xst f146856b;

    public mst(Context context, xst xstVar) {
        this.f146855a = context;
        this.f146856b = xstVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m62777a(fbk fbkVar) {
        kst kstVar;
        mst mstVar;
        if (fbkVar instanceof kst) {
            kstVar = (kst) fbkVar;
            int i = kstVar.f126015d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kstVar.f126015d = i - Integer.MIN_VALUE;
            } else {
                kstVar = new kst(this, fbkVar);
            }
        } else {
            kstVar = new kst(this, fbkVar);
        }
        Object objM27703d = kstVar.f126013b;
        int i2 = kstVar.f126015d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM27703d);
            kstVar.f126012a = this;
            kstVar.f126015d = 1;
            xst xstVar = this.f146856b;
            objM27703d = ((azx) xstVar.f265664b).m27703d(new roa(null, "root", null, null, hz40.m49225C(((Context) xstVar.f265665c).getPackageName()), true, false, new ipm0(5), 3, 2, null, 123821), kstVar);
            if (objM27703d != yukVar) {
                mstVar = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM27703d);
            return objM27703d;
        }
        mstVar = kstVar.f126012a;
        bga.m29073P(objM27703d);
        kstVar.f126012a = null;
        kstVar.f126015d = 2;
        Object objM62778b = mstVar.m62778b((fxx) objM27703d, kstVar);
        return objM62778b == yukVar ? yukVar : objM62778b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:20:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0054
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m62778b(p204p.fxx r11, p204p.ibk r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p204p.lst
            if (r0 == 0) goto L13
            r0 = r12
            p.lst r0 = (p204p.lst) r0
            int r1 = r0.f136607i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136607i = r1
            goto L18
        L13:
            p.lst r0 = new p.lst
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f136605g
            int r1 = r0.f136607i
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            int r11 = r0.f136604f
            int r1 = r0.f136603e
            int r3 = r0.f136602d
            p.axx r4 = r0.f136601c
            java.util.Iterator r5 = r0.f136600b
            java.util.Collection r6 = r0.f136599a
            java.util.Collection r6 = (java.util.Collection) r6
            p204p.bga.m29073P(r12)
            goto L79
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            p204p.bga.m29073P(r12)
            java.util.List r11 = r11.f74479a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
            r1 = 0
            r5 = r11
            r6 = r12
            r11 = r1
            r3 = r11
        L4e:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto Lad
            java.lang.Object r12 = r5.next()
            r4 = r12
            p.axx r4 = (p204p.axx) r4
            java.lang.String r12 = r4.f21021a
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            r0.f136599a = r7
            r0.f136600b = r5
            r0.f136601c = r4
            r0.f136602d = r3
            r0.f136603e = r1
            r0.f136604f = r11
            r0.f136607i = r2
            p.xst r7 = r10.f146856b
            java.lang.Object r12 = r7.m91988t(r12, r0)
            p.yuk r7 = p204p.yuk.f276404a
            if (r12 != r7) goto L79
            return r7
        L79:
            p.fxx r12 = (p204p.fxx) r12
            java.util.List r7 = r12.f74479a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L85
            r12 = 0
            goto La7
        L85:
            p.z6v r7 = new p.z6v
            java.lang.String r8 = r4.f21021a
            java.lang.String r9 = "spotify:section:0JQ5DAIiKWzVFULQfUm85Y"
            boolean r8 = p204p.wj50.m88271j(r8, r9)
            if (r8 == 0) goto L9b
            android.content.Context r4 = r10.f146855a
            r8 = 2131955249(0x7f130e31, float:1.954702E38)
            java.lang.String r4 = r4.getString(r8)
            goto La1
        L9b:
            java.lang.String r4 = r4.f21023c
            if (r4 != 0) goto La1
            java.lang.String r4 = ""
        La1:
            java.util.List r12 = r12.f74479a
            r7.<init>(r4, r12)
            r12 = r7
        La7:
            if (r12 == 0) goto L4e
            r6.add(r12)
            goto L4e
        Lad:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.mst.m62778b(p.fxx, p.ibk):java.lang.Object");
    }
}
