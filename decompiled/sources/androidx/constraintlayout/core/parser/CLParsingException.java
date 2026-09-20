package androidx.constraintlayout.core.parser;

import p204p.qva;

/* JADX INFO: loaded from: classes3.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f549a;

    /* JADX INFO: renamed from: b */
    public final String f550b;

    public CLParsingException(String str, qva qvaVar) {
        this.f549a = str;
        if (qvaVar != null) {
            this.f550b = qvaVar.m73981j();
        } else {
            this.f550b = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.f549a + " (" + this.f550b + " at line 0)");
        return sb.toString();
    }
}
