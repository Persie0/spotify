package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class us6 implements ktx {

    /* JADX INFO: renamed from: a */
    public final Object f233534a;

    public us6(List list) {
        this.f233534a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us6) && this.f233534a.equals(((us6) obj).f233534a);
    }

    public final int hashCode() {
        return this.f233534a.hashCode();
    }
}
