package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jyv extends s4x0 implements th00 {

    /* JADX INFO: renamed from: X */
    public Object f117493X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Object f117494Y;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f117495b;

    /* JADX INFO: renamed from: c */
    public long[] f117496c;

    /* JADX INFO: renamed from: d */
    public int f117497d;

    /* JADX INFO: renamed from: e */
    public int f117498e;

    /* JADX INFO: renamed from: f */
    public int f117499f;

    /* JADX INFO: renamed from: g */
    public int f117500g;

    /* JADX INFO: renamed from: h */
    public long f117501h;

    /* JADX INFO: renamed from: i */
    public int f117502i;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f117503t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jyv(Object obj, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f117495b = i;
        this.f117494Y = obj;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f117495b) {
            case 0:
                jyv jyvVar = new jyv((kyv) this.f117494Y, fbkVar, 0);
                jyvVar.f117503t = obj;
                return jyvVar;
            case 1:
                jyv jyvVar2 = new jyv((kyv) this.f117494Y, fbkVar, 1);
                jyvVar2.f117503t = obj;
                return jyvVar2;
            case 2:
                jyv jyvVar3 = new jyv((tdy0) this.f117494Y, fbkVar, 2);
                jyvVar3.f117503t = obj;
                return jyvVar3;
            default:
                jyv jyvVar4 = new jyv((d4b1) this.f117494Y, fbkVar, 3);
                jyvVar4.f117503t = obj;
                return jyvVar4;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        vsz0 vsz0Var = (vsz0) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f117495b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((jyv) create(vsz0Var, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x022b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0275 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0277  */
    /* JADX WARN: Code duplicated, block: B:93:0x027d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0057 -> B:23:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0059 -> B:16:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0073 -> B:20:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f3 -> B:46:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f5 -> B:39:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x010f -> B:43:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018f -> B:69:0x01d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0191 -> B:62:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ab -> B:66:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0229 -> B:92:0x027b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x022b -> B:85:0x023d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0246 -> B:89:0x0272). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p204p.ly8
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.jyv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
