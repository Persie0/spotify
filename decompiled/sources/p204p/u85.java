package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class u85 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f227810a;

    /* JADX INFO: renamed from: b */
    public final String f227811b;

    /* JADX INFO: renamed from: c */
    public final boolean f227812c;

    /* JADX INFO: renamed from: d */
    public final boolean f227813d;

    public u85(String str, boolean z, String str2, boolean z2) {
        this.f227810a = str;
        this.f227811b = str2;
        this.f227812c = z;
        this.f227813d = z2;
    }

    private final Object readResolve() {
        return new v85(this.f227810a, this.f227812c, this.f227811b, this.f227813d);
    }
}
