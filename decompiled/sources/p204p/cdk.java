package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cdk {

    /* JADX INFO: renamed from: a */
    public final String f36903a;

    /* JADX INFO: renamed from: b */
    public final List f36904b;

    public cdk(String str, ro80 ro80Var) {
        this.f36903a = str;
        this.f36904b = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdk)) {
            return false;
        }
        cdk cdkVar = (cdk) obj;
        return wj50.m88271j(this.f36903a, cdkVar.f36903a) && wj50.m88271j(this.f36904b, cdkVar.f36904b);
    }

    public final int hashCode() {
        return this.f36904b.hashCode() + (this.f36903a.hashCode() * 31);
    }
}
