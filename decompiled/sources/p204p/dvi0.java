package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dvi0 implements xra0, Serializable {

    /* JADX INFO: renamed from: a */
    public String f53469a;

    @Override // p204p.xra0
    public String getName() {
        return this.f53469a;
    }

    public Object readResolve() {
        return bsa0.m30426c(getName());
    }
}
