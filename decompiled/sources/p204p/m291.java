package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class m291 {

    /* JADX INFO: renamed from: a */
    public final Object f139292a;

    public m291(List list) {
        this.f139292a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m291) && this.f139292a.equals(((m291) obj).f139292a);
    }

    public final int hashCode() {
        return this.f139292a.hashCode();
    }
}
