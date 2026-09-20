package p204p;

import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes11.dex */
public final class ll60 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final ll60 f134538a = new ll60();

    /* JADX INFO: renamed from: b */
    public static final mtz0 f134539b = gjg1.m44909K("kotlinx.serialization.json.JsonNull", otz0.f170119z0, new ktz0[0]);

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        eng1.m39504k(froVar);
        if (froVar.mo29812X()) {
            throw new JsonDecodingException(fpg1.m42364t(-1, "Expected 'null' literal", null, null, null));
        }
        return kl60.INSTANCE;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f134539b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        eng1.m39503i(deuVar);
        deuVar.mo35813J();
    }
}
