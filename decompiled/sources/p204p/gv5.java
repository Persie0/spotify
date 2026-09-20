package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final String f84642a;

    public gv5(String str) {
        this.f84642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gv5) && wj50.m88271j(this.f84642a, ((gv5) obj).f84642a);
    }

    public final int hashCode() {
        String str = this.f84642a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
