package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w960 implements ca60 {

    /* JADX INFO: renamed from: a */
    public final String f249090a;

    public w960(String str) {
        this.f249090a = str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM94808a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w960)) {
            return false;
        }
        String str = ((w960) obj).f249090a;
        String str2 = this.f249090a;
        if (str2 == null) {
            if (str == null) {
                zM94808a = true;
            } else {
                zM94808a = false;
            }
        } else if (str == null) {
            zM94808a = false;
        } else {
            zM94808a = yx50.m94808a(str2, str);
        }
        return zM94808a;
    }

    public final int hashCode() {
        String str = this.f249090a;
        if (str == null) {
            return 0;
        }
        return yx50.m94809b(str);
    }
}
