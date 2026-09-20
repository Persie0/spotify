package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class d21 extends k21 {

    /* JADX INFO: renamed from: a */
    public final String f44405a;

    public d21(String str) {
        this.f44405a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d21) && wj50.m88271j(this.f44405a, ((d21) obj).f44405a);
    }

    public final int hashCode() {
        return this.f44405a.hashCode();
    }
}
