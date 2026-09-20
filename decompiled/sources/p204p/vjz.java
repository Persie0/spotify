package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vjz implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mb61 f242092b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fiz f242093c;

    /* JADX WARN: Multi-variable type inference failed */
    public vjz(int i, fiz fizVar, th00 th00Var) {
        this.f242091a = i;
        switch (i) {
            case 4:
                this.f242093c = fizVar;
                this.f242092b = (mb61) th00Var;
                break;
            case 5:
                this.f242093c = fizVar;
                this.f242092b = (mb61) th00Var;
                break;
            case 6:
                this.f242093c = fizVar;
                this.f242092b = (mb61) th00Var;
                break;
            default:
                this.f242093c = fizVar;
                this.f242092b = (mb61) th00Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:139:0x0244  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r14v12, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r14v20, types: [p.mb61, p.vh00] */
    /* JADX WARN: Type inference failed for: r14v26, types: [p.mb61, p.xh00] */
    /* JADX WARN: Type inference failed for: r1v11, types: [p.ibk] */
    /* JADX WARN: Type inference failed for: r1v43, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [p.ibk] */
    /* JADX WARN: Type inference failed for: r2v12, types: [p.mb61, p.vh00] */
    /* JADX WARN: Type inference failed for: r2v8, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r3v12, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x011a -> B:75:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0133 -> B:72:0x0136). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p204p.fiz
    public final java.lang.Object collect(p204p.niz r13, p204p.fbk r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.vjz.collect(p.niz, p.fbk):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vjz(fiz fizVar, th00 th00Var) {
        this.f242091a = 1;
        this.f242092b = (mb61) th00Var;
        this.f242093c = fizVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vjz(fiz fizVar, vh00 vh00Var, int i) {
        this.f242091a = i;
        switch (i) {
            case 7:
                this.f242093c = fizVar;
                this.f242092b = (mb61) vh00Var;
                break;
            default:
                this.f242093c = fizVar;
                this.f242092b = (mb61) vh00Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vjz(fiz fizVar, xh00 xh00Var) {
        this.f242091a = 3;
        this.f242093c = fizVar;
        this.f242092b = (mb61) xh00Var;
    }
}
