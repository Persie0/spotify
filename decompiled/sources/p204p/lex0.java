package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lex0 {

    /* JADX INFO: renamed from: a */
    public final String f132763a;

    public lex0(String str) {
        this.f132763a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lex0) && wj50.m88271j(this.f132763a, ((lex0) obj).f132763a);
    }

    public final int hashCode() {
        return this.f132763a.hashCode() * 31;
    }
}
