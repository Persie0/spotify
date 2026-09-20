package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class w0h1 {

    /* JADX INFO: renamed from: a */
    public final v0h1 f246740a;

    public /* synthetic */ w0h1(use1 use1Var) {
        this.f246740a = (v0h1) use1Var.f233622a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof w0h1) && mvl0.m62956s(this.f246740a, ((w0h1) obj).f246740a) && mvl0.m62956s(null, null) && mvl0.m62956s(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f246740a, null, null});
    }
}
