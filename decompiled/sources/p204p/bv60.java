package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class bv60 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final bv60 f31294a = new bv60();

    /* JADX INFO: renamed from: b */
    public static final pn80 f31295b;

    /* JADX INFO: renamed from: c */
    public static final ktz0 f31296c;

    static {
        pn80 pn80Var = new pn80(ql51.f189738a, l8a.f130828a);
        f31295b = pn80Var;
        f31296c = pn80Var.f179343c;
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return new av60((Map) f31295b.deserialize(froVar));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f31296c;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        f31295b.serialize(deuVar, ((av60) obj).f20109a);
    }
}
