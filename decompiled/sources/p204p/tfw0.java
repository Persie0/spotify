package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tfw0 {

    /* JADX INFO: renamed from: a */
    public final Map f220062a;

    public tfw0(Map map) {
        this.f220062a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfw0) && wj50.m88271j(this.f220062a, ((tfw0) obj).f220062a);
    }

    public final int hashCode() {
        return this.f220062a.hashCode();
    }

    public /* synthetic */ tfw0() {
        this(nau.f152117a);
    }
}
