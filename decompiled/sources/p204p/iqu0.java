package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class iqu0 extends koh {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f104849b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wb70 f104850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iqu0(wb70 wb70Var, int i) {
        super(1);
        this.f104849b = i;
        this.f104850c = wb70Var;
    }

    @Override // p204p.koh
    /* JADX INFO: renamed from: l */
    public final void mo51411l(String[] strArr) {
        switch (this.f104849b) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((kqu0) ((djs0) this.f104850c).f49740b).f125443d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((kqu0) ((djs0) this.f104850c).f49740b).f125444e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((kqu0) ((p0p0) this.f104850c).f172721b).f125447h = strArr;
                return;
        }
    }
}
