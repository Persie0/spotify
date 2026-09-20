package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ow60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final Object f170647a;

    public ow60(List list) {
        this.f170647a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow60) && this.f170647a.equals(((ow60) obj).f170647a);
    }

    public final int hashCode() {
        return this.f170647a.hashCode();
    }
}
