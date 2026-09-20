package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pa21 implements ra21 {

    /* JADX INFO: renamed from: a */
    public final String f175370a;

    public pa21(String str) {
        this.f175370a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa21) && wj50.m88271j(this.f175370a, ((pa21) obj).f175370a);
    }

    public final int hashCode() {
        return this.f175370a.hashCode();
    }
}
