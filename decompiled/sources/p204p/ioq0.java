package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ioq0 implements joq0 {

    /* JADX INFO: renamed from: a */
    public final String f104278a;

    public ioq0(String str) {
        this.f104278a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ioq0) && wj50.m88271j(this.f104278a, ((ioq0) obj).f104278a);
    }

    public final int hashCode() {
        return this.f104278a.hashCode();
    }
}
