package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kcr0 implements rcr0 {

    /* JADX INFO: renamed from: a */
    public final String f121538a;

    public kcr0(String str) {
        this.f121538a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcr0) && wj50.m88271j(this.f121538a, ((kcr0) obj).f121538a);
    }

    public final int hashCode() {
        return this.f121538a.hashCode();
    }
}
