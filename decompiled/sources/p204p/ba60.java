package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ba60 implements ca60 {

    /* JADX INFO: renamed from: a */
    public final String f25097a;

    public ba60(String str) {
        this.f25097a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba60) && wj50.m88271j(this.f25097a, ((ba60) obj).f25097a);
    }

    public final int hashCode() {
        String str = this.f25097a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
