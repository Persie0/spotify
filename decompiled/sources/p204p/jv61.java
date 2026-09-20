package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jv61 extends cv61 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f116273e = 1;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ eh00 f116274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv61(String str, eh00 eh00Var) {
        super(str, true);
        this.f116274f = eh00Var;
    }

    @Override // p204p.cv61
    /* JADX INFO: renamed from: a */
    public final long mo33978a() {
        switch (this.f116273e) {
            case 0:
                this.f116274f.invoke();
                return -1L;
            default:
                return ((Number) this.f116274f.invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv61(String str, boolean z, eh00 eh00Var) {
        super(str, z);
        this.f116274f = eh00Var;
    }
}
