package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jqu0 extends koh {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f115005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gjs0 f115006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqu0(gjs0 gjs0Var, int i) {
        super(1);
        this.f115005b = i;
        this.f115006c = gjs0Var;
    }

    @Override // p204p.koh
    /* JADX INFO: renamed from: l */
    public final void mo51411l(String[] strArr) {
        switch (this.f115005b) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((kqu0) this.f115006c.f80557b).f125443d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((kqu0) this.f115006c.f80557b).f125444e = strArr;
                return;
        }
    }
}
