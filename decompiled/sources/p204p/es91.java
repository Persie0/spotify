package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class es91 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final es91 f62315a = new es91();

    /* JADX INFO: renamed from: b */
    public static final it40 f62316b = bnf1.m29967c("kotlin.ULong", u2b0.f226058a);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return new as91(froVar.mo39233w(f62316b).mo39232u());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f62316b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35828v(f62316b).mo35829z(((as91) obj).f19359a);
    }
}
