package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aic {

    /* JADX INFO: renamed from: a */
    public final boolean f15932a;

    /* JADX INFO: renamed from: b */
    public final Map f15933b;

    public aic(Map map, boolean z) {
        this.f15932a = z;
        this.f15933b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aic)) {
            return false;
        }
        aic aicVar = (aic) obj;
        return this.f15932a == aicVar.f15932a && wj50.m88271j(this.f15933b, aicVar.f15933b);
    }

    public final int hashCode() {
        return this.f15933b.hashCode() + (Boolean.hashCode(this.f15932a) * 31);
    }

    public /* synthetic */ aic() {
        this(nau.f152117a, false);
    }
}
