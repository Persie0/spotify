package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class tjf1 extends AbstractC1928h8 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final Object f220903b;

    /* JADX INFO: renamed from: c */
    public final ydf1 f220904c;

    public tjf1(Object obj, ydf1 ydf1Var) {
        super(false, 1);
        this.f220903b = obj;
        this.f220904c = ydf1Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f220903b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f220904c;
    }

    @Override // p204p.AbstractC1928h8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
