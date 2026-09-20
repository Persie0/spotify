package p204p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class dq11 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final dq11 f51790a = new dq11();

    /* JADX INFO: renamed from: b */
    public static final pn80 f51791b;

    /* JADX INFO: renamed from: c */
    public static final ktz0 f51792c;

    static {
        pn80 pn80Var = new pn80(ql51.f189738a, l8a.f130828a);
        f51791b = pn80Var;
        f51792c = pn80Var.f179343c;
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return new s3f(new HashMap((Map) f51791b.deserialize(froVar)));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f51792c;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        f51791b.serialize(deuVar, ((s3f) obj).f205277a);
    }
}
