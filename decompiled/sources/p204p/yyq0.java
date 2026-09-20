package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class yyq0 implements azq0 {

    /* JADX INFO: renamed from: a */
    public final Object f277562a;

    public yyq0(List list) {
        this.f277562a = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final List m94949a() {
        return this.f277562a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyq0) && this.f277562a.equals(((yyq0) obj).f277562a);
    }

    public final int hashCode() {
        return this.f277562a.hashCode();
    }
}
