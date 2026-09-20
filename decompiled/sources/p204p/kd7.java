package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kd7 {

    /* JADX INFO: renamed from: a */
    public final String f121627a;

    public kd7(String str) {
        this.f121627a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd7) && wj50.m88271j(this.f121627a, ((kd7) obj).f121627a);
    }

    public final int hashCode() {
        String str = this.f121627a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
