package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class kbh1 extends i5h1 {

    /* JADX INFO: renamed from: a */
    public final jbh1 f121207a;

    public kbh1(jbh1 jbh1Var) {
        this.f121207a = jbh1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kbh1) && ((kbh1) obj).f121207a == this.f121207a;
    }

    public final int hashCode() {
        return Objects.hash(kbh1.class, this.f121207a);
    }

    public final String toString() {
        String str = this.f121207a.f110807b;
        return dq60.m36618r(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
