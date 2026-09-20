package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mq20 implements nq20 {

    /* JADX INFO: renamed from: a */
    public final String f146148a;

    public mq20(String str) {
        this.f146148a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq20) && wj50.m88271j(this.f146148a, ((mq20) obj).f146148a);
    }

    public final int hashCode() {
        return this.f146148a.hashCode();
    }
}
