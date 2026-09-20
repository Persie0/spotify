package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class spi {

    /* JADX INFO: renamed from: a */
    public final boolean f212880a;

    /* JADX INFO: renamed from: b */
    public final List f212881b;

    /* JADX INFO: renamed from: c */
    public final xul0 f212882c;

    /* JADX INFO: renamed from: d */
    public final xul0 f212883d;

    public spi(boolean z, List list, xul0 xul0Var, xul0 xul0Var2) {
        this.f212880a = z;
        this.f212881b = list;
        this.f212882c = xul0Var;
        this.f212883d = xul0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spi)) {
            return false;
        }
        spi spiVar = (spi) obj;
        return this.f212880a == spiVar.f212880a && wj50.m88271j(this.f212881b, spiVar.f212881b) && wj50.m88271j(this.f212882c, spiVar.f212882c) && wj50.m88271j(this.f212883d, spiVar.f212883d);
    }

    public final int hashCode() {
        return this.f212883d.hashCode() + ((this.f212882c.hashCode() + s571.m77244c(Boolean.hashCode(this.f212880a) * 31, 31, this.f212881b)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ spi() {
        lau lauVar = lau.f131415a;
        C2244p5 c2244p5 = C2244p5.f174033a;
        this(false, lauVar, c2244p5, c2244p5);
    }
}
