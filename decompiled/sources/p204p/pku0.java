package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final String f178553a;

    public pku0(String str) {
        this.f178553a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pku0) && wj50.m88271j(this.f178553a, ((pku0) obj).f178553a);
    }

    public final int hashCode() {
        return this.f178553a.hashCode();
    }
}
