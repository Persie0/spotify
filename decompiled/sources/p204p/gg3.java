package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gg3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final String f79520a;

    public gg3(String str) {
        this.f79520a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg3) && wj50.m88271j(this.f79520a, ((gg3) obj).f79520a);
    }

    public final int hashCode() {
        String str = this.f79520a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
