package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rlt implements nmt {

    /* JADX INFO: renamed from: a */
    public final String f200365a;

    public rlt(String str) {
        this.f200365a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlt) && wj50.m88271j(this.f200365a, ((rlt) obj).f200365a);
    }

    public final int hashCode() {
        return this.f200365a.hashCode();
    }
}
