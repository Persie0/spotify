package p204p;

import androidx.compose.p002ui.unit.TextUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ca71 {

    /* JADX INFO: renamed from: c */
    public static final ca71 f35759c = new ca71(3, 0, 0);

    /* JADX INFO: renamed from: a */
    public final long f35760a;

    /* JADX INFO: renamed from: b */
    public final long f35761b;

    public ca71(long j, long j2) {
        this.f35760a = j;
        this.f35761b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca71)) {
            return false;
        }
        ca71 ca71Var = (ca71) obj;
        return TextUnit.m306a(this.f35760a, ca71Var.f35760a) && TextUnit.m306a(this.f35761b, ca71Var.f35761b);
    }

    public final int hashCode() {
        tf71[] tf71VarArr = TextUnit.f546b;
        return Long.hashCode(this.f35761b) + (Long.hashCode(this.f35760a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m311f(this.f35760a)) + ", restLine=" + ((Object) TextUnit.m311f(this.f35761b)) + ')';
    }

    public /* synthetic */ ca71(int i, long j, long j2) {
        this((i & 1) != 0 ? epv0.m39702v(0) : j, (i & 2) != 0 ? epv0.m39702v(0) : j2);
    }
}
