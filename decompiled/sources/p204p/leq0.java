package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class leq0 implements peq0 {

    /* JADX INFO: renamed from: a */
    public final Map f132664a;

    public leq0(Map map) {
        this.f132664a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof leq0) && wj50.m88271j(this.f132664a, ((leq0) obj).f132664a);
    }

    public final int hashCode() {
        return this.f132664a.hashCode();
    }
}
