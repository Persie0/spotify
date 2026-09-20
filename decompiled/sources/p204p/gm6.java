package p204p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class gm6 implements rv41 {

    /* JADX INFO: renamed from: a */
    public final List f81285a;

    /* JADX INFO: renamed from: b */
    public final gp91 f81286b;

    /* JADX INFO: renamed from: c */
    public final i26 f81287c;

    /* JADX INFO: renamed from: d */
    public final gh00 f81288d;

    /* JADX INFO: renamed from: e */
    public final w2y0 f81289e;

    /* JADX INFO: renamed from: f */
    public final yum0 f81290f;

    /* JADX INFO: renamed from: g */
    public boolean f81291g = true;

    public gm6(List list, Object obj, gp91 gp91Var, i26 i26Var, gh00 gh00Var, w2y0 w2y0Var) {
        this.f81285a = list;
        this.f81286b = gp91Var;
        this.f81287c = i26Var;
        this.f81288d = gh00Var;
        this.f81289e = w2y0Var;
        this.f81290f = sam.m77645B(obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:25:0x0061, B:27:0x006d, B:32:0x0090, B:36:0x00b7, B:20:0x004f, B:23:0x0058), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:25:0x0061, B:27:0x006d, B:32:0x0090, B:36:0x00b7, B:20:0x004f, B:23:0x0058), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:25:0x0061, B:27:0x006d, B:32:0x0090, B:36:0x00b7, B:20:0x004f, B:23:0x0058), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:25:0x0061, B:27:0x006d, B:32:0x0090, B:36:0x00b7, B:20:0x004f, B:23:0x0058), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca A[PHI: r0 r3 r7 r12
      0x00ca: PHI (r0v13 java.util.List) = (r0v9 java.util.List), (r0v14 java.util.List) binds: [B:26:0x006b, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r3v10 int) = (r3v8 int), (r3v11 int) binds: [B:26:0x006b, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r7v7 int) = (r7v3 int), (r7v8 int) binds: [B:26:0x006b, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:26:0x006b, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006b -> B:40:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c6 -> B:39:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m45218a(p204p.ibk r18) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.gm6.m45218a(p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m45219b(czz czzVar, ibk ibkVar) {
        fm6 fm6Var;
        if (ibkVar instanceof fm6) {
            fm6Var = (fm6) ibkVar;
            int i = fm6Var.f70965d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fm6Var.f70965d = i - Integer.MIN_VALUE;
            } else {
                fm6Var = new fm6(this, ibkVar);
            }
        } else {
            fm6Var = new fm6(this, ibkVar);
        }
        Object obj = fm6Var.f70963b;
        int i2 = fm6Var.f70965d;
        fbk fbkVar = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                czz czzVar2 = fm6Var.f70962a;
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            jr4 jr4Var = new jr4(this, czzVar, fbkVar, 12);
            fm6Var.f70962a = czzVar;
            fm6Var.f70965d = 1;
            Object objM76980u = s1h1.m76980u(15000L, jr4Var, fm6Var);
            yuk yukVar = yuk.f276404a;
            return objM76980u == yukVar ? yukVar : objM76980u;
        } catch (CancellationException e) {
            if (!qlg1.m73191G(fm6Var.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            muk mukVar = (muk) fm6Var.getContext().mo26595B(efy.f59152X0);
            if (mukVar != null) {
                mukVar.mo34898p(new IllegalStateException("Unable to load font " + czzVar, e2), fm6Var.getContext());
            }
            return null;
        }
    }

    @Override // p204p.rv41
    public final Object getValue() {
        return this.f81290f.getValue();
    }
}
