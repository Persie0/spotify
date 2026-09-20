package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yq91 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final yq91 f275172a = new yq91();

    /* JADX INFO: renamed from: b */
    public static final it40 f275173b = bnf1.m29967c("kotlin.UByte", oua.f170236a);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return new uq91(froVar.mo39233w(f275173b).mo39224c0());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f275173b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        deuVar.mo35828v(f275173b).mo35826j(((uq91) obj).f232950a);
    }
}
