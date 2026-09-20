package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m72 {

    /* JADX INFO: renamed from: a */
    public final Map f140629a;

    public m72(Map map) {
        this.f140629a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m72) && wj50.m88271j(this.f140629a, ((m72) obj).f140629a);
    }

    public final int hashCode() {
        return this.f140629a.hashCode();
    }

    public /* synthetic */ m72() {
        this(nau.f152117a);
    }
}
