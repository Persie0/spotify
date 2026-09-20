package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class plo0 implements rlo0 {

    /* JADX INFO: renamed from: a */
    public final String f178766a;

    public plo0(String str) {
        this.f178766a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof plo0) && wj50.m88271j(this.f178766a, ((plo0) obj).f178766a);
    }

    public final int hashCode() {
        return this.f178766a.hashCode();
    }
}
