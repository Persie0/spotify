package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yjt {

    /* JADX INFO: renamed from: a */
    public final String f273452a;

    public yjt(String str) {
        this.f273452a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjt) && wj50.m88271j(this.f273452a, ((yjt) obj).f273452a);
    }

    public final int hashCode() {
        String str = this.f273452a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
