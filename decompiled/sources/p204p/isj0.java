package p204p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes11.dex */
public final class isj0 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final isj0 f105262a = new isj0();

    /* JADX INFO: renamed from: b */
    public static final hsj0 f105263b = hsj0.f94753a;

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f105263b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
