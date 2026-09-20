package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class y770 extends h870 {

    /* JADX INFO: renamed from: a */
    public final String f269982a;

    public y770(String str) {
        this.f269982a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y770) && wj50.m88271j(this.f269982a, ((y770) obj).f269982a);
    }

    public final int hashCode() {
        return this.f269982a.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("KClassValue("), this.f269982a, ')');
    }
}
