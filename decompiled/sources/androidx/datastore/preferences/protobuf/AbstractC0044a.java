package androidx.datastore.preferences.protobuf;

import p204p.mgy0;
import p204p.twe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0044a {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public abstract int mo426a();

    /* JADX INFO: renamed from: b */
    public final int m427b(mgy0 mgy0Var) {
        AbstractC0048e abstractC0048e = (AbstractC0048e) this;
        int i = abstractC0048e.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMo544d = mgy0Var.mo544d(this);
        abstractC0048e.memoizedSerializedSize = iMo544d;
        return iMo544d;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo428c(twe tweVar);
}
