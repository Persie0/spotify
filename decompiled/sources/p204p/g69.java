package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g69 extends s4x0 implements th00 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f76958b;

    /* JADX INFO: renamed from: c */
    public int f76959c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f76960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g69(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f76958b = i2;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f76958b) {
            case 0:
                g69 g69Var = new g69(2, 0, fbkVar);
                g69Var.f76960d = obj;
                return g69Var;
            case 1:
                g69 g69Var2 = new g69(2, 1, fbkVar);
                g69Var2.f76960d = obj;
                return g69Var2;
            case 2:
                g69 g69Var3 = new g69(2, 2, fbkVar);
                g69Var3.f76960d = obj;
                return g69Var3;
            case 3:
                g69 g69Var4 = new g69(2, 3, fbkVar);
                g69Var4.f76960d = obj;
                return g69Var4;
            case 4:
                g69 g69Var5 = new g69(2, 4, fbkVar);
                g69Var5.f76960d = obj;
                return g69Var5;
            case 5:
                g69 g69Var6 = new g69(2, 5, fbkVar);
                g69Var6.f76960d = obj;
                return g69Var6;
            case 6:
                g69 g69Var7 = new g69(2, 6, fbkVar);
                g69Var7.f76960d = obj;
                return g69Var7;
            case 7:
                g69 g69Var8 = new g69(2, 7, fbkVar);
                g69Var8.f76960d = obj;
                return g69Var8;
            case 8:
                g69 g69Var9 = new g69(2, 8, fbkVar);
                g69Var9.f76960d = obj;
                return g69Var9;
            default:
                g69 g69Var10 = new g69(2, 9, fbkVar);
                g69Var10.f76960d = obj;
                return g69Var10;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        sb61 sb61Var = (sb61) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f76958b) {
            case 0:
                ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 1:
                ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 2:
                ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 3:
                return ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 4:
                ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 5:
                ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 6:
                return ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 7:
                return ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
            case 8:
                ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            default:
                return ((g69) create(sb61Var, fbkVar)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0225 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x0234 A[LOOP:6: B:127:0x022e->B:129:0x0234, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01e2 -> B:112:0x01e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0223 -> B:126:0x0226). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0057 -> B:24:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0109 -> B:63:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x014a -> B:77:0x014d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:116:0x01fd
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p204p.ly8
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.g69.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
