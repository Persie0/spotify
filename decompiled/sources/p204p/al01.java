package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class al01 extends fl01 {

    /* JADX INFO: renamed from: a */
    public final String f16699a;

    public al01(String str) {
        this.f16699a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al01) && wj50.m88271j(this.f16699a, ((al01) obj).f16699a);
    }

    public final int hashCode() {
        return this.f16699a.hashCode();
    }
}
