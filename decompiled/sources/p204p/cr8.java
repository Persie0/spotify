package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cr8 implements kr8 {

    /* JADX INFO: renamed from: a */
    public final Object f41203a;

    public cr8(List list) {
        this.f41203a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr8) && this.f41203a.equals(((cr8) obj).f41203a);
    }

    public final int hashCode() {
        return this.f41203a.hashCode();
    }
}
