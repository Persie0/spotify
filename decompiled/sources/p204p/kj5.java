package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kj5 extends fx80 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f123246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj5(ktz0 ktz0Var, int i) {
        super(ktz0Var);
        this.f123246b = i;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: i */
    public final String mo33226i() {
        switch (this.f123246b) {
            case 0:
                return "kotlin.collections.ArrayList";
            case 1:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
