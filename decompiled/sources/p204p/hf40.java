package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class hf40 extends AbstractC1928h8 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final Object f90593b;

    /* JADX INFO: renamed from: c */
    public final Object f90594c;

    public hf40(Object obj, Object obj2) {
        super(false, 0);
        this.f90593b = obj;
        this.f90594c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f90593b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f90594c;
    }

    @Override // p204p.AbstractC1928h8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
