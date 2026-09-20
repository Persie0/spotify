package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ql60 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final ql60 f189741a = new ql60();

    /* JADX INFO: renamed from: b */
    public static final pl60 f189742b = pl60.f178650b;

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        eng1.m39504k(froVar);
        return new nl60((Map) new pn80(ql51.f189738a, bl60.f28100a).m74832e(froVar, null));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f189742b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        eng1.m39503i(deuVar);
        new pn80(ql51.f189738a, bl60.f28100a).serialize(deuVar, (nl60) obj);
    }
}
