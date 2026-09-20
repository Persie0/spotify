package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class shw0 implements uhw0 {

    /* JADX INFO: renamed from: a */
    public final String f209283a;

    public shw0(String str) {
        this.f209283a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shw0) && wj50.m88271j(this.f209283a, ((shw0) obj).f209283a);
    }

    public final int hashCode() {
        return this.f209283a.hashCode();
    }
}
